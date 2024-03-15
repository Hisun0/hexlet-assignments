package exercise;

// BEGIN
public class Flat implements Home {
    private final double totalArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.floor = floor;
        this.totalArea = area + balconyArea;
    }

    public double getArea() {
        return this.totalArea;
    }

    public int compareTo(Home another) {
        return Double.compare(this.totalArea, another.getArea());
    }

    public String toString() {
        return String.format(
                "Квартира площадью %1$s метров на %2$s этаже",
                this.totalArea, this.floor
        );
    }
}
// END
