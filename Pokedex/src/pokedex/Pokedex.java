/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author BRUNO MITSUYOSHI MAKIHARA
 * email: brunomakihara@yahoo.com.br
 * Projeto: Pokedex (Completa) - Pokémon
 */
public class Pokedex extends javax.swing.JFrame {
    
    //QUANDO DIGITA 13/14/15 NÃO APARECE AS INFORMAÇÕES REFERENTES AS VANTAGENS E DESVANTAGENS DO POKÉMON
    //DO TIPO INSETO VOADOR

    /**
     * Creates new form Pokedex
     */
    
    //<editor-fold defaultstate="collapsed" desc="Tipo de todos os pokémons">  
    //CÓDIGOS DE DOIS DIGITOS QUE REPRESENTA O TIPO DO POKÉMON
        //Normal    ->00
        //Lutar     ->01
        //Voar      ->02
        //Veneno    ->03
        //Terreno   ->04
        //Pedra     ->05
        //Bicho     ->06
        //Fantasma  ->07
        //Aço       ->08
        //Fogo      ->09
        //Água      ->10
        //Grama     ->11
        //Elétrico  ->12
        //Psíquico  ->13
        //Gelo      ->14
        //Dragão    ->15
        //Escuro    ->16
        //Fada      ->17
    static String[] tipo  = {
        "1103", "1103", "1103", "09", "09", "0902", "10", "10", "10", "06",
        "06", "0602", "0603", "0603", "0603", "0002", "0002", "0002", "00", "00",
        "0002", "0002", "03", "03", "12", "12", "04", "04", "03", "03",
        "0304", "03", "03", "0304", "17", "17", "09", "09", "0017", "0017",
        "0302", "0302", "1103", "1103", "1103", "0611", "0611", "0603", "0603", "04",
        "04", "00", "00", "10", "10", "01", "01", "09", "09", "10",
        "10", "1001", "13", "13", "13", "01", "01", "01", "1103", "1103",
        "1103", "1003", "1003", "0504", "0504", "0504", "09", "09", "1013", "1013",
        "1208", "1208", "0002", "0002", "0002", "10", "1014", "03", "03", "10",
        "1014", "0703", "0703", "0703", "0504", "13", "13", "10", "10", "12",
        "12", "1113", "1113", "04", "04", "01", "01", "00", "03", "03",
        "0405", "0405", "00", "11", "00", "10", "10", "10", "10", "10",
        "1013", "1317", "0602", "1413", "12", "09", "06", "00", "10", "1002",
        "1014", "00", "00", "10", "12", "09", "00", "0510", "0510", "0510",
        "0510", "0502", "00", "1402", "1202", "0902", "15", "15", "1502", "13",
        "13", "11", "11", "11", "09", "09", "09", "10", "10", "10",
        "00", "00", "0002", "0002", "0602", "0602", "0603", "0603", "0302", "1012",
        "1012", "12", "17", "0017", "17", "1702", "1302", "1302", "12", "12",
        "12", "11", "1017", "1017", "05", "10", "1102", "1102", "1102", "00",
        "11", "11", "0602", "1004", "1004", "13", "16", "1602", "1013", "07",
        "13", "13", "0013", "06", "0608", "00", "0402", "0804", "17", "17",
        "1003", "0608", "0605", "0601", "1614", "00", "00", "09", "0905", "1404",
        "1404", "1005", "10", "10", "1402", "1002", "0802", "1609", "1609", "1015",
        "04", "04", "00", "00", "00", "01", "01", "1413", "12", "09",
        "00", "00", "12", "09", "10", "0504", "0504", "0516", "1302", "0902",
        "1311", "11", "11", "11", "09", "0901", "0901", "10", "1004", "1004",
        "16", "16", "00", "00", "06", "06", "0602", "06", "0603", "1011",
        "1011", "1011", "11", "1116", "1116", "0002", "0002", "1002", "1002", "1317",
        "1317", "1317", "0610", "0602", "11", "1101", "00", "00", "00", "0604",
        "0602", "0607", "00", "00", "00", "01", "01", "0017", "05", "00",
        "00", "1607", "0817", "0805", "0805", "0805", "0113", "0113", "12", "12",
        "12", "12", "06", "06", "1103", "03", "03", "1016", "1016", "10",
        "10", "0904", "0904", "09", "13", "13", "00", "04", "0415", "0415",
        "11", "1116", "0002", "1502", "00", "03", "0513", "0513", "1004", "1004",
        "10", "1016", "0413", "0413", "0511", "0511", "0511", "0511", "10", "10",
        "00", "00", "07", "07", "07", "07", "1102", "13", "16", "13",
        "14", "14", "1410", "1410", "1410", "10", "10", "10", "1005", "10",
        "15", "15", "1502", "0813", "0813", "0813", "05", "14", "08", "1513",
        "1513", "10", "04", "1502", "0813", "13", "11", "11", "1104", "09",
        "0901", "0901", "10", "10", "1008", "0002", "0002", "0002", "00", "0010",
        "06", "06", "12", "12", "12", "1103", "1103", "05", "05", "0508",
        "0508", "06", "06", "0602", "0602", "0602", "12", "10", "10", "11",//wormadam
        "11", "10", "1004", "00", "0702", "0702", "00", "00", "07", "1602",
        "00", "00", "13", "0316", "0316", "0813", "0813", "05", "1317", "00",
        "0002", "0716", "1504", "1504", "1504", "00", "01", "0108", "04", "04",
        "0306", "0316", "0301", "0301", "11", "10", "10", "1002", "1114", "1114",
        "1614", "1208", "00", "0405", "11", "12", "09", "1702", "0602", "11",
        "14", "0402", "1404", "00", "1301", "0508", "07", "1407", "1207", "13",
        "13", "13", "0815", "1015", "0908", "00", "0715", "13", "10", "10",
        "16", "11", "00", "1309", "11", "11", "11", "09", "0901", "0901",
        "10", "10", "10", "00", "00", "00", "00", "00", "16", "16",
        "11", "11", "09", "09", "10", "10", "13", "13", "0002", "0002",
        "0002", "12", "12", "05", "05", "05", "1302", "1302", "04", "0408",
        "00", "01", "01", "01", "10", "1004", "1004", "01", "01", "0611",
        "0611", "0611", "0603", "0603", "0603", "11", "1117", "11", "11", "10",
        "0416", "0416", "0416", "09", "09", "11", "0605", "0605", "1601", "1601",//darmanitan
        "1302", "07", "07", "1005", "1005", "0502", "0502", "03", "03", "16",
        "16", "00", "00", "13", "13", "13", "13", "13", "13", "1002",
        "1002", "14", "14", "14", "0011", "0011", "1202", "06", "0608", "1103",
        "1103", "1007", "1007", "10", "0612", "0612", "1108", "1108", "08", "08",
        "08", "12", "12", "12", "13", "13", "0709", "0709", "0709", "15",
        "15", "15", "14", "14", "14", "06", "06", "1204", "01", "01",
        "15", "0407", "0407", "1608", "1608", "00", "0002", "0002", "1602", "1602",
        "09", "0608", "1615", "1615", "1615", "0609", "0609", "0801", "0501", "1101",
        "00", "1202", "1509", "1512", "0402", "1514", "1001", "0013", "0608", "11",
        "11", "1101", "09", "09", "0913", "10", "10", "1016", "00", "0004",
        "0002", "0902", "0902", "06", "06", "0602", "0900", "0900", "17", "17",
        "17", "11", "11", "01", "0116", "00", "13", "13", "0807", "0807",
        "0807", "17", "17", "17", "17", "1613", "1613", "1005", "1005", "0310",
        "0315", "10", "10", "1200", "1200", "0515", "0515", "0514", "0514", "17",
        "0102", "1217", "0517", "15", "15", "15", "0817", "0711", "0711", "0711",
        "0711", "14", "14", "0215", "0215", "17", "1602", "1504", "0517", "1307",//720
        "0910", "1102", "1102", "1107", "09", "09", "0916", "10", "10", "1017",
        "0002", "0002", "0002", "00", "00", "06", "0612", "0612", "01", "0114",
        "0902", "0617", "0617", "05", "05", "10", "0310", "0310", "04", "04",
        "1006", "1006", "11", "11", "1117", "1117", "0309", "0309", "0001", "0001",
        "11", "11", "11", "17", "0013", "02", "0610", "0610", "0704", "0704",
        "10", "00", "00", "0502", "00", "0915", "1208", "0717", "1013", "0015",
        "0711", "15", "1502", "1502", "1217", "1317", "1117", "1017", "13", "13",
        "1308", "1307", "0503", "0601", "0601", "12", "0802", "0608", "1615", "13",
        "0817"
    };
    //</editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="Tipos diferentes de todos os pokémons"> 
    //{tipo,vantagem,desvantagem}
    static String[][] tiposDiferente  = {//Todos as combinações de tipos diferentes de pokémon que existem
        {"00","xx","01"}, {"01","0005081416","021317"}, {"02","010611","051214"}, {"03","1117","0413"}, {"04","0305080912","101114"}, {"05","02060914","0204081011"}, {"06","111316","020509"}, {"07","0713","0716"}, {"08","051417","010409"}, {"09","06081114","040510"},
        {"10","040509","1112"}, {"11","040510","0203060914"}, {"12","0210","04"}, {"13","0103","060716"}, {"14","02041115","01050809"},  {"15","15","141517"}, {"16","0713","010617"}, {"17","011516","0308"}, {"0001","001416","01021317"}, {"0002","010611","051214"},
        {"0004","030912","01101114"}, {"0010","0409","011112"}, {"0011","0410","010203060914"}, {"0013","0103","0616"}, {"0015","15","01141517"}, {"0017","011516","0308"}, {"0102","0001111416","0212131417"}, {"0108","00051416","010409"}, {"0113","00010514","020717"}, {"0114","000405111516","010208091317"},
        {"0116","00050814","010217"}, {"0215","01061115","05141517"}, {"0301","00111416","020413"}, {"0302","01061117","05121314"}, {"0304","091217","04101314"}, {"0306","111316","02050913"}, {"0309","06111417","04051013"}, {"0310","0917","041213"}, {"0315","1115","04131415"}, {"0316","1113","04"},
        {"0402","010309","1014"}, {"0405","0305091214","010408101114"}, {"0407","03050708091213","0710111416"}, {"0408","03051417","01040910"}, {"0413","0103050912","060710111416"}, {"0415","0305091215","141517"}, {"0416","03050708091213","010610111417"}, {"0501","0005091416","01040810111317"}, {"0502","0206091114","0508101214"}, {"0503","020609111417","04081013"},
        {"0508","0205061417","010410"}, {"0510","0205060914","01041112"}, {"0511","051014","01060814"}, {"0513","0203060914","04060708101116"}, {"0514","02061115","010405081011"}, {"0515","0206091415","010408141517"}, {"0516","020607091314","01040608101117"}, {"0517","0206141516","04081011"}, {"0601","0005111416","02091317"}, {"0602","06111316","0205091214"},
        {"0604","05121316","02091014"}, {"0605","0611131416","050810"}, {"0607","1113","0205070916"}, {"0608","0511131416","09"}, {"0609","0611131416","020510"}, {"0610","04051316","020512"}, {"0611","0405101316","020305060914"}, {"0612","101316","0509"}, {"0617","11131516","0203050809"}, {"0702","0106071113","0507121416"},
        {"0703","111317","04071316"}, {"0709","060708111314","0405071016"}, {"0711","0405071013","0207091416"}, {"0715","071315","0714151617"}, {"0716","0713","17"}, {"0717","01071315","0708"}, {"0802","0106111417","0912"}, {"0807","0507131417","04070916"}, {"0813","0103051417","04070916"}, {"0815","051415","0104"},
        {"0817","010514151617","0409"}, {"0900","061114","01040510"}, {"0901","0008111416","02041013"}, {"0902","01061114","051012"}, {"0904","03081214","0410"}, {"0905","02061114","01040510"}, {"0908","06111417","010410"}, {"0910","04060814","040512"}, {"0913","0103061114","0405071016"}, {"0915","061114","040515"},
        {"0916","060708111314","01040510"}, {"1001","00040508091416","0211121317"}, {"1002","01040609","0512"}, {"1004","030405080912","11"}, {"1007","0405070913","07111216"}, {"1008","04051417","010412"}, {"1011","0405","020306"}, {"1012","020509","0411"}, {"1013","0103040509","0607111216"}, {"1014","020405","01051112"},
        {"1015","040509","1517"}, {"1016","0405070913","0106111217"}, {"1017","01040516","031112"}, {"1101","000405101416","020309131417"}, {"1102","010410","0203050914"}, {"1103","1017","02091314"}, {"1104","04051012","02060914"}, {"1108","04051417","0109"}, {"1113","01040510","02030607091416"}, {"1114","0405","01020305060809"},
        {"1116","0405071013","01020306091417"}, {"1117","0104051016","0203080914"}, {"1200","0010","0104"}, {"1202","01020610","0514"}, {"1204","0305080910","04101114"}, {"1207","02071013","040716"}, {"1208","02051417","010409"}, {"1217","01021016","0304"}, {"1302","01030611","0507121416"}, {"1307","010307","0716"},
        {"1317","0115","030708"}, {"1402","010204061115","05080912"}, {"1404","0304051215","0108091011"}, {"1407","020407111315","0507080916"}, {"1413","010203041115","050607080916"}, {"1512","0210","04141517"}, {"1513","010315","060714151617"}, {"1514","02041115","0105081517"}, {"1602","06071113","05121417"}, {"1608","05071314","010409"},
        {"1613","0307","0617"}, {"1614","020407111315","010506080917"}, {"1615","071315","0106141517"}, {"1702","0106111516","0305081214"}
    };
    //</editor-fold> 
        
