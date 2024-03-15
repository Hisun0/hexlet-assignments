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

    @Override
    public int compareTo() {
        return 0;
    }

    public int compareTo(Home another) {
        if (this.area > another.getArea()) {
            return 1;
        }

        if (this.area < another.getArea()) {
            return -1;
        }

        return 0;
    }

    public String toString() {
        return String.format(
                "%1$s этажный коттедж площадью %2$s метров",
                this.floorCount, this.area
        );
    }
}
// END
