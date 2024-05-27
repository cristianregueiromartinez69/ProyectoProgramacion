import com.dam.proyectoprogramacion.Songs.AttacksSongs;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.plugins.InstantiatorProvider2;
import org.mockito.plugins.InstantiatorProvider;


import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;

import static org.mockito.Mockito.*;
public class TestSongs {
    @Mock
    private AudioInputStream mockAudioInputStream;

    @Mock
    private Clip mockClip;

    @Before
    public void setUp() throws Exception {
        // Mock the AudioSystem static methods
        PowerMockito.mockStatic(AudioSystem.class);

        // Mock the AudioInputStream returned by AudioSystem.getAudioInputStream
        when(AudioSystem.getAudioInputStream(any(File.class))).thenReturn(mockAudioInputStream);

        // Mock the Clip returned by AudioSystem.getLine
        when(AudioSystem.getLine(any(DataLine.Info.class))).thenReturn(mockClip);
    }

    @Test
    public void testMusicCloseCombat() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Call the method
        AttacksSongs.musicCloseCombat();

        // Verify that AudioSystem.getAudioInputStream was called
        PowerMockito.verifyStatic(AudioSystem.class);
        AudioSystem.getAudioInputStream(any(File.class));

        // Verify that AudioSystem.getLine was called
        PowerMockito.verifyStatic(AudioSystem.class);
        AudioSystem.getLine(any(DataLine.Info.class));

        // Verify that the clip was opened and started
        verify(mockClip).open(mockAudioInputStream);
        verify(mockClip).start();
    }

    @Test
    public void testMusicAcrobatics() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Call the method
        AttacksSongs.musicAcrobatics();

        // Verify that AudioSystem.getAudioInputStream was called
        PowerMockito.verifyStatic(AudioSystem.class);
        AudioSystem.getAudioInputStream(any(File.class));

        // Verify that AudioSystem.getLine was called
        PowerMockito.verifyStatic(AudioSystem.class);
        AudioSystem.getLine(any(DataLine.Info.class));

        // Verify that the clip was opened and started
        verify(mockClip).open(mockAudioInputStream);
        verify(mockClip).start();
    }


    //Estos son algunos test de los sonidos de ataques, los demás son iguales ya que solo camia la pita de audio
}
