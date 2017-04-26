
package Criptografia;

public class Conversor {
    
    //<editor-fold defaultstate="collapsed" desc="Valor da Chave"> 
    public void valor(char[] senha, int i) {
        
        if (senha[i] == ' ') {
            senha[i] = '0';
        } else if (senha[i] == 'a') {
            senha[i] = '9';
        } else if (senha[i] == 'b') {
            senha[i] = '8';
        } else if (senha[i] == 'c') {
            senha[i] = '7';
        } else if (senha[i] == 'd') {
            senha[i] = '6';
        } else if (senha[i] == 'e') {
            senha[i] = '5';
        } else if (senha[i] == 'f') {
            senha[i] = '4';
        } else if (senha[i] == 'g') {
            senha[i] = '3';
        } else if (senha[i] == 'h') {
            senha[i] = '2';
        } else if (senha[i] == 'i') {
            senha[i] = '1';
        } else if (senha[i] == 'j') {
            senha[i] = '0';
        } else if (senha[i] == 'k') {
            senha[i] = '9';
        } else if (senha[i] == 'l') {
            senha[i] = '8';
        } else if (senha[i] == 'm') {
            senha[i] = '7';
        } else if (senha[i] == 'n') {
            senha[i] = '6';
        } else if (senha[i] == 'o') {
            senha[i] = '5';
        } else if (senha[i] == 'p') {
            senha[i] = '4';
        } else if (senha[i] == 'q') {
            senha[i] = '3';
        } else if (senha[i] == 'r') {
            senha[i] = '2';
        } else if (senha[i] == 's') {
            senha[i] = '1';
        } else if (senha[i] == 't') {
            senha[i] = '0';
        } else if (senha[i] == 'u') {
            senha[i] = '9';
        } else if (senha[i] == 'v') {
            senha[i] = '8';
        } else if (senha[i] == 'w') {
            senha[i] = '7';
        } else if (senha[i] == 'x') {
            senha[i] = '6';
        } else if (senha[i] == 'y') {
            senha[i] = '5';
        } else if (senha[i] == 'z') {
            senha[i] = '4';
        } else if (senha[i] == 'A') {
            senha[i] = '3';
        } else if (senha[i] == 'B') {
            senha[i] = '2';
        } else if (senha[i] == 'C') {
            senha[i] = '1';
        } else if (senha[i] == 'D') {
            senha[i] = '0';
        } else if (senha[i] == 'E') {
            senha[i] = '9';
        } else if (senha[i] == 'F') {
            senha[i] = '8';
        } else if (senha[i] == 'G') {
            senha[i] = '7';
        } else if (senha[i] == 'H') {
            senha[i] = '6';
        } else if (senha[i] == 'I') {
            senha[i] = '5';
        } else if (senha[i] == 'J') {
            senha[i] = '4';
        } else if (senha[i] == 'K') {
            senha[i] = '3';
        } else if (senha[i] == 'L') {
            senha[i] = '2';
        } else if (senha[i] == 'M') {
            senha[i] = '1';
        } else if (senha[i] == 'N') {
            senha[i] = '0';
        } else if (senha[i] == 'O') {
            senha[i] = '9';
        } else if (senha[i] == 'P') {
            senha[i] = '8';
        } else if (senha[i] == 'Q') {
            senha[i] = '7';
        } else if (senha[i] == 'R') {
            senha[i] = '6';
        } else if (senha[i] == 'S') {
            senha[i] = '5';
        } else if (senha[i] == 'T') {
            senha[i] = '4';
        } else if (senha[i] == 'U') {
            senha[i] = '3';
        } else if (senha[i] == 'V') {
            senha[i] = '2';
        } else if (senha[i] == 'W') {
            senha[i] = '1';
        } else if (senha[i] == 'X') {
            senha[i] = '0';
        } else if (senha[i] == 'Y') {
            senha[i] = '9';
        } else if (senha[i] == 'Z') {
            senha[i] = '8';
        } else if (senha[i] == ',') {
            senha[i] = '7';
        } else if (senha[i] == '.') {
            senha[i] = '6';
        } else if (senha[i] == '0') {
            senha[i] = '5';
        } else if (senha[i] == '1') {
            senha[i] = '4';
        } else if (senha[i] == '2') {
            senha[i] = '3';
        } else if (senha[i] == '3') {
            senha[i] = '2';
        } else if (senha[i] == '4') {
            senha[i] = '1';
        } else if (senha[i] == '5') {
            senha[i] = '0';
        } else if (senha[i] == '6') {
            senha[i] = '9';
        } else if (senha[i] == '7') {
            senha[i] = '8';
        } else if (senha[i] == '8') {
            senha[i] = '7';
        } else if (senha[i] == '9') {
            senha[i] = '6';
        } else if (senha[i] == '@') {
            senha[i] = '5';
        } else if (senha[i] == '"') {
            senha[i] = '4';
        } else if (senha[i] == '!') {
            senha[i] = '3';
        } else if (senha[i] == '#') {
            senha[i] = '2';
        } else if (senha[i] == '$') {
            senha[i] = '1';
        } else if (senha[i] == '%') {
            senha[i] = '0';
        } else if (senha[i] == '&') {
            senha[i] = '9';
        } else if (senha[i] == '(') {
            senha[i] = '8';
        } else if (senha[i] == ')') {
            senha[i] = '7';
        } else if (senha[i] == '[') {
            senha[i] = '6';
        } else if (senha[i] == ']') {
            senha[i] = '5';
        } else if (senha[i] == '{') {
            senha[i] = '4';
        } else if (senha[i] == '}') {
            senha[i] = '3';
        } else if (senha[i] == '_') {
            senha[i] = '2';
        } else if (senha[i] == ':') {
            senha[i] = '1';
        } else if (senha[i] == ';') {
            senha[i] = '0';
        } else if (senha[i] == '|') {
            senha[i] = '9';
        } else if (senha[i] == '?') {
            senha[i] = '8';
        } else if (senha[i] == '+') {
            senha[i] = '7';
        } else if (senha[i] == '-') {
            senha[i] = '6';
        } else if (senha[i] == '/') {
            senha[i] = '5';
        } else if (senha[i] == '*') {
            senha[i] = '4';
        } else if (senha[i] == '=') {
            senha[i] = '3';
        } 
    }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="letraCriptografada"> 
    public char letraCriptografada (char[] senha, int aux, String mensagem, int n) {
        
        int tamanho = mensagem.length();
        char[] texto = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            texto[i] = mensagem.charAt(i);
        }
        
        Double k = new Double(senha[aux]);
        Double key = k.doubleValue();
        
        if (key % 10 == 0) {
            criptografia_1(texto, n);
        } else if (key % 10 == 1) {
            criptografia_2(texto, n);
        } else if (key % 10 == 2) {
            criptografia_3(texto, n);
        } else if (key % 10 == 3) {
            criptografia_4(texto, n);
        } else if (key % 10 == 4) {
            criptografia_5(texto, n);
        } else if (key % 10 == 5) {
            criptografia_6(texto, n);
        } else if (key % 10 == 6) {
            criptografia_7(texto, n);
        } else if (key % 10 == 7) {
            criptografia_8(texto, n);
        } else if (key % 10 == 8) {
            criptografia_9(texto, n);
        } else {
            criptografia_10(texto, n);
        }
        
        return texto[n];
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="letraDescriptografada"> 
    public char letraDescriptografada (char[] senha, int aux, String mensagem, int n) {
        
        int tamanho = mensagem.length();
        char[] texto = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            texto[i] = mensagem.charAt(i);
        }
        
        Double k = new Double(senha[aux]);
        Double key = k.doubleValue();
        
        if (key % 10 == 0) {
            descriptografia_1(texto, n);
        } else if (key % 10 == 1) {
            descriptografia_2(texto, n);
        } else if (key % 10 == 2) {
            descriptografia_3(texto, n);
        } else if (key % 10 == 3) {
            descriptografia_4(texto, n);
        } else if (key % 10 == 4) {
            descriptografia_5(texto, n);
        } else if (key % 10 == 5) {
            descriptografia_6(texto, n);
        } else if (key % 10 == 6) {
            descriptografia_7(texto, n);
        } else if (key % 10 == 7) {
            descriptografia_8(texto, n);
        } else if (key % 10 == 8) {
            descriptografia_9(texto, n);
        } else {
            descriptografia_10(texto, n);
        }
        
