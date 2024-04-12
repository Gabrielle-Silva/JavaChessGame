import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Tests {

    @Test
    public void testCoordinatesOutput(){
    Coordinates testCoords = new Coordinates("d4");
    assertEquals("3,4",testCoords.toString());
    }


    @Test
    public void testSquareisEmpty(){
        Board testPieceSquare = new Board();
        assertEquals(false, testPieceSquare.havePiece("d4"));
    }
}
