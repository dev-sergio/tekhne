package CONEXAO;

import java.sql.Connection;
import java.sql.Statement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio Junior
 */
public class DAOLogin {

    // Cria variavel de conexão
    Connection connection;

    public DAOLogin() throws Exception {
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public boolean verificaUsuario() {
        String sql1 = "SELECT * FROM usuario WHERE usuario = '" + Captura.getusuario() + "'";

        try {
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet1 = statement.executeQuery(sql1);

                if (resultSet1.next()) {
                    String Senha1 = Captura.getsenha();
                    String Senha2 = resultSet1.getString("senha");
                    return (Senha1).equals(Senha2);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    public boolean tipoacesso() {
        String sql1 = "SELECT * FROM usuario WHERE usuario = '" + Captura.getusuario() + "'";

        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet1 = statement.executeQuery(sql1);

            if (resultSet1.next()) {
                String idstatus = resultSet1.getString("tipoacesso");
                return ("ADMIN").equals(idstatus);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }
}
