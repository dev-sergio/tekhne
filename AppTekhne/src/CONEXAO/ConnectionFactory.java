package CONEXAO;

import FILE.Arquivos;
import FILE.ArquivosLeitura;
import TELAS.TelaLogin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class ConnectionFactory {

    public ConnectionFactory() throws FileNotFoundException, IOException, Exception {
        setConnection();
    }

    String server;
    String door;
    String dataBase;
    String user;
    String password;

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public final void setConnection() throws Exception {

        try {
            Arquivos arquivos = new Arquivos();
            ArquivosLeitura arquivosleitura = new ArquivosLeitura(5, arquivos.getArquivoDeConf());
 
            
            server = arquivosleitura.getArrayDoArquivo()[0];
            door = arquivosleitura.getArrayDoArquivo()[1];
            dataBase = arquivosleitura.getArrayDoArquivo()[2];
            user = arquivosleitura.getArrayDoArquivo()[3];
            password = arquivosleitura.getArrayDoArquivo()[4];
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() throws Exception {
        try {
            setConnection();

            return DriverManager.getConnection("jdbc:mysql://" + server + ":" + door + "/" + dataBase, user, password);

        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão!\nVerifique as configurações do banco de dados MySQL atravez do programa 'Configurações do MySQL' ");
            System.exit(1);
            throw new RuntimeException(excecao);
            
        }
    }
}
