
package autenticidadegenerator;

/**
 * @author BRUNO MITSUYOSHI MAKIHARA
 * email: brunomakihara@yahoo.com.br
 */
public class Gerador_de_Codigos extends javax.swing.JFrame {
    
    private static final Criptografia codigo = new Criptografia();

    public Gerador_de_Codigos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldChave = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldCodigo1 = new javax.swing.JTextField();
        jTextFieldCodigo2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonGerador = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Códigos de Autenticidade");
        setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jLabel1.setText("  Digite a Senha que será Criptografada:");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jLabel2.setText("  Código de Segurança Nº 2:");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jLabel3.setText("  Digite a Chave de Criptografia:");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jLabel4.setText("  Código de Segurança Nº 1:");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldChave.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 14)); // NOI18N
        jTextFieldChave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChave.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 102, 102)));
        jTextFieldChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChaveActionPerformed(evt);
            }
        });

        jTextFieldSenha.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 14)); // NOI18N
        jTextFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 102, 102)));
        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        jTextFieldCodigo1.setEditable(false);
        jTextFieldCodigo1.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 14)); // NOI18N
        jTextFieldCodigo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigo1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 102, 102)));
        jTextFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigo1ActionPerformed(evt);
            }
        });

        jTextFieldCodigo2.setEditable(false);
        jTextFieldCodigo2.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 14)); // NOI18N
        jTextFieldCodigo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigo2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 102, 102)));
        jTextFieldCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigo2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Dungeon", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GERADOR DE CÓDIGOS DUPLAMENTE CRIPTOGRAFADOS");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonGerador.setBackground(new java.awt.Color(204, 204, 204));
        jButtonGerador.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jButtonGerador.setText("Gerar Códigos");
        jButtonGerador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonGerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeradorActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jLabel6.setText("  MOMENTO: ");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldData.setEditable(false);
        jTextFieldData.setFont(new java.awt.Font("MS Reference Sans Serif", 3, 14)); // NOI18N
        jTextFieldData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonLimpar.setFont(new java.awt.Font("Dungeon", 2, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCodigo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGerador, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCodigo2)
                            .addComponent(jTextFieldSenha)
                            .addComponent(jTextFieldChave))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldChave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
        
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void jTextFieldChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChaveActionPerformed
        
    }//GEN-LAST:event_jTextFieldChaveActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jButtonGeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeradorActionPerformed
        if (jTextFieldSenha.getText() != null && jTextFieldChave.getText() != null) {
            String senha1;
            String senha2;  
            int tamanho = jTextFieldChave.getText().length();
            char[] senha = new char[tamanho];
            for (int i = 0; i < tamanho; i++) {
                senha[i] = jTextFieldChave.getText().charAt(i);
                codigo.valor(senha, i);
            }

            //criptografa a palavra inteira em uma das 10 bibliotecas
            String palavra = jTextFieldSenha.getText();
            for (int i = 0; i < tamanho; i++) {
                palavra = codigo.criptografiaSecreta(senha[i], palavra);
            }

            //Criptografa cada letra da palavra com uma biblioteca diferente baseada no indice
            //correspondente da letra da chave
            int aux = 0;
            int tamanhoTexto = palavra.length();
            char[] letra = new char[tamanhoTexto];   

            for (int i = 0; i < tamanhoTexto; i++) {
                if (aux < tamanho) {
                    letra[i] = codigo.letraCriptografada(senha, aux, palavra, i);
                    aux++;
                } else {
                    aux = 0;
                    letra[i] = codigo.letraCriptografada(senha, aux, palavra, i);
                    aux++;
                }
            }
            palavra = "";
            for (int i = 0; i < tamanhoTexto; i++) {
                palavra = palavra + letra[i];
            }
            //O código será criptografado duas vezes para gerar duas senhas uma de hoje e uma de ontém
            int numero = codigo.confirma();
            jTextFieldData.setText(codigo.confirmaData());
            senha1 = codigo.criptografiaSecreta2(numero, palavra);
            senha2 = codigo.criptografiaSecreta2(numero +7, palavra);//7 significa que a senha vai ser a mesma a cada 7 minutos
            jTextFieldCodigo1.setText(senha1);
            jTextFieldCodigo2.setText(senha2);
        }
    }//GEN-LAST:event_jButtonGeradorActionPerformed

    private void jTextFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigo1ActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodigo1ActionPerformed

    private void jTextFieldCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigo2ActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodigo2ActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldSenha.setText("");
        jTextFieldChave.setText("");
        jTextFieldData.setText("");
        jTextFieldCodigo1.setText("");
        jTextFieldCodigo2.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed
    
    // <editor-fold defaultstate="collapsed" desc="MAIN">  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gerador_de_Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerador_de_Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerador_de_Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerador_de_Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerador_de_Codigos().setVisible(true);
            }
        });
    }
    // </editor-fold>   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerador;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldChave;
    private javax.swing.JTextField jTextFieldCodigo1;
    private javax.swing.JTextField jTextFieldCodigo2;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
