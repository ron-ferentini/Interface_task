import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WerewolfTest {
    private Werewolf werewolf;

    @BeforeEach
    public void setUp() {
        werewolf = new Werewolf();
    }

    @Test
    public void testInitialFormIsHuman() {
        assertEquals(true, werewolf.isHumanForm);
    }

    @Test
    public void testTransformHumanToWolf() {
        werewolf.transform();
        assertEquals(false, werewolf.isHumanForm);
    }

    @Test
    public void testTransformWolfToHuman() {
        werewolf.transform(); // Change to wolf form
        werewolf.transform(); // Change back to human form
        assertEquals(true, werewolf.isHumanForm);
    }

    @Test
    public void testSpeakInHumanForm() {
        assertEquals("I am a human.", werewolf.speak());
    }

    @Test
    public void testSpeakInWolfForm() {
        werewolf.transform(); // Change to wolf form
        assertEquals("I cannot speak in wolf form.", werewolf.speak());
    }

    @Test
    public void testSoundInHumanForm() {
        assertEquals("No sound in human form.", werewolf.sound());
    }

    @Test
    public void testSoundInWolfForm() {
        werewolf.transform(); // Change to wolf form
        assertEquals("Howl!", werewolf.sound());
    }
}
