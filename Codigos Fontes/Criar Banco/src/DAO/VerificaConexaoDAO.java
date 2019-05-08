/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static SEGURANCA.MD5.md5;
import FACTORY.ConnectionFactory;
import java.security.NoSuchAlgorithmException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio Junior
 */
public class VerificaConexaoDAO {

    static Connection connection;
    ConnectionFactory connectionFactory = new ConnectionFactory();

    public boolean VerificaConexao(String newServer, String newPorta, String newSenha) {
        connection = connectionFactory.getConnection(newServer, newPorta, newSenha);
        try {
            return connection.isValid(1);
        } catch (SQLException ex) {
            Logger.getLogger(VerificaConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean criaBancoDeDados(String nameDataBase) {
        try {
            Statement statement = connection.createStatement();
            return !statement.execute("CREATE DATABASE IF NOT EXISTS " + nameDataBase);

        } catch (SQLException ex) {
            Logger.getLogger(VerificaConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean criaTabelas(String dataBase) throws NoSuchAlgorithmException {
        try {
            Statement statement = connection.createStatement();

            statement.execute("create table `" + dataBase + "`.`produto`("
                    + "`idproduto` int not null,"
                    + "`tipo` varchar (50) not null,"
                    + "`valor` varchar (15) not null,"
                    + "`descricao` varchar(300),"
                    + "primary key (`idproduto`))");

            statement.execute("create table `" + dataBase + "`.`cliente`("
                    + "`idcliente` int not null,"
                    + "`cnpj` varchar (30),"
                    + "`email` varchar (40),"
                    + "`nome` varchar(50),"
                    + "`endereco` varchar (50),"
                    + "`bairro` varchar (50),"
                    + "`cidade` varchar (50),"
                    + "`estado` varchar (50),"
                    + "`telefone` varchar (50),"
                    + "`cep` varchar (50),"
                    + "primary key (`idcliente`))");

            statement.execute("create table `" + dataBase + "`.`funcionario`("
                    + "`registro` varchar (50) not null,"
                    + "`CTPS` varchar (50) not null,"
                    + "`serie` varchar (50) not null,"
                    + "`cargo` varchar (20), "
                    + "`salario` varchar (15), "
                    + "`datanascimento` varchar (16), "
		    + "`nome` varchar (50) not null,"
                    + "`endereco` varchar (50),"
                    + "`bairro` varchar (50),"
                    + "`cidade` varchar (50),"
                    + "`estado` varchar (50),"
                    + "`telefone` varchar (50),"
                    + "`cep` varchar (50),"
                    + "primary key (`registro`))" );



            statement.execute("create table `" + dataBase + "`.`usuario`("
                    + "`idusuario` int not null,"
                    + "`registro` varchar(50) not null,"
                    + "`usuario` varchar (20) not null,"
                    + "`senha` varchar (50) not null,"                    
                    + "`tipoacesso` varchar (15) not null,"
                    + "primary key (`idusuario`,`registro`),"
                    + "foreign key (`registro`) references `" + dataBase + "`.`funcionario` (`registro`))");

 	    statement.execute("create table `" + dataBase + "`.`frmpagamento`("
                    + "`idforma` int not null,"
                    + "`forma` varchar (30) not null,"
                    + "primary key (`idforma`))");  
            
            
            statement.execute("create table `" + dataBase + "`.`venda`("
                    + "`codigo` int not null,"
                    + "`data` varchar (20),"
                    + "`desconto` varchar(20),"
                    + "`cliente` varchar (20),"
                    + "`vendedor` varchar (20),"
                    + "`produto` varchar (20),"                    
                    + "`quantidade` varchar (6),"
                    + "`forma` varchar(20),"
                    + "`valor` varchar(20),"
                    + "primary key (`codigo`))");
            
            
            
            statement.execute("create table `" + dataBase + "`.`parametros`("
                    + "`variavel` varchar (50) not null,"
                    + "`descricao` varchar (50),"
                    + "`valor` varchar (5),"
                    + "primary key (`variavel`))");
            
            
            statement.execute("insert into " + dataBase + ".funcionario "
                    + "values('1', '999.999.999/99', '9999-9', 'Programador', '10.000,00', '01/01/1989', 'Sergio', 'Av. Brasil', 'Paulista', 'São Paulo', 'São Paulo (SP)', '(11)4004-0000', '00000-000');");
            statement.execute("insert into " + dataBase + ".usuario "
                    + "values(1, '1', 'admin','" + md5("12345") + "', 'ADMIN');");
            statement.execute("insert into " + dataBase + ".cliente "
                    + "values('1', '99.999.999/9999-99', 'email@email.com.br', 'Governo de SP', 'Avenida Morumbi, 4500', 'Morumbi', 'São Paulo', 'São Paulo (SP)', '(11)8108-2331', '05650-905');");
            statement.execute("insert into " + dataBase + ".parametros "
                    + "values('CODCLIENTE', 'Ultimo codigo de cliente criado', '1');");
            statement.execute("insert into " + dataBase + ".parametros "
                    + "values('CODFUNCIONARIO', 'Ultimo codigo do Funcionario criado', '1');");
            statement.execute("insert into " + dataBase + ".parametros "
                    + "values('CODUSUARIO', 'Ultimo codigo do Usuario criado', '1');");
            statement.execute("insert into " + dataBase + ".parametros "
                    + "values('CODPRODUTO', 'Ultimo codigo do Produto criado', '0');");
            statement.execute("insert into " + dataBase + ".parametros "
                    + "values('CODPAGAMENTO', 'Ultimo codigo de Pagamento criado', '0');");
            statement.execute("insert into " + dataBase + ".parametros "
                    + "values('CODVENDA', 'Ultimo codigo de VENDA criado', '0');");
  
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(VerificaConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}