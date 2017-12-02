public class Rover {
    private int xCordinate;
    private int yCoordinate;
    private String direction;

    public Rover(int initialX, int initialY, String initialDirection) {
        this.xCordinate = initialX;
        this.yCoordinate = initialY;
        this.direction = initialDirection;
    }

    public String currentPosition() {
        return xCordinate + " " + yCoordinate + " " + direction;
    }


    public enum Direction {
         N, E, S, W
     }

    public void turnRight() {
        if (this.direction == "N"){
          direction = "E";
        }
        else if (direction == "E"){
           direction = "S";
        }
        else if(direction == "S"){
           direction = "W";
        }
        else if (direction == "W"){
           direction = "N";
        }
    }

    public void turnLeft() {
        if (this.direction == "N"){
            direction = "W";
        }
        else if (direction == "W"){
            direction = "S";
        }
        else if(direction == "S"){
            direction = "E";
        }
        else if (direction == "E"){
            direction = "N";
        }
    }


    public void driveForward() {
        if (direction == "N") {
            yCoordinate = (yCoordinate + 1);
        }
    }
//        else if (direction == "E") {
//            currentPosition = (xCordinate + 1) + " " + yCoordinate + " " + direction;
//            return currentPosition;
//        }
//        else if (direction == "S") {
//            currentPosition = xCordinate + " " + (yCoordinate - 1) + " " + direction;
//            return currentPosition;
//        }
//        else if (direction == "W") {
//            currentPosition = (xCordinate - 1) + " " + yCoordinate + " " + direction;
//            return currentPosition;
//        }
//        return currentPosition;
//    }
}
