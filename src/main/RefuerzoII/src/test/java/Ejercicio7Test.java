import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    @DisplayName("Los canales dan la vuelta")
    void canales() {
        assertAll(
                ()-> assertEquals(7, Ejercicio7.canales(99, 7)),
                ()-> assertEquals(2, Ejercicio7.canales(2, 99))
        );

    }
    @Test
    @DisplayName("Los canales NO dan la vuelta")
    void canalesNo() {
        assertAll(
                () -> assertEquals(3, Ejercicio7.canales(2, 5)),
                () -> assertEquals(41, Ejercicio7.canales(5, 63))
        );
    }

}