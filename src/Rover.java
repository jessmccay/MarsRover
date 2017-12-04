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

    public String commands(String nasaCommands) {
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
        }
        return currentPosition();
    }

    public void turnRight() {

      switch(direction) {
          case "N":
              direction = "E";
              break;
          case "E":
              direction = "S";
              break;
          case "S":
              direction = "W";
              break;
          case "W":
              direction = "N";
              break;
      }
    }
//    }   if (this.direction == "N"){
//        direction = "E";
//    }
//        else if (direction == "E"){
//        direction = "S";
//    }
//        else if(direction == "S"){
//        direction = "W";
//    }
//        else if (direction == "W"){
//        direction = "N";
//    }

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

    public static void main(String [ ] args)
    {
        Rover rover1 = new Rover(1,2,"N");
        rover1.commands("LMLMLMLMM");

        Rover rover2 = new Rover(3, 3, "E");
        rover2.commands("MMRMMRMRRM");
    }

}
