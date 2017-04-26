package atendeclientes;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * @author BRUNO MITSUYOSHI MAKIHARA
 * email: brunomakihara@yahoo.com.br
 * Observação: Primeiro inicia-se o servidor e os clientes, depois liga o servidor e os clientes
 */
public class FrameCliente extends javax.swing.JFrame {

    Socket sk;
    PrintStream saida;
    int porta = 1098;
    String ip = "127.0.0.1";
    
    /*
    - COMO FAZER PARA ENCERRAR O SERVIDOR USANDO O RADIO BUTTON
    - COMO REATIVAR O SERVIDOR USANDO RADIO BUTTON
    - COMO FAZER PARA EDITAR O JTEXTFIELD3 DURANTE O PROCESSO DE COMUNICAÇÃO    ->234 FrameServidor
    */
    
    public FrameCliente() {
        super("Cliente - C.H.A.T - Comunication");
        initComponents();
        jTextField1.setText(""+porta);
        jTextField2.setText(ip);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextArea();
        txtEntrada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtSaida.setEditable(false);
        txtSaida.setColumns(20);
        txtSaida.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtSaida.setRows(5);
        jScrollPane1.setViewportView(txtSaida);

        txtEntrada.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        txtEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), null, new java.awt.Color(153, 0, 153), new java.awt.Color(0, 204, 204)));
        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comunicação Humana Através de Texto (CHAT)");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), null, new java.awt.Color(102, 0, 102), new java.awt.Color(0, 204, 204)));

        jLabel2.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel2.setText("Digite a mensagem: ");

        jLabel3.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel3.setText("Porta do Servidor:");

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), null, new java.awt.Color(153, 0, 153), new java.awt.Color(0, 204, 204)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), null, new java.awt.Color(153, 0, 153), new java.awt.Color(0, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel4.setText("Endereço IP do Cliente:");

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jButton1.setText("Conectar no Servidor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEntrada)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        if (txtEntrada.getText().equals("EXIT")) {
            this.dispose();
        }
        saida.println(sk.getInetAddress().getHostAddress()+": "+txtEntrada.getText());//Quando o usuário aperta enter, o IP e a mensagem digitada é mandada para o chat (saida)
        txtEntrada.setText("");//Ajusta o campo de entrada da mensagem para vazio
    }//GEN-LAST:event_txtEntradaActionPerformed

    //QUANDO
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        saida.println(sk.getInetAddress().getHostAddress()+" -> Fechou a Janela");
    }//GEN-LAST:event_formWindowClosing

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // PORTA DO SERVIDOR
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // ENDEREÇO IP DO CLIENTE
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // CONECTAR O CLIENTE NO SERVIDOR
        cliente(jTextField2.getText());
        txtEntrada.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cliente(String ip) {
        this.ip = ip;
        porta = Integer.parseInt(jTextField1.getText());
        try {
            sk = new Socket(ip, porta);//Cria Socket do tipo TCP para o Cliente com IP e Porta
            saida = new PrintStream(sk.getOutputStream());
            saida.flush();//garante que a informação seja enviada
            Escuta e = new Escuta(sk);
            e.start();    
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso!");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar no Server!");
        }
        jTextField1.setText(""+porta);
        jTextField2.setText(ip);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtEntrada;
    protected static javax.swing.JTextArea txtSaida;
    // End of variables declaration//GEN-END:variables
}
