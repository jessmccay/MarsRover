import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {
    @Test
    public void roverStartsWhereItsTold() {
        Rover rover = new Rover(3, 5,"E");
        String roverPosition = rover.currentPosition();
        assertEquals("3 5 E", roverPosition);
    }
    @Test
    public void roverTurnsRight() {
        Rover rover = new Rover(3, 5, "E");
        rover.turnRight();
        assertEquals("3 5 S", rover.currentPosition());

        rover.turnRight();
        rover.turnRight();
        assertEquals("3 5 N", rover.currentPosition());
    }
    @Test
    public void roverTurnsLeft(){
        Rover rover = new Rover(4,4,"N");
        rover.turnLeft();
        assertEquals("4 4 W", rover.currentPosition());

        rover.turnLeft();
        rover.turnLeft();
        assertEquals("4 4 E", rover.currentPosition());
    }
    @Test
    public void turnRightShouldReturnEIfInitialDirectionIsN(){
       Rover rover = new Rover(0,0,"N");
       rover.turnRight();
       assertEquals("0 0 E", rover.currentPosition());
    }
   @Test
   public void turnRightShouldReturnSIfInitialDirectionIsE(){
       Rover rover = new Rover(0,0,"E");
       rover.turnRight();
       assertEquals("0 0 S", rover.currentPosition());
   }
    @Test
    public void turnRightShouldReturnWIfInitialDirectionIsS(){
        Rover rover = new Rover(0,0,"S");
        rover.turnRight();
        assertEquals("0 0 W", rover.currentPosition());
    }
    @Test
    public void turnRightShouldReturnNIfCurrentDirectionIsW(){
       Rover rover = new Rover(0,0,"W");
       rover.turnRight();
       assertEquals("0 0 N", rover.currentPosition());
   }

   @Test
   public void turnLeftShouldReturnWIfCurrentDirectionIsN(){
       Rover rover = new Rover(0,0,"N");
       rover.turnLeft();
       assertEquals("0 0 W", rover.currentPosition());
   }
   @Test
    public void turnLeftShouldReturnSIfCurrentDirectionIsW(){
       Rover rover = new Rover(0,0,"W");
       rover.turnLeft();
       assertEquals("0 0 S", rover.currentPosition());
    }
    @Test
    public void turnLeftShouldReturnEIfCurrentDirectionIsS(){
        Rover rover = new Rover(0,0,"S");
        rover.turnLeft();
        assertEquals("0 0 E", rover.currentPosition());
    }
    @Test
    public void turnLeftShouldSetDirectionNIfCurrentDirectionIsE(){
      Rover rover = new Rover(0,0,"E");
      rover.turnLeft();
      assertEquals("0 0 N", rover.currentPosition());
  }
  @Test
  public void roverShouldDriveForward() {
      Rover rover = new Rover(3,3,"N");
      rover.driveForward();
      assertEquals("3 4 N", rover.currentPosition());

      rover.driveForward();
      rover.driveForward();
      rover.driveForward();
      assertEquals("3 7 N", rover.currentPosition());

  }
  @Test
  public void roverMovesAccordingToCommands() {
        Rover rover = new Rover(4,6,"W");
        rover.commands("LLMMRRLM");
        assertEquals("6 5 S", rover.currentPosition());
  }
}



