/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import CONEXAO.DAOUsuario;
import CONEXAO.OrdenaBusca;
import CONEXAO.Perguntas;
import METODOS.Funcionario;
import METODOS.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Sergio Junior
 */
public final class UsuarioMostra extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    DAOUsuario usuarioDAO = new DAOUsuario();
    Perguntas pergunta = new Perguntas();
    OrdenaBusca ordenaBusca = new OrdenaBusca();
    
    public UsuarioMostra(String registro) {
        initComponents();
        usuarioDAO.getTabelaUsuario(TCadUsuarios, registro);
        
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        TCadUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);  
        TCadUsuarios.getColumnModel().getColumn(1).setPreferredWidth(80);   
        TCadUsuarios.getColumnModel().getColumn(2).setPreferredWidth(80);  
    }

    public UsuarioMostra(boolean setVisivel) {
        initComponents();
        BAlterar.setVisible(setVisivel);
        BExcluir.setVisible(setVisivel);
        usuarioDAO.getTabelaUsuario(TCadUsuarios);
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        TCadUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);  
        TCadUsuarios.getColumnModel().getColumn(1).setPreferredWidth(80);   
        TCadUsuarios.getColumnModel().getColumn(2).setPreferredWidth(80);  
    }

    
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        BExcluir = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        CBoxOrdenar = new javax.swing.JComboBox();
        FieldPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TCadUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios Cadastrados");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        PBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Mostrar Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        PBorda.setDoubleBuffered(false);

        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        BAlterar.setText("Alterar");
        BAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarActionPerformed(evt);
            }
        });

        CBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id", "Usuario" }));
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

        TCadUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome de Usuario", "Tipo de Acesso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TCadUsuarios.setDoubleBuffered(true);
        TCadUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TCadUsuarios);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BExcluir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed
        // TODO add your handling code here:
        UsuarioCadastro usuarioCadastro = new UsuarioCadastro(TCadUsuarios, usuario);
        usuarioDAO.getTabelaUsuario(TCadUsuarios);
        dispose();
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        // TODO add your handling code here:
        if (TCadUsuarios.getSelectedRow() != -1 && pergunta.PerguntaYesNo("Ação permanente.\nDeseja realmente executar essa operação?")) {
            usuarioDAO.getRegistroSelecionado(TCadUsuarios, usuario);
            usuarioDAO.delete(usuario);
            dispose();            
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
            case "Usuario":
                index = 1;
                break;
        }
        ordenaBusca.busca(TCadUsuarios, FieldPesquisa, index);
    }//GEN-LAST:event_FieldPesquisaActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BExcluir;
    private javax.swing.JComboBox CBoxOrdenar;
    private javax.swing.JTextField FieldPesquisa;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTable TCadUsuarios;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
