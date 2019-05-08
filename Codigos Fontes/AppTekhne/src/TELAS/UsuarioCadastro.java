package TELAS;


import CONEXAO.DAOFuncionario;
import CONEXAO.DAOUsuario;
import CONEXAO.Perguntas;
import METODOS.Funcionario;
import METODOS.Usuario;
import static SEGURANCA.MD5.md5;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class UsuarioCadastro extends javax.swing.JDialog {

    public int selectForm;
    Funcionario funcionario = new Funcionario();
    Usuario usuario = new Usuario();
    DAOFuncionario funcionarioDAO = new DAOFuncionario();
    DAOUsuario usuarioDAO = new DAOUsuario();

       
  public UsuarioCadastro(String registro) {
        setModal(true);
        selectForm = 0;
        initComponents();
        TxtRegistro.setText(registro);
        usuarioDAO.getCodUsuario(usuario);
        TxtID.setText(usuario.getId());
        setLocationRelativeTo(null);
        setVisible(true);
        
  } 
  
  
      public UsuarioCadastro(JTable jTable, Usuario usuario) {
        setModal(true);
        selectForm = 1;
        initComponents();
        usuarioDAO.getRegistroSelecionado(jTable, usuario);
        TxtRegistro.setText(usuario.getRegistro());
        TxtID.setText(usuario.getId());
        TxtUser.setText(usuario.getNome());
        jCBAcesso.setSelectedItem(usuario.getTipodeacesso());
        setLocationRelativeTo(null);
        LabelSenha.setVisible(false);
        TxtSenha.setVisible(false);
        setVisible(true);
        
  }   
  public UsuarioCadastro(JTable jTable, Funcionario funcionario) {
        setModal(true);
        selectForm = 0;
        initComponents();
        funcionarioDAO.getRegistroSelecionado(jTable, funcionario);
        TxtRegistro.setText(funcionario.getRegistro());
        usuarioDAO.getCodUsuario(usuario);
        TxtID.setText(usuario.getId());
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
        TxtUser = new javax.swing.JTextField();
        BSalvar = new javax.swing.JButton();
        LabelSenha = new javax.swing.JLabel();
        BCancelar = new javax.swing.JButton();
        TxtRegistro = new javax.swing.JTextField();
        LabelRegistro = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        jCBAcesso = new javax.swing.JComboBox();
        LabelRegistro1 = new javax.swing.JLabel();
        LabelCidade1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Usuario");
        setResizable(false);

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LabelID.setText("ID");

        TxtID.setEditable(false);

        LabelNome.setText("Nome de Usuario *");

        BSalvar.setText("Salvar");
        BSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarActionPerformed(evt);
            }
        });

        LabelSenha.setText("Senha *");

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        TxtRegistro.setEditable(false);

        LabelRegistro.setText("Registro");

        jCBAcesso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LIMITADO", "ADMIN" }));

        LabelRegistro1.setText("Tipo de Acesso");

        LabelCidade1.setText("* CAMPOS OBRIGATÓRIOS");

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtUser)
                    .addComponent(LabelNome)
                    .addComponent(LabelSenha)
                    .addComponent(TxtSenha)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelRegistro)
                                .addGap(18, 18, 18)
                                .addComponent(LabelRegistro1))
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(TxtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCBAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(BCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PBordaLayout.createSequentialGroup()
                .addComponent(LabelCidade1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelID)
                    .addComponent(LabelRegistro)
                    .addComponent(LabelRegistro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(BSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(BCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(LabelCidade1))
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
                .addComponent(PBorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarActionPerformed
        try {
            
        usuario.setId((TxtID.getText()));
        usuario.setRegistro((TxtRegistro.getText()));
        usuario.setNome((TxtUser.getText()));
        usuario.setSenha(md5(TxtSenha.getText()));
        usuario.setTipodeacesso(jCBAcesso.getSelectedItem().toString());
        
          if ("".equals(TxtUser.getText())) {

                JOptionPane.showMessageDialog(null, "Todos os campos são OBRIGATÓRIOS!");
                
            } else {
                
            if (selectForm == 0) {
                if ("".equals(TxtUser.getText())){
                    JOptionPane.showMessageDialog(null, "Todos os campos são OBRIGATÓRIOS!");
                }else{
                usuarioDAO.insert(usuario);
                dispose(); 
                }
            } else if (selectForm == 1) {
                
                Perguntas pergunta = new Perguntas();
                if (pergunta.PerguntaYesNo("Deseja Alterar a senha?")) {
                    usuarioDAO.update1(usuario); 
                } else {
                    usuarioDAO.update2(usuario);  
                }
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
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BSalvar;
    private javax.swing.JLabel LabelCidade1;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JLabel LabelRegistro1;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtRegistro;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JComboBox jCBAcesso;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables
}
