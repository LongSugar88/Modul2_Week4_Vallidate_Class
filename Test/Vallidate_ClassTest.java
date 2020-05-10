import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vallidate_ClassTest {
    Vallidate_Class vallidate_class;
    @BeforeEach
    void setup(){
        vallidate_class = new Vallidate_Class();
    }

    @Test
    void vallidate1() {
        String myClass = "C0318G";
        boolean expect = true;
        boolean result = vallidate_class.vallidate(myClass);
        assertEquals(expect, result);
    }
    @Test
    void vallidate2() {
        String myClass = "M0318G";
        boolean expect = false;
        boolean result = vallidate_class.vallidate(myClass);
        assertEquals(expect, result);
    }
    @Test
    void vallidate3() {
        String myClass = "P0323A";
        boolean expect = false;
        boolean result = vallidate_class.vallidate(myClass);
        assertEquals(expect, result);
    }
}