import net.greet.Greeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    Greeter greeter = new Greeter();

    @Test
    public void userCount(){

        greeter.greeter("Phumlani","IsiXhosa");
        greeter.greeter("Thabang", "Sepedi");
        greeter.greeter("Andre", "IsiNdebele");
        greeter.greeter("Cara", "English");
        greeter.greeter("Cara", "IsiXhosa");
        greeter.greeter("Cara", "English");

        assertEquals(4, greeter.counter());
    }

    @Test
    public void greet(){

        greeter.greeter("Sesethu", "Sepedi");
        assertEquals("Thobela Sesethu!", greeter.greeter("Sesethu","Sepedi"));

        greeter.greeter("Sino", "English");
        assertEquals("Hello Sino!", greeter.greeter("Sino", "English"));
    }
}