        return texto[n];
        
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="criptografiaSecreta"> 
    public String criptografiaSecreta (char senha, String mensagem) {
        
        Double k = new Double(senha);
        Double key = k.doubleValue();
        
        int tamanho = mensagem.length();                
        char[] letra = new char[tamanho]; 
        
        for (int i = 0; i < tamanho; i++) {
            letra[i] = mensagem.charAt(i);
            if (key % 10 == 0) {
                criptografia_1(letra, i);
            } else if (key % 10 == 1) {
                criptografia_2(letra, i);
            } else if (key % 10 == 2) {
                criptografia_3(letra, i);
            } else if (key % 10 == 3) {
                criptografia_4(letra, i);
            } else if (key % 10 == 4) {
                criptografia_5(letra, i);
            } else if (key % 10 == 5) {
                criptografia_6(letra, i);
            } else if (key % 10 == 6) {
                criptografia_7(letra, i);
            } else if (key % 10 == 7) {
                criptografia_8(letra, i);
            } else if (key % 10 == 8) {
                criptografia_9(letra, i);
            } else {
                criptografia_10(letra, i);
            }
        }
        
        mensagem = "";
        for (int i = 0; i < tamanho; i++) {
            mensagem = mensagem + letra[i];
        }
        return mensagem;
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="descriptografiaSecreta"> 
    public String descriptografiaSecreta (char senha, String codigo) {
        
        Double k = new Double(senha);
        Double key = k.doubleValue();
        
        int tamanho = codigo.length();    
        char[] letra = new char[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            letra[i] = codigo.charAt(i);
            if (key % 10 == 0) {
                descriptografia_1(letra, i);
            } else if (key % 10 == 1) {
                descriptografia_2(letra, i);
            } else if (key % 10 == 2) {
                descriptografia_3(letra, i);
            } else if (key % 10 == 3) {
                descriptografia_4(letra, i);
            } else if (key % 10 == 4) {
                descriptografia_5(letra, i);
            } else if (key % 10 == 5) {
                descriptografia_6(letra, i);
            } else if (key % 10 == 6) {
                descriptografia_7(letra, i);
            } else if (key % 10 == 7) {
                descriptografia_8(letra, i);
            } else if (key % 10 == 8) {
                descriptografia_9(letra, i);
            } else {
                descriptografia_10(letra, i);
            } 
        }
        
        codigo = "";
        for (int i = 0; i < tamanho; i++) {
            codigo = codigo + letra[i];
        }
        return codigo;
        
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_1"> 
    public void criptografia_1(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = '4';
        } else if (letra[i] == 'a') {
            letra[i] = 'e';
        } else if (letra[i] == 'b') {
            letra[i] = '9';
        } else if (letra[i] == 'c') {
            letra[i] = 'g';
        } else if (letra[i] == 'd') {
            letra[i] = '7';
        } else if (letra[i] == 'e') {
            letra[i] = '6';
        } else if (letra[i] == 'f') {
            letra[i] = 'm';
        } else if (letra[i] == 'g') {
            letra[i] = 'z';
        } else if (letra[i] == 'h') {
            letra[i] = '3';
        } else if (letra[i] == 'i') {
            letra[i] = 'n';
        } else if (letra[i] == 'j') {
            letra[i] = ' ';
        } else if (letra[i] == 'k') {
            letra[i] = '0';
        } else if (letra[i] == 'l') {
            letra[i] = 'A';
        } else if (letra[i] == 'm') {
            letra[i] = 'x';
        } else if (letra[i] == 'n') {
            letra[i] = 'B';
        } else if (letra[i] == 'o') {
            letra[i] = 'i';
        } else if (letra[i] == 'p') {
            letra[i] = 'b';
        } else if (letra[i] == 'q') {
            letra[i] = 'v';
        } else if (letra[i] == 'r') {
            letra[i] = 'a';
        } else if (letra[i] == 's') {
            letra[i] = 'u';
        } else if (letra[i] == 't') {
            letra[i] = 'r';
        } else if (letra[i] == 'u') {
            letra[i] = 't';
        } else if (letra[i] == 'v') {
            letra[i] = 'F';
        } else if (letra[i] == 'w') {
            letra[i] = 's';
        } else if (letra[i] == 'x') {
            letra[i] = 'p';
        } else if (letra[i] == 'y') {
            letra[i] = 'E';
        } else if (letra[i] == 'z') {
            letra[i] = 'H';
        } else if (letra[i] == 'A') {
            letra[i] = 'q';
        } else if (letra[i] == 'B') {
            letra[i] = 'I';
        } else if (letra[i] == 'C') {
            letra[i] = 'G';
        } else if (letra[i] == 'D') {
            letra[i] = 'J';
        } else if (letra[i] == 'E') {
            letra[i] = 'o';
        } else if (letra[i] == 'F') {
            letra[i] = 'K';
        } else if (letra[i] == 'G') {
            letra[i] = '2';
        } else if (letra[i] == 'H') {
            letra[i] = 'L';
        } else if (letra[i] == 'I') {
            letra[i] = '5';
        } else if (letra[i] == 'J') {
            letra[i] = 'M';
        } else if (letra[i] == 'K') {
            letra[i] = 'l';
        } else if (letra[i] == 'L') {
            letra[i] = 'N';
        } else if (letra[i] == 'M') {
            letra[i] = 'k';
        } else if (letra[i] == 'N') {
            letra[i] = 'O';
        } else if (letra[i] == 'O') {
            letra[i] = ',';
        } else if (letra[i] == 'P') {
            letra[i] = 'P';
        } else if (letra[i] == 'Q') {
            letra[i] = 'w';
        } else if (letra[i] == 'R') {
            letra[i] = 'Q';
        } else if (letra[i] == 'S') {
            letra[i] = 'h';
        } else if (letra[i] == 'T') {
            letra[i] = 'R';
        } else if (letra[i] == 'U') {
            letra[i] = '8';
        } else if (letra[i] == 'V') {
            letra[i] = 'S';
        } else if (letra[i] == 'W') {
            letra[i] = 'f';
        } else if (letra[i] == 'X') {
            letra[i] = 'T';
        } else if (letra[i] == 'Y') {
            letra[i] = '1';
        } else if (letra[i] == 'Z') {
            letra[i] = 'U';
        } else if (letra[i] == ',') {
            letra[i] = 'd';
        } else if (letra[i] == '.') {
            letra[i] = 'V';
        } else if (letra[i] == '0') {
            letra[i] = 'c';
        } else if (letra[i] == '1') {
            letra[i] = 'W';
        } else if (letra[i] == '2') {
            letra[i] = 'C';
        } else if (letra[i] == '3') {
            letra[i] = 'X';
        } else if (letra[i] == '4') {
            letra[i] = 'D';
        } else if (letra[i] == '5') {
            letra[i] = 'Y';
        } else if (letra[i] == '6') {
            letra[i] = '.';
        } else if (letra[i] == '7') {
            letra[i] = 'Z';
        } else if (letra[i] == '8') {
            letra[i] = 'y';
        } else if (letra[i] == '9') {
            letra[i] = '@';
        } else if (letra[i] == '@') {
            letra[i] = 'j';
        } else if (letra[i] == '"') {
            letra[i] = '&';
        } else if (letra[i] == '!') {
            letra[i] = '(';
        } else if (letra[i] == '#') {
            letra[i] = ')';
        } else if (letra[i] == '$') {
            letra[i] = '[';
        } else if (letra[i] == '%') {
            letra[i] = ']';
        } else if (letra[i] == '&') {
            letra[i] = '{';
        } else if (letra[i] == '(') {
            letra[i] = '}';
        } else if (letra[i] == ')') {
            letra[i] = '_';
        } else if (letra[i] == '[') {
            letra[i] = ':';
        } else if (letra[i] == ']') {
            letra[i] = ';';
        } else if (letra[i] == '{') {
            letra[i] = '|';
        } else if (letra[i] == '}') {
            letra[i] = '?';
        } else if (letra[i] == '_') {
            letra[i] = '+';
        } else if (letra[i] == ':') {
            letra[i] = '-';
        } else if (letra[i] == ';') {
            letra[i] = '/';
        } else if (letra[i] == '|') {
            letra[i] = '*';
        } else if (letra[i] == '?') {
            letra[i] = '=';
        } else if (letra[i] == '+') {
            letra[i] = '"';
        } else if (letra[i] == '-') {
            letra[i] = '!';
        } else if (letra[i] == '/') {
            letra[i] = '#';
        } else if (letra[i] == '*') {
            letra[i] = '$';
        } else if (letra[i] == '=') {
            letra[i] = '%';
        }
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_1"> 
    public void descriptografia_1(char[] letra, int i) {
        
        if (letra[i] == '4') {
            letra[i] = ' ';
        } else if (letra[i] == 'e') {
            letra[i] = 'a';
        } else if (letra[i] == '9') {
            letra[i] = 'b';
        } else if (letra[i] == 'g') {
            letra[i] = 'c';
        } else if (letra[i] == '7') {
            letra[i] = 'd';
        } else if (letra[i] == '6') {
            letra[i] = 'e';
        } else if (letra[i] == 'm') {
            letra[i] = 'f';
        } else if (letra[i] == 'z') {
            letra[i] = 'g';
        } else if (letra[i] == '3') {
            letra[i] = 'h';
        } else if (letra[i] == 'n') {
            letra[i] = 'i';
        } else if (letra[i] == ' ') {
            letra[i] = 'j';
        } else if (letra[i] == '0') {
            letra[i] = 'k';
        } else if (letra[i] == 'A') {
            letra[i] = 'l';
        } else if (letra[i] == 'x') {
            letra[i] = 'm';
        } else if (letra[i] == 'B') {
            letra[i] = 'n';
        } else if (letra[i] == 'i') {
            letra[i] = 'o';
        } else if (letra[i] == 'b') {
            letra[i] = 'p';
        } else if (letra[i] == 'v') {
            letra[i] = 'q';
        } else if (letra[i] == 'a') {
            letra[i] = 'r';
        } else if (letra[i] == 'u') {
            letra[i] = 's';
        } else if (letra[i] == 'r') {
            letra[i] = 't';
        } else if (letra[i] == 't') {
            letra[i] = 'u';
        } else if (letra[i] == 'F') {
            letra[i] = 'v';
        } else if (letra[i] == 's') {
            letra[i] = 'w';
        } else if (letra[i] == 'p') {
            letra[i] = 'x';
        } else if (letra[i] == 'E') {
            letra[i] = 'y';
        } else if (letra[i] == 'H') {
            letra[i] = 'z';
        } else if (letra[i] == 'q') {
            letra[i] = 'A';
        } else if (letra[i] == 'I') {
            letra[i] = 'B';
        } else if (letra[i] == 'G') {
            letra[i] = 'C';
        } else if (letra[i] == 'J') {
            letra[i] = 'D';
        } else if (letra[i] == 'o') {
            letra[i] = 'E';
        } else if (letra[i] == 'K') {
            letra[i] = 'F';
        } else if (letra[i] == '2') {
            letra[i] = 'G';
        } else if (letra[i] == 'L') {
            letra[i] = 'H';
        } else if (letra[i] == '5') {
            letra[i] = 'I';
        } else if (letra[i] == 'M') {
            letra[i] = 'J';
        } else if (letra[i] == 'l') {
            letra[i] = 'K';
        } else if (letra[i] == 'N') {
            letra[i] = 'L';
        } else if (letra[i] == 'k') {
            letra[i] = 'M';
        } else if (letra[i] == 'O') {
            letra[i] = 'N';
        } else if (letra[i] == ',') {
            letra[i] = 'O';
        } else if (letra[i] == 'P') {
            letra[i] = 'P';
        } else if (letra[i] == 'w') {
            letra[i] = 'Q';
        } else if (letra[i] == 'Q') {
            letra[i] = 'R';
        } else if (letra[i] == 'h') {
            letra[i] = 'S';
        } else if (letra[i] == 'R') {
            letra[i] = 'T';
        } else if (letra[i] == '8') {
            letra[i] = 'U';
        } else if (letra[i] == 'S') {
            letra[i] = 'V';
        } else if (letra[i] == 'f') {
            letra[i] = 'W';
        } else if (letra[i] == 'T') {
            letra[i] = 'X';
        } else if (letra[i] == '1') {
            letra[i] = 'Y';
        } else if (letra[i] == 'U') {
            letra[i] = 'Z';
        } else if (letra[i] == 'd') {
            letra[i] = ',';
        } else if (letra[i] == 'V') {
            letra[i] = '.';
        } else if (letra[i] == 'c') {
            letra[i] = '0';
        } else if (letra[i] == 'W') {
            letra[i] = '1';
        } else if (letra[i] == 'C') {
            letra[i] = '2';
        } else if (letra[i] == 'X') {
            letra[i] = '3';
        } else if (letra[i] == 'D') {
            letra[i] = '4';
        } else if (letra[i] == 'Y') {
            letra[i] = '5';
        } else if (letra[i] == '.') {
            letra[i] = '6';
        } else if (letra[i] == 'Z') {
            letra[i] = '7';
        } else if (letra[i] == 'y') {
            letra[i] = '8';
        } else if (letra[i] == '@') {
            letra[i] = '9';
        } else if (letra[i] == 'j') {
            letra[i] = '@';
        } else if (letra[i] == '"') {
            letra[i] = '+';
        } else if (letra[i] == '!') {
            letra[i] = '-';
        } else if (letra[i] == '#') {
            letra[i] = '/';
        } else if (letra[i] == '$') {
            letra[i] = '*';
        } else if (letra[i] == '%') {
            letra[i] = '=';
        } else if (letra[i] == '&') {
            letra[i] = '"';
        } else if (letra[i] == '(') {
            letra[i] = '!';
        } else if (letra[i] == ')') {
            letra[i] = '#';
        } else if (letra[i] == '[') {
            letra[i] = '$';
        } else if (letra[i] == ']') {
            letra[i] = '%';
        } else if (letra[i] == '{') {
            letra[i] = '&';
        } else if (letra[i] == '}') {
            letra[i] = '(';
        } else if (letra[i] == '_') {
            letra[i] = ')';
        } else if (letra[i] == ':') {
            letra[i] = '[';
        } else if (letra[i] == ';') {
            letra[i] = ']';
        } else if (letra[i] == '|') {
            letra[i] = '{';
        } else if (letra[i] == '?') {
            letra[i] = '}';
        } else if (letra[i] == '+') {
            letra[i] = '_';
        } else if (letra[i] == '-') {
            letra[i] = ':';
        } else if (letra[i] == '/') {
            letra[i] = ';';
        } else if (letra[i] == '*') {
            letra[i] = '|';
        } else if (letra[i] == '=') {
            letra[i] = '?';
        } else if (letra[i] == '"') {
            letra[i] = '+';
        } 
        
    }
    //</editor-fold>    
    
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_2"> 
    public void criptografia_2(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = 'Q';
        } else if (letra[i] == 'a') {
            letra[i] = 'l';
        } else if (letra[i] == 'b') {
            letra[i] = 'E';
        } else if (letra[i] == 'c') {
            letra[i] = 'a';
        } else if (letra[i] == 'd') {
            letra[i] = 'T';
        } else if (letra[i] == 'e') {
            letra[i] = 'n';
        } else if (letra[i] == 'f') {
            letra[i] = 'U';
        } else if (letra[i] == 'g') {
            letra[i] = 'x';
        } else if (letra[i] == 'h') {
            letra[i] = 'O';
        } else if (letra[i] == 'i') {
            letra[i] = 'P';
        } else if (letra[i] == 'j') {
            letra[i] = 'L';
        } else if (letra[i] == 'k') {
            letra[i] = 'K';
        } else if (letra[i] == 'l') {
            letra[i] = 'J';
        } else if (letra[i] == 'm') {
            letra[i] = 'H';
        } else if (letra[i] == 'n') {
            letra[i] = 'd';
        } else if (letra[i] == 'o') {
            letra[i] = 'F';
        } else if (letra[i] == 'p') {
            letra[i] = 'D';
        } else if (letra[i] == 'q') {
            letra[i] = 'S';
        } else if (letra[i] == 'r') {
            letra[i] = 'A';
        } else if (letra[i] == 's') {
            letra[i] = 'Z';
        } else if (letra[i] == 't') {
            letra[i] = 'X';
        } else if (letra[i] == 'u') {
            letra[i] = 'C';
        } else if (letra[i] == 'v') {
            letra[i] = 'V';
        } else if (letra[i] == 'w') {
            letra[i] = 'B';
        } else if (letra[i] == 'x') {
            letra[i] = 'N';
        } else if (letra[i] == 'y') {
            letra[i] = 'M';
        } else if (letra[i] == 'z') {
            letra[i] = 'i';
        } else if (letra[i] == 'A') {
            letra[i] = 'b';
        } else if (letra[i] == 'B') {
            letra[i] = 't';
        } else if (letra[i] == 'C') {
            letra[i] = 'G';
        } else if (letra[i] == 'D') {
            letra[i] = 'W';
        } else if (letra[i] == 'E') {
            letra[i] = 'f';
        } else if (letra[i] == 'F') {
            letra[i] = 'g';
        } else if (letra[i] == 'G') {
            letra[i] = 'h';
        } else if (letra[i] == 'H') {
            letra[i] = 'R';
        } else if (letra[i] == 'I') {
            letra[i] = 'j';
        } else if (letra[i] == 'J') {
            letra[i] = '.';
        } else if (letra[i] == 'K') {
            letra[i] = ' ';
        } else if (letra[i] == 'L') {
            letra[i] = ',';
        } else if (letra[i] == 'M') {
            letra[i] = '@';
        } else if (letra[i] == 'N') {
            letra[i] = 'k';
        } else if (letra[i] == 'O') {
            letra[i] = '1';
        } else if (letra[i] == 'P') {
            letra[i] = 'm';
        } else if (letra[i] == 'Q') {
            letra[i] = 'Y';
        } else if (letra[i] == 'R') {
            letra[i] = 'o';
        } else if (letra[i] == 'S') {
            letra[i] = 'p';
        } else if (letra[i] == 'T') {
            letra[i] = 'q';
        } else if (letra[i] == 'U') {
            letra[i] = 'r';
        } else if (letra[i] == 'V') {
            letra[i] = 's';
        } else if (letra[i] == 'W') {
            letra[i] = 'c';
        } else if (letra[i] == 'X') {
            letra[i] = 'u';
        } else if (letra[i] == 'Y') {
            letra[i] = 'v';
        } else if (letra[i] == 'Z') {
            letra[i] = 'w';
        } else if (letra[i] == ',') {
            letra[i] = 'I';
        } else if (letra[i] == '.') {
            letra[i] = 'y';
        } else if (letra[i] == '0') {
            letra[i] = 'z';
        } else if (letra[i] == '1') {
            letra[i] = '6';
        } else if (letra[i] == '2') {
            letra[i] = '5';
        } else if (letra[i] == '3') {
            letra[i] = '4';
        } else if (letra[i] == '4') {
            letra[i] = '7';
        } else if (letra[i] == '5') {
            letra[i] = '8';
        } else if (letra[i] == '6') {
            letra[i] = '3';
        } else if (letra[i] == '7') {
            letra[i] = '2';
        } else if (letra[i] == '8') {
            letra[i] = '9';
        } else if (letra[i] == '9') {
            letra[i] = 'e';
        } else if (letra[i] == '@') {
            letra[i] = '0';
        } else if (letra[i] == '"') {
            letra[i] = '+';
        } else if (letra[i] == '!') {
            letra[i] = '-';
        } else if (letra[i] == '#') {
            letra[i] = '/';
        } else if (letra[i] == '$') {
            letra[i] = '*';
        } else if (letra[i] == '%') {
            letra[i] = '=';
        } else if (letra[i] == '&') {
            letra[i] = '"';
        } else if (letra[i] == '(') {
            letra[i] = '!';
        } else if (letra[i] == ')') {
            letra[i] = '#';
        } else if (letra[i] == '[') {
            letra[i] = '$';
        } else if (letra[i] == ']') {
            letra[i] = '%';
        } else if (letra[i] == '{') {
            letra[i] = '&';
        } else if (letra[i] == '}') {
            letra[i] = '(';
        } else if (letra[i] == '_') {
            letra[i] = ')';
        } else if (letra[i] == ':') {
            letra[i] = '[';
        } else if (letra[i] == ';') {
            letra[i] = ']';
        } else if (letra[i] == '|') {
            letra[i] = '{';
        } else if (letra[i] == '?') {
            letra[i] = '}';
        } else if (letra[i] == '+') {
            letra[i] = '_';
        } else if (letra[i] == '-') {
            letra[i] = ':';
        } else if (letra[i] == '/') {
            letra[i] = ';';
        } else if (letra[i] == '*') {
            letra[i] = '|';
        } else if (letra[i] == '=') {
            letra[i] = '?';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_2"> 
    public void descriptografia_2(char[] letra, int i) {
        
        if (letra[i] == 'Q') {
            letra[i] = ' ';
        } else if (letra[i] == 'l') {
            letra[i] = 'a';
        } else if (letra[i] == 'E') {
            letra[i] = 'b';
        } else if (letra[i] == 'a') {
            letra[i] = 'c';
        } else if (letra[i] == 'T') {
            letra[i] = 'd';
        } else if (letra[i] == 'n') {
            letra[i] = 'e';
        } else if (letra[i] == 'U') {
            letra[i] = 'f';
        } else if (letra[i] == 'x') {
            letra[i] = 'g';
        } else if (letra[i] == 'O') {
            letra[i] = 'h';
        } else if (letra[i] == 'P') {
            letra[i] = 'i';
        } else if (letra[i] == 'L') {
            letra[i] = 'j';
        } else if (letra[i] == 'K') {
            letra[i] = 'k';
        } else if (letra[i] == 'J') {
            letra[i] = 'l';
        } else if (letra[i] == 'H') {
            letra[i] = 'm';
        } else if (letra[i] == 'd') {
            letra[i] = 'n';
        } else if (letra[i] == 'F') {
            letra[i] = 'o';
        } else if (letra[i] == 'D') {
            letra[i] = 'p';
        } else if (letra[i] == 'S') {
            letra[i] = 'q';
        } else if (letra[i] == 'A') {
            letra[i] = 'r';
        } else if (letra[i] == 'Z') {
            letra[i] = 's';
        } else if (letra[i] == 'X') {
            letra[i] = 't';
        } else if (letra[i] == 'C') {
            letra[i] = 'u';
        } else if (letra[i] == 'V') {
            letra[i] = 'v';
        } else if (letra[i] == 'B') {
            letra[i] = 'w';
        } else if (letra[i] == 'N') {
            letra[i] = 'x';
        } else if (letra[i] == 'M') {
            letra[i] = 'y';
        } else if (letra[i] == 'i') {
            letra[i] = 'z';
        } else if (letra[i] == 'b') {
            letra[i] = 'A';
        } else if (letra[i] == 't') {
            letra[i] = 'B';
        } else if (letra[i] == 'G') {
            letra[i] = 'C';
        } else if (letra[i] == 'W') {
            letra[i] = 'D';
        } else if (letra[i] == 'f') {
            letra[i] = 'E';
        } else if (letra[i] == 'g') {
            letra[i] = 'F';
        } else if (letra[i] == 'h') {
            letra[i] = 'G';
        } else if (letra[i] == 'R') {
            letra[i] = 'H';
        } else if (letra[i] == 'j') {
            letra[i] = 'I';
        } else if (letra[i] == '.') {
            letra[i] = 'J';
        } else if (letra[i] == ' ') {
            letra[i] = 'K';
        } else if (letra[i] == ',') {
            letra[i] = 'L';
        } else if (letra[i] == '@') {
            letra[i] = 'M';
        } else if (letra[i] == 'k') {
            letra[i] = 'N';
        } else if (letra[i] == '1') {
            letra[i] = 'O';
        } else if (letra[i] == 'm') {
            letra[i] = 'P';
        } else if (letra[i] == 'Y') {
            letra[i] = 'Q';
        } else if (letra[i] == 'o') {
            letra[i] = 'R';
        } else if (letra[i] == 'p') {
            letra[i] = 'S';
        } else if (letra[i] == 'q') {
            letra[i] = 'T';
        } else if (letra[i] == 'r') {
            letra[i] = 'U';
        } else if (letra[i] == 's') {
            letra[i] = 'V';
        } else if (letra[i] == 'c') {
            letra[i] = 'W';
        } else if (letra[i] == 'u') {
            letra[i] = 'X';
        } else if (letra[i] == 'v') {
            letra[i] = 'Y';
        } else if (letra[i] == 'w') {
            letra[i] = 'Z';
        } else if (letra[i] == 'I') {
            letra[i] = ',';
        } else if (letra[i] == 'y') {
            letra[i] = '.';
        } else if (letra[i] == 'z') {
            letra[i] = '0';
        } else if (letra[i] == '6') {
            letra[i] = '1';
        } else if (letra[i] == '5') {
            letra[i] = '2';
        } else if (letra[i] == '4') {
            letra[i] = '3';
        } else if (letra[i] == '7') {
            letra[i] = '4';
        } else if (letra[i] == '8') {
            letra[i] = '5';
        } else if (letra[i] == '3') {
            letra[i] = '6';
        } else if (letra[i] == '2') {
            letra[i] = '7';
        } else if (letra[i] == '9') {
            letra[i] = '8';
        } else if (letra[i] == 'e') {
            letra[i] = '9';
        } else if (letra[i] == '0') {
            letra[i] = '@';
        } else if (letra[i] == '+') {
            letra[i] = '"';
        } else if (letra[i] == '-') {
            letra[i] = '!';
        } else if (letra[i] == '/') {
            letra[i] = '#';
        } else if (letra[i] == '*') {
            letra[i] = '$';
        } else if (letra[i] == '=') {
            letra[i] = '%';
        } else if (letra[i] == '"') {
            letra[i] = '&';
        } else if (letra[i] == '!') {
            letra[i] = '(';
        } else if (letra[i] == '#') {
            letra[i] = ')';
        } else if (letra[i] == '$') {
            letra[i] = '[';
        } else if (letra[i] == '%') {
            letra[i] = ']';
        } else if (letra[i] == '&') {
            letra[i] = '{';
        } else if (letra[i] == '(') {
            letra[i] = '}';
        } else if (letra[i] == ')') {
            letra[i] = '_';
        } else if (letra[i] == '[') {
            letra[i] = ':';
        } else if (letra[i] == ']') {
            letra[i] = ';';
        } else if (letra[i] == '{') {
            letra[i] = '|';
        } else if (letra[i] == '}') {
            letra[i] = '?';
        } else if (letra[i] == '_') {
            letra[i] = '+';
        } else if (letra[i] == ':') {
            letra[i] = '-';
        } else if (letra[i] == ';') {
            letra[i] = '/';
        } else if (letra[i] == '|') {
            letra[i] = '*';
        } else if (letra[i] == '?') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>    
    
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_3"> 
    public void criptografia_3(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = 'l';
        } else if (letra[i] == 'a') {
            letra[i] = 'k';
        } else if (letra[i] == 'b') {
            letra[i] = 'j';
        } else if (letra[i] == 'c') {
            letra[i] = 'h';
        } else if (letra[i] == 'd') {
            letra[i] = 'J';
        } else if (letra[i] == 'e') {
            letra[i] = 'e';
        } else if (letra[i] == 'f') {
            letra[i] = 'q';
        } else if (letra[i] == 'g') {
            letra[i] = 's';
        } else if (letra[i] == 'h') {
            letra[i] = 'a';
        } else if (letra[i] == 'i') {
            letra[i] = 'd';
        } else if (letra[i] == 'j') {
            letra[i] = 'w';
        } else if (letra[i] == 'k') {
            letra[i] = 'f';
        } else if (letra[i] == 'l') {
            letra[i] = 'r';
        } else if (letra[i] == 'm') {
            letra[i] = 't';
        } else if (letra[i] == 'n') {
            letra[i] = 'i';
        } else if (letra[i] == 'o') {
            letra[i] = 'u';
        } else if (letra[i] == 'p') {
            letra[i] = 'y';
        } else if (letra[i] == 'q') {
            letra[i] = 'o';
        } else if (letra[i] == 'r') {
            letra[i] = 'p';
        } else if (letra[i] == 's') {
            letra[i] = 'z';
        } else if (letra[i] == 't') {
            letra[i] = 'x';
        } else if (letra[i] == 'u') {
            letra[i] = 'U';
        } else if (letra[i] == 'v') {
            letra[i] = 'v';
        } else if (letra[i] == 'w') {
            letra[i] = 'b';
        } else if (letra[i] == 'x') {
            letra[i] = 'c';
        } else if (letra[i] == 'y') {
            letra[i] = 'm';
        } else if (letra[i] == 'z') {
            letra[i] = '.';
        } else if (letra[i] == 'A') {
            letra[i] = ',';
        } else if (letra[i] == 'B') {
            letra[i] = 'A';
        } else if (letra[i] == 'C') {
            letra[i] = 'S';
        } else if (letra[i] == 'D') {
            letra[i] = 'D';
        } else if (letra[i] == 'E') {
            letra[i] = 'F';
        } else if (letra[i] == 'F') {
            letra[i] = 'G';
        } else if (letra[i] == 'G') {
            letra[i] = 'H';
        } else if (letra[i] == 'H') {
            letra[i] = 'g';
        } else if (letra[i] == 'I') {
            letra[i] = 'K';
        } else if (letra[i] == 'J') {
            letra[i] = 'L';
        } else if (letra[i] == 'K') {
            letra[i] = 'M';
        } else if (letra[i] == 'L') {
            letra[i] = ' ';
        } else if (letra[i] == 'M') {
            letra[i] = 'N';
        } else if (letra[i] == 'N') {
            letra[i] = 'B';
        } else if (letra[i] == 'O') {
            letra[i] = 'V';
        } else if (letra[i] == 'P') {
            letra[i] = 'C';
        } else if (letra[i] == 'Q') {
            letra[i] = 'X';
        } else if (letra[i] == 'R') {
            letra[i] = 'Z';
        } else if (letra[i] == 'S') {
            letra[i] = 'Q';
        } else if (letra[i] == 'T') {
            letra[i] = 'W';
        } else if (letra[i] == 'U') {
            letra[i] = 'E';
        } else if (letra[i] == 'V') {
            letra[i] = 'R';
        } else if (letra[i] == 'W') {
            letra[i] = 'T';
        } else if (letra[i] == 'X') {
            letra[i] = '0';
        } else if (letra[i] == 'Y') {
            letra[i] = '9';
        } else if (letra[i] == 'Z') {
            letra[i] = '1';
        } else if (letra[i] == ',') {
            letra[i] = '2';
        } else if (letra[i] == '.') {
            letra[i] = '3';
        } else if (letra[i] == '0') {
            letra[i] = '4';
        } else if (letra[i] == '1') {
            letra[i] = '5';
        } else if (letra[i] == '2') {
            letra[i] = '6';
        } else if (letra[i] == '3') {
            letra[i] = '7';
        } else if (letra[i] == '4') {
            letra[i] = '8';
        } else if (letra[i] == '5') {
            letra[i] = 'Y';
        } else if (letra[i] == '6') {
            letra[i] = 'n';
        } else if (letra[i] == '7') {
            letra[i] = 'I';
        } else if (letra[i] == '8') {
            letra[i] = 'O';
        } else if (letra[i] == '9') {
            letra[i] = '@';
        } else if (letra[i] == '@') {
            letra[i] = 'P';
        } else if (letra[i] == '"') {
            letra[i] = '?';
        } else if (letra[i] == '!') {
            letra[i] = '+';
        } else if (letra[i] == '#') {
            letra[i] = '-';
        } else if (letra[i] == '$') {
            letra[i] = '/';
        } else if (letra[i] == '%') {
            letra[i] = '*';
        } else if (letra[i] == '&') {
            letra[i] = '=';
        } else if (letra[i] == '(') {
            letra[i] = '|';
        } else if (letra[i] == ')') {
            letra[i] = '"';
        } else if (letra[i] == '[') {
            letra[i] = '!';
        } else if (letra[i] == ']') {
            letra[i] = '#';
        } else if (letra[i] == '{') {
            letra[i] = '$';
        } else if (letra[i] == '}') {
            letra[i] = '%';
        } else if (letra[i] == '_') {
            letra[i] = '&';
        } else if (letra[i] == ':') {
            letra[i] = '(';
        } else if (letra[i] == ';') {
            letra[i] = ')';
        } else if (letra[i] == '|') {
            letra[i] = '[';
        } else if (letra[i] == '?') {
            letra[i] = ']';
        } else if (letra[i] == '+') {
            letra[i] = '{';
        } else if (letra[i] == '-') {
            letra[i] = '}';
        } else if (letra[i] == '/') {
            letra[i] = '_';
        } else if (letra[i] == '*') {
            letra[i] = ':';
        } else if (letra[i] == '=') {
            letra[i] = ';';
        }        
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_3"> 
    public void descriptografia_3(char[] letra, int i) {
        
        if (letra[i] == 'l') {
            letra[i] = ' ';
        } else if (letra[i] == 'k') {
            letra[i] = 'a';
        } else if (letra[i] == 'j') {
            letra[i] = 'b';
        } else if (letra[i] == 'h') {
            letra[i] = 'c';
        } else if (letra[i] == 'J') {
            letra[i] = 'd';
        } else if (letra[i] == 'e') {
            letra[i] = 'e';
        } else if (letra[i] == 'q') {
            letra[i] = 'f';
        } else if (letra[i] == 's') {
            letra[i] = 'g';
        } else if (letra[i] == 'a') {
            letra[i] = 'h';
        } else if (letra[i] == 'd') {
            letra[i] = 'i';
        } else if (letra[i] == 'w') {
            letra[i] = 'j';
        } else if (letra[i] == 'f') {
            letra[i] = 'k';
        } else if (letra[i] == 'r') {
            letra[i] = 'l';
        } else if (letra[i] == 't') {
            letra[i] = 'm';
        } else if (letra[i] == 'i') {
            letra[i] = 'n';
        } else if (letra[i] == 'u') {
            letra[i] = 'o';
        } else if (letra[i] == 'y') {
            letra[i] = 'p';
        } else if (letra[i] == 'o') {
            letra[i] = 'q';
        } else if (letra[i] == 'p') {
            letra[i] = 'r';
        } else if (letra[i] == 'z') {
            letra[i] = 's';
        } else if (letra[i] == 'x') {
            letra[i] = 't';
        } else if (letra[i] == 'U') {
            letra[i] = 'u';
        } else if (letra[i] == 'v') {
            letra[i] = 'v';
        } else if (letra[i] == 'b') {
            letra[i] = 'w';
        } else if (letra[i] == 'c') {
            letra[i] = 'x';
        } else if (letra[i] == 'm') {
            letra[i] = 'y';
        } else if (letra[i] == '.') {
            letra[i] = 'z';
        } else if (letra[i] == ',') {
            letra[i] = 'A';
        } else if (letra[i] == 'A') {
            letra[i] = 'B';
        } else if (letra[i] == 'S') {
            letra[i] = 'C';
        } else if (letra[i] == 'D') {
            letra[i] = 'D';
        } else if (letra[i] == 'F') {
            letra[i] = 'E';
        } else if (letra[i] == 'G') {
            letra[i] = 'F';
        } else if (letra[i] == 'H') {
            letra[i] = 'G';
        } else if (letra[i] == 'g') {
            letra[i] = 'H';
        } else if (letra[i] == 'K') {
            letra[i] = 'I';
        } else if (letra[i] == 'L') {
            letra[i] = 'J';
        } else if (letra[i] == 'M') {
            letra[i] = 'K';
        } else if (letra[i] == ' ') {
            letra[i] = 'L';
        } else if (letra[i] == 'N') {
            letra[i] = 'M';
        } else if (letra[i] == 'B') {
            letra[i] = 'N';
        } else if (letra[i] == 'V') {
            letra[i] = 'O';
        } else if (letra[i] == 'C') {
            letra[i] = 'P';
        } else if (letra[i] == 'X') {
            letra[i] = 'Q';
        } else if (letra[i] == 'Z') {
            letra[i] = 'R';
        } else if (letra[i] == 'Q') {
            letra[i] = 'S';
        } else if (letra[i] == 'W') {
            letra[i] = 'T';
        } else if (letra[i] == 'E') {
            letra[i] = 'U';
        } else if (letra[i] == 'R') {
            letra[i] = 'V';
        } else if (letra[i] == 'T') {
            letra[i] = 'W';
        } else if (letra[i] == '0') {
            letra[i] = 'X';
        } else if (letra[i] == '9') {
            letra[i] = 'Y';
        } else if (letra[i] == '1') {
            letra[i] = 'Z';
        } else if (letra[i] == '2') {
            letra[i] = ',';
        } else if (letra[i] == '3') {
            letra[i] = '.';
        } else if (letra[i] == '4') {
            letra[i] = '0';
        } else if (letra[i] == '5') {
            letra[i] = '1';
        } else if (letra[i] == '6') {
            letra[i] = '2';
        } else if (letra[i] == '7') {
            letra[i] = '3';
        } else if (letra[i] == '8') {
            letra[i] = '4';
        } else if (letra[i] == 'Y') {
            letra[i] = '5';
        } else if (letra[i] == 'n') {
            letra[i] = '6';
        } else if (letra[i] == 'I') {
            letra[i] = '7';
        } else if (letra[i] == 'O') {
            letra[i] = '8';
        } else if (letra[i] == '@') {
            letra[i] = '9';
        } else if (letra[i] == 'P') {
            letra[i] = '@';
        } else if (letra[i] == '?') {
            letra[i] = '"';
        } else if (letra[i] == '+') {
            letra[i] = '!';
        } else if (letra[i] == '-') {
            letra[i] = '#';
        } else if (letra[i] == '/') {
            letra[i] = '$';
        } else if (letra[i] == '*') {
            letra[i] = '%';
        } else if (letra[i] == '=') {
            letra[i] = '&';
        } else if (letra[i] == '|') {
            letra[i] = '(';
        } else if (letra[i] == '"') {
            letra[i] = ')';
        } else if (letra[i] == '!') {
            letra[i] = '[';
        } else if (letra[i] == '#') {
            letra[i] = ']';
        } else if (letra[i] == '$') {
            letra[i] = '{';
        } else if (letra[i] == '%') {
            letra[i] = '}';
        } else if (letra[i] == '&') {
            letra[i] = '_';
        } else if (letra[i] == '(') {
            letra[i] = ':';
        } else if (letra[i] == ')') {
            letra[i] = ';';
        } else if (letra[i] == '[') {
            letra[i] = '|';
        } else if (letra[i] == ']') {
            letra[i] = '?';
        } else if (letra[i] == '{') {
            letra[i] = '+';
        } else if (letra[i] == '}') {
            letra[i] = '-';
        } else if (letra[i] == '_') {
            letra[i] = '/';
        } else if (letra[i] == ':') {
            letra[i] = '*';
        } else if (letra[i] == ';') {
            letra[i] = '=';
        } 
        
    }
        //</editor-fold>    
    
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_4"> 
    public void criptografia_4(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = 'V';
        } else if (letra[i] == 'a') {
            letra[i] = 'e';
        } else if (letra[i] == 'b') {
            letra[i] = 'j';
        } else if (letra[i] == 'c') {
            letra[i] = 'd';
        } else if (letra[i] == 'd') {
            letra[i] = 'b';
        } else if (letra[i] == 'e') {
            letra[i] = 'p';
        } else if (letra[i] == 'f') {
            letra[i] = 'g';
        } else if (letra[i] == 'g') {
            letra[i] = 'h';
        } else if (letra[i] == 'h') {
            letra[i] = '.';
        } else if (letra[i] == 'i') {
            letra[i] = 'c';
        } else if (letra[i] == 'j') {
            letra[i] = 'k';
        } else if (letra[i] == 'k') {
            letra[i] = 'u';
        } else if (letra[i] == 'l') {
            letra[i] = 'l';
        } else if (letra[i] == 'm') {
            letra[i] = 'n';
        } else if (letra[i] == 'n') {
            letra[i] = 'o';
        } else if (letra[i] == 'o') {
            letra[i] = 'f';
        } else if (letra[i] == 'p') {
            letra[i] = 'q';
        } else if (letra[i] == 'q') {
            letra[i] = 'r';
        } else if (letra[i] == 'r') {
            letra[i] = 's';
        } else if (letra[i] == 's') {
            letra[i] = 't';
        } else if (letra[i] == 't') {
            letra[i] = 'm';
        } else if (letra[i] == 'u') {
            letra[i] = 'v';
        } else if (letra[i] == 'v') {
            letra[i] = 'w';
        } else if (letra[i] == 'w') {
            letra[i] = 'x';
        } else if (letra[i] == 'x') {
            letra[i] = 'y';
        } else if (letra[i] == 'y') {
            letra[i] = 'z';
        } else if (letra[i] == 'z') {
            letra[i] = ',';
        } else if (letra[i] == 'A') {
            letra[i] = '@';
        } else if (letra[i] == 'B') {
            letra[i] = 'i';
        } else if (letra[i] == 'C') {
            letra[i] = ' ';
        } else if (letra[i] == 'D') {
            letra[i] = 'A';
        } else if (letra[i] == 'E') {
            letra[i] = 'B';
        } else if (letra[i] == 'F') {
            letra[i] = 'C';
        } else if (letra[i] == 'G') {
            letra[i] = 'D';
        } else if (letra[i] == 'H') {
            letra[i] = 'E';
        } else if (letra[i] == 'I') {
            letra[i] = 'F';
        } else if (letra[i] == 'J') {
            letra[i] = 'G';
        } else if (letra[i] == 'K') {
            letra[i] = 'H';
        } else if (letra[i] == 'L') {
            letra[i] = 'I';
        } else if (letra[i] == 'M') {
            letra[i] = 'J';
        } else if (letra[i] == 'N') {
            letra[i] = 'K';
        } else if (letra[i] == 'O') {
            letra[i] = '0';
        } else if (letra[i] == 'P') {
            letra[i] = '1';
        } else if (letra[i] == 'Q') {
            letra[i] = '2';
        } else if (letra[i] == 'R') {
            letra[i] = '3';
        } else if (letra[i] == 'S') {
            letra[i] = '4';
        } else if (letra[i] == 'T') {
            letra[i] = '5';
        } else if (letra[i] == 'U') {
            letra[i] = '6';
        } else if (letra[i] == 'V') {
            letra[i] = '7';
        } else if (letra[i] == 'W') {
            letra[i] = '8';
        } else if (letra[i] == 'X') {
            letra[i] = '9';
        } else if (letra[i] == 'Y') {
            letra[i] = 'L';
        } else if (letra[i] == 'Z') {
            letra[i] = 'M';
        } else if (letra[i] == ',') {
            letra[i] = 'N';
        } else if (letra[i] == '.') {
            letra[i] = 'O';
        } else if (letra[i] == '0') {
            letra[i] = 'P';
        } else if (letra[i] == '1') {
            letra[i] = 'Q';
        } else if (letra[i] == '2') {
            letra[i] = 'R';
        } else if (letra[i] == '3') {
            letra[i] = 'S';
        } else if (letra[i] == '4') {
            letra[i] = 'T';
        } else if (letra[i] == '5') {
            letra[i] = 'U';
        } else if (letra[i] == '6') {
            letra[i] = 'a';
        } else if (letra[i] == '7') {
            letra[i] = 'W';
        } else if (letra[i] == '8') {
            letra[i] = 'X';
        } else if (letra[i] == '9') {
            letra[i] = 'Y';
        } else if (letra[i] == '@') {
            letra[i] = 'Z';
        } else if (letra[i] == '"') {
            letra[i] = '=';
        } else if (letra[i] == '!') {
            letra[i] = '"';
        } else if (letra[i] == '#') {
            letra[i] = '!';
        } else if (letra[i] == '$') {
            letra[i] = '#';
        } else if (letra[i] == '%') {
            letra[i] = '$';
        } else if (letra[i] == '&') {
            letra[i] = '%';
        } else if (letra[i] == '(') {
            letra[i] = '&';
        } else if (letra[i] == ')') {
            letra[i] = '(';
        } else if (letra[i] == '[') {
            letra[i] = ')';
        } else if (letra[i] == ']') {
            letra[i] = '[';
        } else if (letra[i] == '{') {
            letra[i] = ']';
        } else if (letra[i] == '}') {
            letra[i] = '{';
        } else if (letra[i] == '_') {
            letra[i] = '}';
        } else if (letra[i] == ':') {
            letra[i] = '_';
        } else if (letra[i] == ';') {
            letra[i] = ':';
        } else if (letra[i] == '|') {
            letra[i] = ';';
        } else if (letra[i] == '?') {
            letra[i] = '|';
        } else if (letra[i] == '+') {
            letra[i] = '?';
        } else if (letra[i] == '-') {
            letra[i] = '+';
        } else if (letra[i] == '/') {
            letra[i] = '-';
        } else if (letra[i] == '*') {
            letra[i] = '/';
        } else if (letra[i] == '=') {
            letra[i] = '*';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_4"> 
    public void descriptografia_4(char[] letra, int i) {
        
        if (letra[i] == 'V') {
            letra[i] = ' ';
        } else if (letra[i] == 'e') {
            letra[i] = 'a';
        } else if (letra[i] == 'j') {
            letra[i] = 'b';
        } else if (letra[i] == 'd') {
            letra[i] = 'c';
        } else if (letra[i] == 'b') {
            letra[i] = 'd';
        } else if (letra[i] == 'p') {
            letra[i] = 'e';
        } else if (letra[i] == 'g') {
            letra[i] = 'f';
        } else if (letra[i] == 'h') {
            letra[i] = 'g';
        } else if (letra[i] == '.') {
            letra[i] = 'h';
        } else if (letra[i] == 'c') {
            letra[i] = 'i';
        } else if (letra[i] == 'k') {
            letra[i] = 'j';
        } else if (letra[i] == 'u') {
            letra[i] = 'k';
        } else if (letra[i] == 'l') {
            letra[i] = 'l';
        } else if (letra[i] == 'n') {
            letra[i] = 'm';
        } else if (letra[i] == 'o') {
            letra[i] = 'n';
        } else if (letra[i] == 'f') {
            letra[i] = 'o';
        } else if (letra[i] == 'q') {
            letra[i] = 'p';
        } else if (letra[i] == 'r') {
            letra[i] = 'q';
        } else if (letra[i] == 's') {
            letra[i] = 'r';
        } else if (letra[i] == 't') {
            letra[i] = 's';
        } else if (letra[i] == 'm') {
            letra[i] = 't';
        } else if (letra[i] == 'v') {
            letra[i] = 'u';
        } else if (letra[i] == 'w') {
            letra[i] = 'v';
        } else if (letra[i] == 'x') {
            letra[i] = 'w';
        } else if (letra[i] == 'y') {
            letra[i] = 'x';
        } else if (letra[i] == 'z') {
            letra[i] = 'y';
        } else if (letra[i] == ',') {
            letra[i] = 'z';
        } else if (letra[i] == '@') {
            letra[i] = 'A';
        } else if (letra[i] == 'i') {
            letra[i] = 'B';
        } else if (letra[i] == ' ') {
            letra[i] = 'C';
        } else if (letra[i] == 'A') {
            letra[i] = 'D';
        } else if (letra[i] == 'B') {
            letra[i] = 'E';
        } else if (letra[i] == 'C') {
            letra[i] = 'F';
        } else if (letra[i] == 'D') {
            letra[i] = 'G';
        } else if (letra[i] == 'E') {
            letra[i] = 'H';
        } else if (letra[i] == 'F') {
            letra[i] = 'I';
        } else if (letra[i] == 'G') {
            letra[i] = 'J';
        } else if (letra[i] == 'H') {
            letra[i] = 'K';
        } else if (letra[i] == 'I') {
            letra[i] = 'L';
        } else if (letra[i] == 'J') {
            letra[i] = 'M';
        } else if (letra[i] == 'K') {
            letra[i] = 'N';
        } else if (letra[i] == '0') {
            letra[i] = 'O';
        } else if (letra[i] == '1') {
            letra[i] = 'P';
        } else if (letra[i] == '2') {
            letra[i] = 'Q';
        } else if (letra[i] == '3') {
            letra[i] = 'R';
        } else if (letra[i] == '4') {
            letra[i] = 'S';
        } else if (letra[i] == '5') {
            letra[i] = 'T';
        } else if (letra[i] == '6') {
            letra[i] = 'U';
        } else if (letra[i] == '7') {
            letra[i] = 'V';
        } else if (letra[i] == '8') {
            letra[i] = 'W';
        } else if (letra[i] == '9') {
            letra[i] = 'X';
        } else if (letra[i] == 'L') {
            letra[i] = 'Y';
        } else if (letra[i] == 'M') {
            letra[i] = 'Z';
        } else if (letra[i] == 'N') {
            letra[i] = ',';
        } else if (letra[i] == 'O') {
            letra[i] = '.';
        } else if (letra[i] == 'P') {
            letra[i] = '0';
        } else if (letra[i] == 'Q') {
            letra[i] = '1';
        } else if (letra[i] == 'R') {
            letra[i] = '2';
        } else if (letra[i] == 'S') {
            letra[i] = '3';
        } else if (letra[i] == 'T') {
            letra[i] = '4';
        } else if (letra[i] == 'U') {
            letra[i] = '5';
        } else if (letra[i] == 'a') {
            letra[i] = '6';
        } else if (letra[i] == 'W') {
            letra[i] = '7';
        } else if (letra[i] == 'X') {
            letra[i] = '8';
        } else if (letra[i] == 'Y') {
            letra[i] = '9';
        } else if (letra[i] == 'Z') {
            letra[i] = '@';
        } else if (letra[i] == '=') {
            letra[i] = '"';
        } else if (letra[i] == '"') {
            letra[i] = '!';
        } else if (letra[i] == '!') {
            letra[i] = '#';
        } else if (letra[i] == '#') {
            letra[i] = '$';
        } else if (letra[i] == '$') {
            letra[i] = '%';
        } else if (letra[i] == '%') {
            letra[i] = '&';
        } else if (letra[i] == '&') {
            letra[i] = '(';
        } else if (letra[i] == '(') {
            letra[i] = ')';
        } else if (letra[i] == ')') {
            letra[i] = '[';
        } else if (letra[i] == '[') {
            letra[i] = ']';
        } else if (letra[i] == ']') {
            letra[i] = '{';
        } else if (letra[i] == '{') {
            letra[i] = '}';
        } else if (letra[i] == '}') {
            letra[i] = '_';
        } else if (letra[i] == '_') {
            letra[i] = ':';
        } else if (letra[i] == ':') {
            letra[i] = ';';
        } else if (letra[i] == ';') {
            letra[i] = '|';
        } else if (letra[i] == '|') {
            letra[i] = '?';
        } else if (letra[i] == '?') {
            letra[i] = '+';
        } else if (letra[i] == '+') {
            letra[i] = '-';
        } else if (letra[i] == '-') {
            letra[i] = '/';
        } else if (letra[i] == '/') {
            letra[i] = '*';
        } else if (letra[i] == '*') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>    
    
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_5"> 
    public void criptografia_5(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = ',';
        } else if (letra[i] == 'a') {
            letra[i] = '.';
        } else if (letra[i] == 'b') {
            letra[i] = '0';
        } else if (letra[i] == 'c') {
            letra[i] = '1';
        } else if (letra[i] == 'd') {
            letra[i] = '2';
        } else if (letra[i] == 'e') {
            letra[i] = '3';
        } else if (letra[i] == 'f') {
            letra[i] = '4';
        } else if (letra[i] == 'g') {
            letra[i] = '5';
        } else if (letra[i] == 'h') {
            letra[i] = '6';
        } else if (letra[i] == 'i') {
            letra[i] = '7';
        } else if (letra[i] == 'j') {
            letra[i] = '8';
        } else if (letra[i] == 'k') {
            letra[i] = '9';
        } else if (letra[i] == 'l') {
            letra[i] = '@';
        } else if (letra[i] == 'm') {
            letra[i] = '"';
        } else if (letra[i] == 'n') {
            letra[i] = '!';
        } else if (letra[i] == 'o') {
            letra[i] = '#';
        } else if (letra[i] == 'p') {
            letra[i] = '$';
        } else if (letra[i] == 'q') {
            letra[i] = '%';
        } else if (letra[i] == 'r') {
            letra[i] = '&';
        } else if (letra[i] == 's') {
            letra[i] = '(';
        } else if (letra[i] == 't') {
            letra[i] = ')';
        } else if (letra[i] == 'u') {
            letra[i] = '[';
        } else if (letra[i] == 'v') {
            letra[i] = ']';
        } else if (letra[i] == 'w') {
            letra[i] = '{';
        } else if (letra[i] == 'x') {
            letra[i] = '}';
        } else if (letra[i] == 'y') {
            letra[i] = '_';
        } else if (letra[i] == 'z') {
            letra[i] = ':';
        } else if (letra[i] == 'A') {
            letra[i] = ';';
        } else if (letra[i] == 'B') {
            letra[i] = '|';
        } else if (letra[i] == 'C') {
            letra[i] = '?';
        } else if (letra[i] == 'D') {
            letra[i] = '+';
        } else if (letra[i] == 'E') {
            letra[i] = '-';
        } else if (letra[i] == 'F') {
            letra[i] = '/';
        } else if (letra[i] == 'G') {
            letra[i] = '*';
        } else if (letra[i] == 'H') {
            letra[i] = '=';
        } else if (letra[i] == 'I') {
            letra[i] = 'J';
        } else if (letra[i] == 'J') {
            letra[i] = 'K';
        } else if (letra[i] == 'K') {
            letra[i] = 'L';
        } else if (letra[i] == 'L') {
            letra[i] = 'M';
        } else if (letra[i] == 'M') {
            letra[i] = 'N';
        } else if (letra[i] == 'N') {
            letra[i] = 'O';
        } else if (letra[i] == 'O') {
            letra[i] = 'P';
        } else if (letra[i] == 'P') {
            letra[i] = 'Q';
        } else if (letra[i] == 'Q') {
            letra[i] = 'R';
        } else if (letra[i] == 'R') {
            letra[i] = 'S';
        } else if (letra[i] == 'S') {
            letra[i] = 'T';
        } else if (letra[i] == 'T') {
            letra[i] = 'U';
        } else if (letra[i] == 'U') {
            letra[i] = 'V';
        } else if (letra[i] == 'V') {
            letra[i] = 'W';
        } else if (letra[i] == 'W') {
            letra[i] = 'X';
        } else if (letra[i] == 'X') {
            letra[i] = 'Y';
        } else if (letra[i] == 'Y') {
            letra[i] = 'Z';
        } else if (letra[i] == 'Z') {
            letra[i] = ' ';
        } else if (letra[i] == ',') {
            letra[i] = 'a';
        } else if (letra[i] == '.') {
            letra[i] = 'b';
        } else if (letra[i] == '0') {
            letra[i] = 'c';
        } else if (letra[i] == '1') {
            letra[i] = 'd';
        } else if (letra[i] == '2') {
            letra[i] = 'e';
        } else if (letra[i] == '3') {
            letra[i] = 'f';
        } else if (letra[i] == '4') {
            letra[i] = 'g';
        } else if (letra[i] == '5') {
            letra[i] = 'h';
        } else if (letra[i] == '6') {
            letra[i] = 'i';
        } else if (letra[i] == '7') {
            letra[i] = 'j';
        } else if (letra[i] == '8') {
            letra[i] = 'k';
        } else if (letra[i] == '9') {
            letra[i] = 'l';
        } else if (letra[i] == '@') {
            letra[i] = 'm';
        } else if (letra[i] == '"') {
            letra[i] = 'n';
        } else if (letra[i] == '!') {
            letra[i] = 'o';
        } else if (letra[i] == '#') {
            letra[i] = 'p';
        } else if (letra[i] == '$') {
            letra[i] = 'q';
        } else if (letra[i] == '%') {
            letra[i] = 'r';
        } else if (letra[i] == '&') {
            letra[i] = 's';
        } else if (letra[i] == '(') {
            letra[i] = 't';
        } else if (letra[i] == ')') {
            letra[i] = 'u';
        } else if (letra[i] == '[') {
            letra[i] = 'v';
        } else if (letra[i] == ']') {
            letra[i] = 'w';
        } else if (letra[i] == '{') {
            letra[i] = 'x';
        } else if (letra[i] == '}') {
            letra[i] = 'y';
        } else if (letra[i] == '_') {
            letra[i] = 'z';
        } else if (letra[i] == ':') {
            letra[i] = 'A';
        } else if (letra[i] == ';') {
            letra[i] = 'B';
        } else if (letra[i] == '|') {
            letra[i] = 'C';
        } else if (letra[i] == '?') {
            letra[i] = 'D';
        } else if (letra[i] == '+') {
            letra[i] = 'E';
        } else if (letra[i] == '-') {
            letra[i] = 'F';
        } else if (letra[i] == '/') {
            letra[i] = 'G';
        } else if (letra[i] == '*') {
            letra[i] = 'H';
        } else if (letra[i] == '=') {
            letra[i] = 'I';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_5"> 
    public void descriptografia_5(char[] letra, int i) {
        
        if (letra[i] == ',') {
            letra[i] = ' ';
        } else if (letra[i] == '.') {
            letra[i] = 'a';
        } else if (letra[i] == '0') {
            letra[i] = 'b';
        } else if (letra[i] == '1') {
            letra[i] = 'c';
        } else if (letra[i] == '2') {
            letra[i] = 'd';
        } else if (letra[i] == '3') {
            letra[i] = 'e';
        } else if (letra[i] == '4') {
            letra[i] = 'f';
        } else if (letra[i] == '5') {
            letra[i] = 'g';
        } else if (letra[i] == '6') {
            letra[i] = 'h';
        } else if (letra[i] == '7') {
            letra[i] = 'i';
        } else if (letra[i] == '8') {
            letra[i] = 'j';
        } else if (letra[i] == '9') {
            letra[i] = 'k';
        } else if (letra[i] == '@') {
            letra[i] = 'l';
        } else if (letra[i] == '"') {
            letra[i] = 'm';
        } else if (letra[i] == '!') {
            letra[i] = 'n';
        } else if (letra[i] == '#') {
            letra[i] = 'o';
        } else if (letra[i] == '$') {
            letra[i] = 'p';
        } else if (letra[i] == '%') {
            letra[i] = 'q';
        } else if (letra[i] == '&') {
            letra[i] = 'r';
        } else if (letra[i] == '(') {
            letra[i] = 's';
        } else if (letra[i] == ')') {
            letra[i] = 't';
        } else if (letra[i] == '[') {
            letra[i] = 'u';
        } else if (letra[i] == ']') {
            letra[i] = 'v';
        } else if (letra[i] == '{') {
            letra[i] = 'w';
        } else if (letra[i] == '}') {
            letra[i] = 'x';
        } else if (letra[i] == '_') {
            letra[i] = 'y';
        } else if (letra[i] == ':') {
            letra[i] = 'z';
        } else if (letra[i] == ';') {
            letra[i] = 'A';
        } else if (letra[i] == '|') {
            letra[i] = 'B';
        } else if (letra[i] == '?') {
            letra[i] = 'C';
        } else if (letra[i] == '+') {
            letra[i] = 'D';
        } else if (letra[i] == '-') {
            letra[i] = 'E';
        } else if (letra[i] == '/') {
            letra[i] = 'F';
        } else if (letra[i] == '*') {
            letra[i] = 'G';
        } else if (letra[i] == '=') {
            letra[i] = 'H';
        } else if (letra[i] == 'J') {
            letra[i] = 'I';
        } else if (letra[i] == 'K') {
            letra[i] = 'J';
        } else if (letra[i] == 'L') {
            letra[i] = 'K';
        } else if (letra[i] == 'M') {
            letra[i] = 'L';
        } else if (letra[i] == 'N') {
            letra[i] = 'M';
        } else if (letra[i] == 'O') {
            letra[i] = 'N';
        } else if (letra[i] == 'P') {
            letra[i] = 'O';
        } else if (letra[i] == 'Q') {
            letra[i] = 'P';
        } else if (letra[i] == 'R') {
            letra[i] = 'Q';
        } else if (letra[i] == 'S') {
            letra[i] = 'R';
        } else if (letra[i] == 'T') {
            letra[i] = 'S';
        } else if (letra[i] == 'U') {
            letra[i] = 'T';
        } else if (letra[i] == 'V') {
            letra[i] = 'U';
        } else if (letra[i] == 'W') {
            letra[i] = 'V';
        } else if (letra[i] == 'X') {
            letra[i] = 'W';
        } else if (letra[i] == 'Y') {
            letra[i] = 'X';
        } else if (letra[i] == 'Z') {
            letra[i] = 'Y';
        } else if (letra[i] == ' ') {
            letra[i] = 'Z';
        } else if (letra[i] == 'a') {
            letra[i] = ',';
        } else if (letra[i] == 'b') {
            letra[i] = '.';
        } else if (letra[i] == 'c') {
            letra[i] = '0';
        } else if (letra[i] == 'd') {
            letra[i] = '1';
        } else if (letra[i] == 'e') {
            letra[i] = '2';
        } else if (letra[i] == 'f') {
            letra[i] = '3';
        } else if (letra[i] == 'g') {
            letra[i] = '4';
        } else if (letra[i] == 'h') {
            letra[i] = '5';
        } else if (letra[i] == 'i') {
            letra[i] = '6';
        } else if (letra[i] == 'j') {
            letra[i] = '7';
        } else if (letra[i] == 'k') {
            letra[i] = '8';
        } else if (letra[i] == 'l') {
            letra[i] = '9';
        } else if (letra[i] == 'm') {
            letra[i] = '@';
        } else if (letra[i] == 'n') {
            letra[i] = '"';
        } else if (letra[i] == 'o') {
            letra[i] = '!';
        } else if (letra[i] == 'p') {
            letra[i] = '#';
        } else if (letra[i] == 'q') {
            letra[i] = '$';
        } else if (letra[i] == 'r') {
            letra[i] = '%';
        } else if (letra[i] == 's') {
            letra[i] = '&';
        } else if (letra[i] == 't') {
            letra[i] = '(';
        } else if (letra[i] == 'u') {
            letra[i] = ')';
        } else if (letra[i] == 'v') {
            letra[i] = '[';
        } else if (letra[i] == 'w') {
            letra[i] = ']';
        } else if (letra[i] == 'x') {
            letra[i] = '{';
        } else if (letra[i] == 'y') {
            letra[i] = '}';
        } else if (letra[i] == 'z') {
            letra[i] = '_';
        } else if (letra[i] == 'A') {
            letra[i] = ':';
        } else if (letra[i] == 'B') {
            letra[i] = ';';
        } else if (letra[i] == 'C') {
            letra[i] = '|';
        } else if (letra[i] == 'D') {
            letra[i] = '?';
        } else if (letra[i] == 'E') {
            letra[i] = '+';
        } else if (letra[i] == 'F') {
            letra[i] = '-';
        } else if (letra[i] == 'G') {
            letra[i] = '/';
        } else if (letra[i] == 'H') {
            letra[i] = '*';
        } else if (letra[i] == 'I') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>    
     
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_6"> 
    public void criptografia_6(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = '"';
        } else if (letra[i] == 'a') {
            letra[i] = '!';
        } else if (letra[i] == 'b') {
            letra[i] = '#';
        } else if (letra[i] == 'c') {
            letra[i] = '$';
        } else if (letra[i] == 'd') {
            letra[i] = '%';
        } else if (letra[i] == 'e') {
            letra[i] = '&';
        } else if (letra[i] == 'f') {
            letra[i] = '(';
        } else if (letra[i] == 'g') {
            letra[i] = ')';
        } else if (letra[i] == 'h') {
            letra[i] = '[';
        } else if (letra[i] == 'i') {
            letra[i] = ']';
        } else if (letra[i] == 'j') {
            letra[i] = '{';
        } else if (letra[i] == 'k') {
            letra[i] = '}';
        } else if (letra[i] == 'l') {
            letra[i] = '_';
        } else if (letra[i] == 'm') {
            letra[i] = ':';
        } else if (letra[i] == 'n') {
            letra[i] = ';';
        } else if (letra[i] == 'o') {
            letra[i] = '|';
        } else if (letra[i] == 'p') {
            letra[i] = '?';
        } else if (letra[i] == 'q') {
            letra[i] = '+';
        } else if (letra[i] == 'r') {
            letra[i] = '-';
        } else if (letra[i] == 's') {
            letra[i] = '/';
        } else if (letra[i] == 't') {
            letra[i] = '*';
        } else if (letra[i] == 'u') {
            letra[i] = '=';
        } else if (letra[i] == 'v') {
            letra[i] = 'V';
        } else if (letra[i] == 'w') {
            letra[i] = 'W';
        } else if (letra[i] == 'x') {
            letra[i] = 'X';
        } else if (letra[i] == 'y') {
            letra[i] = 'Y';
        } else if (letra[i] == 'z') {
            letra[i] = 'Z';
        } else if (letra[i] == 'A') {
            letra[i] = ',';
        } else if (letra[i] == 'B') {
            letra[i] = '.';
        } else if (letra[i] == 'C') {
            letra[i] = '0';
        } else if (letra[i] == 'D') {
            letra[i] = '1';
        } else if (letra[i] == 'E') {
            letra[i] = '2';
        } else if (letra[i] == 'F') {
            letra[i] = '3';
        } else if (letra[i] == 'G') {
            letra[i] = '4';
        } else if (letra[i] == 'H') {
            letra[i] = '5';
        } else if (letra[i] == 'I') {
            letra[i] = '6';
        } else if (letra[i] == 'J') {
            letra[i] = '7';
        } else if (letra[i] == 'K') {
            letra[i] = '8';
        } else if (letra[i] == 'L') {
            letra[i] = '9';
        } else if (letra[i] == 'M') {
            letra[i] = '@';
        } else if (letra[i] == 'N') {
            letra[i] = ' ';
        } else if (letra[i] == 'O') {
            letra[i] = 'a';
        } else if (letra[i] == 'P') {
            letra[i] = 'b';
        } else if (letra[i] == 'Q') {
            letra[i] = 'c';
        } else if (letra[i] == 'R') {
            letra[i] = 'd';
        } else if (letra[i] == 'S') {
            letra[i] = 'e';
        } else if (letra[i] == 'T') {
            letra[i] = 'f';
        } else if (letra[i] == 'U') {
            letra[i] = 'g';
        } else if (letra[i] == 'V') {
            letra[i] = 'h';
        } else if (letra[i] == 'W') {
            letra[i] = 'i';
        } else if (letra[i] == 'X') {
            letra[i] = 'j';
        } else if (letra[i] == 'Y') {
            letra[i] = 'k';
        } else if (letra[i] == 'Z') {
            letra[i] = 'l';
        } else if (letra[i] == ',') {
            letra[i] = 'm';
        } else if (letra[i] == '.') {
            letra[i] = 'n';
        } else if (letra[i] == '0') {
            letra[i] = 'o';
        } else if (letra[i] == '1') {
            letra[i] = 'p';
        } else if (letra[i] == '2') {
            letra[i] = 'q';
        } else if (letra[i] == '3') {
            letra[i] = 'r';
        } else if (letra[i] == '4') {
            letra[i] = 's';
        } else if (letra[i] == '5') {
            letra[i] = 't';
        } else if (letra[i] == '6') {
            letra[i] = 'u';
        } else if (letra[i] == '7') {
            letra[i] = 'v';
        } else if (letra[i] == '8') {
            letra[i] = 'w';
        } else if (letra[i] == '9') {
            letra[i] = 'x';
        } else if (letra[i] == '@') {
            letra[i] = 'y';
        } else if (letra[i] == '"') {
            letra[i] = 'z';
        } else if (letra[i] == '!') {
            letra[i] = 'A';
        } else if (letra[i] == '#') {
            letra[i] = 'B';
        } else if (letra[i] == '$') {
            letra[i] = 'C';
        } else if (letra[i] == '%') {
            letra[i] = 'D';
        } else if (letra[i] == '&') {
            letra[i] = 'E';
        } else if (letra[i] == '(') {
            letra[i] = 'F';
        } else if (letra[i] == ')') {
            letra[i] = 'G';
        } else if (letra[i] == '[') {
            letra[i] = 'H';
        } else if (letra[i] == ']') {
            letra[i] = 'I';
        } else if (letra[i] == '{') {
            letra[i] = 'J';
        } else if (letra[i] == '}') {
            letra[i] = 'K';
        } else if (letra[i] == '_') {
            letra[i] = 'L';
        } else if (letra[i] == ':') {
            letra[i] = 'M';
        } else if (letra[i] == ';') {
            letra[i] = 'N';
        } else if (letra[i] == '|') {
            letra[i] = 'O';
        } else if (letra[i] == '?') {
            letra[i] = 'P';
        } else if (letra[i] == '+') {
            letra[i] = 'Q';
        } else if (letra[i] == '-') {
            letra[i] = 'R';
        } else if (letra[i] == '/') {
            letra[i] = 'S';
        } else if (letra[i] == '*') {
            letra[i] = 'T';
        } else if (letra[i] == '=') {
            letra[i] = 'U';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_6"> 
    public void descriptografia_6(char[] letra, int i) {
        
        if (letra[i] == '"') {
            letra[i] = ' ';
        } else if (letra[i] == '!') {
            letra[i] = 'a';
        } else if (letra[i] == '#') {
            letra[i] = 'b';
        } else if (letra[i] == '$') {
            letra[i] = 'c';
        } else if (letra[i] == '%') {
            letra[i] = 'd';
        } else if (letra[i] == '&') {
            letra[i] = 'e';
        } else if (letra[i] == '(') {
            letra[i] = 'f';
        } else if (letra[i] == ')') {
            letra[i] = 'g';
        } else if (letra[i] == '[') {
            letra[i] = 'h';
        } else if (letra[i] == ']') {
            letra[i] = 'i';
        } else if (letra[i] == '{') {
            letra[i] = 'j';
        } else if (letra[i] == '}') {
            letra[i] = 'k';
        } else if (letra[i] == '_') {
            letra[i] = 'l';
        } else if (letra[i] == ':') {
            letra[i] = 'm';
        } else if (letra[i] == ';') {
            letra[i] = 'n';
        } else if (letra[i] == '|') {
            letra[i] = 'o';
        } else if (letra[i] == '?') {
            letra[i] = 'p';
        } else if (letra[i] == '+') {
            letra[i] = 'q';
        } else if (letra[i] == '-') {
            letra[i] = 'r';
        } else if (letra[i] == '/') {
            letra[i] = 's';
        } else if (letra[i] == '*') {
            letra[i] = 't';
        } else if (letra[i] == '=') {
            letra[i] = 'u';
        } else if (letra[i] == ' ') {
            letra[i] = 'N';
        } else if (letra[i] == 'a') {
            letra[i] = 'O';
        } else if (letra[i] == 'b') {
            letra[i] = 'P';
        } else if (letra[i] == 'c') {
            letra[i] = 'Q';
        } else if (letra[i] == 'd') {
            letra[i] = 'R';
        } else if (letra[i] == 'e') {
            letra[i] = 'S';
        } else if (letra[i] == 'f') {
            letra[i] = 'T';
        } else if (letra[i] == 'g') {
            letra[i] = 'U';
        } else if (letra[i] == 'h') {
            letra[i] = 'V';
        } else if (letra[i] == 'i') {
            letra[i] = 'W';
        } else if (letra[i] == 'j') {
            letra[i] = 'X';
        } else if (letra[i] == 'k') {
            letra[i] = 'Y';
        } else if (letra[i] == 'l') {
            letra[i] = 'Z';
        } else if (letra[i] == 'm') {
            letra[i] = ',';
        } else if (letra[i] == 'n') {
            letra[i] = '.';
        } else if (letra[i] == 'o') {
            letra[i] = '0';
        } else if (letra[i] == 'p') {
            letra[i] = '1';
        } else if (letra[i] == 'q') {
            letra[i] = '2';
        } else if (letra[i] == 'r') {
            letra[i] = '3';
        } else if (letra[i] == 's') {
            letra[i] = '4';
        } else if (letra[i] == 't') {
            letra[i] = '5';
        } else if (letra[i] == 'u') {
            letra[i] = '6';
        } else if (letra[i] == 'v') {
            letra[i] = '7';
        } else if (letra[i] == 'w') {
            letra[i] = '8';
        } else if (letra[i] == 'x') {
            letra[i] = '9';
        } else if (letra[i] == 'y') {
            letra[i] = '@';
        } else if (letra[i] == 'z') {
            letra[i] = '"';
        } else if (letra[i] == 'A') {
            letra[i] = '!';
        } else if (letra[i] == 'B') {
            letra[i] = '#';
        } else if (letra[i] == 'C') {
            letra[i] = '$';
        } else if (letra[i] == 'D') {
            letra[i] = '%';
        } else if (letra[i] == 'E') {
            letra[i] = '&';
        } else if (letra[i] == 'F') {
            letra[i] = '(';
        } else if (letra[i] == 'G') {
            letra[i] = ')';
        } else if (letra[i] == 'H') {
            letra[i] = '[';
        } else if (letra[i] == 'I') {
            letra[i] = ']';
        } else if (letra[i] == 'J') {
            letra[i] = '{';
        } else if (letra[i] == 'K') {
            letra[i] = '}';
        } else if (letra[i] == 'L') {
            letra[i] = '_';
        } else if (letra[i] == 'M') {
            letra[i] = ':';
        } else if (letra[i] == 'N') {
            letra[i] = ';';
        } else if (letra[i] == 'O') {
            letra[i] = '|';
        } else if (letra[i] == 'P') {
            letra[i] = '?';
        } else if (letra[i] == 'Q') {
            letra[i] = '+';
        } else if (letra[i] == 'R') {
            letra[i] = '-';
        } else if (letra[i] == 'S') {
            letra[i] = '/';
        } else if (letra[i] == 'T') {
            letra[i] = '*';
        } else if (letra[i] == 'U') {
            letra[i] = '=';
        } else if (letra[i] == 'V') {
            letra[i] = 'v';
        } else if (letra[i] == 'W') {
            letra[i] = 'w';
        } else if (letra[i] == 'X') {
            letra[i] = 'x';
        } else if (letra[i] == 'Y') {
            letra[i] = 'y';
        } else if (letra[i] == 'Z') {
            letra[i] = 'z';
        } else if (letra[i] == ',') {
            letra[i] = 'A';
        } else if (letra[i] == '.') {
            letra[i] = 'B';
        } else if (letra[i] == '0') {
            letra[i] = 'C';
        } else if (letra[i] == '1') {
            letra[i] = 'D';
        } else if (letra[i] == '2') {
            letra[i] = 'E';
        } else if (letra[i] == '3') {
            letra[i] = 'F';
        } else if (letra[i] == '4') {
            letra[i] = 'G';
        } else if (letra[i] == '5') {
            letra[i] = 'H';
        } else if (letra[i] == '6') {
            letra[i] = 'I';
        } else if (letra[i] == '7') {
            letra[i] = 'J';
        } else if (letra[i] == '8') {
            letra[i] = 'K';
        } else if (letra[i] == '9') {
            letra[i] = 'L';
        } else if (letra[i] == '@') {
            letra[i] = 'M';
        } 
        
    }
    //</editor-fold>    
    
     
    //<editor-fold defaultstate="collapsed" desc="criptografia_7"> 
    public void criptografia_7(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = '%';
        } else if (letra[i] == 'a') {
            letra[i] = '&';
        } else if (letra[i] == 'b') {
            letra[i] = '(';
        } else if (letra[i] == 'c') {
            letra[i] = ')';
        } else if (letra[i] == 'd') {
            letra[i] = '[';
        } else if (letra[i] == 'e') {
            letra[i] = ']';
        } else if (letra[i] == 'f') {
            letra[i] = '{';
        } else if (letra[i] == 'g') {
            letra[i] = '}';
        } else if (letra[i] == 'h') {
            letra[i] = '_';
        } else if (letra[i] == 'i') {
            letra[i] = ':';
        } else if (letra[i] == 'j') {
            letra[i] = ';';
        } else if (letra[i] == 'k') {
            letra[i] = '|';
        } else if (letra[i] == 'l') {
            letra[i] = '?';
        } else if (letra[i] == 'm') {
            letra[i] = '+';
        } else if (letra[i] == 'n') {
            letra[i] = '-';
        } else if (letra[i] == 'o') {
            letra[i] = '/';
        } else if (letra[i] == 'p') {
            letra[i] = '*';
        } else if (letra[i] == 'q') {
            letra[i] = '=';
        } else if (letra[i] == 'r') {
            letra[i] = ' ';
        } else if (letra[i] == 's') {
            letra[i] = 'a';
        } else if (letra[i] == 't') {
            letra[i] = 'b';
        } else if (letra[i] == 'u') {
            letra[i] = 'c';
        } else if (letra[i] == 'v') {
            letra[i] = 'd';
        } else if (letra[i] == 'w') {
            letra[i] = 'e';
        } else if (letra[i] == 'x') {
            letra[i] = 'f';
        } else if (letra[i] == 'y') {
            letra[i] = 'g';
        } else if (letra[i] == 'z') {
            letra[i] = 'h';
        } else if (letra[i] == 'A') {
            letra[i] = 'i';
        } else if (letra[i] == 'B') {
            letra[i] = 'j';
        } else if (letra[i] == 'C') {
            letra[i] = 'k';
        } else if (letra[i] == 'D') {
            letra[i] = 'l';
        } else if (letra[i] == 'E') {
            letra[i] = 'm';
        } else if (letra[i] == 'F') {
            letra[i] = 'n';
        } else if (letra[i] == 'G') {
            letra[i] = 'o';
        } else if (letra[i] == 'H') {
            letra[i] = 'p';
        } else if (letra[i] == 'I') {
            letra[i] = 'q';
        } else if (letra[i] == 'J') {
            letra[i] = 'r';
        } else if (letra[i] == 'K') {
            letra[i] = 's';
        } else if (letra[i] == 'L') {
            letra[i] = 't';
        } else if (letra[i] == 'M') {
            letra[i] = 'u';
        } else if (letra[i] == 'N') {
            letra[i] = 'v';
        } else if (letra[i] == 'O') {
            letra[i] = 'w';
        } else if (letra[i] == 'P') {
            letra[i] = 'x';
        } else if (letra[i] == 'Q') {
            letra[i] = 'y';
        } else if (letra[i] == 'R') {
            letra[i] = 'z';
        } else if (letra[i] == 'S') {
            letra[i] = 'A';
        } else if (letra[i] == 'T') {
            letra[i] = 'B';
        } else if (letra[i] == 'U') {
            letra[i] = 'C';
        } else if (letra[i] == 'V') {
            letra[i] = 'D';
        } else if (letra[i] == 'W') {
            letra[i] = 'E';
        } else if (letra[i] == 'X') {
            letra[i] = 'F';
        } else if (letra[i] == 'Y') {
            letra[i] = 'G';
        } else if (letra[i] == 'Z') {
            letra[i] = 'H';
        } else if (letra[i] == ',') {
            letra[i] = 'I';
        } else if (letra[i] == '.') {
            letra[i] = 'J';
        } else if (letra[i] == '0') {
            letra[i] = 'K';
        } else if (letra[i] == '1') {
            letra[i] = 'L';
        } else if (letra[i] == '2') {
            letra[i] = 'M';
        } else if (letra[i] == '3') {
            letra[i] = 'N';
        } else if (letra[i] == '4') {
            letra[i] = 'O';
        } else if (letra[i] == '5') {
            letra[i] = 'P';
        } else if (letra[i] == '6') {
            letra[i] = 'Q';
        } else if (letra[i] == '7') {
            letra[i] = 'R';
        } else if (letra[i] == '8') {
            letra[i] = 'S';
        } else if (letra[i] == '9') {
            letra[i] = 'T';
        } else if (letra[i] == '@') {
            letra[i] = 'U';
        } else if (letra[i] == '"') {
            letra[i] = 'V';
        } else if (letra[i] == '!') {
            letra[i] = 'W';
        } else if (letra[i] == '#') {
            letra[i] = 'X';
        } else if (letra[i] == '$') {
            letra[i] = 'Y';
        } else if (letra[i] == '%') {
            letra[i] = 'Z';
        } else if (letra[i] == '&') {
            letra[i] = ',';
        } else if (letra[i] == '(') {
            letra[i] = '.';
        } else if (letra[i] == ')') {
            letra[i] = '0';
        } else if (letra[i] == '[') {
            letra[i] = '1';
        } else if (letra[i] == ']') {
            letra[i] = '2';
        } else if (letra[i] == '{') {
            letra[i] = '3';
        } else if (letra[i] == '}') {
            letra[i] = '4';
        } else if (letra[i] == '_') {
            letra[i] = '5';
        } else if (letra[i] == ':') {
            letra[i] = '6';
        } else if (letra[i] == ';') {
            letra[i] = '7';
        } else if (letra[i] == '|') {
            letra[i] = '8';
        } else if (letra[i] == '?') {
            letra[i] = '9';
        } else if (letra[i] == '+') {
            letra[i] = '@';
        } else if (letra[i] == '-') {
            letra[i] = '"';
        } else if (letra[i] == '/') {
            letra[i] = '!';
        } else if (letra[i] == '*') {
            letra[i] = '#';
        } else if (letra[i] == '=') {
            letra[i] = '$';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_7"> 
    public void descriptografia_7(char[] letra, int i) {
        
        if (letra[i] == '%') {
            letra[i] = ' ';
        } else if (letra[i] == '&') {
            letra[i] = 'a';
        } else if (letra[i] == '(') {
            letra[i] = 'b';
        } else if (letra[i] == ')') {
            letra[i] = 'c';
        } else if (letra[i] == '[') {
            letra[i] = 'd';
        } else if (letra[i] == ']') {
            letra[i] = 'e';
        } else if (letra[i] == '{') {
            letra[i] = 'f';
        } else if (letra[i] == '}') {
            letra[i] = 'g';
        } else if (letra[i] == '_') {
            letra[i] = 'h';
        } else if (letra[i] == ':') {
            letra[i] = 'i';
        } else if (letra[i] == ';') {
            letra[i] = 'j';
        } else if (letra[i] == '|') {
            letra[i] = 'k';
        } else if (letra[i] == '?') {
            letra[i] = 'l';
        } else if (letra[i] == '+') {
            letra[i] = 'm';
        } else if (letra[i] == '-') {
            letra[i] = 'n';
        } else if (letra[i] == '/') {
            letra[i] = 'o';
        } else if (letra[i] == '*') {
            letra[i] = 'p';
        } else if (letra[i] == '=') {
            letra[i] = 'q';
        } else if (letra[i] == ' ') {
            letra[i] = 'r';
        } else if (letra[i] == 'a') {
            letra[i] = 's';
        } else if (letra[i] == 'b') {
            letra[i] = 't';
        } else if (letra[i] == 'c') {
            letra[i] = 'u';
        } else if (letra[i] == 'd') {
            letra[i] = 'v';
        } else if (letra[i] == 'e') {
            letra[i] = 'w';
        } else if (letra[i] == 'f') {
            letra[i] = 'x';
        } else if (letra[i] == 'g') {
            letra[i] = 'y';
        } else if (letra[i] == 'h') {
            letra[i] = 'z';
        } else if (letra[i] == 'i') {
            letra[i] = 'A';
        } else if (letra[i] == 'j') {
            letra[i] = 'B';
        } else if (letra[i] == 'k') {
            letra[i] = 'C';
        } else if (letra[i] == 'l') {
            letra[i] = 'D';
        } else if (letra[i] == 'm') {
            letra[i] = 'E';
        } else if (letra[i] == 'n') {
            letra[i] = 'F';
        } else if (letra[i] == 'o') {
            letra[i] = 'G';
        } else if (letra[i] == 'p') {
            letra[i] = 'H';
        } else if (letra[i] == 'q') {
            letra[i] = 'I';
        } else if (letra[i] == 'r') {
            letra[i] = 'J';
        } else if (letra[i] == 's') {
            letra[i] = 'K';
        } else if (letra[i] == 't') {
            letra[i] = 'L';
        } else if (letra[i] == 'u') {
            letra[i] = 'M';
        } else if (letra[i] == 'v') {
            letra[i] = 'N';
        } else if (letra[i] == 'w') {
            letra[i] = 'O';
        } else if (letra[i] == 'x') {
            letra[i] = 'P';
        } else if (letra[i] == 'y') {
            letra[i] = 'Q';
        } else if (letra[i] == 'z') {
            letra[i] = 'R';
        } else if (letra[i] == 'A') {
            letra[i] = 'S';
        } else if (letra[i] == 'B') {
            letra[i] = 'T';
        } else if (letra[i] == 'C') {
            letra[i] = 'U';
        } else if (letra[i] == 'D') {
            letra[i] = 'V';
        } else if (letra[i] == 'E') {
            letra[i] = 'W';
        } else if (letra[i] == 'F') {
            letra[i] = 'X';
        } else if (letra[i] == 'G') {
            letra[i] = 'Y';
        } else if (letra[i] == 'H') {
            letra[i] = 'Z';
        } else if (letra[i] == 'I') {
            letra[i] = ',';
        } else if (letra[i] == 'J') {
            letra[i] = '.';
        } else if (letra[i] == 'K') {
            letra[i] = '0';
        } else if (letra[i] == 'L') {
            letra[i] = '1';
        } else if (letra[i] == 'M') {
            letra[i] = '2';
        } else if (letra[i] == 'N') {
            letra[i] = '3';
        } else if (letra[i] == 'O') {
            letra[i] = '4';
        } else if (letra[i] == 'P') {
            letra[i] = '5';
        } else if (letra[i] == 'Q') {
            letra[i] = '6';
        } else if (letra[i] == 'R') {
            letra[i] = '7';
        } else if (letra[i] == 'S') {
            letra[i] = '8';
        } else if (letra[i] == 'T') {
            letra[i] = '9';
        } else if (letra[i] == 'U') {
            letra[i] = '@';
        } else if (letra[i] == 'V') {
            letra[i] = '"';
        } else if (letra[i] == 'W') {
            letra[i] = '!';
        } else if (letra[i] == 'X') {
            letra[i] = '#';
        } else if (letra[i] == 'Y') {
            letra[i] = '$';
        } else if (letra[i] == 'Z') {
            letra[i] = '%';
        } else if (letra[i] == ',') {
            letra[i] = '&';
        } else if (letra[i] == '.') {
            letra[i] = '(';
        } else if (letra[i] == '0') {
            letra[i] = ')';
        } else if (letra[i] == '1') {
            letra[i] = '[';
        } else if (letra[i] == '2') {
            letra[i] = ']';
        } else if (letra[i] == '3') {
            letra[i] = '{';
        } else if (letra[i] == '4') {
            letra[i] = '}';
        } else if (letra[i] == '5') {
            letra[i] = '_';
        } else if (letra[i] == '6') {
            letra[i] = ':';
        } else if (letra[i] == '7') {
            letra[i] = ';';
        } else if (letra[i] == '8') {
            letra[i] = '|';
        } else if (letra[i] == '9') {
            letra[i] = '?';
        } else if (letra[i] == '@') {
            letra[i] = '+';
        } else if (letra[i] == '"') {
            letra[i] = '-';
        } else if (letra[i] == '!') {
            letra[i] = '/';
        } else if (letra[i] == '#') {
            letra[i] = '*';
        } else if (letra[i] == '$') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>    
    
     
    //<editor-fold defaultstate="collapsed" desc="criptografia_8"> 
    public void criptografia_8(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = 'v';
        } else if (letra[i] == 'a') {
            letra[i] = 'w';
        } else if (letra[i] == 'b') {
            letra[i] = 'x';
        } else if (letra[i] == 'c') {
            letra[i] = 'y';
        } else if (letra[i] == 'd') {
            letra[i] = 'z';
        } else if (letra[i] == 'e') {
            letra[i] = 'A';
        } else if (letra[i] == 'f') {
            letra[i] = 'B';
        } else if (letra[i] == 'g') {
            letra[i] = 'C';
        } else if (letra[i] == 'h') {
            letra[i] = 'D';
        } else if (letra[i] == 'i') {
            letra[i] = 'E';
        } else if (letra[i] == 'j') {
            letra[i] = 'F';
        } else if (letra[i] == 'k') {
            letra[i] = 'G';
        } else if (letra[i] == 'l') {
            letra[i] = 'H';
        } else if (letra[i] == 'm') {
            letra[i] = 'I';
        } else if (letra[i] == 'n') {
            letra[i] = 'J';
        } else if (letra[i] == 'o') {
            letra[i] = 'K';
        } else if (letra[i] == 'p') {
            letra[i] = 'L';
        } else if (letra[i] == 'q') {
            letra[i] = 'M';
        } else if (letra[i] == 'r') {
            letra[i] = 'N';
        } else if (letra[i] == 's') {
            letra[i] = 'O';
        } else if (letra[i] == 't') {
            letra[i] = 'P';
        } else if (letra[i] == 'u') {
            letra[i] = 'Q';
        } else if (letra[i] == 'v') {
            letra[i] = 'R';
        } else if (letra[i] == 'w') {
            letra[i] = 'S';
        } else if (letra[i] == 'x') {
            letra[i] = 'T';
        } else if (letra[i] == 'y') {
            letra[i] = 'U';
        } else if (letra[i] == 'z') {
            letra[i] = 'V';
        } else if (letra[i] == 'A') {
            letra[i] = 'W';
        } else if (letra[i] == 'B') {
            letra[i] = 'X';
        } else if (letra[i] == 'C') {
            letra[i] = 'Y';
        } else if (letra[i] == 'D') {
            letra[i] = 'Z';
        } else if (letra[i] == 'E') {
            letra[i] = ',';
        } else if (letra[i] == 'F') {
            letra[i] = '.';
        } else if (letra[i] == 'G') {
            letra[i] = '0';
        } else if (letra[i] == 'H') {
            letra[i] = '1';
        } else if (letra[i] == 'I') {
            letra[i] = '2';
        } else if (letra[i] == 'J') {
            letra[i] = '3';
        } else if (letra[i] == 'K') {
            letra[i] = '4';
        } else if (letra[i] == 'L') {
            letra[i] = '5';
        } else if (letra[i] == 'M') {
            letra[i] = '6';
        } else if (letra[i] == 'N') {
            letra[i] = '7';
        } else if (letra[i] == 'O') {
            letra[i] = '8';
        } else if (letra[i] == 'P') {
            letra[i] = '9';
        } else if (letra[i] == 'Q') {
            letra[i] = '@';
        } else if (letra[i] == 'R') {
            letra[i] = '"';
        } else if (letra[i] == 'S') {
            letra[i] = '!';
        } else if (letra[i] == 'T') {
            letra[i] = '#';
        } else if (letra[i] == 'U') {
            letra[i] = '$';
        } else if (letra[i] == 'V') {
            letra[i] = '%';
        } else if (letra[i] == 'W') {
            letra[i] = '&';
        } else if (letra[i] == 'X') {
            letra[i] = '(';
        } else if (letra[i] == 'Y') {
            letra[i] = ')';
        } else if (letra[i] == 'Z') {
            letra[i] = '[';
        } else if (letra[i] == ',') {
            letra[i] = ']';
        } else if (letra[i] == '.') {
            letra[i] = '{';
        } else if (letra[i] == '0') {
            letra[i] = '}';
        } else if (letra[i] == '1') {
            letra[i] = '_';
        } else if (letra[i] == '2') {
            letra[i] = ':';
        } else if (letra[i] == '3') {
            letra[i] = ';';
        } else if (letra[i] == '4') {
            letra[i] = '|';
        } else if (letra[i] == '5') {
            letra[i] = '?';
        } else if (letra[i] == '6') {
            letra[i] = '+';
        } else if (letra[i] == '7') {
            letra[i] = '-';
        } else if (letra[i] == '8') {
            letra[i] = '/';
        } else if (letra[i] == '9') {
            letra[i] = '*';
        } else if (letra[i] == '@') {
            letra[i] = '=';
        } else if (letra[i] == '"') {
            letra[i] = 'd';
        } else if (letra[i] == '!') {
            letra[i] = 'e';
        } else if (letra[i] == '#') {
            letra[i] = 'f';
        } else if (letra[i] == '$') {
            letra[i] = 'g';
        } else if (letra[i] == '%') {
            letra[i] = 'h';
        } else if (letra[i] == '&') {
            letra[i] = 'i';
        } else if (letra[i] == '(') {
            letra[i] = 'j';
        } else if (letra[i] == ')') {
            letra[i] = 'k';
        } else if (letra[i] == '[') {
            letra[i] = 'l';
        } else if (letra[i] == ']') {
            letra[i] = 'm';
        } else if (letra[i] == '{') {
            letra[i] = 'n';
        } else if (letra[i] == '}') {
            letra[i] = 'o';
        } else if (letra[i] == '_') {
            letra[i] = 'p';
        } else if (letra[i] == ':') {
            letra[i] = 'q';
        } else if (letra[i] == ';') {
            letra[i] = 'r';
        } else if (letra[i] == '|') {
            letra[i] = 's';
        } else if (letra[i] == '?') {
            letra[i] = 't';
        } else if (letra[i] == '+') {
            letra[i] = 'u';
        } else if (letra[i] == '-') {
            letra[i] = ' ';
        } else if (letra[i] == '/') {
            letra[i] = 'a';
        } else if (letra[i] == '*') {
            letra[i] = 'b';
        } else if (letra[i] == '=') {
            letra[i] = 'c';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_8"> 
    public void descriptografia_8(char[] letra, int i) {
        
        if (letra[i] == 'v') {
            letra[i] = ' ';
        } else if (letra[i] == 'w') {
            letra[i] = 'a';
        } else if (letra[i] == 'x') {
            letra[i] = 'b';
        } else if (letra[i] == 'y') {
            letra[i] = 'c';
        } else if (letra[i] == 'z') {
            letra[i] = 'd';
        } else if (letra[i] == 'A') {
            letra[i] = 'e';
        } else if (letra[i] == 'B') {
            letra[i] = 'f';
        } else if (letra[i] == 'C') {
            letra[i] = 'g';
        } else if (letra[i] == 'D') {
            letra[i] = 'h';
        } else if (letra[i] == 'E') {
            letra[i] = 'i';
        } else if (letra[i] == 'F') {
            letra[i] = 'j';
        } else if (letra[i] == 'G') {
            letra[i] = 'k';
        } else if (letra[i] == 'H') {
            letra[i] = 'l';
        } else if (letra[i] == 'I') {
            letra[i] = 'm';
        } else if (letra[i] == 'J') {
            letra[i] = 'n';
        } else if (letra[i] == 'K') {
            letra[i] = 'o';
        } else if (letra[i] == 'L') {
            letra[i] = 'p';
        } else if (letra[i] == 'M') {
            letra[i] = 'q';
        } else if (letra[i] == 'N') {
            letra[i] = 'r';
        } else if (letra[i] == 'O') {
            letra[i] = 's';
        } else if (letra[i] == 'P') {
            letra[i] = 't';
        } else if (letra[i] == 'Q') {
            letra[i] = 'u';
        } else if (letra[i] == 'R') {
            letra[i] = 'v';
        } else if (letra[i] == 'S') {
            letra[i] = 'w';
        } else if (letra[i] == 'T') {
            letra[i] = 'x';
        } else if (letra[i] == 'U') {
            letra[i] = 'y';
        } else if (letra[i] == 'V') {
            letra[i] = 'z';
        } else if (letra[i] == 'W') {
            letra[i] = 'A';
        } else if (letra[i] == 'X') {
            letra[i] = 'B';
        } else if (letra[i] == 'Y') {
            letra[i] = 'C';
        } else if (letra[i] == 'Z') {
            letra[i] = 'D';
        } else if (letra[i] == ',') {
            letra[i] = 'E';
        } else if (letra[i] == '.') {
            letra[i] = 'F';
        } else if (letra[i] == '0') {
            letra[i] = 'G';
        } else if (letra[i] == '1') {
            letra[i] = 'H';
        } else if (letra[i] == '2') {
            letra[i] = 'I';
        } else if (letra[i] == '3') {
            letra[i] = 'J';
        } else if (letra[i] == '4') {
            letra[i] = 'K';
        } else if (letra[i] == '5') {
            letra[i] = 'L';
        } else if (letra[i] == '6') {
            letra[i] = 'M';
        } else if (letra[i] == '7') {
            letra[i] = 'N';
        } else if (letra[i] == '8') {
            letra[i] = 'O';
        } else if (letra[i] == '9') {
            letra[i] = 'P';
        } else if (letra[i] == '@') {
            letra[i] = 'Q';
        } else if (letra[i] == '"') {
            letra[i] = 'R';
        } else if (letra[i] == '!') {
            letra[i] = 'S';
        } else if (letra[i] == '#') {
            letra[i] = 'T';
        } else if (letra[i] == '$') {
            letra[i] = 'U';
        } else if (letra[i] == '%') {
            letra[i] = 'V';
        } else if (letra[i] == '&') {
            letra[i] = 'W';
        } else if (letra[i] == '(') {
            letra[i] = 'X';
        } else if (letra[i] == ')') {
            letra[i] = 'Y';
        } else if (letra[i] == '[') {
            letra[i] = 'Z';
        } else if (letra[i] == ']') {
            letra[i] = ',';
        } else if (letra[i] == '{') {
            letra[i] = '.';
        } else if (letra[i] == '}') {
            letra[i] = '0';
        } else if (letra[i] == '_') {
            letra[i] = '1';
        } else if (letra[i] == ':') {
            letra[i] = '2';
        } else if (letra[i] == ';') {
            letra[i] = '3';
        } else if (letra[i] == '|') {
            letra[i] = '4';
        } else if (letra[i] == '?') {
            letra[i] = '5';
        } else if (letra[i] == '+') {
            letra[i] = '6';
        } else if (letra[i] == '-') {
            letra[i] = '7';
        } else if (letra[i] == '/') {
            letra[i] = '8';
        } else if (letra[i] == '*') {
            letra[i] = '9';
        } else if (letra[i] == '=') {
            letra[i] = '@';
        } else if (letra[i] == 'd') {
            letra[i] = '"';
        } else if (letra[i] == 'e') {
            letra[i] = '!';
        } else if (letra[i] == 'f') {
            letra[i] = '#';
        } else if (letra[i] == 'g') {
            letra[i] = '$';
        } else if (letra[i] == 'h') {
            letra[i] = '%';
        } else if (letra[i] == 'i') {
            letra[i] = '&';
        } else if (letra[i] == 'j') {
            letra[i] = '(';
        } else if (letra[i] == 'k') {
            letra[i] = ')';
        } else if (letra[i] == 'l') {
            letra[i] = '[';
        } else if (letra[i] == 'm') {
            letra[i] = ']';
        } else if (letra[i] == 'n') {
            letra[i] = '{';
        } else if (letra[i] == 'o') {
            letra[i] = '}';
        } else if (letra[i] == 'p') {
            letra[i] = '_';
        } else if (letra[i] == 'q') {
            letra[i] = ':';
        } else if (letra[i] == 'r') {
            letra[i] = ';';
        } else if (letra[i] == 's') {
            letra[i] = '|';
        } else if (letra[i] == 't') {
            letra[i] = '?';
        } else if (letra[i] == 'u') {
            letra[i] = '+';
        } else if (letra[i] == ' ') {
            letra[i] = '-';
        } else if (letra[i] == 'a') {
            letra[i] = '/';
        } else if (letra[i] == 'b') {
            letra[i] = '*';
        } else if (letra[i] == 'c') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>    
     
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_9"> 
    public void criptografia_9(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = '_';
        } else if (letra[i] == 'a') {
            letra[i] = ':';
        } else if (letra[i] == 'b') {
            letra[i] = ';';
        } else if (letra[i] == 'c') {
            letra[i] = '|';
        } else if (letra[i] == 'd') {
            letra[i] = '?';
        } else if (letra[i] == 'e') {
            letra[i] = '+';
        } else if (letra[i] == 'f') {
            letra[i] = '-';
        } else if (letra[i] == 'g') {
            letra[i] = '/';
        } else if (letra[i] == 'h') {
            letra[i] = '*';
        } else if (letra[i] == 'i') {
            letra[i] = '=';
        } else if (letra[i] == 'j') {
            letra[i] = '5';
        } else if (letra[i] == 'k') {
            letra[i] = '6';
        } else if (letra[i] == 'l') {
            letra[i] = '7';
        } else if (letra[i] == 'm') {
            letra[i] = '8';
        } else if (letra[i] == 'n') {
            letra[i] = '9';
        } else if (letra[i] == 'o') {
            letra[i] = '@';
        } else if (letra[i] == 'p') {
            letra[i] = '"';
        } else if (letra[i] == 'q') {
            letra[i] = '!';
        } else if (letra[i] == 'r') {
            letra[i] = '#';
        } else if (letra[i] == 's') {
            letra[i] = '$';
        } else if (letra[i] == 't') {
            letra[i] = '%';
        } else if (letra[i] == 'u') {
            letra[i] = '&';
        } else if (letra[i] == 'v') {
            letra[i] = '(';
        } else if (letra[i] == 'w') {
            letra[i] = ')';
        } else if (letra[i] == 'x') {
            letra[i] = '[';
        } else if (letra[i] == 'y') {
            letra[i] = ']';
        } else if (letra[i] == 'z') {
            letra[i] = '{';
        } else if (letra[i] == 'A') {
            letra[i] = '}';
        } else if (letra[i] == 'B') {
            letra[i] = ' ';
        } else if (letra[i] == 'C') {
            letra[i] = 'a';
        } else if (letra[i] == 'D') {
            letra[i] = 'b';
        } else if (letra[i] == 'E') {
            letra[i] = 'c';
        } else if (letra[i] == 'F') {
            letra[i] = 'd';
        } else if (letra[i] == 'G') {
            letra[i] = 'e';
        } else if (letra[i] == 'H') {
            letra[i] = 'f';
        } else if (letra[i] == 'I') {
            letra[i] = 'g';
        } else if (letra[i] == 'J') {
            letra[i] = 'h';
        } else if (letra[i] == 'K') {
            letra[i] = 'i';
        } else if (letra[i] == 'L') {
            letra[i] = 'j';
        } else if (letra[i] == 'M') {
            letra[i] = 'k';
        } else if (letra[i] == 'N') {
            letra[i] = 'l';
        } else if (letra[i] == 'O') {
            letra[i] = 'm';
        } else if (letra[i] == 'P') {
            letra[i] = 'n';
        } else if (letra[i] == 'Q') {
            letra[i] = 'o';
        } else if (letra[i] == 'R') {
            letra[i] = 'p';
        } else if (letra[i] == 'S') {
            letra[i] = 'q';
        } else if (letra[i] == 'T') {
            letra[i] = 'r';
        } else if (letra[i] == 'U') {
            letra[i] = 's';
        } else if (letra[i] == 'V') {
            letra[i] = 't';
        } else if (letra[i] == 'W') {
            letra[i] = 'u';
        } else if (letra[i] == 'X') {
            letra[i] = 'v';
        } else if (letra[i] == 'Y') {
            letra[i] = 'w';
        } else if (letra[i] == 'Z') {
            letra[i] = 'x';
        } else if (letra[i] == ',') {
            letra[i] = 'y';
        } else if (letra[i] == '.') {
            letra[i] = 'z';
        } else if (letra[i] == '0') {
            letra[i] = 'A';
        } else if (letra[i] == '1') {
            letra[i] = 'B';
        } else if (letra[i] == '2') {
            letra[i] = 'C';
        } else if (letra[i] == '3') {
            letra[i] = 'D';
        } else if (letra[i] == '4') {
            letra[i] = 'E';
        } else if (letra[i] == '5') {
            letra[i] = 'F';
        } else if (letra[i] == '6') {
            letra[i] = 'G';
        } else if (letra[i] == '7') {
            letra[i] = 'H';
        } else if (letra[i] == '8') {
            letra[i] = 'I';
        } else if (letra[i] == '9') {
            letra[i] = 'J';
        } else if (letra[i] == '@') {
            letra[i] = 'K';
        } else if (letra[i] == '"') {
            letra[i] = 'L';
        } else if (letra[i] == '!') {
            letra[i] = 'M';
        } else if (letra[i] == '#') {
            letra[i] = 'N';
        } else if (letra[i] == '$') {
            letra[i] = 'O';
        } else if (letra[i] == '%') {
            letra[i] = 'P';
        } else if (letra[i] == '&') {
            letra[i] = 'Q';
        } else if (letra[i] == '(') {
            letra[i] = 'R';
        } else if (letra[i] == ')') {
            letra[i] = 'S';
        } else if (letra[i] == '[') {
            letra[i] = 'T';
        } else if (letra[i] == ']') {
            letra[i] = 'U';
        } else if (letra[i] == '{') {
            letra[i] = 'V';
        } else if (letra[i] == '}') {
            letra[i] = 'W';
        } else if (letra[i] == '_') {
            letra[i] = 'X';
        } else if (letra[i] == ':') {
            letra[i] = 'Y';
        } else if (letra[i] == ';') {
            letra[i] = 'Z';
        } else if (letra[i] == '|') {
            letra[i] = ',';
        } else if (letra[i] == '?') {
            letra[i] = '.';
        } else if (letra[i] == '+') {
            letra[i] = '0';
        } else if (letra[i] == '-') {
            letra[i] = '1';
        } else if (letra[i] == '/') {
            letra[i] = '2';
        } else if (letra[i] == '*') {
            letra[i] = '3';
        } else if (letra[i] == '=') {
            letra[i] = '4';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_9"> 
    public void descriptografia_9(char[] letra, int i) {
        
        if (letra[i] == '_') {
            letra[i] = ' ';
        } else if (letra[i] == ':') {
            letra[i] = 'a';
        } else if (letra[i] == ';') {
            letra[i] = 'b';
        } else if (letra[i] == '|') {
            letra[i] = 'c';
        } else if (letra[i] == '?') {
            letra[i] = 'd';
        } else if (letra[i] == '+') {
            letra[i] = 'e';
        } else if (letra[i] == '-') {
            letra[i] = 'f';
        } else if (letra[i] == '/') {
            letra[i] = 'g';
        } else if (letra[i] == '*') {
            letra[i] = 'h';
        } else if (letra[i] == '=') {
            letra[i] = 'i';
        } else if (letra[i] == '5') {
            letra[i] = 'j';
        } else if (letra[i] == '6') {
            letra[i] = 'k';
        } else if (letra[i] == '7') {
            letra[i] = 'l';
        } else if (letra[i] == '8') {
            letra[i] = 'm';
        } else if (letra[i] == '9') {
            letra[i] = 'n';
        } else if (letra[i] == '@') {
            letra[i] = 'o';
        } else if (letra[i] == '"') {
            letra[i] = 'p';
        } else if (letra[i] == '!') {
            letra[i] = 'q';
        } else if (letra[i] == '#') {
            letra[i] = 'r';
        } else if (letra[i] == '$') {
            letra[i] = 's';
        } else if (letra[i] == '%') {
            letra[i] = 't';
        } else if (letra[i] == '&') {
            letra[i] = 'u';
        } else if (letra[i] == '(') {
            letra[i] = 'v';
        } else if (letra[i] == ')') {
            letra[i] = 'w';
        } else if (letra[i] == '[') {
            letra[i] = 'x';
        } else if (letra[i] == ']') {
            letra[i] = 'y';
        } else if (letra[i] == '{') {
            letra[i] = 'z';
        } else if (letra[i] == '}') {
            letra[i] = 'A';
        } else if (letra[i] == ' ') {
            letra[i] = 'B';
        } else if (letra[i] == 'a') {
            letra[i] = 'C';
        } else if (letra[i] == 'b') {
            letra[i] = 'D';
        } else if (letra[i] == 'c') {
            letra[i] = 'E';
        } else if (letra[i] == 'd') {
            letra[i] = 'F';
        } else if (letra[i] == 'e') {
            letra[i] = 'G';
        } else if (letra[i] == 'f') {
            letra[i] = 'H';
        } else if (letra[i] == 'g') {
            letra[i] = 'I';
        } else if (letra[i] == 'h') {
            letra[i] = 'J';
        } else if (letra[i] == 'i') {
            letra[i] = 'K';
        } else if (letra[i] == 'j') {
            letra[i] = 'L';
        } else if (letra[i] == 'k') {
            letra[i] = 'M';
        } else if (letra[i] == 'l') {
            letra[i] = 'N';
        } else if (letra[i] == 'm') {
            letra[i] = 'O';
        } else if (letra[i] == 'n') {
            letra[i] = 'P';
        } else if (letra[i] == 'o') {
            letra[i] = 'Q';
        } else if (letra[i] == 'p') {
            letra[i] = 'R';
        } else if (letra[i] == 'q') {
            letra[i] = 'S';
        } else if (letra[i] == 'r') {
            letra[i] = 'T';
        } else if (letra[i] == 's') {
            letra[i] = 'U';
        } else if (letra[i] == 't') {
            letra[i] = 'V';
        } else if (letra[i] == 'u') {
            letra[i] = 'W';
        } else if (letra[i] == 'v') {
            letra[i] = 'X';
        } else if (letra[i] == 'w') {
            letra[i] = 'Y';
        } else if (letra[i] == 'x') {
            letra[i] = 'Z';
        } else if (letra[i] == 'y') {
            letra[i] = ',';
        } else if (letra[i] == 'z') {
            letra[i] = '.';
        } else if (letra[i] == 'A') {
            letra[i] = '0';
        } else if (letra[i] == 'B') {
            letra[i] = '1';
        } else if (letra[i] == 'C') {
            letra[i] = '2';
        } else if (letra[i] == 'D') {
            letra[i] = '3';
        } else if (letra[i] == 'E') {
            letra[i] = '4';
        } else if (letra[i] == 'F') {
            letra[i] = '5';
        } else if (letra[i] == 'G') {
            letra[i] = '6';
        } else if (letra[i] == 'H') {
            letra[i] = '7';
        } else if (letra[i] == 'I') {
            letra[i] = '8';
        } else if (letra[i] == 'J') {
            letra[i] = '9';
        } else if (letra[i] == 'K') {
            letra[i] = '@';
        } else if (letra[i] == 'L') {
            letra[i] = '"';
        } else if (letra[i] == 'M') {
            letra[i] = '!';
        } else if (letra[i] == 'N') {
            letra[i] = '#';
        } else if (letra[i] == 'O') {
            letra[i] = '$';
        } else if (letra[i] == 'P') {
            letra[i] = '%';
        } else if (letra[i] == 'Q') {
            letra[i] = '&';
        } else if (letra[i] == 'R') {
            letra[i] = '(';
        } else if (letra[i] == 'S') {
            letra[i] = ')';
        } else if (letra[i] == 'T') {
            letra[i] = '[';
        } else if (letra[i] == 'U') {
            letra[i] = ']';
        } else if (letra[i] == 'V') {
            letra[i] = '{';
        } else if (letra[i] == 'W') {
            letra[i] = '}';
        } else if (letra[i] == 'X') {
            letra[i] = '_';
        } else if (letra[i] == 'Y') {
            letra[i] = ':';
        } else if (letra[i] == 'Z') {
            letra[i] = ';';
        } else if (letra[i] == ',') {
            letra[i] = '|';
        } else if (letra[i] == '.') {
            letra[i] = '?';
        } else if (letra[i] == '0') {
            letra[i] = '+';
        } else if (letra[i] == '1') {
            letra[i] = '-';
        } else if (letra[i] == '2') {
            letra[i] = '/';
        } else if (letra[i] == '3') {
            letra[i] = '*';
        } else if (letra[i] == '4') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>   
     
    
    //<editor-fold defaultstate="collapsed" desc="criptografia_10"> 
    public void criptografia_10(char[] letra, int i) {
        
        if (letra[i] == ' ') {
            letra[i] = '5';
        } else if (letra[i] == 'a') {
            letra[i] = '6';
        } else if (letra[i] == 'b') {
            letra[i] = '7';
        } else if (letra[i] == 'c') {
            letra[i] = '8';
        } else if (letra[i] == 'd') {
            letra[i] = '9';
        } else if (letra[i] == 'e') {
            letra[i] = '@';
        } else if (letra[i] == 'f') {
            letra[i] = '"';
        } else if (letra[i] == 'g') {
            letra[i] = '!';
        } else if (letra[i] == 'h') {
            letra[i] = '#';
        } else if (letra[i] == 'i') {
            letra[i] = '$';
        } else if (letra[i] == 'j') {
            letra[i] = '%';
        } else if (letra[i] == 'k') {
            letra[i] = '&';
        } else if (letra[i] == 'l') {
            letra[i] = '(';
        } else if (letra[i] == 'm') {
            letra[i] = ')';
        } else if (letra[i] == 'n') {
            letra[i] = '[';
        } else if (letra[i] == 'o') {
            letra[i] = ']';
        } else if (letra[i] == 'p') {
            letra[i] = '{';
        } else if (letra[i] == 'q') {
            letra[i] = '}';
        } else if (letra[i] == 'r') {
            letra[i] = '_';
        } else if (letra[i] == 's') {
            letra[i] = ':';
        } else if (letra[i] == 't') {
            letra[i] = ';';
        } else if (letra[i] == 'u') {
            letra[i] = '|';
        } else if (letra[i] == 'v') {
            letra[i] = '?';
        } else if (letra[i] == 'w') {
            letra[i] = '+';
        } else if (letra[i] == 'x') {
            letra[i] = '-';
        } else if (letra[i] == 'y') {
            letra[i] = '/';
        } else if (letra[i] == 'z') {
            letra[i] = '*';
        } else if (letra[i] == 'A') {
            letra[i] = '=';
        } else if (letra[i] == 'B') {
            letra[i] = 'P';
        } else if (letra[i] == 'C') {
            letra[i] = 'Q';
        } else if (letra[i] == 'D') {
            letra[i] = 'R';
        } else if (letra[i] == 'E') {
            letra[i] = 'S';
        } else if (letra[i] == 'F') {
            letra[i] = 'T';
        } else if (letra[i] == 'G') {
            letra[i] = 'U';
        } else if (letra[i] == 'H') {
            letra[i] = 'V';
        } else if (letra[i] == 'I') {
            letra[i] = 'W';
        } else if (letra[i] == 'J') {
            letra[i] = 'X';
        } else if (letra[i] == 'K') {
            letra[i] = 'Y';
        } else if (letra[i] == 'L') {
            letra[i] = 'Z';
        } else if (letra[i] == 'M') {
            letra[i] = ',';
        } else if (letra[i] == 'N') {
            letra[i] = '.';
        } else if (letra[i] == 'O') {
            letra[i] = '0';
        } else if (letra[i] == 'P') {
            letra[i] = '1';
        } else if (letra[i] == 'Q') {
            letra[i] = '2';
        } else if (letra[i] == 'R') {
            letra[i] = '3';
        } else if (letra[i] == 'S') {
            letra[i] = '4';
        } else if (letra[i] == 'T') {
            letra[i] = ' ';
        } else if (letra[i] == 'U') {
            letra[i] = 'a';
        } else if (letra[i] == 'V') {
            letra[i] = 'b';
        } else if (letra[i] == 'W') {
            letra[i] = 'c';
        } else if (letra[i] == 'X') {
            letra[i] = 'd';
        } else if (letra[i] == 'Y') {
            letra[i] = 'e';
        } else if (letra[i] == 'Z') {
            letra[i] = 'f';
        } else if (letra[i] == ',') {
            letra[i] = 'g';
        } else if (letra[i] == '.') {
            letra[i] = 'h';
        } else if (letra[i] == '0') {
            letra[i] = 'i';
        } else if (letra[i] == '1') {
            letra[i] = 'j';
        } else if (letra[i] == '2') {
            letra[i] = 'k';
        } else if (letra[i] == '3') {
            letra[i] = 'l';
        } else if (letra[i] == '4') {
            letra[i] = 'm';
        } else if (letra[i] == '5') {
            letra[i] = 'n';
        } else if (letra[i] == '6') {
            letra[i] = 'o';
        } else if (letra[i] == '7') {
            letra[i] = 'p';
        } else if (letra[i] == '8') {
            letra[i] = 'q';
        } else if (letra[i] == '9') {
            letra[i] = 'r';
        } else if (letra[i] == '@') {
            letra[i] = 's';
        } else if (letra[i] == '"') {
            letra[i] = 't';
        } else if (letra[i] == '!') {
            letra[i] = 'u';
        } else if (letra[i] == '#') {
            letra[i] = 'v';
        } else if (letra[i] == '$') {
            letra[i] = 'w';
        } else if (letra[i] == '%') {
            letra[i] = 'x';
        } else if (letra[i] == '&') {
            letra[i] = 'y';
        } else if (letra[i] == '(') {
            letra[i] = 'z';
        } else if (letra[i] == ')') {
            letra[i] = 'A';
        } else if (letra[i] == '[') {
            letra[i] = 'B';
        } else if (letra[i] == ']') {
            letra[i] = 'C';
        } else if (letra[i] == '{') {
            letra[i] = 'D';
        } else if (letra[i] == '}') {
            letra[i] = 'E';
        } else if (letra[i] == '_') {
            letra[i] = 'F';
        } else if (letra[i] == ':') {
            letra[i] = 'G';
        } else if (letra[i] == ';') {
            letra[i] = 'H';
        } else if (letra[i] == '|') {
            letra[i] = 'I';
        } else if (letra[i] == '?') {
            letra[i] = 'J';
        } else if (letra[i] == '+') {
            letra[i] = 'K';
        } else if (letra[i] == '-') {
            letra[i] = 'L';
        } else if (letra[i] == '/') {
            letra[i] = 'M';
        } else if (letra[i] == '*') {
            letra[i] = 'N';
        } else if (letra[i] == '=') {
            letra[i] = 'O';
        } 
        
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="descriptografia_10"> 
    public void descriptografia_10(char[] letra, int i) {
        
        if (letra[i] == '5') {
            letra[i] = ' ';
        } else if (letra[i] == '6') {
            letra[i] = 'a';
        } else if (letra[i] == '7') {
            letra[i] = 'b';
        } else if (letra[i] == '8') {
            letra[i] = 'c';
        } else if (letra[i] == '9') {
            letra[i] = 'd';
        } else if (letra[i] == '@') {
            letra[i] = 'e';
        } else if (letra[i] == '"') {
            letra[i] = 'f';
        } else if (letra[i] == '!') {
            letra[i] = 'g';
        } else if (letra[i] == '#') {
            letra[i] = 'h';
        } else if (letra[i] == '$') {
            letra[i] = 'i';
        } else if (letra[i] == '%') {
            letra[i] = 'j';
        } else if (letra[i] == '&') {
            letra[i] = 'k';
        } else if (letra[i] == '(') {
            letra[i] = 'l';
        } else if (letra[i] == ')') {
            letra[i] = 'm';
        } else if (letra[i] == '[') {
            letra[i] = 'n';
        } else if (letra[i] == ']') {
            letra[i] = 'o';
        } else if (letra[i] == '{') {
            letra[i] = 'p';
        } else if (letra[i] == '}') {
            letra[i] = 'q';
        } else if (letra[i] == '_') {
            letra[i] = 'r';
        } else if (letra[i] == ':') {
            letra[i] = 's';
        } else if (letra[i] == ';') {
            letra[i] = 't';
        } else if (letra[i] == '|') {
            letra[i] = 'u';
        } else if (letra[i] == '?') {
            letra[i] = 'v';
        } else if (letra[i] == '+') {
            letra[i] = 'w';
        } else if (letra[i] == '-') {
            letra[i] = 'x';
        } else if (letra[i] == '/') {
            letra[i] = 'y';
        } else if (letra[i] == '*') {
            letra[i] = 'z';
        } else if (letra[i] == '=') {
            letra[i] = 'A';
        } else if (letra[i] == 'P') {
            letra[i] = 'B';
        } else if (letra[i] == 'Q') {
            letra[i] = 'C';
        } else if (letra[i] == 'R') {
            letra[i] = 'D';
        } else if (letra[i] == 'S') {
            letra[i] = 'E';
        } else if (letra[i] == 'T') {
            letra[i] = 'F';
        } else if (letra[i] == 'U') {
            letra[i] = 'G';
        } else if (letra[i] == 'V') {
            letra[i] = 'H';
        } else if (letra[i] == 'W') {
            letra[i] = 'I';
        } else if (letra[i] == 'X') {
            letra[i] = 'J';
        } else if (letra[i] == 'Y') {
            letra[i] = 'K';
        } else if (letra[i] == 'Z') {
            letra[i] = 'L';
        } else if (letra[i] == ',') {
            letra[i] = 'M';
        } else if (letra[i] == '.') {
            letra[i] = 'N';
        } else if (letra[i] == '0') {
            letra[i] = 'O';
        } else if (letra[i] == '1') {
            letra[i] = 'P';
        } else if (letra[i] == '2') {
            letra[i] = 'Q';
        } else if (letra[i] == '3') {
            letra[i] = 'R';
        } else if (letra[i] == '4') {
            letra[i] = 'S';
        } else if (letra[i] == ' ') {
            letra[i] = 'T';
        } else if (letra[i] == 'a') {
            letra[i] = 'U';
        } else if (letra[i] == 'b') {
            letra[i] = 'V';
        } else if (letra[i] == 'c') {
            letra[i] = 'W';
        } else if (letra[i] == 'd') {
            letra[i] = 'X';
        } else if (letra[i] == 'e') {
            letra[i] = 'Y';
        } else if (letra[i] == 'f') {
            letra[i] = 'Z';
        } else if (letra[i] == 'g') {
            letra[i] = ',';
        } else if (letra[i] == 'h') {
            letra[i] = '.';
        } else if (letra[i] == 'i') {
            letra[i] = '0';
        } else if (letra[i] == 'j') {
            letra[i] = '1';
        } else if (letra[i] == 'k') {
            letra[i] = '2';
        } else if (letra[i] == 'l') {
            letra[i] = '3';
        } else if (letra[i] == 'm') {
            letra[i] = '4';
        } else if (letra[i] == 'n') {
            letra[i] = '5';
        } else if (letra[i] == 'o') {
            letra[i] = '6';
        } else if (letra[i] == 'p') {
            letra[i] = '7';
        } else if (letra[i] == 'q') {
            letra[i] = '8';
        } else if (letra[i] == 'r') {
            letra[i] = '9';
        } else if (letra[i] == 's') {
            letra[i] = '@';
        } else if (letra[i] == 't') {
            letra[i] = '"';
        } else if (letra[i] == 'u') {
            letra[i] = '!';
        } else if (letra[i] == 'v') {
            letra[i] = '#';
        } else if (letra[i] == 'w') {
            letra[i] = '$';
        } else if (letra[i] == 'x') {
            letra[i] = '%';
        } else if (letra[i] == 'y') {
            letra[i] = '&';
        } else if (letra[i] == 'z') {
            letra[i] = '(';
        } else if (letra[i] == 'A') {
            letra[i] = ')';
        } else if (letra[i] == 'B') {
            letra[i] = '[';
        } else if (letra[i] == 'C') {
            letra[i] = ']';
        } else if (letra[i] == 'D') {
            letra[i] = '{';
        } else if (letra[i] == 'E') {
            letra[i] = '}';
        } else if (letra[i] == 'F') {
            letra[i] = '_';
        } else if (letra[i] == 'G') {
            letra[i] = ':';
        } else if (letra[i] == 'H') {
            letra[i] = ';';
        } else if (letra[i] == 'I') {
            letra[i] = '|';
        } else if (letra[i] == 'J') {
            letra[i] = '?';
        } else if (letra[i] == 'K') {
            letra[i] = '+';
        } else if (letra[i] == 'L') {
            letra[i] = '-';
        } else if (letra[i] == 'M') {
            letra[i] = '/';
        } else if (letra[i] == 'N') {
            letra[i] = '*';
        } else if (letra[i] == 'O') {
            letra[i] = '=';
        } 
        
    }
    //</editor-fold>  
    
}
