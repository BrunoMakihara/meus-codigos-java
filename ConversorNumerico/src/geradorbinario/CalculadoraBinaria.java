package geradorbinario;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

/**
 * @author BRUNO MITSUYOSHI MAKIHARA
 * email: brunomakihara@yahoo.com.br
 */
public class CalculadoraBinaria extends javax.swing.JFrame {

    //OPERADORES PARA REALIZAR CÁLCULO SECRETO DA CALCULADORA
    private int numero1 = 0;
    private int numero2 = 0;
    private String operador = "";
    private boolean codigoSecreto = false;
    
    public CalculadoraBinaria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Numérico de Bases");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Iskoola Pota", 2, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton1.setText("9");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton2.setText("8");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton3.setText("7");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton4.setText("*");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton5.setText("/");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton6.setText("4");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton7.setText("5");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton8.setText("6");
        jButton8.setBorder(new javax.swing.border.MatteBorder(null));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton9.setText("+");
        jButton9.setBorder(new javax.swing.border.MatteBorder(null));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton10.setText("1");
        jButton10.setBorder(new javax.swing.border.MatteBorder(null));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton11.setText("2");
        jButton11.setBorder(new javax.swing.border.MatteBorder(null));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton12.setText("3");
        jButton12.setBorder(new javax.swing.border.MatteBorder(null));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton13.setText("-");
        jButton13.setBorder(new javax.swing.border.MatteBorder(null));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton14.setText("0");
        jButton14.setBorder(new javax.swing.border.MatteBorder(null));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton15.setText("BINÁRIO");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton16.setText("HEXA");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor Numérico Binário");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton17.setFont(new java.awt.Font("Dungeon", 0, 14)); // NOI18N
        jButton17.setText("GERAR LISTA DE NÚMEROS BINÁRIOS");
        jButton17.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entre com um Número Decimal para ser Convertido em Binário, ou em Qualquer Outra Base");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText(" Número Decimal:");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText(" Número Binário:");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Iskoola Pota", 2, 24)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton18.setText("0");
        jButton18.setBorder(new javax.swing.border.MatteBorder(null));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton19.setText("1");
        jButton19.setBorder(new javax.swing.border.MatteBorder(null));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton20.setText("DECIMAL");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Dungeon", 0, 12)); // NOI18N
        jButton21.setText("NOVO");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton22.setText("BASE 3");
        jButton22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton23.setText("BASE 4");
        jButton23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton24.setText("BASE 5");
        jButton24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton25.setText("BASE 8");
        jButton25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton26.setText("BASE 7");
        jButton26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton27.setText("BASE 6");
        jButton27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton28.setText("BASE 9");
        jButton28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton29.setText("BASE 11");
        jButton29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton30.setText("BASE 12");
        jButton30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton31.setText("BASE 13");
        jButton31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton32.setText("BASE 14");
        jButton32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton33.setText("BASE 15");
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton34.setText("B");
        jButton34.setBorder(new javax.swing.border.MatteBorder(null));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton35.setText("C");
        jButton35.setBorder(new javax.swing.border.MatteBorder(null));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton36.setText("A");
        jButton36.setBorder(new javax.swing.border.MatteBorder(null));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton37.setText("F");
        jButton37.setBorder(new javax.swing.border.MatteBorder(null));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton38.setText("D");
        jButton38.setBorder(new javax.swing.border.MatteBorder(null));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton39.setText("E");
        jButton39.setBorder(new javax.swing.border.MatteBorder(null));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Dungeon", 0, 10)); // NOI18N
        jButton40.setText("H");
        jButton40.setBorder(new javax.swing.border.MatteBorder(null));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Funcionalidade dos Botões e dos Campos de Texto"> 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acrescentaDecimal("9");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        acrescentaDecimal("8");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        acrescentaDecimal("7");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        acrescentaDecimal("6");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        acrescentaDecimal("5");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        acrescentaDecimal("4");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        acrescentaDecimal("3");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        acrescentaDecimal("2");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       acrescentaDecimal("1");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        acrescentaDecimal("0");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText()+"*");
            String aux = "";
            String temp = jTextField1.getText();
            for (int i = 0; i < temp.length()-1; i++) {
                aux += temp.charAt(i);//PRIMEIRO NÚMERO
            }
            numero1 = Integer.parseInt(aux);
            aux = ""+temp.charAt(temp.length() -1);
            operador = aux;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText()+"/");
            String aux = "";
            String temp = jTextField1.getText();
            for (int i = 0; i < temp.length()-1; i++) {
                aux += temp.charAt(i);//PRIMEIRO NÚMERO
            }
            numero1 = Integer.parseInt(aux);
            aux = ""+temp.charAt(temp.length() -1);
            operador = aux;
        } catch (Exception e) {
        }  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText()+"+");
            String aux = "";
            String temp = jTextField1.getText();
            for (int i = 0; i < temp.length()-1; i++) {
                aux += temp.charAt(i);//PRIMEIRO NÚMERO
            }
            numero1 = Integer.parseInt(aux);
            aux = ""+temp.charAt(temp.length() -1);
            operador = aux;
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText()+"-");
            String aux = "";
            String temp = jTextField1.getText();
            for (int i = 0; i < temp.length()-1; i++) {
                aux += temp.charAt(i);//PRIMEIRO NÚMERO
            }
            numero1 = Integer.parseInt(aux);
            aux = ""+temp.charAt(temp.length() -1);
            operador = aux;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    public void operacao() {
        int resultado = 0;
        switch (operador) {
            case "*":
                resultado = numero1 *numero2;
                break;
            case "/":
                resultado = numero1 /numero2;
                break;
            case "+":
                resultado = numero1 +numero2;
                break;
            case "-":
                resultado = numero1 -numero2;
                break;
            default:
                break;
        }
        String textoPrincipal = numero1+operador+numero2+" = "+resultado;
        jTextField1.setText(textoPrincipal);
        jTextField2.setText(" "+resultado);
        jTextField3.setText(" "+Integer.toBinaryString(resultado));
        numero1 = 0;
        numero2 = 0;
        operador = "";
    }
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            int base = 2;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");//NÚMERO DIGITADO
            jTextField2.setText(" Clique em Novo");//DECIMAL
            jTextField3.setText(" Clique em NOVO");//BINÁRIO
            jTextField4.setText("");
        }   
    }//GEN-LAST:event_jButton15ActionPerformed
    
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       // BOTÃO HEXADECIMAL 
        try {
            int base = 16;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            if (codigoSecreto) {
                char baseChar = jTextField1.getText().charAt(jTextField1.getText().length()-1);
                int base = converteToNumber(baseChar);
                String numeroString = "";
                for (int i = 0; i < jTextField1.getText().length()-1; i++) {
                    numeroString += jTextField1.getText().charAt(i);
                }
                int numero = Integer.parseInt(numeroString);
                
                jTextField1.setText("Gerando Código Base " + base + " ... ");
                String arquivo = EscolherArquivo.caminho();
                BufferedWriter saida;
                saida = new BufferedWriter(new FileWriter(arquivo, true));//TALVEZ OCORRA ERRO QUANDO FECHA A JANELA DE NOME
                saida.write("\r\n");
                saida.write("GERADOR CONTÍNUO DE CÓDIGOS BASE " + base + " - " + numero);
                saida.write("\r\n");
                saida.write("___________________________________________");
                saida.write("\r\n");
                saida.write("\r\n");
                
                int temp = numero;
                int numMax = 1;
                String[] dados = new String[temp];
                String numeroModificado;
                String numeroMaior = conversorUniversal(temp, base);
                for (int i = 0; i < temp; i++) {//Gera Qtd de Números Binários
                    dados[i] = (complementoNumero(numeroString, numMax+"")+" - ");
                    numeroModificado = conversorUniversal(i+1, base);
                    numeroModificado = complementoNumero(numeroMaior, numeroModificado);
                    dados[i] += numeroModificado;
                    numMax++;
                }
                for (int i = 0; i < temp; i++) {
                    saida.write(dados[i]);
                    saida.write("\r\n");
                    System.out.println(dados[i]);//IMPRIME O QUE SERÁ IMPRESSO NO BLOCO DE NOTAS
                }
                saida.flush();
                saida.close();
                
            } else {
                String aux = jTextField1.getText();
                int numMax = Integer.parseInt(jTextField1.getText());//TALVEZ OCORRA ERRO NA CONVERSÃO DE STRING PARA NÚMEROS
                jTextField1.setText("Gerando Código Binário ... ");
                String arquivo = EscolherArquivo.caminho();
                BufferedWriter saida;
                saida = new BufferedWriter(new FileWriter(arquivo, true));//TALVEZ OCORRA ERRO QUANDO FECHA A JANELA DE NOME
                saida.write("\r\n");
                saida.write("GERADOR CONTÍNUO DE CÓDIGOS BINÁRIOS - "+numMax);
                saida.write("\r\n");
                saida.write("___________________________________________");
                saida.write("\r\n");
                saida.write("\r\n");

                int posicao = expoenteBinario(numMax);
                int temp = numMax;
                String[] dados = new String[temp];
                for (int i = 0; i < temp; i++) {//Gera Qtd de Números Binários
                    String numeroBinario = "";
                    numMax = temp -i;
                    aux = complementoNumero(aux, numMax+"");
                    dados[i] = (aux+" - ");
                    for (int j = posicao; j > -1; j--) {//Gera o Número Binário
                        int binario = (int) Math.pow(2, j);
                        if (binario <= numMax) {
                            numeroBinario += '1';
                            numMax -= binario;
                        } else {
                            numeroBinario += '0';
                        }
                    }
                    dados[i] += numeroBinario;
                }
                for (int i = temp-1; i > -1; i--) {
                    saida.write(dados[i]);
                    saida.write("\r\n");
                    System.out.println(dados[i]);//IMPRIME O QUE SERÁ IMPRESSO NO BLOCO DE NOTAS
                }
                saida.flush();
                saida.close();
            }    
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Erro de gravação ");
            System.err.println("ERRO: " + e.getMessage());
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TELA BINARIO PARA DECIMAL
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // 0 PARA CONVERSOR
        acrescentaBinario("0");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // 1 PARA CONVERSOR
        acrescentaBinario("1");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // BOTÃO DECIMAL
        try {
            if (!"".equals(operador)) {
                String aux = ""+numero1;
                String aux2 = "";
                String temp = jTextField1.getText();
                for (int i = aux.length()+1; i < temp.length(); i++) {
                    aux2 += temp.charAt(i);//PRIMEIRO NÚMERO
                }
                numero2 = Integer.parseInt(aux2);
                operacao();                
                
            } else {
                if (jTextField4.getText().contains(" ")) {
                    jTextField1.setText("");
                    jTextField2.setText(" Clique em Novo");
                    jTextField3.setText(" Clique em NOVO");
                    jTextField4.setText(" Clique em NOVO");
                } else {
                    String binario = jTextField4.getText();
                    int numero = 0;
                    numero += converte(binario, binario.length()-1, 0); 
                    jTextField1.setText("");
                    jTextField2.setText(" "+String.valueOf(numero));
                    jTextField3.setText(" "+binario);
                    jTextField4.setText(" DECIMAL: "+numero);
                }
                if (jTextField3.getText().equals(" 010000")) {
                    jTextField1.setText("*** ATENÇÃO!!! ... Código Secreto Desbloqueado! ***");
                    jTextField2.setText("-------------------------------------------------------------------------");
                    jTextField3.setText("-------------------------------------------------------------------------");
                    jTextField4.setText("**************************");
                    formula();
                }
            }  
        } catch (Exception e) {
            jTextField1.setText("");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText(" Clique em NOVO");
        }   
    }//GEN-LAST:event_jButton20ActionPerformed

    public void formula() {
        JOptionPane.showMessageDialog(null, "Modo Root Ativado!");
        System.out.println("Código Secreto Desbloqueado!");
        codigoSecreto = true;
    }
    
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // BOTÃO NOVO
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        numero1 = 0;
        numero2 = 0;
        operador = "";
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // BASE 3
        try {
            int base = 3;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // BASE 4
        try {
            int base = 4;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // BASE 5
        try {
            int base = 5;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // BASE 8
        try {
            int base = 8;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // BASE 7
        try {
            int base = 7;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // BASE 6
        try {
            int base = 6;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // BASE 9
        try {
            int base = 9;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // BASE 11
        try {
            int base = 11;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // BASE 12
        try {
            int base = 12;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // BASE 13
        try {
            int base = 13;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // BASE 14
        try {
            int base = 14;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // BASE 15
        try {
            int base = 15;
            String naoDecimal = jTextField1.getText();
            if (jTextField1.getText().charAt(0) == '0') {
                jTextField1.setText(" DECIMAL: "+converteToDecimal(naoDecimal, base));
                jTextField2.setText(" "+converteToDecimal(naoDecimal, base));
                jTextField3.setText(" "+Integer.toBinaryString(Integer.parseInt(converteToDecimal(naoDecimal, base))));
            } else {
                int numero = Integer.parseInt(jTextField1.getText()); 
                jTextField1.setText(" "+numero+" na BASE "+base+": "+conversorUniversal(numero, base));
                jTextField2.setText(" "+numero);
                jTextField3.setText(" "+Integer.toBinaryString(numero));
            }  
            jTextField4.setText("");
        } catch (Exception e) {
            jTextField1.setText(" Clique em NOVO");
            jTextField2.setText(" Clique em Novo");
            jTextField3.setText(" Clique em NOVO");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // BOTÃO B
        acrescentaDecimal("B");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // BOTÃO C
        acrescentaDecimal("C");
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // BOTÃO A
        acrescentaDecimal("A");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // BOTÃO F
        acrescentaDecimal("F");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // BOTÃO D
        acrescentaDecimal("D");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // BOTÃO E
        acrescentaDecimal("E");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // BOTÃO 16
        acrescentaDecimal("H");
    }//GEN-LAST:event_jButton40ActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="acrescenta Decimal"> 
    public void acrescentaDecimal (String x) {
        if (jTextField1.getText().contains("Clique")) {
            //BLOQUEIA OS BOTÕES E AGUARDA O CLIQUE NO BOTÃO NOVO
            x = "";
        } else if (jTextField1.getText().contains(" ") || jTextField4.getText().contains(" ")) {
            //SE O SISTEMA FOR UTILIZADO CORRETAMENTE, ELE PERMITIRÁ FAZER OPERAÇÕES CONSTANTES
            //SEM A NECESSIDADE DE APERTAR O BOTÃO NOVO
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }
        jTextField1.setText(jTextField1.getText()+x);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="acrescenta Binário"> 
    public void acrescentaBinario (String x) {
        if (jTextField4.getText().contains("D") || jTextField1.getText().contains(" ")) {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        } else if (jTextField4.getText().contains("Clique")) {
            //BLOQUEIA OS BOTÕES E AGUARDA O CLIQUE NO BOTÃO NOVO
            x = "";
        }
        jTextField4.setText(jTextField4.getText()+x);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="expoente Binário"> 
    public static int expoenteBinario(int numero) {
        int base = 1;
        int qtdBase = -1;
        do {
            base *= 2;//VALOR DA CASA DE BITS -> EXEMPLO 8-4-2-1
            qtdBase++;//base máxima a ser elevada para acrescentar o valor 1
        } while (base <= numero);
        return qtdBase;//VALOR DO EXPOENTE -> EXEMPLO 3-2-1-0
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="conversão Decimal"> 
    public static int converte(String binario, int i, int numero) {
        int x = binario.length()-1-i;
        if (binario.charAt(i) == '1') {
            numero += (int) pow(2,x);
        }
        i--;
        if (i >= 0) {
            return converte (binario,i, numero);
        } else {
            return numero;
        }   
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="conversor Universal para Decimal"> 
    public static String converteToDecimal(String numero, int base) {
        int decimal = 0;
        int expoente = numero.length()-2;
        for (int i = 1; i < numero.length(); i++) {//i = 1, estou descontando o ZERO inserido no começo do número
            if (converteToNumber(numero.charAt(i)) >= base) {
                return "ERRO DE CONVERSÃO";
            }
            decimal = decimal + converteToNumber(numero.charAt(i)) * (int) pow(base, expoente);
            expoente--;
        }
        return ""+decimal;   
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="conversor Universal para Outras Bases"> 
    public static String conversorUniversal(int numero, int base) {
        int expoente = 0;
        do {
            expoente++;
        } while (Math.pow(base, expoente) < numero+1);  
        expoente--;
        String numeroConversao = "";
        String aux;
        for (int i = expoente; i > -1; i--) {
            int numerico = (int) Math.pow(base, i);
            if (numerico <= numero && numerico != 1) {//ternario != 1, porque o i tem que ser diferente de ZERO
                for (int j = base -1; j > -1; j--) {
                    if (numerico *j <= numero) {
                        aux = Hexadecimal(j);
                        numeroConversao += aux;
                        numero -= numerico *j;
                        j = -1;//FUNCIONA COMO SE FOSSE UM BREAK
                    }
                }
            } else {
                if (numero < base && i == 0) {//garante que o número corresponde ao resto
                    aux = Hexadecimal(numero);
                    numeroConversao += aux;
                } else {
                    numeroConversao += '0';
                }
            } 
        }
        return numeroConversao;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Algarismos Hexadecimais"> 
    public static String Hexadecimal (int numero) {
        switch (numero) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14: 
                return "E";
            case 15:
                return "F";
            default:
                return ""+numero;
        }
    } 
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Converter Caracteres Hexadecimais em Números"> 
    public static int converteToNumber (char numero) {
        switch (numero) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E': 
                return 14;
            case 'F':
                return 15;
            case 'H':
                return 16;
            default:
                return Integer.parseInt(""+numero);
        }
    } 
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="complemento de Numeração">  
    public static String complementoNumero(String numeroMaior, String numero) {
        int tamanho = numeroMaior.length();
        int tamanho2 = numero.length();
        tamanho = tamanho -tamanho2;
        String complemento = "";
        switch (tamanho) {
            case 0:
                complemento = "";
                break;
            case 1:
                complemento = "0";
                break;
            case 2:
                complemento = "00";
                break;
            case 3:
                complemento = "000";
                break;
            case 4:
                complemento = "0000";
                break;
            case 5:
                complemento = "00000";
                break;
            case 6:
                complemento = "000000";
                break;
            case 7:
                complemento = "0000000";
                break;
            case 8:
                complemento = "00000000";
                break;
            case 9:
                complemento = "000000000";
                break;
            case 10:
                complemento = "0000000000";
                break;
            case 11:
                complemento = "00000000000";
                break;
            case 12:
                complemento = "000000000000";
                break;
            default:
                break;
        }
        complemento += numero;
        return complemento;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="main">  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CalculadoraBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraBinaria().setVisible(true);
            }
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Declaração de Variáveis"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
