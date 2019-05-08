package CONEXAO;

import METODOS.Venda;
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
public class DAOVenda {

    // Cria variavel de conexão
    Connection connection;

    public DAOVenda() {
          
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    public void getRegistroSelecionado(JTable jTable, Venda venda) {
        venda.setCodigo(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
        venda.setCliente(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 1)));
        venda.setProduto(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 2)));
        venda.setQuantidade(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 3)));
        venda.setForma(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 4)));
        venda.setDesconto(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 5)));
        venda.setValor(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 6)));
        venda.setVendedor(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 7)));
        venda.setData(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 8)));
        
        
        
        
    }
    
public JComboBox getCliente(JComboBox jComboBox) {
        try {
            String sql1 = "SELECT nome FROM cliente";

            Statement statement1 = connection.createStatement();

            ResultSet resultSet1 = statement1.executeQuery(sql1);

            if (resultSet1.first()) {
                do {
                    jComboBox.addItem(resultSet1.getString("nome"));
                } while (resultSet1.next());
            }else 
            {
                jComboBox.addItem("Sem Cliente");
            }
           

            return jComboBox;
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }
public void getValorUnitario(Venda venda) {
        String sql = "SELECT valor FROM produto WHERE tipo = '" + venda.getProduto() + "'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                String aux = resultSet.getString("valor");
                venda.setUnitario(aux);
                statement.close();
            } 
            
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

public JComboBox getProduto(JComboBox jComboBox) {
        try {
            String sql1 = "SELECT tipo FROM produto";

            Statement statement1 = connection.createStatement();

            ResultSet resultSet1 = statement1.executeQuery(sql1);

            if (resultSet1.first()) {
                do {
                    jComboBox.addItem(resultSet1.getString("tipo"));
                } while (resultSet1.next());
            }else 
            {
                jComboBox.addItem("S/ Produto Cadastrado");
            }
           

            return jComboBox;
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }


public JComboBox getForma(JComboBox jComboBox) {
        try {
            String sql1 = "SELECT forma FROM frmpagamento";

            Statement statement1 = connection.createStatement();

            ResultSet resultSet1 = statement1.executeQuery(sql1);

            if (resultSet1.first()) {
                do {
                    jComboBox.addItem(resultSet1.getString("forma"));
                } while (resultSet1.next());
            }else 
            {
                jComboBox.addItem("S/ Forma Pgto");
            }
           

            return jComboBox;
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }


public JComboBox getFuncionario(JComboBox jComboBox) {
        try {
            String sql1 = "SELECT nome FROM Funcionario";

            Statement statement1 = connection.createStatement();

            ResultSet resultSet1 = statement1.executeQuery(sql1);

            if (resultSet1.first()) {
                do {
                    jComboBox.addItem(resultSet1.getString("nome"));
                } while (resultSet1.next());
            }else 
            {
                jComboBox.addItem("Sem Funcionario");
            }
           

            return jComboBox;
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }















    public void getCodVenda(Venda venda) {
        String sql = "SELECT valor FROM parametros WHERE variavel = 'CODVENDA'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                int aux = Integer.parseInt(resultSet.getString("valor")) + 1;
                venda.setCodigo(String.valueOf(aux));
                statement.close();
            } else {
                venda.setCodigo("1");
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    
    public JTable getTabelaVenda(JTable jTable) {

        String sql1 = "SELECT * FROM venda";

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
                    defaultTableModel.addRow(new Object[]{resultSet.getString("codigo"),
                        resultSet.getString("cliente"), resultSet.getString("produto"), 
                        resultSet.getString("quantidade"), resultSet.getString("forma"), 
                        resultSet.getString("desconto"), resultSet.getString("valor"), 
                        resultSet.getString("vendedor"), resultSet.getString("data")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
            
        } catch (SQLException ex) {
            
            throw new RuntimeException();
        }
    }
    
    
    public void insert(Venda venda) {
        
        String sql1 = "INSERT INTO venda VALUES(" + venda.getCodigo() + ",'" 
                + venda.getData() + "','" + venda.getDesconto() + "','" 
                + venda.getCliente() + "','" + venda.getVendedor() + "','" 
                + venda.getProduto() + "','" + venda.getQuantidade() + "','"
                + venda.getForma() + "','" + venda.getValor() + "')";
        String sql2 = "UPDATE parametros SET valor = '" + venda.getCodigo() + "' WHERE `variavel`='CODVENDA'";
        
        try {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql1);
                statement.execute(sql2);
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public void delete(Venda venda) {

        String sql1 = "SELECT codigo FROM venda WHERE codigo = " + venda.getCodigo();
        String sql2 = "DELETE FROM venda WHERE codigo = " + venda.getCodigo();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            if (resultSet.first()) {
               // statement.execute(sql2);
                statement.execute(sql2);
                JOptionPane.showMessageDialog(null, "Concluido");
            }
            statement.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação!");
            throw new RuntimeException();
        }
    }

    public void update(Venda venda) {
        String sql1 = "UPDATE venda SET data = '" + venda.getData() + "' WHERE codigo = " + venda.getCodigo();
        String sql2 = "UPDATE venda SET desconto = '" + venda.getDesconto() + "' WHERE codigo = " + venda.getCodigo();
        String sql3 = "UPDATE venda SET cliente = '" + venda.getCliente() + "' WHERE codigo = " + venda.getCodigo();
        String sql4 = "UPDATE venda SET vendedor = '" + venda.getVendedor() + "' WHERE codigo = " + venda.getCodigo();
        String sql5 = "UPDATE venda SET produto = '" + venda.getProduto() + "' WHERE codigo = " + venda.getCodigo();
        String sql6 = "UPDATE venda SET quantidade = '" + venda.getQuantidade() + "' WHERE codigo = " + venda.getCodigo();
        String sql7 = "UPDATE venda SET forma = '" + venda.getForma() + "' WHERE codigo = " + venda.getCodigo();
        String sql8 = "UPDATE venda SET valor = '" + venda.getValor() + "' WHERE codigo = " + venda.getCodigo();
        
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
 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

            throw new RuntimeException();
        }
    }
}