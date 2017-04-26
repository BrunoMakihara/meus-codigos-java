
package master.sbrain;

/**
 * @author BRUNO MITSUYOSHI MAKIHARA
 * email: brunomakihara@yahoo.com.br
 */
//ESTE PROGRAMA MOSTRA A MELHOR JOGADA A SE FAZER E QUANTOS POR CENTO DE CHANCES VOCÊ TEM DE GANHAR
//SE A PORCENTAGEM FOR MAIOR QUE 50% VOCÊ PODE TRUCAR

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

//MAS CASO CONTRÁRIO, A PROBABILIDADE DO OUTRO TRIO MANDAR SERÁ GRANDE

public class CalculadoraTrucada extends javax.swing.JFrame {
//Obs: se colocarmos os botões de manilha na calculadora, não precisamos mais utilizar as
//variáveis de vira e nem a de naipe, pois já iremos cadastrar as cartas com as respectivas
//forças, tornando o algoritmo mais simples e veloz!!!
    private static final carteadaEstruturada cartasPoderosas = new carteadaEstruturada();
    static int cartas[] = new int[9];
    static int posicao[] = new int[9];
    static int x = 0;
    static String minhasCartas = "";
    static String[] mostraStatus = new String[9];
    static String[] mostraCartas = new String[9];
    
