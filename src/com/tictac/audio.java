package com.tictac;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class audio
{
    void playAudio(String filePath) throws IOException, UnsupportedAudioFileException, LineUnavailableException
    {
        File audioFile = new File(filePath);

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        AudioFormat format = audioStream.getFormat();

        DataLine.Info info =  new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioStream);
        audioClip.start();
        audioClip.loop(0);
    }
}
