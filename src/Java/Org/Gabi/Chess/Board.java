public class Board {
    private String[][] square = new String[8][8];

    public boolean havePiece(String coords){
        Coordinates c = new Coordinates(coords);
        System.out.println(c.getHorizontal());
        System.out.println(c.getVertical());
//        if (square[c.getHorizontal()][c.getVertical()].isEmpty()){
//            return false;
//        }else {
//            return true;
//        }
        return true;
    }




}
