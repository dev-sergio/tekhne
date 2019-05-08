/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import CONEXAO.DAOFuncionario;
import CONEXAO.DAOUsuario;
import CONEXAO.DAOVenda;
import METODOS.Funcionario;
import CONEXAO.OrdenaBusca;
import CONEXAO.Perguntas;
import METODOS.Venda;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Sergio Junior
 */
public final class VendaMostra extends javax.swing.JFrame {

    Venda venda = new Venda();
    DAOVenda vendaDAO = new DAOVenda();
    Perguntas pergunta = new Perguntas();
    OrdenaBusca ordenaBusca = new OrdenaBusca();

    public VendaMostra() {
        initComponents();
        vendaDAO.getTabelaVenda(TCadVenda);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
    }

    public VendaMostra(boolean setVisivel) {
        initComponents();
        BNovo.setVisible(setVisivel);
        BAlterar.setVisible(setVisivel);
        BExcluir.setVisible(setVisivel);
        
        
        vendaDAO.getTabelaVenda(TCadVenda);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TCadVenda = new javax.swing.JTable();
        BExcluir = new javax.swing.JButton();
        BNovo = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        CBoxOrdenar = new javax.swing.JComboBox();
        FieldPesquisa2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENDAS");
        setResizable(false);

        PBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Vendas Realizadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TCadVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cliente", "Produto", "Quantidade", "Forma de Pagamento", "Desconto", "Valor Total", "Vendedor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TCadVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TCadVenda);
        if (TCadVenda.getColumnModel().getColumnCount() > 0) {
            TCadVenda.getColumnModel().getColumn(0).setMinWidth(60);
            TCadVenda.getColumnModel().getColumn(0).setPreferredWidth(60);
            TCadVenda.getColumnModel().getColumn(0).setMaxWidth(60);
            TCadVenda.getColumnModel().getColumn(1).setMinWidth(90);
            TCadVenda.getColumnModel().getColumn(1).setPreferredWidth(90);
            TCadVenda.getColumnModel().getColumn(1).setMaxWidth(90);
            TCadVenda.getColumnModel().getColumn(4).setMinWidth(200);
            TCadVenda.getColumnModel().getColumn(4).setPreferredWidth(200);
            TCadVenda.getColumnModel().getColumn(4).setMaxWidth(200);
            TCadVenda.getColumnModel().getColumn(5).setMinWidth(60);
            TCadVenda.getColumnModel().getColumn(5).setPreferredWidth(60);
            TCadVenda.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        BNovo.setText("Novas Vendas");
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

        CBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo" }));
        CBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxOrdenarActionPerformed(evt);
            }
        });

        FieldPesquisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPesquisa2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(CBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FieldPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluir)))
                .addContainerGap())
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNovo)
                    .addComponent(BExcluir)
                    .addComponent(BAlterar)
                    .addComponent(CBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        VendaCadastro vendaCadastro = new VendaCadastro();
        vendaDAO.getTabelaVenda(TCadVenda);
    }//GEN-LAST:event_BNovoActionPerformed

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed
        // TODO add your handling code here:
        VendaCadastro vendaCadastro = new VendaCadastro(TCadVenda, venda);
        vendaDAO.getTabelaVenda(TCadVenda);
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        // TODO add your handling code here:
        if (TCadVenda.getSelectedRow() != -1 && pergunta.PerguntaYesNo("Deseja realmente executar essa operação? \n Essa operação excluirá permanentemente a venda no banco de dados.")) {
            vendaDAO.getRegistroSelecionado(TCadVenda, venda);
            vendaDAO.delete(venda);
            vendaDAO.getTabelaVenda(TCadVenda);
        } else {
        }
    }//GEN-LAST:event_BExcluirActionPerformed
   
    
    private void CBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxOrdenarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CBoxOrdenarActionPerformed

    private void FieldPesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPesquisa2ActionPerformed
        // TODO add your handling code here:
        int index = 0;
        switch (CBoxOrdenar.getSelectedItem().toString()) {
            case "Codigo":
                index = 0;
                break;
        }
        ordenaBusca.busca(TCadVenda, FieldPesquisa2, index);
    }//GEN-LAST:event_FieldPesquisa2ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BNovo;
    private javax.swing.JComboBox CBoxOrdenar;
    private javax.swing.JTextField FieldPesquisa2;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTable TCadVenda;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
