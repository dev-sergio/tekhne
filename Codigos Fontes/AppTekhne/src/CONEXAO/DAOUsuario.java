package CONEXAO;

import METODOS.Usuario;
import static SEGURANCA.MD5.md5;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio Junior
 */
public class DAOUsuario {

    // Cria variavel de conexão
    Connection connection;

    public DAOUsuario() {
          
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void getRegistroSelecionado(JTable jTable, Usuario usuario) {
        usuario.setId(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));
        usuario.setNome(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 1)));
        usuario.setTipodeacesso(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 2)));
        
    }
    
    
    
    public void getCodUsuario(Usuario usuario) {
        String sql = "SELECT valor FROM parametros WHERE variavel = 'CODUSUARIO'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                int aux = Integer.parseInt(resultSet.getString("valor")) + 1;
                usuario.setId(String.valueOf(aux));
                statement.close();
            } else {
                usuario.setId("1");
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    

    
    public JTable getTabelaUsuario(JTable jTable, String registro) {
        
        String sql1 = "SELECT * FROM usuario WHERE registro = " + registro;        
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
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idusuario"),
                        resultSet.getString("usuario"), resultSet.getString("tipoacesso")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
            
        } catch (SQLException ex) {
            
            throw new RuntimeException();
        }
    }
    
    
    
    public JTable getTabelaUsuario(JTable jTable) {
        
        String sql1 = "SELECT * FROM usuario";

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
                    defaultTableModel.addRow(new Object[]{resultSet.getString("idusuario"),
                        resultSet.getString("usuario"), resultSet.getString("tipoacesso")});
                } while (resultSet.next());
            }
            statement.close();
            return jTable;
            
        } catch (SQLException ex) {
            
            throw new RuntimeException();
        }
    }
    
    
    public void insert(Usuario usuario) {
        
        String sql1 = "INSERT INTO usuario VALUES(" + usuario.getId() + ",'" 
                + usuario.getRegistro() + "','" + usuario.getNome() + "','" 
                + usuario.getSenha() + "','" + usuario.getTipodeacesso() + "')";
        String sql2 = "UPDATE parametros SET valor = '" + usuario.getId() + "' WHERE `variavel`='CODUSUARIO'";
        
        try {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql1);
                statement.execute(sql2);
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
    
    public void update1(Usuario usuario) throws NoSuchAlgorithmException {
        String sql1 = "UPDATE usuario SET usuario = '" + usuario.getNome() + "' WHERE idusuario = " + usuario.getId();
        String sql2 = "UPDATE usuario SET tipoacesso = '" + usuario.getTipodeacesso() + "' WHERE idusuario = " + usuario.getId();

        JPasswordField pwd = new JPasswordField(10);
        int action = JOptionPane.showConfirmDialog(null, pwd, "Insira a senha do usuario", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) {
            JOptionPane.showMessageDialog(null, "Senha não atualizada!");
            Statement statement;
            try {
                statement = connection.createStatement();
                statement.execute(sql1);
                statement.execute(sql2);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

                throw new RuntimeException();
            }

        } else {
            String senha = new String(pwd.getPassword());
            if ("".equals(senha)) {

                JOptionPane.showMessageDialog(null, "Senha em branco, não foi possivel atualizar a senha \n A senha sera a mesma antiga");

            } else {

                String sql3 = "UPDATE usuario SET senha = '" + md5(senha) + "' WHERE idusuario = " + usuario.getId();

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
    }
    
    
    public void update2(Usuario usuario) throws NoSuchAlgorithmException {
        String sql1 = "UPDATE usuario SET usuario = '" + usuario.getNome() + "' WHERE idusuario = " + usuario.getId();
        String sql2 = "UPDATE usuario SET tipoacesso = '" + usuario.getTipodeacesso() + "' WHERE idusuario = " + usuario.getId();

        Statement statement;
        try {
            statement = connection.createStatement();
            statement.execute(sql1);
            statement.execute(sql2);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o registro!");

            throw new RuntimeException();
        }
    }

    
    
    
    
    
    
    public void delete(Usuario usuario) {

        String sql1 = "SELECT registro FROM usuario WHERE idusuario = " + usuario.getId();
        String sql2 = "DELETE FROM usuario WHERE idusuario = " + usuario.getId();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            if (resultSet.first()) {
                statement.execute(sql2);
                JOptionPane.showMessageDialog(null, "Concluido");
            }
            statement.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação!");
            throw new RuntimeException();
        }
    }
}