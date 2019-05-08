package CONEXAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Junior
 */
public class DAO {

    // Cria variavel de conexão
    Connection connection;

    public DAO() {
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JTable getProduto(JTable jTable) {
        try {
            String SQL = "SELECT idproduto, descricao, custo FROM produto";

            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(SQL);

            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel = (DefaultTableModel) jTable.getModel();

            while (defaultTableModel.getRowCount() != 0) {
                defaultTableModel.removeRow(0);
            }

            jTable.setModel(defaultTableModel);

            if (resultSet1.first()) {
                do {
                    defaultTableModel.addRow(new Object[]{resultSet1.getString("idproduto"), resultSet1.getString("descricao"), resultSet1.getString("custo")});
                } while (resultSet1.next());
            }
            statement1.close();
            return jTable;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JTable getFornecedor(JTable jTable) {
        try {
            String SQL = "SELECT idfornecedor, razao FROM fornecedor";

            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(SQL);

            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel = (DefaultTableModel) jTable.getModel();

            while (defaultTableModel.getRowCount() != 0) {
                defaultTableModel.removeRow(0);
            }

            jTable.setModel(defaultTableModel);

            if (resultSet1.first()) {
                do {
                    defaultTableModel.addRow(new Object[]{resultSet1.getString("idfornecedor"), resultSet1.getString("razao")});
                } while (resultSet1.next());
            }
            statement1.close();
            return jTable;

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JTable getTipoMovimento(JTable jTable, String tipo) {
        try {

            String SQL = "SELECT idmovimento, descricao FROM tipomovimento WHERE tipo = '" + tipo + "'";

            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(SQL);

            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel = (DefaultTableModel) jTable.getModel();

            while (defaultTableModel.getRowCount() != 0) {
                defaultTableModel.removeRow(0);
            }

            jTable.setModel(defaultTableModel);

            if (resultSet1.first()) {
                do {
                    defaultTableModel.addRow(new Object[]{resultSet1.getString("idmovimento"), resultSet1.getString("descricao")});
                } while (resultSet1.next());
            }
            statement1.close();
            return jTable;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JTable getUsuario(JTable jTable) {
        try {
            String SQL = "SELECT idusuario, codusuario, nome FROM usuario";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);

            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel = (DefaultTableModel) jTable.getModel();

            while (defaultTableModel.getRowCount() != 0) {
                defaultTableModel.removeRow(0);
            }

            jTable.setModel(defaultTableModel);

            if (resultSet.first()) {
                do {
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idusuario"), resultSet.getString("codusuario"), resultSet.getString("nome")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JTable getCliente(JTable jTable) {
        try {
            String SQL = "SELECT * FROM cliente";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);

            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel = (DefaultTableModel) jTable.getModel();

            while (defaultTableModel.getRowCount() != 0) {
                defaultTableModel.removeRow(0);
            }

            jTable.setModel(defaultTableModel);

            if (resultSet.first()) {
                do {
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idcliente"), resultSet.getString("cnpj"), resultSet.getString("nome")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }
}
