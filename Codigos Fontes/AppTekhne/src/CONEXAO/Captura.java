/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXAO;

/**
 *
 * @author Sergio Junior
 */
public class Captura {
    
    static String usuario;
    static String senha;
    static int tipoacesso;

    public static String getusuario() {
        return usuario;
    }

    public static void setusuario(String usuario) {
        Captura.usuario = usuario;
    }

    public static String getsenha() {
        return senha;
    }

    public static void setsenha(String senha) {
        Captura.senha = senha;
    }

    public static int gettipoacesso() {
        return tipoacesso;
    }

    public static void settipoacesso(int tipoacesso) {
        Captura.tipoacesso = tipoacesso;
    }

}
