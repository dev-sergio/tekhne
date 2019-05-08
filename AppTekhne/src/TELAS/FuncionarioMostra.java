/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import CONEXAO.DAOFuncionario;
import CONEXAO.DAOUsuario;
import METODOS.Funcionario;
import CONEXAO.OrdenaBusca;
import CONEXAO.Perguntas;
import javax.swing.JFrame;

/**
 *
 * @author Sergio Junior
 */
public final class FuncionarioMostra extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    DAOFuncionario funcionarioDAO = new DAOFuncionario();
    DAOUsuario usuarioDAO = new DAOUsuario();
    Perguntas pergunta = new Perguntas();
    OrdenaBusca ordenaBusca = new OrdenaBusca();
    

    public FuncionarioMostra() {
        initComponents();
        funcionarioDAO.getTabelaUsuario(TCadFuncionario);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        TCadFuncionario.setAutoResizeMode(TCadFuncionario.AUTO_RESIZE_OFF); 
        TCadFuncionario.getColumnModel().getColumn(0).setPreferredWidth(53);  
        TCadFuncionario.getColumnModel().getColumn(1).setPreferredWidth(90);  
        TCadFuncionario.getColumnModel().getColumn(2).setPreferredWidth(60);  
        TCadFuncionario.getColumnModel().getColumn(3).setPreferredWidth(160);  
        TCadFuncionario.getColumnModel().getColumn(4).setPreferredWidth(100);  
        TCadFuncionario.getColumnModel().getColumn(5).setPreferredWidth(130);  
        TCadFuncionario.getColumnModel().getColumn(6).setPreferredWidth(80);
        TCadFuncionario.getColumnModel().getColumn(7).setPreferredWidth(70);  
        TCadFuncionario.getColumnModel().getColumn(8).setPreferredWidth(200);  
        TCadFuncionario.getColumnModel().getColumn(9).setPreferredWidth(70);  
        TCadFuncionario.getColumnModel().getColumn(10).setPreferredWidth(90);
        TCadFuncionario.getColumnModel().getColumn(11).setPreferredWidth(90);
        TCadFuncionario.getColumnModel().getColumn(12).setPreferredWidth(110);
    }

    public FuncionarioMostra(boolean setVisivel) {
        initComponents();
        BNovo.setVisible(setVisivel);
        BAlterar.setVisible(setVisivel);
        BExcluir.setVisible(setVisivel);
        BAcessos.setVisible(setVisivel);

        funcionarioDAO.getTabelaUsuario(TCadFuncionario);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TCadFuncionario = new javax.swing.JTable();
        BExcluir = new javax.swing.JButton();
        BNovo = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        BAcessos = new javax.swing.JButton();
        CBoxOrdenar = new javax.swing.JComboBox();
        FieldPesquisa2 = new javax.swing.JTextField();
        BAcessos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios Cadastrados");

        PBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro Funcionarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TCadFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "CTPS", "Nº Serie", "Nome", "Telefone", "Cargo", "Salario", "Data Nasc.", "Endereço", "CEP", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TCadFuncionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TCadFuncionario);

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

        BAcessos.setText("Add Usuario");
        BAcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcessosActionPerformed(evt);
            }
        });

        CBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Registro", "CTPS", "Nome" }));
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

        BAcessos1.setText("Usuario Vinculado");
        BAcessos1.setToolTipText("Selecione um usuario e clique aqui para vizualizar os usuarios vinculados à esse funcionario");
        BAcessos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcessos1ActionPerformed(evt);
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
                        .addGap(18, 18, 18)
                        .addComponent(BAcessos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAcessos)))
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
                    .addComponent(BAcessos)
                    .addComponent(CBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAcessos1))
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
        FuncionarioCadastro funcionarioCadastro = new FuncionarioCadastro();
        funcionarioDAO.getTabelaUsuario(TCadFuncionario);
    }//GEN-LAST:event_BNovoActionPerformed

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed
        // TODO add your handling code here:
        FuncionarioCadastro funcionarioCadastro = new FuncionarioCadastro(TCadFuncionario, funcionario);
        funcionarioDAO.getTabelaUsuario(TCadFuncionario);
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        // TODO add your handling code here:
        if (TCadFuncionario.getSelectedRow() != -1 && pergunta.PerguntaYesNo("A exclusão do funcionario acarretará também na exclusão do Usuario do Sistema.\nDeseja realmente executar essa operação?")) {
            funcionarioDAO.getRegistroSelecionado(TCadFuncionario, funcionario);
            funcionarioDAO.delete(funcionario);
            funcionarioDAO.getTabelaUsuario(TCadFuncionario);
        } else {
        }
    }//GEN-LAST:event_BExcluirActionPerformed


    private void BAcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcessosActionPerformed
        // TODO add your handling code here:
        UsuarioCadastro usuarioCadastro = new UsuarioCadastro(TCadFuncionario, funcionario);
        funcionarioDAO.getTabelaUsuario(TCadFuncionario);
    }//GEN-LAST:event_BAcessosActionPerformed

    private void CBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxOrdenarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CBoxOrdenarActionPerformed

    private void FieldPesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPesquisa2ActionPerformed
        // TODO add your handling code here:
        int index = 0;
        switch (CBoxOrdenar.getSelectedItem().toString()) {
            case "Registro":
                index = 0;
                break;
            case "CTPS":
                index = 1;
                break;
            case "Nome":
                index = 2;
                break;
        }
        ordenaBusca.busca(TCadFuncionario, FieldPesquisa2, index);
    }//GEN-LAST:event_FieldPesquisa2ActionPerformed

    private void BAcessos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcessos1ActionPerformed
        String registro;
        registro = (String) TCadFuncionario.getValueAt(TCadFuncionario.getSelectedRow(), 0);
        UsuarioMostra usuario = new UsuarioMostra(registro);


    }//GEN-LAST:event_BAcessos1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAcessos;
    private javax.swing.JButton BAcessos1;
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BNovo;
    private javax.swing.JComboBox CBoxOrdenar;
    private javax.swing.JTextField FieldPesquisa2;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTable TCadFuncionario;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
