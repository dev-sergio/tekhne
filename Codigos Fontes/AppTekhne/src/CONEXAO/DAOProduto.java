package CONEXAO;

import METODOS.Produto;
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
public class DAOProduto {

    // Cria variavel de conexão
    Connection connection;

    public DAOProduto() {
          
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void getRegistroSelecionado(JTable jTable, Produto produto) {
        produto.setID(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
        produto.setTipo(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 1)));
        produto.setValor(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 2)));
        produto.setDescricao(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 3)));
        
    }
    
    
    public void getCodProduto(Produto produto) {
        String sql = "SELECT valor FROM parametros WHERE variavel = 'CODPRODUTO'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                int aux = Integer.parseInt(resultSet.getString("valor")) + 1;
                produto.setID(String.valueOf(aux));
                statement.close();
            } else {
                produto.setID("1");
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    
    public JTable getTabelaUsuario(JTable jTable) {

        String sql1 = "SELECT * FROM produto";

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
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idproduto"),
                        resultSet.getString("tipo"), resultSet.getString("valor"), 
                        resultSet.getString("descricao")});
                    
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
            
        } catch (SQLException ex) {
            
            throw new RuntimeException();
        }
    }
    
    
    public void insert(Produto produto) {
        
        String sql1 = "INSERT INTO produto VALUES(" + produto.getID() + ",'" 
                + produto.getTipo() + "','" + produto.getValor() + "','" 
                + produto.getDescricao() + "')";
        String sql2 = "UPDATE parametros SET valor = '" + produto.getID() + "' WHERE `variavel`='CODPRODUTO'";
        
        try {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql1);
                statement.execute(sql2);
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public void delete(Produto produto) {

        String sql1 = "SELECT idproduto FROM produto WHERE idproduto = " + produto.getID();
        String sql2 = "DELETE FROM produto WHERE idproduto = " + produto.getID();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            if (resultSet.first()) {
                statement.execute(sql1);
                statement.execute(sql2);
                JOptionPane.showMessageDialog(null, "Concluido");
            }
            statement.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação!");
            throw new RuntimeException();
        }
    }

    public void update(Produto produto) {
        String sql1 = "UPDATE produto SET tipo = '" + produto.getTipo() + "' WHERE idproduto = " + produto.getID();
        String sql2 = "UPDATE produto SET valor = '" + produto.getValor() + "' WHERE idproduto = " + produto.getID();
        String sql3 = "UPDATE produto SET descricao = '" + produto.getDescricao() + "' WHERE idproduto = " + produto.getID();
        

        Statement statement;
        try {
            statement = connection.createStatement();
            statement.execute(sql1);
            statement.execute(sql2);
            statement.execute(sql3);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

            throw new RuntimeException();
        }
    }
}