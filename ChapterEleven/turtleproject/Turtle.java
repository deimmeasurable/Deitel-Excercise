package ChapterEleven.turtleproject;

public class Turtle {
private Pen biro = new Pen();
private Direction currentDirection = Direction.EAST;
private Position currentPosition=new Position(0,0);
private String [][] turtleWrite=new String[5][5];
    public Pen getPen() {
        return biro;
    }

    public void penDown() {
        biro.setState(PenState.DOWN);
    }

    public void penUp() {
        biro.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return  currentDirection;
    }

    public void turnRight() {
        if(currentDirection ==Direction.EAST) face(Direction.SOUTH);
       else if(currentDirection==Direction.SOUTH) face(Direction.WEST);
       else if(currentDirection==Direction.WEST)face(Direction.NORTH);


    }


    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {

        if(currentDirection == Direction.EAST)face(Direction.NORTH);
        else if(currentDirection==Direction.NORTH)face(Direction.WEST);
        else if(currentDirection==Direction.WEST)face(Direction.SOUTH);


    }

    public void move(int numberOfSteps) {
        if(currentDirection==Direction.EAST) increaseColumnBy(numberOfSteps-1);
        else if(currentDirection==Direction.SOUTH) increaseRowBy(numberOfSteps-1);
        else if (currentDirection==Direction.WEST)decreaseColumnBy(numberOfSteps-1);
        else if(currentDirection==Direction.NORTH)decreaseRowBy(numberOfSteps-1);




    }

    private void decreaseRowBy(int decrease) {
        currentPosition.setRow(currentPosition.getRow()-decrease);
    }

    private void decreaseColumnBy(int decrease) {
        currentPosition.setColumn((currentPosition.getColumn()-decrease));
    }

    private void increaseRowBy(int increase) {
        currentPosition.setRow((currentPosition.getRow()+increase));
    }

    private void increaseColumnBy(int increase) {
        currentPosition.setColumn((currentPosition.getColumn()+increase));
    }

    public Position getCurrentPostion() {
        return currentPosition;
    }
}
