package TELAS;

import CONEXAO.OrdenaBuscaDAO;
import javax.swing.JOptionPane;
import CONEXAO.DAOFuncionario;
import METODOS.Funcionario;
import javax.swing.JTable;

public class FuncionarioCadastro extends javax.swing.JDialog {

    int selectForm;
    Funcionario funcionario = new Funcionario();
    DAOFuncionario funcionarioDAO = new DAOFuncionario();
    OrdenaBuscaDAO ordenaBuscaDAO = new OrdenaBuscaDAO();
  

    public FuncionarioCadastro() {
        setModal(true);
        selectForm = 0;
        initComponents();
        funcionarioDAO.getCodFuncionario(funcionario);
        TxtRegistro.setText(funcionario.getRegistro());

        setLocationRelativeTo(null);
        setVisible(true);
         
    }

    public FuncionarioCadastro(JTable jTable, Funcionario funcionario) {
        setModal(true);
        selectForm = 1;
        initComponents();
        funcionarioDAO.getRegistroSelecionado(jTable, funcionario);
        TxtRegistro.setText(funcionario.getRegistro());
        TxtCTPS.setText(funcionario.getCtps());
        TxtSerie.setText(funcionario.getSerie());
        TxtCargo.setText(funcionario.getCargo());
        TxtSalario.setText(funcionario.getSalario());
        TxtDataNasc.setText(funcionario.getDatanascimento());
        TxtNome.setText(funcionario.getNome());
        TxtEndereco.setText(funcionario.getEndereco());
        TxtBairro.setText(funcionario.getBairro());
        TxtCidade.setText(funcionario.getCidade());        
        CBEstado.setSelectedItem(funcionario.getEstado());
        TxtTelefone.setText(funcionario.getTelefone());
        TxtCEP.setText(funcionario.getCep());
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        LabelRegistro = new javax.swing.JLabel();
        TxtRegistro = new javax.swing.JTextField();
        LabelCTPS = new javax.swing.JLabel();
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
        LabelCargo = new javax.swing.JLabel();
        LabelSalario = new javax.swing.JLabel();
        LabelDataNasc = new javax.swing.JLabel();
        TxtCargo = new javax.swing.JTextField();
        Bcancelar = new javax.swing.JButton();
        TxtSalario = new javax.swing.JFormattedTextField();
        TxtCEP = new javax.swing.JFormattedTextField();
        CBEstado = new javax.swing.JComboBox();
        TxtDataNasc = new javax.swing.JFormattedTextField();
        TxtTelefone = new javax.swing.JFormattedTextField();
        TxtCTPS = new javax.swing.JFormattedTextField();
        LabelSerie = new javax.swing.JLabel();
        TxtSerie = new javax.swing.JFormattedTextField();
        LabelCidade1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Funcionario");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LabelRegistro.setText("Registro");

        TxtRegistro.setEditable(false);
        TxtRegistro.setFocusable(false);

        LabelCTPS.setText("CTPS*");

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

        LabelBairro.setText("Bairro");

        LabelEstado.setText("Estado");

        LabelCargo.setText("Cargo");

        LabelSalario.setText("Salario");

        LabelDataNasc.setText("Data Nasc.");

        Bcancelar.setText("Cancelar");
        Bcancelar.setFocusable(false);
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        TxtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        try {
            TxtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        try {
            TxtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TxtCTPS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LabelSerie.setText("Série*");

        try {
            TxtSerie.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#")));
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
                        .addComponent(TxtEndereco)
                        .addContainerGap())
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelEnd)
                        .addGap(62, 62, 62)
                        .addComponent(LabelCidade)
                        .addContainerGap(286, Short.MAX_VALUE))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDataNasc)
                                    .addComponent(TxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTelefone)
                                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelSalario)))
                            .addComponent(TxtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelBairro)
                                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PBordaLayout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(LabelEstado)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(PBordaLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelCEP)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNome)
                                    .addGroup(PBordaLayout.createSequentialGroup()
                                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PBordaLayout.createSequentialGroup()
                                                .addComponent(LabelRegistro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(LabelCTPS))
                                            .addGroup(PBordaLayout.createSequentialGroup()
                                                .addComponent(TxtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TxtCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(9, 9, 9)
                                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelSerie))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCargo)
                                    .addComponent(TxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBordaLayout.createSequentialGroup()
                        .addComponent(Bcancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelCidade1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelRegistro)
                            .addComponent(LabelCTPS)
                            .addComponent(LabelCargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(LabelNome)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelDataNasc)
                                .addGap(26, 26, 26))
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelEnd)
                .addGap(1, 1, 1)
                .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PBordaLayout.createSequentialGroup()
                            .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabelEstado)
                                .addComponent(LabelCEP))
                            .addGap(26, 26, 26))
                        .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelBairro)
                            .addComponent(LabelCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelCidade1)
                .addGap(7, 7, 7))
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
                .addComponent(PBorda, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BcancelarActionPerformed

    private void BconcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconcluirActionPerformed
        try {
            
        funcionario.setRegistro((TxtRegistro.getText()));
        funcionario.setCtps((TxtCTPS.getText()));
        funcionario.setSerie((TxtSerie.getText()));
        funcionario.setCargo((TxtCargo.getText()));
        funcionario.setSalario((TxtSalario.getText()));
        funcionario.setDatanascimento((TxtDataNasc.getText()));
        funcionario.setNome((TxtNome.getText()));
        funcionario.setEndereco((TxtEndereco.getText()));
        funcionario.setBairro((TxtBairro.getText()));
        funcionario.setCidade((TxtCidade.getText()));
        funcionario.setTelefone((TxtTelefone.getText()));
        funcionario.setCep((TxtCEP.getText()));        
        funcionario.setEstado(CBEstado.getSelectedItem().toString());
        
         if ("".equals(TxtNome.getText())
                    || "   .   .   /  ".equals(TxtCTPS.getText())
                    || "    - ".equals(TxtSerie.getText())
                    || "(  )    -    ".equals(TxtTelefone.getText())) {

                JOptionPane.showMessageDialog(null, "Existem campos OBRIGATÓRIOS vazios");
                
            } else {
                
            if (selectForm == 0) {
                funcionarioDAO.insert(funcionario);
                 int resposta = JOptionPane.showConfirmDialog(null, "Deseja Vincular Funcionario com um login e senha para o sistema?", "Adicionar Usuario", JOptionPane.YES_NO_OPTION);

                    if (resposta == JOptionPane.YES_OPTION) {
                        String registro;
                        registro = TxtRegistro.getText();
                        UsuarioCadastro usuarioCadastro = new UsuarioCadastro(registro);
                        dispose();
                    }
                    {dispose();
                    }
                
            } else if (selectForm == 1) {
                funcionarioDAO.update(funcionario);
                dispose();
            }  
            
            }
        } catch (Exception excecao) {
            throw new RuntimeException();
        }

    }//GEN-LAST:event_BconcluirActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton Bconcluir;
    private javax.swing.JComboBox CBEstado;
    private javax.swing.JLabel LabelBairro;
    private javax.swing.JLabel LabelCEP;
    private javax.swing.JLabel LabelCTPS;
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelCidade1;
    private javax.swing.JLabel LabelDataNasc;
    private javax.swing.JLabel LabelEnd;
    private javax.swing.JLabel LabelEstado;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JLabel LabelSerie;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JFormattedTextField TxtCEP;
    private javax.swing.JFormattedTextField TxtCTPS;
    private javax.swing.JTextField TxtCargo;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JFormattedTextField TxtDataNasc;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtRegistro;
    private javax.swing.JFormattedTextField TxtSalario;
    private javax.swing.JFormattedTextField TxtSerie;
    private javax.swing.JFormattedTextField TxtTelefone;
    // End of variables declaration//GEN-END:variables
}
