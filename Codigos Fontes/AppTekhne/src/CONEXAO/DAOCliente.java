package CONEXAO;

import METODOS.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Junior
 */
public class DAOCliente {

    // Cria variavel de conexão
    Connection connection;

    public DAOCliente(){
        
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    public void getRegistroSelecionado(JTable jTable, Cliente cliente) {
        cliente.setIdCliente(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
        cliente.setNome(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 1)));
        cliente.setCnpj(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 2)));
        cliente.setEmail(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 3)));
        cliente.setTelefone(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 4)));
        cliente.setEndereco(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 5)));
        cliente.setCep(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 6)));
        cliente.setBairro(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 7)));
        cliente.setCidade(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 8)));
        cliente.setEstado(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 9)));

    }

    public void getCodCliente(Cliente cliente) {
        String sql = "SELECT valor FROM parametros WHERE variavel = 'CODCLIENTE'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                int aux = Integer.parseInt(resultSet.getString("valor")) + 1;
                cliente.setIdCliente(String.valueOf(aux));
                statement.close();
            } else {
                cliente.setIdCliente("1");
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    
    public JTable getTabelaCliente(JTable jTable) {

        String sql1 = "SELECT * FROM cliente";

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
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idcliente"), 
                        resultSet.getString("nome"), resultSet.getString("cnpj"), resultSet.getString("email"), 
                        resultSet.getString("telefone"), resultSet.getString("endereco"), resultSet.getString("cep"), 
                        resultSet.getString("bairro"), resultSet.getString("cidade"), resultSet.getString("estado")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;

        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public void insert(Cliente cliente) {

        String sql1 = "INSERT INTO cliente VALUES(" + cliente.getIdCliente() + ",'" 
                + cliente.getCnpj() + "','" + cliente.getEmail() + "','" 
                + cliente.getNome() + "','" + cliente.getEndereco() + "','" 
                + cliente.getBairro() + "','" + cliente.getCidade() + "','" + cliente.getEstado() + "','" 
                + cliente.getTelefone() + "','" + cliente.getCep() + "')";
        
        String sql2 = "UPDATE parametros SET valor = '" + cliente.getIdCliente() + "' WHERE `variavel`='CODCLIENTE'";

        try {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql1);
                statement.execute(sql2);
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public void delete(Cliente cliente) {

        String sql1 = "SELECT idcliente FROM cliente WHERE idcliente = " + cliente.getIdCliente();
        String sql2 = "DELETE FROM cliente WHERE idcliente = " + cliente.getIdCliente();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);

            if (resultSet.first()) {
                statement.execute(sql2);
                JOptionPane.showMessageDialog(null, "Concluido");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação!\nVerificar se existem registros relacionados.");
            throw new RuntimeException();
        }
    }

    public void update(Cliente cliente) {
        String sql1 = "UPDATE cliente SET cnpj = '" + cliente.getCnpj() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql2 = "UPDATE cliente SET email = '" + cliente.getEmail() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql3 = "UPDATE cliente SET nome = '" + cliente.getNome() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql4 = "UPDATE cliente SET nome = '" + cliente.getNome() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql5 = "UPDATE cliente SET endereco = '" + cliente.getEndereco() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql6 = "UPDATE cliente SET bairro = '" + cliente.getBairro() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql7 = "UPDATE cliente SET cidade = '" + cliente.getCidade() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql8 = "UPDATE cliente SET estado = '" + cliente.getEstado() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql9 = "UPDATE cliente SET telefone = '" + cliente.getTelefone() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        String sql10 = "UPDATE cliente SET cep = '" + cliente.getCep() + "' WHERE idcliente = '" + cliente.getIdCliente() + "'";
        
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
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

            throw new RuntimeException();
        }
    }
}