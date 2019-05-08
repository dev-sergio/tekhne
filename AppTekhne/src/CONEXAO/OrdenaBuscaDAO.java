package CONEXAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio Junior
 */
public class OrdenaBuscaDAO {

    // Cria variavel de conexão
    Connection connection;

    public OrdenaBuscaDAO() {
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(OrdenaBuscaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean getCodExistente(String codigo, String sql) {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                statement.close();
                return true;
            } else {
                statement.close();
                return false;
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }

    public boolean getCodBloqueado(String sql) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.first()) {
                statement.close();
                return true;
            } else {
                statement.close();
                return false;
            }
        } catch (SQLException ex) {

            throw new RuntimeException();
        }
    }
}
