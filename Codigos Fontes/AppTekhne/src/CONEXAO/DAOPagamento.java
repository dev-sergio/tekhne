package CONEXAO;

import METODOS.Pagamento;
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
public class DAOPagamento {

    // Cria variavel de conexão
    Connection connection;

    public DAOPagamento() {
          
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void getRegistroSelecionado(JTable jTable, Pagamento pagamento) {
        pagamento.setID(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
        pagamento.setForma(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 1)));
        
    }
    
    
    public void getCodPagamento(Pagamento pagamento) {
        String sql = "SELECT valor FROM parametros WHERE variavel = 'CODPAGAMENTO'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                int aux = Integer.parseInt(resultSet.getString("valor")) + 1;
                pagamento.setID(String.valueOf(aux));
                statement.close();
            } else {
                pagamento.setID("1");
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    
    public JTable getTabelaForma(JTable jTable) {

        String sql1 = "SELECT * FROM frmpagamento";

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
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idforma"),
                        resultSet.getString("forma")});
                    
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
            
        } catch (SQLException ex) {
            
            throw new RuntimeException();
        }
    }
    
    
    public void insert(Pagamento pagamento) {
        
        String sql1 = "INSERT INTO frmpagamento VALUES(" + pagamento.getID() + ",'" 
                + pagamento.getForma() + "')";
        String sql2 = "UPDATE parametros SET valor = '" + pagamento.getID() + "' WHERE `variavel`='CODPAGAMENTO'";
        
        try {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql1);
                statement.execute(sql2);
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public void delete(Pagamento pagamento) {

        String sql1 = "SELECT idforma FROM frmpagamento WHERE idforma = " + pagamento.getID();
        String sql2 = "DELETE FROM frmpagamento WHERE idforma = " + pagamento.getID();

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

    public void update(Pagamento pagamento) {
        String sql1 = "UPDATE frmpagamento SET forma = '" + pagamento.getForma() + "' WHERE idforma = " + pagamento.getID();
 
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.execute(sql1);
           
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

            throw new RuntimeException();
        }
    }
}