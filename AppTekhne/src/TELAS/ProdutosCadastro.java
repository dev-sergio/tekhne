package TELAS;


import CONEXAO.OrdenaBuscaDAO;
import javax.swing.JOptionPane;
import CONEXAO.DAOProduto;
import METODOS.Converter;
import static METODOS.Converter.converter;
import METODOS.Produto;
import javax.swing.JTable;

public class ProdutosCadastro extends javax.swing.JDialog {

    int selectForm;
    Produto produto = new Produto();
    DAOProduto produtoDAO = new DAOProduto();
    OrdenaBuscaDAO ordenaBuscaDAO = new OrdenaBuscaDAO();
  
    public ProdutosCadastro() {
        setModal(true);
        selectForm = 0;
        initComponents();
        produtoDAO.getCodProduto(produto);
        TxtID.setText(produto.getID());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public ProdutosCadastro(JTable jTable, Produto produto) {
        setModal(true);
        selectForm = 1;
        initComponents();
        produtoDAO.getRegistroSelecionado(jTable, produto);
        TxtID.setText(produto.getID());
        TxtValor.setText(produto.getValor());
        TxtTipo.setText(produto.getTipo());
        TxtDesc.setText(produto.getDescricao());
        
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        PBorda = new javax.swing.JPanel();
        LabelID = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        LabelNome = new javax.swing.JLabel();
        TxtTipo = new javax.swing.JTextField();
        BSalvar = new javax.swing.JButton();
        LabelDataNasc = new javax.swing.JLabel();
        BCancelar = new javax.swing.JButton();
        LabelDataNasc1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDesc = new javax.swing.JTextArea();
        TxtValor = new javax.swing.JTextField();
        LabelCidade1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Produto");
        setResizable(false);

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LabelID.setText("ID");

        TxtID.setEditable(false);
        TxtID.setFocusable(false);

        LabelNome.setText("Tipo (nome)*");

        BSalvar.setText("Salvar");
        BSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarActionPerformed(evt);
            }
        });

        LabelDataNasc.setText("Valor do Serviço*");

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        LabelDataNasc1.setText("Descrição do Serviço a ser prestado");

        TxtDesc.setColumns(20);
        TxtDesc.setLineWrap(true);
        TxtDesc.setRows(5);
        TxtDesc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TxtDesc);

        TxtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtValorFocusLost(evt);
            }
        });
        TxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorActionPerformed(evt);
            }
        });

        LabelCidade1.setText("* CAMPOS OBRIGATÓRIOS");

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelID))
                        .addGap(18, 18, 18)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelDataNasc)
                                .addGap(92, 92, 92))
                            .addComponent(TxtValor)))
                    .addComponent(TxtTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDataNasc1)
                            .addComponent(LabelNome)
                            .addComponent(LabelCidade1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelDataNasc)
                        .addGap(26, 26, 26)))
                .addGap(7, 7, 7)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDataNasc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(BCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelCidade1)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PBorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PBorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarActionPerformed

        try {

            produto.setID((TxtID.getText()));
            produto.setValor((TxtValor.getText()));
            produto.setTipo((TxtTipo.getText()));
            produto.setDescricao((TxtDesc.getText()));
            Converter converter = new Converter();

            if ("".equals(TxtID.getText())
                    || "".equals(TxtTipo.getText())
                    || "".equals(TxtValor.getText())) {

                JOptionPane.showMessageDialog(null, "Existem campos OBRIGATÓRIOS vazios");

            } else {
                String valor = TxtValor.getText();
                valor = valor.replace(',', '.');

                if (converter.isNumeric(valor)) {
                    if (selectForm == 0) {
                        produtoDAO.insert(produto);

                    } else if (selectForm == 1) {
                        produtoDAO.update(produto);
                    }
                    dispose();
                }
            }
        } catch (Exception excecao) {
            throw new RuntimeException();
        }


    }//GEN-LAST:event_BSalvarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        dispose(); 
    }//GEN-LAST:event_BCancelarActionPerformed

    private void TxtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtValorFocusLost
Converter converter = new Converter();
     String valor = TxtValor.getText();
     valor = valor.replace(',', '.');
     
     if ("".equals(TxtValor.getText())) {
         
     }else{
         if (converter.isNumeric(valor)){ 
            String decimal = converter(Double.parseDouble(TxtValor.getText().replace(',', '.')));
            TxtValor.setText(decimal.replace('.', ','));
         }else{
            JOptionPane.showMessageDialog(null, "Campo aceita apenas numeros, '.' e ','!");
            TxtValor.setText("");
            TxtValor.requestFocus();
         }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorFocusLost

    private void TxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BSalvar;
    private javax.swing.JLabel LabelCidade1;
    private javax.swing.JLabel LabelDataNasc;
    private javax.swing.JLabel LabelDataNasc1;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTextArea TxtDesc;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtTipo;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
