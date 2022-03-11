import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;



class MainTest {

    private final ByteArrayOutputStream choice = new ByteArrayOutputStream();
    private final ByteArrayOutputStream err = new ByteArrayOutputStream();
    private final PrintStream origChoice = new PrintStream(System.out);
    private final PrintStream origErr = new PrintStream(System.err);

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(choice));
        System.setErr(new PrintStream(err));
    }

    @Test
    void choice() {
        System.out.println("Hello");
        assertEquals("Hello", choice.toString(), "Unexpected Output");
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(origChoice);
        System.setErr(origErr);
    }
}