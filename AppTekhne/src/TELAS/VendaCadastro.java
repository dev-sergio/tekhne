package TELAS;

import CONEXAO.DAOVenda;
import METODOS.Venda;
import CONEXAO.OrdenaBuscaDAO;
import METODOS.Converter;
import static METODOS.Converter.converter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class VendaCadastro extends javax.swing.JDialog {

    int selectForm;
    Venda venda = new Venda();
    DAOVenda vendaDAO = new DAOVenda();
    OrdenaBuscaDAO ordenaBuscaDAO = new OrdenaBuscaDAO();
    
    

    public VendaCadastro() {
        setModal(true);
        selectForm = 0;
        initComponents();
        vendaDAO.getCodVenda(venda);
        TxtCodigo.setText(venda.getCodigo());
        vendaDAO.getCliente(CBCliente);
        vendaDAO.getProduto(CBProduto);
        vendaDAO.getForma(CBForma);
        vendaDAO.getFuncionario(CBVendedor);
        Date data = new Date();  
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
        TxtData.setText(formatador.format(data));        
        
        setLocationRelativeTo(null);
        setVisible(true);
        getRootPane().setDefaultButton(Bcalcular);

    }

    public VendaCadastro(JTable jTable, Venda venda) {
        setModal(true);
        selectForm = 1;
        initComponents();
        vendaDAO.getRegistroSelecionado(jTable, venda);
        TxtCodigo.setText(venda.getCodigo());
        TxtData.setText(venda.getData());
        TxtValor.setText(venda.getValor());

        vendaDAO.getCliente(CBCliente);
        vendaDAO.getProduto(CBProduto);
        vendaDAO.getForma(CBForma);
        vendaDAO.getFuncionario(CBVendedor);

        CBCliente.setSelectedItem(venda.getCliente());
        CBProduto.setSelectedItem(venda.getProduto());
        CBQuantidade.setSelectedItem(venda.getQuantidade());
        CBForma.setSelectedItem(venda.getForma());
        CBVendedor.setSelectedItem(venda.getVendedor());

        setLocationRelativeTo(null);
        setVisible(true);
        getRootPane().setDefaultButton(Bcalcular);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBorda = new javax.swing.JPanel();
        LabelRegistro = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        LabelCTPS = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelEnd = new javax.swing.JLabel();
        LabelTelefone = new javax.swing.JLabel();
        Bconcluir = new javax.swing.JButton();
        LabelCargo = new javax.swing.JLabel();
        LabelSalario = new javax.swing.JLabel();
        LabelDataNasc = new javax.swing.JLabel();
        Bcancelar = new javax.swing.JButton();
        CBForma = new javax.swing.JComboBox();
        CBCliente = new javax.swing.JComboBox();
        CBProduto = new javax.swing.JComboBox();
        CBVendedor = new javax.swing.JComboBox();
        LabelEnd1 = new javax.swing.JLabel();
        TxtValor = new javax.swing.JFormattedTextField();
        CBQuantidade = new javax.swing.JComboBox();
        TxtData = new javax.swing.JFormattedTextField();
        Bcalcular = new javax.swing.JButton();
        TxtDesconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setResizable(false);

        PBorda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LabelRegistro.setText("CODIGO");

        TxtCodigo.setEditable(false);
        TxtCodigo.setFocusable(false);

        LabelCTPS.setText("DATA");

        LabelNome.setText("Produto");

        LabelEnd.setText("Valor Total");

        LabelTelefone.setText("Quantidade");

        Bconcluir.setText("Concluir Venda");
        Bconcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconcluirActionPerformed(evt);
            }
        });

        LabelCargo.setText("Cliente");

        LabelSalario.setText("Forma Pagamento");

        LabelDataNasc.setText("Vendedor");

        Bcancelar.setText("Cancelar");
        Bcancelar.setFocusable(false);
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        LabelEnd1.setText("Desconto");

        TxtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        TxtValor.setFocusable(false);
        TxtValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtValorFocusLost(evt);
            }
        });
        TxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorActionPerformed(evt);
            }
        });

        CBQuantidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        CBQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBQuantidadeActionPerformed(evt);
            }
        });

        try {
            TxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtData.setText("    ");

        Bcalcular.setText("Calcular");
        Bcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcalcularActionPerformed(evt);
            }
        });

        TxtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtDescontoFocusLost(evt);
            }
        });
        TxtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescontoActionPerformed(evt);
            }
        });
        TxtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtDescontoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDescontoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PBordaLayout = new javax.swing.GroupLayout(PBorda);
        PBorda.setLayout(PBordaLayout);
        PBordaLayout.setHorizontalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(CBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelRegistro)
                                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCargo)
                                    .addComponent(CBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelCTPS)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDataNasc)
                                    .addComponent(CBVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PBordaLayout.createSequentialGroup()
                                        .addComponent(CBForma, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Bconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LabelSalario)))
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PBordaLayout.createSequentialGroup()
                                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CBQuantidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LabelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PBordaLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(LabelEnd1))
                                            .addGroup(PBordaLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(Bcalcular))))
                                    .addComponent(Bcancelar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelEnd)
                                    .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PBordaLayout.setVerticalGroup(
            PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBordaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRegistro)
                    .addComponent(LabelCTPS)
                    .addComponent(LabelCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addComponent(LabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(LabelDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(Bcancelar)
                        .addGap(28, 28, 28))
                    .addGroup(PBordaLayout.createSequentialGroup()
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelEnd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bcalcular))
                            .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PBordaLayout.createSequentialGroup()
                                .addComponent(LabelEnd)
                                .addGap(24, 24, 24)))
                        .addGap(18, 18, 18)
                        .addComponent(LabelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bconcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BcancelarActionPerformed

    private void BconcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconcluirActionPerformed

        if ("".equals(TxtValor.getText())) {

            JOptionPane.showMessageDialog(null, "Calcular valor");

        } else {
            try {

                venda.setCodigo((TxtCodigo.getText()));
                venda.setData((TxtData.getText()));
                venda.setDesconto((TxtDesconto.getText()));
                venda.setValor((TxtValor.getText()));

                venda.setCliente(CBCliente.getSelectedItem().toString());
                venda.setProduto(CBProduto.getSelectedItem().toString());
                venda.setQuantidade(CBQuantidade.getSelectedItem().toString());
                venda.setForma(CBForma.getSelectedItem().toString());
                venda.setVendedor(CBVendedor.getSelectedItem().toString());

                if (selectForm == 0) {
                    vendaDAO.insert(venda);

                } else if (selectForm == 1) {
                    vendaDAO.update(venda);
                }
                dispose();

            } catch (Exception excecao) {
                throw new RuntimeException();
            }
        }

    }//GEN-LAST:event_BconcluirActionPerformed


    
    
    
    
    
    private void CBQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBQuantidadeActionPerformed

    private void BcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcalcularActionPerformed
        Converter converter = new Converter();
        String valor = TxtDesconto.getText();
        valor = valor.replace(',', '.');

        if ((converter.isNumeric(valor))
            || "".equals(TxtDesconto.getText())) {

            venda.setProduto(CBProduto.getSelectedItem().toString());
            vendaDAO.getValorUnitario(venda);
            Float valor1 = Float.parseFloat(venda.getUnitario().replace(',', '.'));
            double vezes = Integer.parseInt(CBQuantidade.getSelectedItem().toString());
            double resultado = valor1 * vezes;
            if ("".equals(TxtDesconto.getText())) {
                TxtValor.setText(converter(resultado).replace('.', ','));
            } else {
                float desconto = Float.parseFloat(TxtDesconto.getText().replace(',', '.'));
                resultado = resultado - desconto;
                TxtValor.setText(converter(resultado).replace('.', ','));
            }
        }

    }//GEN-LAST:event_BcalcularActionPerformed

    private void TxtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescontoActionPerformed

    }//GEN-LAST:event_TxtDescontoActionPerformed

    private void TxtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtDescontoFocusLost
     Converter converter = new Converter();
     String valor = TxtDesconto.getText();
     valor = valor.replace(',', '.');
     
     if ("".equals(TxtDesconto.getText())) {
         
     }else{
         if (converter.isNumeric(valor)){ 
            String decimal = converter(Double.parseDouble(TxtDesconto.getText().replace(',', '.')));
            TxtDesconto.setText(decimal.replace('.', ','));
         }else{
            JOptionPane.showMessageDialog(null, "Campo aceita apenas numeros, '.' e ','!");
            TxtDesconto.setText("");
            TxtDesconto.requestFocus();
         }
        }  
        
        
    }//GEN-LAST:event_TxtDescontoFocusLost

    private void TxtDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDescontoKeyTyped
    }//GEN-LAST:event_TxtDescontoKeyTyped

    private void TxtDescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDescontoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescontoKeyPressed

    private void TxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorActionPerformed

    private void TxtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtValorFocusLost
        String decimal = converter(Double.parseDouble(TxtValor.getText().replace(',', '.')));
            TxtValor.setText(decimal.replace('.', ','));
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorFocusLost
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcalcular;
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton Bconcluir;
    private javax.swing.JComboBox CBCliente;
    private javax.swing.JComboBox CBForma;
    private javax.swing.JComboBox CBProduto;
    private javax.swing.JComboBox CBQuantidade;
    private javax.swing.JComboBox CBVendedor;
    private javax.swing.JLabel LabelCTPS;
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelDataNasc;
    private javax.swing.JLabel LabelEnd;
    private javax.swing.JLabel LabelEnd1;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JPanel PBorda;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JFormattedTextField TxtData;
    private javax.swing.JTextField TxtDesconto;
    private javax.swing.JFormattedTextField TxtValor;
    // End of variables declaration//GEN-END:variables
}
