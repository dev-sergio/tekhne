package CONEXAO;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class OrdenaBusca {

    public void busca(JTable jTable, JTextField jTextField, int index) {
        int aux = 0;
        boolean achou = true;

        while (achou) {
            String valor1 = jTextField.getText();
            String valor2 = (String) jTable.getValueAt(aux, index);
            if (valor1 == null ? valor2 == null : valor1.equals(valor2)) {
                jTable.setRowSelectionInterval(aux, aux);
                achou = false;
            }
            aux++;
            if (aux == jTable.getRowCount() && achou) {
                JOptionPane.showMessageDialog(null, "Valor não encontrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                achou = false;
            }
        }
    }
}
