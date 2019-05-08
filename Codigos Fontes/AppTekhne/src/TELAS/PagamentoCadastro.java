package TELAS;


import CONEXAO.OrdenaBuscaDAO;
import javax.swing.JOptionPane;
import CONEXAO.DAOPagamento;
import METODOS.Converter;
import METODOS.Pagamento;
import javax.swing.JTable;

public class PagamentoCadastro extends javax.swing.JDialog {

    int selectForm;
    Pagamento pagamento = new Pagamento();
    DAOPagamento pagamentoDAO = new DAOPagamento();
    OrdenaBuscaDAO ordenaBuscaDAO = new OrdenaBuscaDAO();
  

    public PagamentoCadastro() {
        setModal(true);
        selectForm = 0;
        initComponents();
        pagamentoDAO.getCodPagamento(pagamento);
        TxtID.setText(pagamento.getID());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public PagamentoCadastro(JTable jTable) {
        setModal(true);
        selectForm = 1;
        initComponents();
        TxtID.setEditable(false);
        
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public PagamentoCadastro(JTable jTable, Pagamento pagamento) {
        setModal(true);
        selectForm = 1;
        initComponents();
        pagamentoDAO.getRegistroSelecionado(jTable, pagamento);
        TxtID.setText(pagamento.getID());
        TxtForma.setText(pagamento.getForma());
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
        TxtForma = new javax.swing.JTextField();
        BSalvar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Pgto");
        setResizable(false);

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LabelID.setText("ID");

        TxtID.setEditable(false);
        TxtID.setFocusable(false);

        LabelNome.setText("Forma de Pagamento");

        TxtForma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtFormaFocusLost(evt);
            }
        });

        BSalvar.setText("Salvar");
        BSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");
        BCancelar.setFocusable(false);
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtForma)
                    .addComponent(LabelNome)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelID)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(BCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarActionPerformed
        try {
            
        pagamento.setID((TxtID.getText()));
        pagamento.setForma((TxtForma.getText()));
        
        
         if ("".equals(TxtID.getText())
                    || "".equals(TxtForma.getText())) {

                JOptionPane.showMessageDialog(null, "Todos os campos são OBRIGATÓRIOS!");
                
            } else {
                
            if (selectForm == 0) {
                pagamentoDAO.insert(pagamento);
                 
            } else if (selectForm == 1) {
                pagamentoDAO.update(pagamento);
                
            }  
            dispose();
            }
        } catch (Exception excecao) {
            throw new RuntimeException();
        }

        
        
        
        

    }//GEN-LAST:event_BSalvarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        dispose(); 
    }//GEN-LAST:event_BCancelarActionPerformed

    private void TxtFormaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtFormaFocusLost
    
         
        
    }//GEN-LAST:event_TxtFormaFocusLost
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BSalvar;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTextField TxtForma;
    private javax.swing.JTextField TxtID;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables
}