    static int numeroPokemon = -1;
    static String nomePokemon;
    static String categoria;
    static String habilidade;
    static String sexo;
    static String tipoPokemon;
    static String vantagem;
    static String desvantagem;
    static String altura;
    static String peso;
    static String hp;
    static String ataque;
    static String defesa;
    static String ataque_especial;
    static String defesa_especial;
    static String velocidade;
    static String total;
    static String descricao;
    
    
    public Pokedex() {
        initComponents();
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("pokeball.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokedéx Completa 2017 - Todas as Gerações");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pokedex Completa ®");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel2.setText("  Número:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel2.setPreferredSize(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel3.setText("  Nome:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel3.setPreferredSize(null);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel4.setText("  Categoria:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField1.setPreferredSize(null);
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

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField2.setPreferredSize(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField3.setPreferredSize(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel5.setText("  Habilidades:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel6.setText("  Sexo:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel7.setText("  Tipo:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField4.setPreferredSize(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField5.setPreferredSize(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField6.setPreferredSize(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel8.setText("  Desvantagem:");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField7.setPreferredSize(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField8.setPreferredSize(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel9.setText("  Vantagem:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel10.setText("  HP:");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel10.setPreferredSize(null);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel11.setText("  Velocidade:");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel11.setPreferredSize(null);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel12.setText("  Total:");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel12.setPreferredSize(null);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel13.setText("  Ataque:");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel13.setPreferredSize(null);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField9.setPreferredSize(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel14.setText("  Defesa:");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel14.setPreferredSize(null);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField10.setPreferredSize(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField11.setPreferredSize(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField12.setPreferredSize(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField13.setPreferredSize(null);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField14.setPreferredSize(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel15.setText("  Atq. esp:");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel15.setPreferredSize(null);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField15.setPreferredSize(null);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel16.setText("  Def. esp:");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel16.setPreferredSize(null);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jButton1.setText("Procurar Pokemon");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton1.setPreferredSize(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Descrição: ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jButton2.setText("<<===  Pokémon Anterior");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jButton3.setText("Pokémon Posterior  ===>>");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField16.setPreferredSize(null);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel18.setText("  Altura:");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextField17.setPreferredSize(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        jLabel19.setText("  Peso:");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Campos em branco">  
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // NÚMERO DO POKÉMON
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // NOME DO POKÉMON
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // HABILIDADES
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // SEXO
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TIPO DO POKÉMON
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // CATEGORIA
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // VANTAGEM
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // DESVANTAGEM
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // HP DO POKÉMON
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // ATAQUE
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // DEFESA
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // ATAQUE ESPECIAL
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // DEFESA ESPECIAL
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // VELOCIDADE
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TOTAL DE PONTOS
    }//GEN-LAST:event_jTextField15ActionPerformed
    //</editor-fold> 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO QUE PROCURA O POKÉMON DE ACORDO COM O NOME, NÚMERO OU TIPO
        try { 
            //transforma o número digitado (string) em um número
            int numero = Integer.parseInt(jTextField1.getText());
            numero--;//decrementa o número para ficar ajustado de acordo com o índice 
            numeroPokemon = numero;
            busca();
            jTextField2.setText(nomePokemon);
            jTextField3.setText(categoria);
            jTextField4.setText(habilidade);
            jTextField5.setText(sexo);
            jTextField6.setText(tipoPokemon);
            jTextField7.setText(vantagem);
            jTextField8.setText(desvantagem);
            jTextField16.setText(altura);
            jTextField17.setText(peso);
            jTextField9.setText(hp);
            jTextField10.setText(ataque);
            jTextField11.setText(defesa);
            jTextField12.setText(ataque_especial);
            jTextField13.setText(defesa_especial);
            jTextField14.setText(velocidade);
            jTextField15.setText(total);
            jTextArea1.setText("Descrição:\n    "+descricao);
            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/"+nomePokemon+".png")));  
            
        } catch (Exception e) {
            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("pokeball.png")));
            numeroPokemon = -1;
            jTextArea1.setText("ATENÇÃO \"" + jTextField1.getText() + "\" NÃO É UM NÚMERO VÁLIDO!");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField16.setText("");
            jTextField17.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            jTextField14.setText("");
            jTextField15.setText("");
        }          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTÃO ANTERIOR
        try {
            if (numeroPokemon >= 1 && numeroPokemon <= 801) {
                numeroPokemon--;
                busca();
                jTextField1.setText((numeroPokemon +1) + "");
                jTextField2.setText(nomePokemon);
                jTextField3.setText(categoria);
                jTextField4.setText(habilidade);
                jTextField5.setText(sexo);
                jTextField6.setText(tipoPokemon);
                jTextField7.setText(vantagem);
                jTextField8.setText(desvantagem);
                jTextField16.setText(altura);
                jTextField17.setText(peso);
                jTextField9.setText(hp);
                jTextField10.setText(ataque);
                jTextField11.setText(defesa);
                jTextField12.setText(ataque_especial);
                jTextField13.setText(defesa_especial);
                jTextField14.setText(velocidade);
                jTextField15.setText(total);
                jTextArea1.setText("Descrição:\n    "+descricao);
                jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/"+nomePokemon+".png")));  

            }
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
        } catch (URISyntaxException ex) {
            Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTÃO POSTERIOR
        try {
            if (numeroPokemon >= -1 && numeroPokemon <= 799) {
                numeroPokemon++;
                busca();
                jTextField1.setText((numeroPokemon +1) + "");
                jTextField2.setText(nomePokemon);
                jTextField3.setText(categoria);
                jTextField4.setText(habilidade);
                jTextField5.setText(sexo);
                jTextField6.setText(tipoPokemon);
                jTextField7.setText(vantagem);
                jTextField8.setText(desvantagem);
                jTextField16.setText(altura);
                jTextField17.setText(peso);
                jTextField9.setText(hp);
                jTextField10.setText(ataque);
                jTextField11.setText(defesa);
                jTextField12.setText(ataque_especial);
                jTextField13.setText(defesa_especial);
                jTextField14.setText(velocidade);
                jTextField15.setText(total);
                jTextArea1.setText("Descrição:\n    "+descricao);
                jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagens/"+nomePokemon+".png")));  
            }    
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
        } catch (URISyntaxException ex) {
            Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Campos em branco">  
    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // ALTURA
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // PESO
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // MOUSE CLICK
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="busca o pokémon"> 
    public static void busca() throws UnsupportedEncodingException, FileNotFoundException, URISyntaxException {
        String tipo2Pokemon;
        try {
            if (tipo[numeroPokemon].length() == 2) {//se o pokémon é de apenas um tipo
                tipoPokemon = retornaTipo(tipo[numeroPokemon]);

            } else {//senão ele tem mais de um tipo
                tipoPokemon = retornaTipo(tipo[numeroPokemon].charAt(0) + "" + tipo[numeroPokemon].charAt(1));
                tipo2Pokemon = retornaTipo(tipo[numeroPokemon].charAt(2) + "" + tipo[numeroPokemon].charAt(3));            
                tipoPokemon = tipoPokemon+"/"+tipo2Pokemon;
            }
        } catch (Exception e) {
            numeroPokemon = -1;
        }
        
        String[]dados = new String[14];
        InputStream in = Pokedex.class.getResourceAsStream("dados_pokedex.txt");
        Reader reader = new InputStreamReader(in, "ISO-8859-1");
        BufferedReader br = new BufferedReader(reader);
        
        try (FileReader arq = new FileReader("dados_pokedex.txt")) {
            String linha = br.readLine(); // lê a primeira linha
            int i = 0;
            while(i < numeroPokemon) {
                linha = br.readLine();
                i++;
            }
            System.out.println(linha);
            String pokemon = linha.replace("\"", "");   //remove o caractér " da string linha
            dados = pokemon.split(";");                 //quebra a string onde tem ; e transforma em vários elementos de um vetor
            //System.out.println(dados);
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }
        //JOptionPane.showMessageDialog(null, "O ERRO DO DIST ESTÁ AQUI "+dados[0]);
        nomePokemon = dados[0];
        categoria = dados[10];
        habilidade = dados[11];
        sexo = dados[12];
        altura = dados[1]+" m";
        peso = dados[2]+" Kg";
        hp = dados[3];
        ataque = dados[4];
        defesa = dados[5];
        ataque_especial = dados[6];
        defesa_especial = dados[7];
        velocidade = dados[8];
        total = dados[9];
        descricao = dados[13];
        
        //trecho de código que retorna os tipos de vantagem e desvantagem em relação ao número do pokémon informado
        String tipoDoPokemon = tipo[numeroPokemon];
        String aux = "", temp;
        for (int i = 0; i < tiposDiferente.length; i++) {
            if (tipoDoPokemon.length() == 4) {//inverte a ordem dos tipos
                aux = tipoDoPokemon.charAt(2) + "" + tipoDoPokemon.charAt(3);
                temp = tipoDoPokemon.charAt(0) + "" + tipoDoPokemon.charAt(1);
                aux += temp;
            }//procura o tipo no vetor tiposDiferente
            if ((tipoDoPokemon == tiposDiferente[i][0]) || (aux == tiposDiferente[i][0])) {
                vantagem = traducaoTipo(tiposDiferente[i][1]);
                desvantagem = traducaoTipo(tiposDiferente[i][2]);
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Método que Retorna o conjunto de tipos do Pokémon">  
    public static String traducaoTipo (String numeros) {//recebe uma string de números
        int quantidade = numeros.length()/2;
        String vetor[] = new String[quantidade];//determina a quantidade de tipos que contém na string numeros
        int aux = 0;
        for (int i = 0; i < quantidade; i++) {//cria um vetor do tamanho da quantidade de tipos do pokémon
            vetor[i] = numeros.charAt(aux) + "" + numeros.charAt(aux+1);
            aux+=2;
        }
        String retorno = "";
        for (int i = 0; i < quantidade; i++) {
            if (i < (quantidade -1)) {
                retorno += retornaTipo(vetor[i])+"/";
            } else {
                retorno += retornaTipo(vetor[i]);
            } 
        }
        return retorno;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Método que Retorna o Tipo do Pokémon">  
    public static String retornaTipo (String tipo) {
        if (tipo.equals("00")) {//tipo normal
            return "Normal";
        } else if (tipo.equals("01")) {//tipo lutador
            return "Lutador";
        } else if (tipo.equals("02")) {//tipo voador
            return "Voador";
        } else if (tipo.equals("03")) {//tipo venenoso
            return "Venenoso";
        } else if (tipo.equals("04")) {//tipo terrestre
            return "Terrestre";
        } else if (tipo.equals("05")) {//tipo pedra
            return "Pedra";
        } else if (tipo.equals("06")) {//tipo inseto
            return "Inseto";
        } else if (tipo.equals("07")) {//tipo fantasma
            return "Fantasma";
        } else if (tipo.equals("08")) {//tipo aço
            return "Aço";
        } else if (tipo.equals("09")) {//tipo fogo
            return "Fogo";
        } else if (tipo.equals("10")) {//tipo água
            return "Água";
        } else if (tipo.equals("11")) {//tipo grama
            return "Planta";
        } else if (tipo.equals("12")) {//tipo elétrico
            return "Elétrico";
        } else if (tipo.equals("13")) {//tipo psiquíco
            return "Psiquíco";
        } else if (tipo.equals("14")) {//tipo gelo
            return "Gelo";
        } else if (tipo.equals("15")) {//tipo dragão
            return "Dragão";
        } else if (tipo.equals("16")) {//tipo sombra
            return "Sombra";
        } else if (tipo.equals("17")) {//tipo fada
            return "Fada";
        } else if (tipo.equals("xx")) {//nenhum tipo
            return "Nenhum";
        } else {//tipo não encontrado
            return "tipo não encontrado";
        }
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="trecho do final do código">  
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
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokedex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
    //</editor-fold> 
}
