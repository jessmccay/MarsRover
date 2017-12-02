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

    public void commands(String nasaCommands) {
       char[] nasaCommandsArray = nasaCommands.toCharArray();
        for (int i = 0; i < nasaCommandsArray.length; i++) {
            if (nasaCommandsArray[i] == 'L') {
                turnLeft();
            }
           if (nasaCommandsArray[i] == 'R') {
               turnRight();
           }
           if (nasaCommandsArray[i] == 'M') {
               driveForward();
           }
            //Process char
        }
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
        if (this.direction == "N") {
            yCoordinate = (yCoordinate + 1);
        }
        if (this.direction == "S"){
            yCoordinate = yCoordinate - 1;
        }
        if (this.direction == "W"){
            xCordinate = xCordinate - 1;
        }
        if (this.direction == "E"){
            xCordinate = xCordinate + 1;
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
