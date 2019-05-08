/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Perguntas {

    public boolean PerguntaYesNo() {
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente executar essa operação?", "Atenção", JOptionPane.OK_OPTION);

        if (escolha == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PerguntaYesNo(String frase) {
        int escolha = JOptionPane.showConfirmDialog(null, frase, "Atenção", JOptionPane.OK_OPTION);

        if (escolha == 0) {
            return true;
        } else {
            return false;
        }
    }
}
