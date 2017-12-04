import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlateauTest {
    @Test
    public void plateauHasFourXYCoordinates(){
        Plateau plateau = new Plateau(6,8);
       String expectedPlateauCoordinates = ("0,0 0,8 6,8 6,0");
        assertEquals (expectedPlateauCoordinates, plateau.getCoordinates());
    }

    @Test
    public void BottomLeftAndTopLeftXCoordinatesShouldMatch() {
        Plateau plateau = new Plateau(3, 4);
        assertEquals("0,0 0,4 3,4 3,0", plateau.getCoordinates());
    }

}
