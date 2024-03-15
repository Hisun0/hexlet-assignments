package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public int compareTo(Home another) {
        return Double.compare(this.area, another.getArea());
    }

    public String toString() {
        return String.format(
                "%1$s этажный коттедж площадью %2$s метров",
                this.floorCount, this.area
        );
    }
}
// END
