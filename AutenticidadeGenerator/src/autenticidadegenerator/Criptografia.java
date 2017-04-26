
package autenticidadegenerator;
import java.util.Calendar;

public class Criptografia {
    
    
    //<editor-fold defaultstate="collapsed" desc="Valor da Chave"> 
    public void valor(char[] senha, int i) {
        //troca uma letra da senha por um número
        //de forma simples, esse método converte letras em números
        switch (senha[i]) {
            case ' ':
                senha[i] = '0';
                break;
            case 'a':
                senha[i] = '9';
                break;
            case 'b':
                senha[i] = '8';
                break;
            case 'c':
                senha[i] = '7';
                break;
            case 'd':
                senha[i] = '6';
                break;
            case 'e':
                senha[i] = '5';
                break;
            case 'f':
                senha[i] = '4';
                break;
            case 'g':
                senha[i] = '3';
                break;
            case 'h':
                senha[i] = '2';
                break;
            case 'i':
                senha[i] = '1';
                break;
            case 'j':
                senha[i] = '0';
                break;
            case 'k':
                senha[i] = '9';
                break;
            case 'l':
                senha[i] = '8';
                break;
            case 'm':
                senha[i] = '7';
                break;
            case 'n':
                senha[i] = '6';
                break;
            case 'o':
                senha[i] = '5';
                break;
            case 'p':
                senha[i] = '4';
                break;
            case 'q':
                senha[i] = '3';
                break;
            case 'r':
                senha[i] = '2';
                break;
            case 's':
                senha[i] = '1';
                break;
            case 't':
                senha[i] = '0';
                break;
            case 'u':
                senha[i] = '9';
                break;
            case 'v':
                senha[i] = '8';
                break;
            case 'w':
                senha[i] = '7';
                break;
            case 'x':
                senha[i] = '6';
                break;
            case 'y':
                senha[i] = '5';
                break;
            case 'z':
                senha[i] = '4';
                break;
            case 'A':
                senha[i] = '3';
                break;
            case 'B':
                senha[i] = '2';
                break;
            case 'C':
                senha[i] = '1';
                break;
            case 'D':
                senha[i] = '0';
                break;
            case 'E':
                senha[i] = '9';
                break;
            case 'F':
                senha[i] = '8';
                break;
            case 'G':
                senha[i] = '7';
                break;
            case 'H':
                senha[i] = '6';
                break;
            case 'I':
                senha[i] = '5';
                break;
            case 'J':
                senha[i] = '4';
                break;
            case 'K':
                senha[i] = '3';
                break;
            case 'L':
                senha[i] = '2';
                break;
            case 'M':
                senha[i] = '1';
                break;
            case 'N':
                senha[i] = '0';
                break;
            case 'O':
                senha[i] = '9';
                break;
            case 'P':
                senha[i] = '8';
                break;
            case 'Q':
                senha[i] = '7';
                break;
            case 'R':
                senha[i] = '6';
                break;
            case 'S':
                senha[i] = '5';
                break;
            case 'T':
                senha[i] = '4';
                break;
            case 'U':
                senha[i] = '3';
                break;
            case 'V':
                senha[i] = '2';
                break;
            case 'W':
                senha[i] = '1';
                break;
            case 'X':
                senha[i] = '0';
                break;
            case 'Y':
                senha[i] = '9';
                break;
            case 'Z':
                senha[i] = '8';
                break;
            case ',':
                senha[i] = '7';
                break;
            case '.':
                senha[i] = '6';
                break;
            case '0':
                senha[i] = '5';
                break;
            case '1':
                senha[i] = '4';
                break;
            case '2':
                senha[i] = '3';
                break;
            case '3':
                senha[i] = '2'; 
                break;
            case '4':
                senha[i] = '1';
                break;
            case '5':
                senha[i] = '0';
                break;
            case '6':
                senha[i] = '9';
                break;
            case '7':
                senha[i] = '8';
                break;
            case '8':
                senha[i] = '7';
                break;
            case '9':
                senha[i] = '6';
                break;
            case '@':
                senha[i] = '5';
                break;
            case '"':
                senha[i] = '4';
                break;
            case '!':
                senha[i] = '3';
                break;
            case '#':
                senha[i] = '2';
                break;
            case '$':
                senha[i] = '1';
                break;
            case '%':
                senha[i] = '0';
                break;
            case '&':
                senha[i] = '9';
                break;
            case '(':
                senha[i] = '8';
                break;
            case ')':
                senha[i] = '7';
                break;
            case '[':
                senha[i] = '6';
                break;
            case ']':
                senha[i] = '5';
                break;
            case '{':
                senha[i] = '4';
                break;
            case '}':
                senha[i] = '3';
                break;
            case '_':
                senha[i] = '2';
                break;
            case ':':
                senha[i] = '1';
                break;
            case ';':
                senha[i] = '0';
                break;
            case '|':
                senha[i] = '9';
                break;
            case '?':
                senha[i] = '8';
                break;
            case '+':
                senha[i] = '7';
                break;
            case '-':
                senha[i] = '6';
                break;
            case '/':
                senha[i] = '5';
                break;
            case '*':
                senha[i] = '4';
                break;
            case '=':
                senha[i] = '3';
                break;
            default:
                break;
        }
    }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="letraCriptografada"> 
    public char letraCriptografada (char[] senha, int aux, String mensagem, int n) {
        //criptografa uma letra específica, em uma biblioteca específica
        //senha[aux] = algum número
        //cada letra da mensagem será criptografada conforme o número da chave correspondente ao índice
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
    
    //<editor-fold defaultstate="collapsed" desc="criptografiaSecreta"> 
    public String criptografiaSecreta (char senha, String mensagem) {
        //Criptografa uma palavra inteira conforme o senha solicitada de 0 a 9
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
    
    //<editor-fold defaultstate="collapsed" desc="Confirma Senha de Hoje"> 
    public int confirma() {
        //Utilizei dia + mês, pois dessa forma quando estivermos no primeiro dia do mês
        //o programa poderá gerar um key2 não necessariamente sequencial 12 vezer por ano,
        //na hora de fazer o módulo, já se acrescentarmos o ano, essa mudança será feita uma vez a cada 365 dias
        int minuto, hora, dia, mes, key2;
        minuto = Calendar.getInstance().get(Calendar.MINUTE);
        hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mes = Calendar.getInstance().get(Calendar.MONTH);
        
        key2 = minuto + hora + dia + mes;
        
        return key2;      
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="criptografiaSecreta2"> 
    public String criptografiaSecreta2 (int numero, String mensagem) {
        //Criptografa uma letra na posição indicada da mensagem
        int key = numero;
        
        int tamanho = mensagem.length();                
        char[] letra = new char[tamanho]; 
        
        for (int i = 0; i < tamanho; i++) {
            letra[i] = mensagem.charAt(i);
            switch (key % 10) {
                case 0:
                    criptografia_1(letra, i);
                    break;
                case 1:
                    criptografia_2(letra, i);
                    break;
                case 2:
                    criptografia_3(letra, i);
                    break;
                case 3:
                    criptografia_4(letra, i);
                    break;
                case 4:
                    criptografia_5(letra, i);
                    break;
                case 5:
                    criptografia_6(letra, i);
                    break;
                case 6:
                    criptografia_7(letra, i);
                    break;
                case 7:
                    criptografia_8(letra, i);
                    break;
                case 8:
                    criptografia_9(letra, i);
                    break;
                default:
                    criptografia_10(letra, i);
                    break;
            }
        }
        
        mensagem = "";
        for (int i = 0; i < tamanho; i++) {
            mensagem = mensagem + letra[i];
        }
        return mensagem;
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Confirma DATA de Hoje"> 
    public String confirmaData() {
        int dia, mes, ano;
        dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mes = Calendar.getInstance().get(Calendar.MONTH);
        ano = Calendar.getInstance().get(Calendar.YEAR);
        int hora, minuto;
        hora = Calendar.getInstance().get(Calendar.HOUR);
        minuto = Calendar.getInstance().get(Calendar.MINUTE);
        
        return " "+dia+"/"+mes+"/"+ano+" ás "+hora+":"+minuto;      
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
    
}
