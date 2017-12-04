public class Plateau {
    private final int bottomRightXCoordinate;
    private int topLeftYCoordinate;
    private int topRightXCoordinate;
    private int topRightYCoordinate;

    public Plateau(int xCoordinate, int yCoordinate){
        topLeftYCoordinate = yCoordinate;
        topRightYCoordinate = yCoordinate;
        topRightXCoordinate = xCoordinate;
        bottomRightXCoordinate = xCoordinate;
    }

   public String getCoordinates(){
       int bottomLeftXCoordinate = 0;
       int bottomLeftYCoordinate = 0;
       int topLeftXCoordinate = 0;
       int bottomRightYCoordinate = 0;

       return bottomLeftXCoordinate + "," + bottomLeftYCoordinate + " " + topLeftXCoordinate +"," + topLeftYCoordinate + " " + topRightXCoordinate + "," + topRightYCoordinate + " " + bottomRightXCoordinate + "," + bottomRightYCoordinate;
   }
}
