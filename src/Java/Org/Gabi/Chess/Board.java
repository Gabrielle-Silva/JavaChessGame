public class Board {
    private String[][] square = new String[8][8];

    public boolean havePiece(String coords){
        Coordinates c = new Coordinates(coords);
        if (square[c.getHorizontal()][c.getVertical()] != null){
            return false;
        }else {
            return true;
        }

    }




}
