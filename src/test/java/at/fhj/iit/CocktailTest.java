package at.fhj.iit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for testing Cocktail.java
 *
 * @author Markus Kaufmann
 * @author Tarik Avdibasic
 */
@DisplayName("Testing Cocktail")
class CocktailTest {

    private Cocktail cubaLibre, virginColada;

    @BeforeEach
    public void setup(){



        cubaLibre = new Cocktail ("Cuba Libre");
        cubaLibre.addLiquid(new Liquid ("White rum", 0.04, 40));
        cubaLibre.addLiquid(new Liquid ( "Cola", 0.12, 0));
        cubaLibre.addLiquid(new Liquid("Fresh lime juice", 0.02, 0));
        cubaLibre.buildRecipe(" Fill the glass with ice");
        cubaLibre.buildRecipe(" Squeeze and drop 2 lime wedges into the glass");
        cubaLibre.buildRecipe(" Pour in 4cl rum");
        cubaLibre.buildRecipe(" Top up with 12cl of cola");
        cubaLibre.buildRecipe( "Stir it gently!");

        virginColada = new Cocktail ("Virgin Colada");
        virginColada.addLiquid(new Liquid ("Whipped cream", 0.02, 0));
        virginColada.addLiquid(new Liquid ("Coconut milk", 0.04, 0));
        virginColada.addLiquid(new Liquid ("Pineapple juice", 0.16, 0));
        virginColada.buildRecipe(" Fill the glass with ice");
        virginColada.buildRecipe(" Pour the ingredients in the shaker and shake it for 20s");
        virginColada.buildRecipe(" Pour the mixed ingredients from the shaker in the glass");
        virginColada.buildRecipe(" Decorate it with the slice of pineapple or honeydew melon!");

    }

    @Test
    @DisplayName("Testing constructor name of cubaLibre")
    public void testCocktailCubaLibre(){
        assertEquals("Cuba Libre",cubaLibre.name);
    }

    @Test
    @DisplayName("Testing constructor name of virginColada")
    public void testCocktailVirginColada(){
        assertEquals("Virgin Colada",virginColada.name);
    }

    @Test
    @DisplayName("controlling if building a recipe works")
    void buildRecipeTest() {



    }



    @Test
    @DisplayName("Testing functionality of the rounding on 2 decimal for cubaLibre")
    void testRoundForCubaLibre() {
            assertEquals(18.0, cubaLibre.round(cubaLibre.getVolume(), 2),0.01, "" +
                    "Excpected value is 18.0, actual value is " + cubaLibre.round(cubaLibre.getVolume(), 2));
    }

    @Test
    @DisplayName("Testing functionality of the rounding on 2 decimal for virginColada")
    void testRoundForVirginColada() {
        assertEquals(22.0, virginColada.round(virginColada.getVolume(), 2),0.01, "" +
                "Excpected value is 22.0, actual value is " + virginColada.round(virginColada.getVolume(), 2));
    }

    @Test
    @DisplayName("Testing the size of the volume of the Cocktail cubaLibre")
    void testGetVolumeOfCubaLibre() {
        assertEquals(18, cubaLibre.getVolume(), 0.01);
    }


    @Test
    void getAlcoholPercent() {

    }

    @Test
    void isAlcoholic() {
    }

    @Test
    void addLiquid() {
    }
}