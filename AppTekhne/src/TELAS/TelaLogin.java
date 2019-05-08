package TELAS;

import CONEXAO.Captura;
import CONEXAO.ConnectionFactory;
import CONEXAO.DAOLogin;
import static SEGURANCA.MD5.md5;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaLogin extends javax.swing.JDialog {

    Connection connection;

    public TelaLogin() throws IOException, Exception {
      
        
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        LabelUsuario = new javax.swing.JLabel();
        FieldUsuario = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        BContinuar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        FieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TEKHNE");

        PBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        LabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelUsuario.setText("Usuário");

        FieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldUsuarioFocusLost(evt);
            }
        });
        FieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FieldUsuarioKeyPressed(evt);
            }
        });

        LabelSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelSenha.setText("Senha");

        BContinuar.setText("Continuar");
        BContinuar.setEnabled(false);
        BContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinuarActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        FieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FieldSenhaKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tema");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metal", "Nimbus", "CDE/ Motif", "Windowns", "Windowns Classic" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(LabelUsuario)
                    .addComponent(LabelSenha)
                    .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PBordaLayout.createSequentialGroup()
                            .addComponent(BContinuar)
                            .addGap(47, 47, 47)
                            .addComponent(BCancelar))
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FieldUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(FieldSenha, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCancelar)
                    .addComponent(BContinuar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addComponent(PBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinuarActionPerformed
        Captura.setusuario(FieldUsuario.getText());
        try {
            Captura.setsenha(md5(FieldSenha.getText()));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        Captura captura = new Captura();

        DAOLogin logindao = null;
        try {
            logindao = new DAOLogin();
        } catch (Exception ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (logindao.verificaUsuario()) {
            String MosUser = FieldUsuario.getText().trim();
            dispose();
            Principal principal = null;
            try {
                principal = new Principal();
            } catch (Exception ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            principal.receber(MosUser);

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha não estão corretos!");
        }
    }//GEN-LAST:event_BContinuarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_BCancelarActionPerformed


    private void FieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldUsuarioFocusLost
        // TODO add your handling code here:
        FieldUsuario.setText(FieldUsuario.getText().replace(" ", ""));
        if (!FieldUsuario.getText().isEmpty()) {
            BContinuar.setEnabled(true);
        } else {
            BContinuar.setEnabled(false);
        }
    }//GEN-LAST:event_FieldUsuarioFocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try {
            String novoTema = jComboBox1.getSelectedItem().toString();
            switch (novoTema) {
                case "Metal":
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(this);
                    break;
                case "Nimbus":
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(this);
                    break;
                case "CDE/ Motif":
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(this);
                    break;
                case "Windowns":
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(this);
                    break;
                case "Windowns Classic":
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(this);
                    break;
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void FieldUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldUsuarioKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            FieldSenha.requestFocus();
        }
    }//GEN-LAST:event_FieldUsuarioKeyPressed

    private void FieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldSenhaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BContinuar.requestFocus();
        }
    }//GEN-LAST:event_FieldSenhaKeyPressed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BContinuar;
    private javax.swing.JPasswordField FieldSenha;
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PBorda;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
