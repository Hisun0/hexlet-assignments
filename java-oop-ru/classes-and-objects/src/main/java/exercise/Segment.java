package exercise;

// BEGIN
public class Segment {
    private final Point beginPoint;
    private final Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getMidPoint() {
        int midBeginPoint = (beginPoint.getX() + endPoint.getX()) / 2;
        int midEndPoint = (beginPoint.getY() + endPoint.getY()) / 2;

        return new Point(midBeginPoint, midEndPoint);
    }
}
// END
