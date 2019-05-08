package TELAS;

import CONEXAO.DAOLogin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Sergio Junior
 */
public class Principal extends javax.swing.JFrame {

    TelaLogin TelaLogin;
    

    public Principal() throws Exception {
        initComponents();
        setLayout(new BorderLayout());
        
ActionListener tarefa = (ActionEvent e) -> {
    
        Locale locale = new Locale("pt", "BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'", locale);
        LabData.setText(formatador.format(calendar.getTime()));
        calendar.getTime();
    };

    javax.swing.Timer timer = new javax.swing.Timer(1000, tarefa);
    timer.start();
    
        JPanel inferior = new JPanel();
        inferior.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
        inferior.add(LabUser);
        LabUser.setPreferredSize(new Dimension(600, 20));
        inferior.add(LabData);
        LabData.setPreferredSize(new Dimension(300, 20));
        
        this.add(inferior, BorderLayout.SOUTH);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);  
        
        DAOLogin logindao = new DAOLogin();
        
        if (logindao.tipoacesso()) {
            /**
             * Libera tudo
             */
             
             
          
            
            
            

        } else {

            CadFuncionario.setEnabled(false);
            CadConfig.setEnabled(false);
           
            

        }
        setVisible(true);
    }

    public void receber(String x) {
        this.y = x;
        transferir();
    }
    String y;

    private void transferir() {
        LabUser.setText("Usuario: " + y);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabData = new javax.swing.JLabel();
        LabUser = new javax.swing.JLabel();
        JMBarra = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadVenda = new javax.swing.JMenuItem();
        CadMostraVenda = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        JMCadastros = new javax.swing.JMenu();
        CadFuncionario = new javax.swing.JMenuItem();
        CadCliente = new javax.swing.JMenuItem();
        CarProduto = new javax.swing.JMenuItem();
        CadPagamento = new javax.swing.JMenuItem();
        Sair1 = new javax.swing.JMenuItem();
        CadConfig = new javax.swing.JMenu();
        ConfBancoDeDados = new javax.swing.JMenuItem();
        Sair2 = new javax.swing.JMenuItem();
        TelaAjuda = new javax.swing.JMenu();
        AjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEKHNE");
        setExtendedState(1);
        setResizable(false);

        LabData.setAlignmentY(0.0F);
        LabData.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LabUser.setAlignmentY(0.0F);
        LabUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("Vendas");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        CadVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        CadVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadVenda.setText("Realizar Vendas");
        CadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadVendaActionPerformed(evt);
            }
        });
        jMenu1.add(CadVenda);

        CadMostraVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        CadMostraVenda.setText("Mostrar Vendas");
        CadMostraVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadMostraVendaActionPerformed(evt);
            }
        });
        jMenu1.add(CadMostraVenda);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        Sair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        JMBarra.add(jMenu1);

        JMCadastros.setText("Cadastros");
        JMCadastros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        CadFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        CadFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadFuncionario.setText("Funcionario");
        CadFuncionario.setToolTipText("Cadastro de Armazéns");
        CadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionarioActionPerformed(evt);
            }
        });
        JMCadastros.add(CadFuncionario);

        CadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        CadCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadCliente.setText("Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        JMCadastros.add(CadCliente);

        CarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        CarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CarProduto.setText("Produtos");
        CarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarProdutoActionPerformed(evt);
            }
        });
        JMCadastros.add(CarProduto);

        CadPagamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        CadPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadPagamento.setText("Forma de Pagamento");
        CadPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPagamentoActionPerformed(evt);
            }
        });
        JMCadastros.add(CadPagamento);

        Sair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        Sair1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sair1.setText("Sair");
        Sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair1ActionPerformed(evt);
            }
        });
        JMCadastros.add(Sair1);

        JMBarra.add(JMCadastros);

        CadConfig.setText("Configurações");
        CadConfig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ConfBancoDeDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        ConfBancoDeDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfBancoDeDados.setText("Banco de Dados");
        ConfBancoDeDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfBancoDeDadosActionPerformed(evt);
            }
        });
        CadConfig.add(ConfBancoDeDados);

        Sair2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        Sair2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sair2.setText("Sair");
        Sair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair2ActionPerformed(evt);
            }
        });
        CadConfig.add(Sair2);

        JMBarra.add(CadConfig);

        TelaAjuda.setText("Sobre");
        TelaAjuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        AjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        AjudaSobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AjudaSobre.setText("Sobre");
        AjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjudaSobreActionPerformed(evt);
            }
        });
        TelaAjuda.add(AjudaSobre);

        JMBarra.add(TelaAjuda);

        setJMenuBar(JMBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabUser, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(LabData, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabData)
                    .addComponent(LabUser))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfBancoDeDadosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ConfBancoDeDadosActionPerformed
        try {
            BancoDeDados banco = new BancoDeDados();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConfBancoDeDadosActionPerformed

    private void AjudaSobreActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AjudaSobreActionPerformed
        TelaSobre sobre = new TelaSobre();      

    }//GEN-LAST:event_AjudaSobreActionPerformed

    private void SairActionPerformed(ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        
        dispose();

    }//GEN-LAST:event_SairActionPerformed

    private void CadClienteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        ClienteMostra clienteMostra = new ClienteMostra();

    }//GEN-LAST:event_CadClienteActionPerformed

    private void CadFuncionarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CadFuncionarioActionPerformed

            FuncionarioMostra funcionarioMostra = new FuncionarioMostra();
       
    }//GEN-LAST:event_CadFuncionarioActionPerformed

    private void CarProdutoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CarProdutoActionPerformed
       ProdutoMostra produtoMostra = new ProdutoMostra(); 
    }//GEN-LAST:event_CarProdutoActionPerformed

    private void CadPagamentoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CadPagamentoActionPerformed
       PagamentoMostra pagamentoMostra = new PagamentoMostra();
    }//GEN-LAST:event_CadPagamentoActionPerformed

    private void CadMostraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadMostraVendaActionPerformed
         VendaMostra venda = new VendaMostra();
    }//GEN-LAST:event_CadMostraVendaActionPerformed

    private void Sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair1ActionPerformed

        dispose();

    }//GEN-LAST:event_Sair1ActionPerformed

    private void Sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair2ActionPerformed

        dispose();

    }//GEN-LAST:event_Sair2ActionPerformed

    private void CadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadVendaActionPerformed
        VendaCadastro venda = new VendaCadastro();
    }//GEN-LAST:event_CadVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AjudaSobre;
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenu CadConfig;
    private javax.swing.JMenuItem CadFuncionario;
    private javax.swing.JMenuItem CadMostraVenda;
    private javax.swing.JMenuItem CadPagamento;
    private javax.swing.JMenuItem CadVenda;
    private javax.swing.JMenuItem CarProduto;
    private javax.swing.JMenuItem ConfBancoDeDados;
    private javax.swing.JMenuBar JMBarra;
    private javax.swing.JMenu JMCadastros;
    private javax.swing.JLabel LabData;
    private javax.swing.JLabel LabUser;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sair1;
    private javax.swing.JMenuItem Sair2;
    private javax.swing.JMenu TelaAjuda;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
