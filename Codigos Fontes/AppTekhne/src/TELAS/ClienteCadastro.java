package TELAS;

import CONEXAO.OrdenaBuscaDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import CONEXAO.DAOCliente;
import METODOS.Cliente;
import javax.swing.JTable;

public class ClienteCadastro extends javax.swing.JDialog {

    int selectForm;
    Cliente cliente = new Cliente();
    DAOCliente clienteDAO = new DAOCliente();
    OrdenaBuscaDAO ordenaBuscaDAO = new OrdenaBuscaDAO();
    

    public ClienteCadastro() {
        setModal(true);
        selectForm = 0;
        initComponents();
        clienteDAO.getCodCliente(cliente);
        
        TxtID.setText(cliente.getIdCliente());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public ClienteCadastro(JTable jTable, Cliente cliente) {
        setModal(true);
        selectForm = 1;
        initComponents();
        clienteDAO.getRegistroSelecionado(jTable, cliente);
        TxtID.setText(cliente.getIdCliente());
        TxtCNPJ.setText(cliente.getCnpj());
        TxtEmail.setText(cliente.getEmail());
        TxtNome.setText(cliente.getNome());
        TxtEndereco.setText(cliente.getEndereco());
        TxtBairro.setText(cliente.getBairro());
        TxtCidade.setText(cliente.getCidade());
        CBEstado.setSelectedItem(cliente.getEstado());
        TxtTelefone.setText(cliente.getTelefone());
        TxtCEP.setText(cliente.getCep());
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        LabelRegistro = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        LabelCNPJ = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        LabelEnd = new javax.swing.JLabel();
        TxtEndereco = new javax.swing.JTextField();
        LabelCidade = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        LabelTelefone = new javax.swing.JLabel();
        Bconcluir = new javax.swing.JButton();
        LabelCEP = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        LabelBairro = new javax.swing.JLabel();
        LabelEstado = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        LabelSalario = new javax.swing.JLabel();
        Bcancelar = new javax.swing.JButton();
        TxtCEP = new javax.swing.JFormattedTextField();
        TxtCNPJ = new javax.swing.JFormattedTextField();
        CBEstado = new javax.swing.JComboBox();
        TxtTelefone = new javax.swing.JFormattedTextField();
        LabelCidade1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Cliente");
        setResizable(false);

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LabelRegistro.setText("ID");

        TxtID.setEditable(false);
        TxtID.setFocusable(false);

        LabelCNPJ.setText("CNPJ*");

        LabelNome.setText("Nome*");

        LabelEnd.setText("Endereço");

        LabelCidade.setText("Cidade");

        LabelTelefone.setText("Telefone Fixo*");

        Bconcluir.setText("Concluir");
        Bconcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconcluirActionPerformed(evt);
            }
        });

        LabelCEP.setText("CEP");

        TxtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtBairroFocusLost(evt);
            }
        });
        TxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBairroActionPerformed(evt);
            }
        });

        LabelBairro.setText("Bairro");

        LabelEstado.setText("Estado");

        LabelSalario.setText("E-Mail");

        Bcancelar.setText("Cancelar");
        Bcancelar.setFocusable(false);
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        try {
            TxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TxtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        try {
            TxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LabelCidade1.setText("* CAMPOS OBRIGATÓRIOS");

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCidade)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelBairro)
                            .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelEstado)
                                .addGap(53, 53, 53))
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBEstado, 0, 1, Short.MAX_VALUE))))
                    .addComponent(TxtNome)
                    .addComponent(TxtEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRegistro))
                        .addGap(146, 146, 146)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(TxtCNPJ)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                                .addComponent(LabelCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(146, 146, 146))))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelEnd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCEP)
                                    .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTelefone)
                                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Bcancelar)
                            .addComponent(LabelNome)
                            .addComponent(LabelCidade1))
                        .addGap(18, 18, 18)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtEmail)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelSalario)
                                    .addComponent(Bconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRegistro)
                    .addComponent(LabelCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelEnd)
                .addGap(18, 18, 18)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelBairro)
                                    .addComponent(LabelEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PBordaLayout.createSequentialGroup()
                                    .addComponent(LabelCEP)
                                    .addGap(26, 26, 26))
                                .addGroup(PBordaLayout.createSequentialGroup()
                                    .addComponent(LabelSalario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                                .addComponent(LabelTelefone)
                                .addGap(26, 26, 26))))
                    .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bcancelar)
                    .addComponent(Bconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCidade1)
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     
    private void BconcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconcluirActionPerformed
         // TODO add your handling code here:
        try {
            
            cliente.setIdCliente((TxtID.getText()));
            cliente.setCnpj(TxtCNPJ.getText());
            cliente.setEmail(TxtEmail.getText());
            cliente.setNome(TxtNome.getText());
            cliente.setEndereco(TxtEndereco.getText());
            cliente.setBairro(TxtBairro.getText());
            cliente.setCidade(TxtCidade.getText());
            cliente.setEstado(CBEstado.getSelectedItem().toString());
            cliente.setTelefone(TxtTelefone.getText());
            cliente.setCep(TxtCEP.getText());
            
            
            
            
            
            if ("".equals(TxtNome.getText())
                    || "  .   .   /    -   ".equals(TxtCNPJ.getText())
                    || "(  )     -    ".equals(TxtTelefone.getText())) {

                JOptionPane.showMessageDialog(null, "Existem campos obrigatórios vazios");
                
            } else {
                
            if (selectForm == 0) {
                clienteDAO.insert(cliente);
            } else if (selectForm == 1) {
                clienteDAO.update(cliente);
            }
            dispose();
            }
        } catch (Exception excecao) {
            throw new RuntimeException();
        }

    }//GEN-LAST:event_BconcluirActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BcancelarActionPerformed

    private void TxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBairroActionPerformed

    private void TxtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtBairroFocusLost

    }//GEN-LAST:event_TxtBairroFocusLost
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton Bconcluir;
    private javax.swing.JComboBox CBEstado;
    private javax.swing.JLabel LabelBairro;
    private javax.swing.JLabel LabelCEP;
    private javax.swing.JLabel LabelCNPJ;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelCidade1;
    private javax.swing.JLabel LabelEnd;
    private javax.swing.JLabel LabelEstado;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JFormattedTextField TxtCEP;
    private javax.swing.JFormattedTextField TxtCNPJ;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JFormattedTextField TxtTelefone;
    // End of variables declaration//GEN-END:variables
}
