/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import CONEXAO.DAOPagamento;
import CONEXAO.OrdenaBusca;
import CONEXAO.Perguntas;
import METODOS.Pagamento;
import javax.swing.JFrame;

/**
 *
 * @author Sergio Junior
 */
public final class PagamentoMostra extends javax.swing.JFrame {

    Pagamento pagamento = new Pagamento();
    DAOPagamento pagamentoDAO = new DAOPagamento();
    Perguntas pergunta = new Perguntas();
    OrdenaBusca ordenaBusca = new OrdenaBusca();

    public PagamentoMostra() {
        initComponents();
        pagamentoDAO.getTabelaForma(TCadPgto);
        
        setExtendedState(JFrame.NORMAL);
        setVisible(true);
        setLocationRelativeTo(null);
        
        TCadPgto.getColumnModel().getColumn(0).setPreferredWidth(20);  
        TCadPgto.getColumnModel().getColumn(1).setPreferredWidth(100);    
    }

    public PagamentoMostra(boolean setVisivel) {
        initComponents();
        BNovo.setVisible(setVisivel);
        BAlterar.setVisible(setVisivel);
        BExcluir.setVisible(setVisivel);
        pagamentoDAO.getTabelaForma(TCadPgto);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setLocationRelativeTo(null);
        
        TCadPgto.getColumnModel().getColumn(0).setPreferredWidth(20);  
        TCadPgto.getColumnModel().getColumn(1).setPreferredWidth(100);  
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        BExcluir = new javax.swing.JButton();
        BNovo = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        CBoxOrdenar = new javax.swing.JComboBox();
        FieldPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TCadPgto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma de Pagamento");
        setLocationByPlatform(true);
        setResizable(false);

        PBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Mostrar Formas de Pagamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        BNovo.setText("Novo");
        BNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNovoActionPerformed(evt);
            }
        });

        BAlterar.setText("Alterar");
        BAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarActionPerformed(evt);
            }
        });

        CBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id", "Forma" }));
        CBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxOrdenarActionPerformed(evt);
            }
        });

        FieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPesquisaActionPerformed(evt);
            }
        });

        TCadPgto.setAutoCreateRowSorter(true);
        TCadPgto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Forma de Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TCadPgto.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TCadPgto);

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(CBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(BNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BExcluir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNovo)
                    .addComponent(BExcluir)
                    .addComponent(BAlterar)
                    .addComponent(CBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void BNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNovoActionPerformed
        // TODO add your handling code here:
        PagamentoCadastro pagamentoCadastro = new PagamentoCadastro();
        pagamentoDAO.getTabelaForma(TCadPgto);
    }//GEN-LAST:event_BNovoActionPerformed

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed
        // TODO add your handling code here:
        PagamentoCadastro pagamentoCadastro = new PagamentoCadastro(TCadPgto, pagamento);
        pagamentoDAO.getTabelaForma(TCadPgto);
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        // TODO add your handling code here:
        if (TCadPgto.getSelectedRow() != -1 && pergunta.PerguntaYesNo("Deseja realmente executar essa operação?")) {
            pagamentoDAO.getRegistroSelecionado(TCadPgto, pagamento);
            pagamentoDAO.delete(pagamento);
            pagamentoDAO.getTabelaForma(TCadPgto);
        } else {
        }
    }//GEN-LAST:event_BExcluirActionPerformed
   
    
    private void CBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxOrdenarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CBoxOrdenarActionPerformed

    private void FieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPesquisaActionPerformed
        // TODO add your handling code here:
        int index = 0;
        switch (CBoxOrdenar.getSelectedItem().toString()) {
            case "Id":
                index = 0;
                break;
            case "Forma":
                index = 1;
                break;
        }
        ordenaBusca.busca(TCadPgto, FieldPesquisa, index);
    }//GEN-LAST:event_FieldPesquisaActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BNovo;
    private javax.swing.JComboBox CBoxOrdenar;
    private javax.swing.JTextField FieldPesquisa;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTable TCadPgto;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
