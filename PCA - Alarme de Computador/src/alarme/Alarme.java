/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarme;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Port;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author BRUNO
 */
public class Alarme {

    static Clip clip;
    static FloatControl volume;
    public static void main(String[] args) throws Exception {
 
        try {
            File soundFile = new File ("sirene.wav");
            AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
            DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
            clip = (Clip) AudioSystem.getLine(info);//Clip clip
            clip.open(sound);
            setVolume(100);
            clip.start();
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JOptionPane.showMessageDialog(null, "ATENÇÃO PERIGO!!!\nInvasão de privacidade detectado!!!");
                    JOptionPane.showMessageDialog(null,"Você não tem permissão para desativar o alarme!","PCA - Alarme de Computador", JOptionPane.ERROR_MESSAGE);
                }
            });
        } catch (Exception e) {
            System.out.println("erro: "+e);
        }
    
    }
    
    public static void setVolume(int vol) throws LineUnavailableException {
        if (clip.isOpen()) {
            if (volume == null) {
                //Controle de Volume
                Port lineOut;
                if (AudioSystem.isLineSupported(Port.Info.LINE_OUT)) {
                lineOut = (Port) AudioSystem.getLine(Port.Info.LINE_OUT);
                lineOut.open();
                } else if (AudioSystem.isLineSupported(Port.Info.HEADPHONE)) {
                    lineOut = (Port) AudioSystem.getLine(Port.Info.HEADPHONE);
                    lineOut.open();
                } else if (AudioSystem.isLineSupported(Port.Info.SPEAKER)) {
                    lineOut = (Port) AudioSystem.getLine(Port.Info.SPEAKER);
                    lineOut.open();
                } else {
                    throw new LineUnavailableException(
                    "Nao foi possivel detectar um canal de saida");
                }
                volume = (FloatControl) lineOut.getControl(FloatControl.Type.VOLUME);
            }
            volume.setValue((float) (vol / 100.0));
        }
    }
}