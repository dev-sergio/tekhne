package TELAS;

import CONEXAO.DAOCliente;
import METODOS.Cliente;
import CONEXAO.OrdenaBusca;
import CONEXAO.Perguntas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public final class ClienteMostra extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    DAOCliente clienteDAO = new DAOCliente();
    Perguntas pergunta = new Perguntas();
    OrdenaBusca ordenaBusca = new OrdenaBusca();

    public ClienteMostra() {
        initComponents();
        clienteDAO.getTabelaCliente(TCadCliente);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public ClienteMostra(boolean setVisivel) {
        initComponents();
        BNovo.setVisible(setVisivel);
        BAlterar.setVisible(setVisivel);
        BExcluir.setVisible(setVisivel);
        
        clienteDAO.getTabelaCliente(TCadCliente);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public ClienteMostra(JTable jTable, Cliente cliente) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TCadCliente = new javax.swing.JTable();
        BExcluir = new javax.swing.JButton();
        BNovo = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        CBPesquisa = new javax.swing.JComboBox();
        FieldPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes Cadastrados");

        PBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro de Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TCadCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CNPJ", "E-Mail", "Telefone", "Endereço", "CEP", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TCadCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TCadCliente);
        if (TCadCliente.getColumnModel().getColumnCount() > 0) {
            TCadCliente.getColumnModel().getColumn(0).setMinWidth(0);
            TCadCliente.getColumnModel().getColumn(0).setPreferredWidth(90);
            TCadCliente.getColumnModel().getColumn(0).setMaxWidth(90);
        }

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

        CBPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome" }));
        CBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesquisaActionPerformed(evt);
            }
        });

        FieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                        .addComponent(CBPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BNovo)
                        .addGap(18, 18, 18)
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
                    .addComponent(CBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
        ClienteCadastro telaCadCliente = new ClienteCadastro();
        clienteDAO.getTabelaCliente(TCadCliente);
    }//GEN-LAST:event_BNovoActionPerformed

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed
        // TODO add your handling code here:
        ClienteCadastro clienteCadastro = new ClienteCadastro(TCadCliente, cliente);
        clienteDAO.getTabelaCliente(TCadCliente);
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        // TODO add your handling code here:
        if (TCadCliente.getSelectedRow() != -1 && pergunta.PerguntaYesNo() == true) {
            clienteDAO.getRegistroSelecionado(TCadCliente, cliente);
            clienteDAO.delete(cliente);
            clienteDAO.getTabelaCliente(TCadCliente);
        } else {
        }
    }//GEN-LAST:event_BExcluirActionPerformed

    private void FieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPesquisaActionPerformed
        // TODO add your handling code here:
        int index = 0;
        switch (CBPesquisa.getSelectedItem().toString()) {
            case "Código":
                index = 0;
                break;
            case "Nome":
                index = 1;
                break;
        }
        ordenaBusca.busca(TCadCliente, FieldPesquisa, index);
    }//GEN-LAST:event_FieldPesquisaActionPerformed

    private void CBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPesquisaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BNovo;
    private javax.swing.JComboBox CBPesquisa;
    private javax.swing.JTextField FieldPesquisa;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTable TCadCliente;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
