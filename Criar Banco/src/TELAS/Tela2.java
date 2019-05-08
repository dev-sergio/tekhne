

package TELAS;

import DAO.VerificaConexaoDAO;
import FILE.Arquivos;
import FILE.ArquivosEscrita;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Junior
 */
public class Tela2 extends javax.swing.JFrame {

    String server;
    String porta;
    String senha;

    public Tela2(String server, String porta, String senha) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        this.server = server;
        this.porta = porta;
        this.senha = senha;
        FBancoDeDados.requestFocus();
    }
    VerificaConexaoDAO verificaConexaoDAO = new VerificaConexaoDAO();
    Arquivos arquivos = new Arquivos();
    ArquivosEscrita arquivosEscrita = new ArquivosEscrita();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FBancoDeDados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Pré Aula");

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(3);
        jTextArea1.setText("Assistente de Configuração para Banco de Dados\ndo Sistema para controle da empresa TEKHNE.\n\nPara dar continuidade ao processo insira o nome do\nbanco de dados a ser criado para o sistema.");
        jScrollPane1.setViewportView(jTextArea1);

        BContinuar.setText("Concluir");
        BContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarActionPerformed(evt);
            }
        });
        BContinuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BContinuarKeyPressed(evt);
            }
        });

        jLabel1.setText("Banco de Dados");

        FBancoDeDados.setToolTipText("Nome do banco de dados a ser criado para o sistema");
        FBancoDeDados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FBancoDeDadosFocusLost(evt);
            }
        });
        FBancoDeDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBancoDeDadosActionPerformed(evt);
            }
        });
        FBancoDeDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FBancoDeDadosKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BContinuar))
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(FBancoDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 179, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(BContinuar))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FBancoDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 103, Short.MAX_VALUE)))
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

    private void FBancoDeDadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FBancoDeDadosFocusLost
        
        String bancoDeDados = FBancoDeDados.getText();
        if (bancoDeDados.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo Banco de Dados.");
            FBancoDeDados.requestFocus();
        } else if (bancoDeDados.contains(" ")) {
            JOptionPane.showMessageDialog(rootPane, "O nome do Banco de Dados não pode conter espaços.");
            FBancoDeDados.requestFocus();
        }
    }//GEN-LAST:event_FBancoDeDadosFocusLost

    private void BContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarActionPerformed
        String bancoDeDados = FBancoDeDados.getText();
        if (bancoDeDados.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo Banco de Dados.");
            FBancoDeDados.requestFocus();
        } else if (bancoDeDados.contains(" ")) {
            JOptionPane.showMessageDialog(rootPane, "O nome do Banco de Dados não pode conter espaços.");
            FBancoDeDados.requestFocus();
        } else {
            try {

                if (verificaConexaoDAO.criaBancoDeDados(FBancoDeDados.getText())
                        && verificaConexaoDAO.criaTabelas(FBancoDeDados.getText())) {
                    JOptionPane.showMessageDialog(null, "Banco de Dados criados com sucesso.\n"
                            + "Tabelas e Registros criados com sucesso.\n"
                            + "Arquivo conf.ini configurado com sucesso.\n\n\n"
                            + "Processo concluido!");
                    try {
                        arquivosEscrita.setArquivoDeConf(arquivos.getArquivoDeConf(), server, porta, FBancoDeDados.getText(), "root", senha);
                    } catch (Exception ex) {
                        Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel criar o Banco de Dados: " + FBancoDeDados.getText());
                    dispose();
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_BContinuarActionPerformed

    private void BContinuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BContinuarKeyPressed
        String bancoDeDados = FBancoDeDados.getText();
        if (bancoDeDados.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo Banco de Dados.");
            FBancoDeDados.requestFocus();
        } else if (bancoDeDados.contains(" ")) {
            JOptionPane.showMessageDialog(rootPane, "O nome do Banco de Dados não pode conter espaços.");
            FBancoDeDados.requestFocus();
        } else {

            try {

                if (verificaConexaoDAO.criaBancoDeDados(FBancoDeDados.getText())
                        && verificaConexaoDAO.criaTabelas(FBancoDeDados.getText())) {
                    JOptionPane.showMessageDialog(null, "Banco de Dados criados com sucesso.\n"
                            + "Tabelas e Registros criados com sucesso.\n"
                            + "Arquivo conf.ini configurado com sucesso.\n\n\n"
                            + "Processo concluido!");

                    try {
                        arquivosEscrita.setArquivoDeConf(arquivos.getArquivoDeConf(), server, porta, FBancoDeDados.getText(), "root", senha);
                    } catch (Exception ex) {
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel criar o Banco de Dados: " + FBancoDeDados.getText());
                    dispose();
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BContinuarKeyPressed

    private void FBancoDeDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBancoDeDadosActionPerformed
        // TODO add your handling code here:
        BContinuar.requestFocus();
    }//GEN-LAST:event_FBancoDeDadosActionPerformed

    private void FBancoDeDadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FBancoDeDadosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FBancoDeDadosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BContinuar;
    private javax.swing.JTextField FBancoDeDados;
    private javax.swing.JPanel PBorda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
