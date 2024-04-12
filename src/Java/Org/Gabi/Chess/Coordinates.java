public class Coordinates {

    private int horizontal;
    private int vertical;
    private String coordinate;

    public Coordinates(String coordinates) {
        this.coordinate = coordinates;
        setHorizontal(coordinates.charAt(0)-97);
        setVertical(56-coordinates.charAt(1));
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public String getCoordnate() {
        return coordinate;
    }

    public void setCoordnate(String coordinate) {
        this.coordinate = coordinate;
    }

    public int[] coordsArray(){
        int[] arr = new int[2];
        arr[0] = getHorizontal();
        arr[1] = getVertical();
        return arr;
    }

    @Override
    public String toString() {
        return String.valueOf(getHorizontal()) + "," + String.valueOf(getVertical());
    }
}
