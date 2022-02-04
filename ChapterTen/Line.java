package ChapterTen;

public abstract class Line {
    private  String striagthLine;
    private String curveLine;
    private String verticalLine;

    public Line(String striagthLine, String curveLine, String verticalLine) {
        this.striagthLine = striagthLine;
        this.curveLine = curveLine;
        this.verticalLine = verticalLine;
    }

    public abstract void move();
     abstract void pass();

}
