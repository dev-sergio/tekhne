package TELAS;

import FILE.Arquivos;
import FILE.ArquivosEscrita;
import FILE.ArquivosLeitura;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BancoDeDados extends javax.swing.JFrame {

    Arquivos arquivos = new Arquivos();
    ArquivosLeitura arquivosLeitura;
    ArquivosEscrita arquivosEscrita = new ArquivosEscrita();

    public BancoDeDados() throws FileNotFoundException, IOException, Exception {
        this.arquivosLeitura = new ArquivosLeitura(5, arquivos.getArquivoDeConf());
        initComponents();
        FieldServer.setText(arquivosLeitura.getArrayDoArquivo()[0]);
        FieldDoor.setText(arquivosLeitura.getArrayDoArquivo()[1]);
        FieldDataBase.setText(arquivosLeitura.getArrayDoArquivo()[2]);
        FieldUser.setText(arquivosLeitura.getArrayDoArquivo()[3]);
        FieldPassword.setText(arquivosLeitura.getArrayDoArquivo()[4]);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JTextField getFieldDataBase() {
        return FieldDataBase;
    }

    public JTextField getFieldDoor() {
        return FieldDoor;
    }

    public JTextField getFieldServer() {
        return FieldServer;
    }

    public JTextField getFieldUser() {
        return FieldUser;
    }

    public JPasswordField getFieldPassword() {
        return FieldPassword;
    }

    //**************************************************************************
    //METODO PARA INICIALIZAR COMPONENTES
    //**************************************************************************
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBorder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FieldServer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldDoor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldDataBase = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldPassword = new javax.swing.JPasswordField();
        BConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Conexão");
        setResizable(false);

        PanelBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Conexão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N

        jLabel1.setText("Servidor");

        jLabel2.setText("Porta");

        jLabel3.setText("Banco de Dados");

        jLabel4.setText("Usuário");

        jLabel5.setText("Senha");

        BConcluir.setText("Concluir");
        BConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBorderLayout = new javax.swing.GroupLayout(PanelBorder);
        PanelBorder.setLayout(PanelBorderLayout);
        PanelBorderLayout.setHorizontalGroup(
            PanelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBorderLayout.createSequentialGroup()
                        .addGroup(PanelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FieldUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldDataBase, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(FieldServer, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(FieldDoor))
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(FieldPassword))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBorderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BConcluir)))
                .addContainerGap())
        );
        PanelBorderLayout.setVerticalGroup(
            PanelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorderLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldDoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BConcluir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConcluirActionPerformed
        String caminho = System.getProperty("user.dir") + "\\conf.ini";
        File f = new File(caminho);
        f.delete();
        try {
            arquivosEscrita.setArquivoDeConf(arquivos.getArquivoDeConf(), FieldServer.getText(), FieldDoor.getText(), FieldDataBase.getText(), FieldUser.getText(), FieldPassword.getText());
        } catch (Exception ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_BConcluirActionPerformed
    //**************************************************************************
    //COMPONENTES
    //**************************************************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConcluir;
    private javax.swing.JTextField FieldDataBase;
    private javax.swing.JTextField FieldDoor;
    private javax.swing.JPasswordField FieldPassword;
    private javax.swing.JTextField FieldServer;
    private javax.swing.JTextField FieldUser;
    private javax.swing.JPanel PanelBorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
