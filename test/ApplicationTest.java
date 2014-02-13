import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.Calcul;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    public void assert_addition(double x, double y, double r){
        assertThat(new Calcul(x, y).addition()).isEqualTo(r);
    }

    public void assert_soustraction(double x, double y, double r){
        assertThat(new Calcul(x, y).soustraction()).isEqualTo(r);
    }

    public void assert_multiplication(double x, double y, double r){
        assertThat(new Calcul(x, y).multiplication()).isEqualTo(r);
    }

    public void assert_division(double x, double y, double r){
        assertThat(new Calcul(x, y).division()).isEqualTo(r);
    }
    
    public void assert_carre(double x, double y, double r){
        assertThat(new Calcul(x, y).carre()).isEqualTo(r);
    }
    
    /*public void assert_racine(double x, double y, double r){
        assertThat(new Calcul(x, y).racine()).isEqualTo(r);
    }*/

    @Test
    public void testAddition(){
        assert_addition(1,1,2);
        assert_addition(2,2,4);
        assert_addition(5,2,7);
    }
    
    @Test
    public void testSoustraction(){
        assert_soustraction(1,1,0);
        assert_soustraction(2,2,0);
        assert_soustraction(5,2,3);
    }

    @Test
    public void testMultiplication(){
        assert_multiplication(1,1,1);
        assert_multiplication(2,2,4);
        assert_multiplication(5,2,10);
        assert_multiplication(5,0,0);
    }

    @Test
    public void testDivision(){
        assert_division(1,1,1);
        assert_division(2,2,1);
        assert_division(10,2,5);
    }
    
    @Test
    public void testCarre(){
        assert_carre(1,1,1);
        assert_carre(2,1,4);
        assert_carre(5,1,25);
        assert_carre(9,1,81);
    }
    
    /*@Test
    public void testRacine(){
        assert_racine(1,1,1);
        assert_racine(4,1,2);
        assert_racine(25,1,5);
        assert_racine(9,1,3);
        assert_racine(81,1,9);
    }*/

}
