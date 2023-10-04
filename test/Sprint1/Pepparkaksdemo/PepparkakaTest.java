package Sprint1.Pepparkaksdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PepparkakaTest {

    Pepparkaka p = new Pepparkaka("katt", true);
    Pepparkaka pOGlaseradFrånBörjan = new Pepparkaka("katt", true);

    @Test
    void glasera(){

        assert(pOGlaseradFrånBörjan.getGlaserad()==false);

        pOGlaseradFrånBörjan.glasera();

        assert(pOGlaseradFrånBörjan.getGlaserad()==true);

    }


    @Test
    void getForm() {
        String expectedForm = "katt";
        String notExpectedForm = "hund";
        String actualForm = p.getForm();

        Assertions.assertEquals(expectedForm, actualForm);
        Assertions.assertNotEquals(notExpectedForm, actualForm);
    }

    @Test
    void setForm() {
        String expectedformBeforeSet = "katt";
        String expectedformAfterSet = "giraff";

        p.setForm(expectedformAfterSet);

        String actualForm = p.getForm();

        assert(expectedformAfterSet==actualForm);
        assert(expectedformBeforeSet!=actualForm);

        assert(!(expectedformBeforeSet==actualForm));

        assertEquals(expectedformAfterSet, actualForm);


        Assertions.assertEquals(expectedformAfterSet, actualForm);
        Assertions.assertNotEquals(expectedformBeforeSet, actualForm);
    }



    @Test
    void whoAmI() {
    }

    @Test
    void getSugarContent() {
    }


}