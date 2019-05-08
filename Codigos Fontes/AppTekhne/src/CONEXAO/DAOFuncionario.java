package CONEXAO;

import METODOS.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Junior
 */
public class DAOFuncionario {

    // Cria variavel de conexão
    Connection connection;

    public DAOFuncionario() {
          
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void getRegistroSelecionado(JTable jTable, Funcionario funcionario) {
        funcionario.setRegistro(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
        funcionario.setCtps(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 1)));
        funcionario.setSerie(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 2)));
        funcionario.setNome(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 3)));
        funcionario.setTelefone(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 4)));
        funcionario.setCargo(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 5)));
        funcionario.setSalario(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 6)));
        funcionario.setDatanascimento(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 7)));
        funcionario.setCep(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 9)));
        funcionario.setEndereco(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 8)));
        funcionario.setBairro(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 10)));
        funcionario.setCidade(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 11)));
        funcionario.setEstado(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 12)));
        
        
        
    }
    
    
    public void getCodFuncionario(Funcionario funcionario) {
        String sql = "SELECT valor FROM parametros WHERE variavel = 'CODFUNCIONARIO'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                int aux = Integer.parseInt(resultSet.getString("valor")) + 1;
                funcionario.setRegistro(String.valueOf(aux));
                statement.close();
            } else {
                funcionario.setRegistro("1");
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    
    public JTable getTabelaUsuario(JTable jTable) {

        String sql1 = "SELECT * FROM funcionario";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);

            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel = (DefaultTableModel) jTable.getModel();

            while (defaultTableModel.getRowCount() != 0) {
                defaultTableModel.removeRow(0);
            }

            jTable.setModel(defaultTableModel);

            if (resultSet.first()) {
                do {
                    defaultTableModel.addRow(new Object[]{resultSet.getString("registro"),
                        resultSet.getString("CTPS"), resultSet.getString("serie"), resultSet.getString("nome"), 
                        resultSet.getString("telefone"), resultSet.getString("cargo"), 
                        resultSet.getString("salario"), resultSet.getString("datanascimento"), 
                        resultSet.getString("endereco"), resultSet.getString("cep"), resultSet.getString("bairro"), 
                        resultSet.getString("cidade"), resultSet.getString("estado")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
            
        } catch (SQLException ex) {
            
            throw new RuntimeException();
        }
    }
    
    
    public void insert(Funcionario funcionario) {
        
        String sql1 = "INSERT INTO funcionario VALUES(" + funcionario.getRegistro() + ",'" 
                + funcionario.getCtps() + "','" + funcionario.getSerie() + "','" 
                + funcionario.getCargo() + "','" + funcionario.getSalario() + "','"
                + funcionario.getDatanascimento() + "','" + funcionario.getNome() + "','"
                + funcionario.getEndereco() + "','" + funcionario.getBairro() + "','"
                + funcionario.getCidade() + "','" + funcionario.getEstado() + "','"
                + funcionario.getTelefone() + "','" + funcionario.getCep() + "')";
        String sql2 = "UPDATE parametros SET valor = '" + funcionario.getRegistro() + "' WHERE `variavel`='CODFUNCIONARIO'";
        
        try {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql1);
                statement.execute(sql2);
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public void delete(Funcionario funcionario) {

        String sql1 = "SELECT registro FROM funcionario WHERE registro = " + funcionario.getRegistro();
        String sql2 = "DELETE FROM usuario WHERE registro = '" + funcionario.getRegistro() + "'";
        String sql3 = "DELETE FROM funcionario WHERE registro = " + funcionario.getRegistro();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            if (resultSet.first()) {
                statement.execute(sql2);
                statement.execute(sql3);
                JOptionPane.showMessageDialog(null, "Concluido");
            }
            statement.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação!");
            throw new RuntimeException();
        }
    }

    public void update(Funcionario funcionario) {
        String sql1 = "UPDATE funcionario SET CTPS = '" + funcionario.getCtps() + "' WHERE registro = " + funcionario.getRegistro();
        String sql2 = "UPDATE funcionario SET cargo = '" + funcionario.getCargo() + "' WHERE registro = " + funcionario.getRegistro();
        String sql3 = "UPDATE funcionario SET salario = '" + funcionario.getSalario() + "' WHERE registro = " + funcionario.getRegistro();
        String sql4 = "UPDATE funcionario SET datanascimento = '" + funcionario.getDatanascimento() + "' WHERE registro = " + funcionario.getRegistro();
        String sql5 = "UPDATE funcionario SET nome = '" + funcionario.getNome() + "' WHERE registro = " + funcionario.getRegistro();
        String sql6 = "UPDATE funcionario SET endereco = '" + funcionario.getEndereco() + "' WHERE registro = " + funcionario.getRegistro();
        String sql7 = "UPDATE funcionario SET bairro = '" + funcionario.getBairro() + "' WHERE registro = " + funcionario.getRegistro();
        String sql8 = "UPDATE funcionario SET cidade = '" + funcionario.getCidade() + "' WHERE registro = " + funcionario.getRegistro();
        String sql9 = "UPDATE funcionario SET estado = '" + funcionario.getEstado() + "' WHERE registro = " + funcionario.getRegistro();
        String sql10 = "UPDATE funcionario SET telefone = '" + funcionario.getTelefone() + "' WHERE registro = " + funcionario.getRegistro();
        String sql11 = "UPDATE funcionario SET cep = '" + funcionario.getCep() + "' WHERE registro = " + funcionario.getRegistro();
        String sql12 = "UPDATE funcionario SET serie = '" + funcionario.getSerie() + "' WHERE registro = " + funcionario.getRegistro();
        
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.execute(sql1);
            statement.execute(sql2);
            statement.execute(sql3);
            statement.execute(sql4);
            statement.execute(sql5);
            statement.execute(sql6);
            statement.execute(sql7);
            statement.execute(sql8);
            statement.execute(sql9);
            statement.execute(sql10);
            statement.execute(sql11);
            statement.execute(sql12);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

            throw new RuntimeException();
        }
    }
}