    //<editor-fold defaultstate="collapsed" desc="LISTA DE CORREÇÃO DE BUGS">  
    /*
    ERROS CORRIGIDOS DURANTE TESTES E EXECUÇÕES

    - NOME DOS CAMPOS
    - SISTEMA DE VALIDAÇÃO DE CARTAS
    - CONTROLE DE INSERÇÃO DE 9 CARTAS
    - ACEITA APENAS 4 CARTAS REPETIDAS
    - BLOQUEIO DE MANILHAS REPETIDAS
    - CARTAS REPETIDAS SELECIONA A CARTA QUE ESTÁ MAIS PRÓXIMA DO PÉ
    - INSERÇÃO E POSICIONAMENTO DE CARTAS
    - MAIOR CHANCE DE FAZER A 1ºRODADA
    - REPOSICIONAMENTO APÓS A 1ºRODADA
    - MAIOR CHANCE DE FAZER A 2ºRODADA
    - PORCENTAGEM TOTAL DE PERDA (CALCULO DAS 3 CARTAS)
    - SELECIONADOR DE MANILHAS PARA CÁLCULO DE PORCENTAGEM
    - SELECIONADOR DE NOMANILHAS PARA CÁLCULO DE PORCENTAGEM
    - PROBABILIDADE DE GANHAR COM CARTAS NORMAIS E MANILHAS
    - DECREMENTO DE PORCENTAGEM
    - PROBABILIDADE DE GANHAR COM 3 MANILHAS
    - PROBABILIDADE DE GANHAR COM CASAL
    - INCREMENTAÇÃO DE 50% DE CHANCES DE GANHAR
    - AJUSTE PARA NÃO GERAR PORCENTAGEM NEGATIVA
    - AJUSTE PARA NÃO ULTRAPASSAR A PORCENTAGEM DE 100%
    - QUANDO TEM ZAP JOGA O ZAP POR ÚLTIMO
    - QUANDO TEM ZAP E UMA MANILHA, JOGA A CARTA MAIS FRACA PRIMEIRO
    - AJUSTE DE CAMPOS PARA VAZIOS
    - AJUSTE DE STATUS
    - SELEÇÃO E EXIBIÇÃO DAS 3 MAIORES CARTAS
    - SELEÇÃO E EXIBIÇÃO DA MELHOR JOGADA
    - ZERAR A FILA DAS CARTAS CADASTRADAS
    - CORREÇÃO DAS CHANCES DE FAZER A PRIMEIRA(A NO PÉ, EM VEZ DE 3 NA MÃO)
    - EXCEÇÃO DE OURO E 3, JOGA O 3 SE ESTIVER MAIS PERTO DO PÉ
    - SE NÃO TEM ZAP DESCONTA O DECREMENTO DAS CARTAS REPETIDAS A TERCEIRA 
    - SIMPLICIDADE E EFICIÊNCIA
    - IMPRESSÃO DE TESTES FEITOS NO CONSOLE
    - CORREÇÃO DE BUGS
    - REDUÇÃO DE TRECHOS IRREDUNDANTES DO CÓDIGO
    ______________________________________________________________________   
    */
    
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="CalculadoraTrucada">  
    public CalculadoraTrucada() {
        initComponents();
        jTextPaneStatus.setText(" Digite as Cartas do Mão");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneCarta = new javax.swing.JTextPane();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_Q = new javax.swing.JButton();
        jButton_J = new javax.swing.JButton();
        jButton_K = new javax.swing.JButton();
        jButton_A = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_OURO = new javax.swing.JButton();
        jButton_ESPADA = new javax.swing.JButton();
        jButton_COPAS = new javax.swing.JButton();
        jButton_ZAP = new javax.swing.JButton();
        jButton_OK = new javax.swing.JButton();
        jButton_NOVO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMelhoresCartas = new javax.swing.JTextField();
        jTextFieldMelhorJogada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneStatus = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jButtonCriar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora do Truco");
        setBackground(new java.awt.Color(102, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("CLIQUE NOS BOTÕES CORRESPONDENTES AS CARTAS");
        jLabel1.setToolTipText("Aprenda a Mandar uma Mão de 11!");

        jTextPaneCarta.setEditable(false);
        jTextPaneCarta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPaneCarta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(jTextPaneCarta);

        jButton_4.setText("4");
        jButton_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });

        jButton_5.setText("5");
        jButton_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });

        jButton_6.setText("6");
        jButton_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_7.setText("7");
        jButton_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });

        jButton_Q.setText("Q");
        jButton_Q.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QActionPerformed(evt);
            }
        });

        jButton_J.setText("J");
        jButton_J.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JActionPerformed(evt);
            }
        });

        jButton_K.setText("K");
        jButton_K.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KActionPerformed(evt);
            }
        });

        jButton_A.setText("A");
        jButton_A.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AActionPerformed(evt);
            }
        });

        jButton_2.setText("2");
        jButton_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });

        jButton_3.setText("3");
        jButton_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });

        jButton_OURO.setText("OURO ♢");
        jButton_OURO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_OURO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OUROActionPerformed(evt);
            }
        });

        jButton_ESPADA.setText("ESPADA ♤");
        jButton_ESPADA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_ESPADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ESPADAActionPerformed(evt);
            }
        });

        jButton_COPAS.setText("COPAS ♡");
        jButton_COPAS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_COPAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_COPASActionPerformed(evt);
            }
        });

        jButton_ZAP.setText("ZAP ♧");
        jButton_ZAP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_ZAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ZAPActionPerformed(evt);
            }
        });

        jButton_OK.setText("OK");
        jButton_OK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        jButton_NOVO.setText("APAGAR");
        jButton_NOVO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_NOVO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_NOVOMousePressed(evt);
            }
        });
        jButton_NOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NOVOActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Melhores Cartas:");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("CARTAS SELECIONADAS: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Melhor Jogada: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextFieldMelhoresCartas.setEditable(false);
        jTextFieldMelhoresCartas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMelhoresCartas.setForeground(new java.awt.Color(0, 0, 153));
        jTextFieldMelhoresCartas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldMelhoresCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMelhoresCartasActionPerformed(evt);
            }
        });

        jTextFieldMelhorJogada.setEditable(false);
        jTextFieldMelhorJogada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMelhorJogada.setForeground(new java.awt.Color(0, 0, 153));
        jTextFieldMelhorJogada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldMelhorJogada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMelhorJogadaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("STATUS DO SEU JOGO: ");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextPaneStatus.setEditable(false);
        jTextPaneStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPaneStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(jTextPaneStatus);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Vani", 3, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Master'S Brain");
        jLabel6.setToolTipText("Master'S Brain");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setName("CALCUADORA DO TRUCO"); // NOI18N

        jButtonCriar.setFont(new java.awt.Font("Century", 3, 12)); // NOI18N
        jButtonCriar.setText("CRIAR FONTE DE ESTUDOS");
        jButtonCriar.setToolTipText("GERAR CARTEADAS ALEATÓRIAS");
        jButtonCriar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_ZAP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_J, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_COPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton_ESPADA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_A, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_OURO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_K, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_NOVO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMelhoresCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMelhorJogada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_COPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ESPADA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_OURO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ZAP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_A, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_K, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_J, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_NOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMelhoresCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMelhorJogada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("Aprenda a mandar uma mão de 11");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QActionPerformed
        acrescenta(5, 'Q');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_QActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        acrescenta(9, '2');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_ZAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ZAPActionPerformed
        acrescenta(14, 'Z');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_ZAPActionPerformed

    private void jTextFieldMelhoresCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMelhoresCartasActionPerformed
        
    }//GEN-LAST:event_jTextFieldMelhoresCartasActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        try {
            if (x == 9 && cartas[8] != 0) {
                jTextPaneStatus.setText(" Clique em NOVO!");
                Node melhoresCartas[] = new Node[3]; 
                for (int i = 0; i < melhoresCartas.length; i++) {
                    melhoresCartas[i] = cartasPoderosas.maioresCartas();
                } 
                for (Node melhoresCarta : melhoresCartas) {
                    cartasPoderosas.cadastro(melhoresCarta.getCarta(), melhoresCarta.getPosicao());
                }
                jTextFieldMelhorJogada.setText(cartasPoderosas.probabilidadeDoTruco(melhoresCartas));
                jTextFieldMelhoresCartas.setText(colocacao());
                
                
                //Efetua o cadastro de todas as cartas novamente
                cartasPoderosas.removeAll();
                for (int i = 0; i < 9; i++) {
                    if (i < 3) {
                        posicao[i] = 3;
                    } else if (i < 6) {
                        posicao[i] = 2;
                    } else {
                        posicao[i] = 1;
                    }
                    cartasPoderosas.cadastro(cartas[i], posicao[i]);
                }
            }  
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_NOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NOVOActionPerformed
        /*System.out.println();
        jTextPaneStatus.setText(" Digite as Cartas do Mão");
        jTextPaneCarta.setText("");
        jTextFieldMelhoresCartas.setText("");
        jTextFieldMelhorJogada.setText("");
        x = 0;
        minhasCartas = "";
        cartasPoderosas.removeAll();
        zerarCartas(cartas);//Zera o vetor de cartas, para não ter bloqueio de manilha na mesma posição do teste anterior
        */
        try {
            if (x > 0) {
                x--;
                jTextPaneStatus.setText(mostraStatus[x]);
                jTextPaneCarta.setText(mostraCartas[x]);
                minhasCartas = mostraCartas[x];
                cartasPoderosas.remove(x);//tem que remover o último a ser inserido não a mais fraca
                jTextFieldMelhorJogada.setText("");
                jTextFieldMelhoresCartas.setText("");
                cartas[x] = 0; 
            }
            
        } catch (Exception e) {
            //System.err.println("erro no apagar");
        }
    }//GEN-LAST:event_jButton_NOVOActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        acrescenta(2, '5');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        acrescenta(1, '4');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        acrescenta(3, '6');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        acrescenta(4, '7');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JActionPerformed
        acrescenta(6, 'J');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_JActionPerformed

    private void jButton_KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KActionPerformed
        acrescenta(7, 'K');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_KActionPerformed

    private void jButton_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AActionPerformed
        acrescenta(8, 'A');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_AActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        acrescenta(10, '3');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_COPASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_COPASActionPerformed
        acrescenta(13, 'C');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_COPASActionPerformed

    private void jButton_ESPADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ESPADAActionPerformed
        acrescenta(12, 'E');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_ESPADAActionPerformed

    private void jButton_OUROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OUROActionPerformed
        acrescenta(11, 'O');
        jTextPaneCarta.setText(minhasCartas); 
    }//GEN-LAST:event_jButton_OUROActionPerformed

    private void jTextFieldMelhorJogadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMelhorJogadaActionPerformed
        
    }//GEN-LAST:event_jTextFieldMelhorJogadaActionPerformed

    private void jButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarActionPerformed
        try {
            String arquivo = EscolherArquivo.caminho();
            BufferedWriter saida;
            saida = new BufferedWriter(new FileWriter(arquivo, true));
            saida.write("\r\n");
            saida.write("******** PROBABILIDADE DO TRUCO ********");
            saida.write("\r\n");
            for(int i = 0; i < 100; i++){//GERA 100 CARTEADAS DIFERENTES
                saida.write("\r\n");
                String inf;
                saida.write("________________________________________");
                saida.write("\r\n");
                saida.write("\r\n");
                saida.write(simulacao(i));
                saida.write("\r\n");
                saida.write(cartasPoderosas.display(cadastraCartas(),9));
                saida.write("\r\n");
                inf = selecaoDeCartas();
                saida.write("\r\n");
                saida.write(colocacao());
                saida.write("\r\n");
                saida.write(inf);  
                saida.write("\r\n");
                cartasPoderosas.removeAll();
            }
            saida.write("________________________________________");
            saida.flush();
            saida.close();
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Erro de gravação ");
            System.err.println("ERRO: " + e.getMessage());
        } 
    }//GEN-LAST:event_jButtonCriarActionPerformed

    private void jButton_NOVOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NOVOMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_NOVOMousePressed
    //</editor-fold> 
    

    //<editor-fold defaultstate="collapsed" desc="cadastraCartasAleatórias">  
    public static int[] cadastraCartas() {
        int card[] = new int[9];
        int position[] = new int[9];
        int naipe;
        int z=0, c=0, e=0, o=0;
        int manilhas = 0;
        int aux;
        boolean continua;
        boolean cartasLimites;
        
        Random r = new Random();
        for (int i = 0; i < 9; i++) {
            if (i < 3) {//ATRIBUI O POSICIONAMENTO DAS CARTAS
                position[i] = 3;
            } else if (i < 6) {
                position[i] = 2;
            } else if (i < 9){
                position[i] = 1;
            }
            do {
                cartasLimites = false;//zera a restrição de repetição de 4 cartas
                aux = 0;
                card[i] = Math.abs(r.nextInt()%10)+1;//GERA CARTAS DE 1 A 10

                if (card[i] == 1) {//SE TIVER MANILHA, FINGE QUE A MANILHA É O 4        
                    do {//se tiver manilha repetida, gera outra manilha diferente
                        continua = false;
                        naipe = Math.abs(r.nextInt()%4)+1;//GERA NAIPES DE 1 A 4
                        card[i] = naipe +10;
                        if (manilhas == 4) {//IMPEDE QUE SEJA CADASTRADO MANILHAS REPETIDAS
                            card[i] = 1;// E ACABA CADASTRANDO UM 4 ao em véz de manilha
                        } else if (card[i] == 11) {
                            o++;
                            if (o > 1) {
                                continua = true;
                                o--;
                            }
                        } else if (card[i] == 12) {
                            e++;
                            if (e > 1) {
                                continua = true;
                                e--;
                            }
                        } else if (card[i] == 13) {
                            c++;
                            if (c > 1) {
                                continua = true;
                                c--;
                            }
                        } else if (card[i] == 14) {
                            z++;
                            if (z > 1) {
                                continua = true;
                                z--;
                            }
                        }
                        manilhas = z + c + e + o; 
                    } while(continua); 
                }
                //RESTRINGE O CADASTRO DE APENAS 4 CARTAS REPETIDAS
                for (int j = 0; j < i+1; j++) {
                    if (card[i] == card[j]) {
                        aux++;
                    }
                }
                if (aux > 4) {
                    cartasLimites = true;
                }
            } while(cartasLimites);
            
            cartasPoderosas.cadastro(card[i], position[i]);  
        }
        return card;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="selecaoDeCartas">  
    public static String selecaoDeCartas() {
        Node melhoresCartas[] = new Node[3];
        for (int i = 0; i < 3; i++) {
            melhoresCartas[i] = cartasPoderosas.maioresCartas();
        }
        for (Node melhoresCarta : melhoresCartas) {
            cartasPoderosas.cadastro(melhoresCarta.getCarta(), melhoresCarta.getPosicao());
        }
        return cartasPoderosas.probabilidadeDoTruco(melhoresCartas);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Estudos de Simulação">  
    public static String simulacao(int i) {
        String complemento = "";
        if (i < 9) {
            complemento = "00";
        } else if (i < 99) {
            complemento = "0";
        }
        return "Estudos de Simulação Número: " + complemento +(i + 1);
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Acrescenta"> 
    private void acrescenta(int valor, char carta){
        int flag = 0;
        int cartaLimite = 1;
        if(x < 9){
            if (valor > 10) {
                for (int i = 0; i <= x; i++) {
                    if (cartas[i] == valor) {
                        flag = 1;//TEM MANILHA REPETIDA
                    }
                }
            }
            for (int i = 0; i < x; i++) {
                if (valor == cartas[i]) {
                    cartaLimite++;//CONTA A QTD DE CARTAS REPETIDAS
                }
            }
            if (cartaLimite > 4) {//SE TIVER MAIS DE 4 CARTAS REPETIDAS
                flag = 1;//TEM MAIS DE 4 CARTAS REPETIDAS
            }
            if (flag == 0) {//verifica se não tem erro, para poder fazer o cadastro da carta
                mostraStatus[x] = jTextPaneStatus.getText();
                mostraCartas[x] = jTextPaneCarta.getText();
                if (x < 3) {
                    jTextPaneStatus.setText(" Digite as Cartas do Mão");
                    posicao[x] = 3;
                    if (x == 2) {
                        jTextPaneStatus.setText(" Digite as Cartas do Meio");
                    }
                } else if (x < 6) {
                    jTextPaneStatus.setText(" Digite as Cartas do Meio");
                    posicao[x] = 2;
                    if (x == 5) {
                        jTextPaneStatus.setText(" Digite as Cartas do Contra Pé");
                    }
                } else {
                    jTextPaneStatus.setText(" Digite as Cartas do Contra Pé");
                    posicao[x] = 1;
                    if (x == 8) {
                        jTextPaneStatus.setText(" Clique em OK!!");
                    }
                }
                cartas[x] = valor;
                cartasPoderosas.cadastro(cartas[x], posicao[x]);
                if (x == 0) {
                    minhasCartas = " " + carta;
                } else if (x < 9){
                    minhasCartas = minhasCartas + " - " + carta;
                }
                x++;
            }
        } else {
            jTextPaneStatus.setText(" Clique em OK!");
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Colocação"> 
    public static String colocacao() {
        Node melhoresCartas[] = new Node[3];
        for (int i = 0; i < melhoresCartas.length; i++) {
            melhoresCartas[i] = cartasPoderosas.maioresCartas();
        }
        for (Node melhoresCarta : melhoresCartas) {
            cartasPoderosas.cadastro(melhoresCarta.getCarta(), melhoresCarta.getPosicao());
        }
        char carta[] = new char[3]; 
        String position[] = new String[3];
        for (int i = 0; i < melhoresCartas.length; i++) {
            switch (melhoresCartas[i].getCarta()) {
                case 14:
                    carta[i] = 'Z';
                    break;
                case 13:
                    carta[i] = 'C';
                    break;
                case 12:
                    carta[i] = 'E';
                    break;
                case 11:
                    carta[i] = 'O';
                    break;
                case 10:
                    carta[i] = '3';
                    break;
                case 9:
                    carta[i] = '2';
                    break;
                case 8:
                    carta[i] = 'A';
                    break;
                case 7:
                    carta[i] = 'K';
                    break;
                case 6:
                    carta[i] = 'J';
                    break;
                case 5:
                    carta[i] = 'Q';
                    break;
                case 4:
                    carta[i] = '7';
                    break;
                case 3:
                    carta[i] = '6';
                    break;
                case 2:
                    carta[i] = '5';
                    break;
                case 1:
                    carta[i] = '4';
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < melhoresCartas.length; i++) {
            switch (melhoresCartas[i].getPosicao()) {
                case 3:
                    position[i] = "Mão";
                    break;
                case 2:
                    position[i] = "Meio";
                    break;
                case 1:
                    position[i] = "Pé";
                    break;
                default:
                    break;
            }
        }
        String colocacao = " " + carta[0] + "_" + position[0] + " - " + carta[1] + "_" +
                position[1] + " - " + carta[2] + "_" + position[2];
        
        return colocacao;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="zerar Cartas">  
    public void zerarCartas(int [] cartas) {
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = 0;
        }
    }
    //</editor-fold>
    
        
    //<editor-fold defaultstate="collapsed" desc="main">  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTrucada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTrucada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTrucada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTrucada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraTrucada().setVisible(true);
            }
        });       
    } 
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Declaração de Variáveis não Modificaveis"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriar;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_A;
    private javax.swing.JButton jButton_COPAS;
    private javax.swing.JButton jButton_ESPADA;
    private javax.swing.JButton jButton_J;
    private javax.swing.JButton jButton_K;
    private javax.swing.JButton jButton_NOVO;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_OURO;
    private javax.swing.JButton jButton_Q;
    private javax.swing.JButton jButton_ZAP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldMelhorJogada;
    private javax.swing.JTextField jTextFieldMelhoresCartas;
    private javax.swing.JTextPane jTextPaneCarta;
    private javax.swing.JTextPane jTextPaneStatus;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
