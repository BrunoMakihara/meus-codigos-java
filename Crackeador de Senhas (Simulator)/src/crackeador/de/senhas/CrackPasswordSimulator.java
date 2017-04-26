package crackeador.de.senhas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author BRUNO MITSUYOSHI MAKIHARA
 * email: brunomakihara@yahoo.com.br
 */
public class CrackPasswordSimulator extends javax.swing.JFrame {
    
    private static final Combinacoes crackeador = new Combinacoes();
    private int tamanho;
    private String password;
    private final char numeros[] = {'0','1','2','3','4','5','6','7','8','9'};
    private final char caracteresEspeciais[] = {'!','@','#','$','%','¨','&','*','(',')','_','-','+','=','´','`','{','}','[',']','^','~','|','/','?',',','.','<','>',':',';','°','º','ª','²','¹','²','³','£','¢','¬','§','"',' '};
    private final char maiusculas[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final char minusculas[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public CrackPasswordSimulator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        jToggleButton1.setText("jToggleButton1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crackeador de Senhas");

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Dungeon", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRACKEADOR DE SENHAS - SIMULATOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel2.setBackground(new java.awt.Color(0, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ESCOLHA O VALOR DO TIPO DE ENTRADA DE CARÁCTERES");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jCheckBox1.setText("NÚMEROS");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jCheckBox2.setText("CARACTÉRES ESPECIAIS");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jCheckBox3.setText("LETRAS MAIÚSCULAS");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jCheckBox4.setText("LETRAS MINÚSCULAS");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dungeon", 2, 12)); // NOI18N
        jButton1.setText("INICIAR CRACKEAMENTO DE SENHA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NÚM. DE CARACTÉRES DA SENHA: ");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dungeon", 2, 12)); // NOI18N
        jButton2.setText("CRACKEAR SENHA A PARTIR DE CARACTÉRES ESPECÍFICOS");
        jButton2.setToolTipText("Digite os caract. esp. na frente do NÚM. DE CARACTÉRES DA SENHA ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 255, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SENHA QUE SERÁ CRACKEADA: ");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPasswordField2.setText("SUPERTEST");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 255, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SENHA CRACKEADA: ");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUANTIDADE DE TENTATIVAS: ");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setFont(new java.awt.Font("Dungeon", 2, 12)); // NOI18N
        jButton4.setText("SALVAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dungeon", 2, 12)); // NOI18N
        jButton5.setText("SALVAR");
        jButton5.setToolTipText("Digite os caract. esp. na frente do NÚM. DE CARACTÉRES DA SENHA ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jPasswordField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // CAMPO ONDE SERÁ INSERIDO O TAMANHO DA SENHA
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO QUE INICIA O CRACKEAMENTO DA SENHA
        jTextField2.setText("Realizando Crackeamento...");
        try {
            password = jPasswordField2.getText();
            tamanho = Integer.parseInt(jTextField1.getText());
            String senha = "";
            if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//1,2,3,4
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length + maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    } else if (i < numeros.length + caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -(numeros.length + caracteresEspeciais.length)];
                    } else if (i < numeros.length + caracteresEspeciais.length + maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(numeros.length + caracteresEspeciais.length + maiusculas.length)];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected()) {//1,2,3
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length + maiusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    } else if (i < numeros.length + caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -(numeros.length + caracteresEspeciais.length)];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected()) {//1,2,4
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    } else if (i < numeros.length + caracteresEspeciais.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(numeros.length + caracteresEspeciais.length)];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//1,3,4
                int tamanhoBiblioteca = numeros.length + maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -numeros.length];
                    } else if (i < numeros.length + maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(numeros.length + maiusculas.length)];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//2,3,4
                int tamanhoBiblioteca = caracteresEspeciais.length + maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i];
                    } else if (i < caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -caracteresEspeciais.length];
                    } else if (i < caracteresEspeciais.length + maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(caracteresEspeciais.length + maiusculas.length)];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected()) {//1,2
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox3.isSelected()) {//1,3
                int tamanhoBiblioteca = numeros.length + maiusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -numeros.length];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox4.isSelected()) {//1,4
                int tamanhoBiblioteca = numeros.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -numeros.length];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected()) {//2,3
                int tamanhoBiblioteca = caracteresEspeciais.length + maiusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i];
                    } else if (i < caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -caracteresEspeciais.length];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox2.isSelected() && jCheckBox4.isSelected()) {//2,4
                int tamanhoBiblioteca = caracteresEspeciais.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i];
                    } else if (i < caracteresEspeciais.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -caracteresEspeciais.length];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//3,4
                int tamanhoBiblioteca = maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < maiusculas.length) {
                        biblioteca[i] = maiusculas[i];
                    } else if (i < maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -maiusculas.length];
                    }
                }
                senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected()) {//1
                senha = crackeador.bibliotecaNumeros(tamanho, password);
            } else if (jCheckBox2.isSelected()) {//2
                senha = crackeador.bibliotecaCaracteresEspeciais(tamanho, password);
            } else if (jCheckBox3.isSelected()) {//3
                senha = crackeador.bibliotecaMaiucula(tamanho, password);
            } else if (jCheckBox4.isSelected()) {//4
                senha = crackeador.bibliotecaMinuscula(tamanho, password);
            }
            jTextField3.setText(Combinacoes.quantidade+"");  
            if (!senha.equals("")) {
                jTextField2.setText(senha);
                JOptionPane.showMessageDialog(null, "Senha Desbloqueada com Sucesso!!!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jTextField2.setText("Senha Incorreta!");
                JOptionPane.showMessageDialog(null, "Infelizmente não foi possível quebrar a Senha!!!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | HeadlessException e) {
            jTextField2.setText("Crackeamento Falhou!");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTÃO PARA GERAR UMA BIBLIOTECA DE CARACTÉRES ESPECÍFICOS
        jTextField2.setText("Realizando Crackeamento...");
        try {
            password = jPasswordField2.getText();//o password só pode ter no máximo 9 digítos nesse caso
            tamanho = Integer.parseInt(jTextField1.getText().charAt(0)+"");//quando for digitar o tamanho, digite o tamanho em seguida digite os caracteres especificos
            char biblioteca[] = new char[jTextField1.getText().length()-1];//cria um vetor de caracteres, baseado no campo NÚM. DE CARACTÉRES DE SENHA
            for (int i = 0; i < jTextField1.getText().length()-1; i++) {
                biblioteca[i] = jTextField1.getText().charAt(i+1);
            }
            String senha = crackeador.bibliotecaManual(tamanho, biblioteca, password);
            jTextField3.setText(Combinacoes.quantidade+"");  
            if (!senha.equals("")) {
                jTextField2.setText(senha);
                JOptionPane.showMessageDialog(null, "Senha Desbloqueada com Sucesso!!!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jTextField2.setText("Senha Incorreta!");
                JOptionPane.showMessageDialog(null, "Infelizmente não foi possível quebrar a Senha!!!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | HeadlessException e) {
            jTextField2.setText("Crackeamento Falhou!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // NÚMEROS
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // CARACTÉRES ESPECIAIS
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // LETRAS MINÚSCULAS
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // LETRAS MAIÚSCULAS
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // SENHA QUE SERÁ CRACKEADA:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // SENHA CRACKEADA
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // QUANTIDADE DE TENTATIVAS
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        // TODO add your handling code here:
        jPasswordField2.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");        
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // SALVAR SENHA GERADA A PARTIR DE BIBLIOTECAS
        jTextField2.setText("Realizando Crackeamento...");
        try {
            password = jPasswordField2.getText();
            tamanho = Integer.parseInt(jTextField1.getText());
            String senha = "";
            if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//1,2,3,4
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length + maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    } else if (i < numeros.length + caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -(numeros.length + caracteresEspeciais.length)];
                    } else if (i < numeros.length + caracteresEspeciais.length + maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(numeros.length + caracteresEspeciais.length + maiusculas.length)];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected()) {//1,2,3
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length + maiusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    } else if (i < numeros.length + caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -(numeros.length + caracteresEspeciais.length)];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected()) {//1,2,4
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    } else if (i < numeros.length + caracteresEspeciais.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(numeros.length + caracteresEspeciais.length)];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//1,3,4
                int tamanhoBiblioteca = numeros.length + maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -numeros.length];
                    } else if (i < numeros.length + maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(numeros.length + maiusculas.length)];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//2,3,4
                int tamanhoBiblioteca = caracteresEspeciais.length + maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i];
                    } else if (i < caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -caracteresEspeciais.length];
                    } else if (i < caracteresEspeciais.length + maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -(caracteresEspeciais.length + maiusculas.length)];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox2.isSelected()) {//1,2
                int tamanhoBiblioteca = numeros.length + caracteresEspeciais.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i -numeros.length];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox3.isSelected()) {//1,3
                int tamanhoBiblioteca = numeros.length + maiusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -numeros.length];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected() && jCheckBox4.isSelected()) {//1,4
                int tamanhoBiblioteca = numeros.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < numeros.length) {
                        biblioteca[i] = numeros[i];
                    } else if (i < numeros.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -numeros.length];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected()) {//2,3
                int tamanhoBiblioteca = caracteresEspeciais.length + maiusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i];
                    } else if (i < caracteresEspeciais.length + maiusculas.length) {
                        biblioteca[i] = maiusculas[i -caracteresEspeciais.length];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox2.isSelected() && jCheckBox4.isSelected()) {//2,4
                int tamanhoBiblioteca = caracteresEspeciais.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < caracteresEspeciais.length) {
                        biblioteca[i] = caracteresEspeciais[i];
                    } else if (i < caracteresEspeciais.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -caracteresEspeciais.length];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox3.isSelected() && jCheckBox4.isSelected()) {//3,4
                int tamanhoBiblioteca = maiusculas.length + minusculas.length;
                char biblioteca[] = new char[tamanhoBiblioteca];                
                for (int i = 0; i < biblioteca.length; i++) {
                    if (i < maiusculas.length) {
                        biblioteca[i] = maiusculas[i];
                    } else if (i < maiusculas.length + minusculas.length) {
                        biblioteca[i] = minusculas[i -maiusculas.length];
                    }
                }
                senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);             
            } else if (jCheckBox1.isSelected()) {//1
                senha = crackeador.salvaBibliotecaNumeros(tamanho, password);
            } else if (jCheckBox2.isSelected()) {//2
                senha = crackeador.salvaBibliotecaCaracteresEspeciais(tamanho, password);
            } else if (jCheckBox3.isSelected()) {//3
                senha = crackeador.salvaBibliotecaMaiucula(tamanho, password);
            } else if (jCheckBox4.isSelected()) {//4
                senha = crackeador.salvaBibliotecaMinuscula(tamanho, password);
            }
            jTextField2.setText(senha);
            jTextField3.setText(Combinacoes.quantidade+"");
            JOptionPane.showMessageDialog(null, "Gravação Concluída!");
        } catch (NumberFormatException | HeadlessException e) {
            jTextField2.setText("Crackeamento Falhou!");
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // SALVA SENHA GERADA A PARTIR DE CARACTÉRES ESPECÍFICOS
        jTextField2.setText("Realizando Crackeamento...");
        try {
            password = jPasswordField2.getText();//o password só pode ter no máximo 9 digítos nesse caso
            tamanho = Integer.parseInt(jTextField1.getText().charAt(0)+"");//quando for digitar o tamanho, digite o tamanho em seguida digite os caracteres especificos
            char biblioteca[] = new char[jTextField1.getText().length()-1];//cria um vetor de caracteres, baseado no campo NÚM. DE CARACTÉRES DE SENHA
            for (int i = 0; i < jTextField1.getText().length()-1; i++) {
                biblioteca[i] = jTextField1.getText().charAt(i+1);
            }
            String senha = crackeador.salvaBibliotecaManual(tamanho, biblioteca, password);
            jTextField2.setText(senha);
            jTextField3.setText(Combinacoes.quantidade+"");
            JOptionPane.showMessageDialog(null, "Gravação Concluída!");
        } catch (NumberFormatException | HeadlessException e) {
            jTextField2.setText("Crackeamento Falhou!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CrackPasswordSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrackPasswordSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrackPasswordSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrackPasswordSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrackPasswordSimulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
