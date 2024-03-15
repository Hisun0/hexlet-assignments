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

    @Override
    public int compareTo() {
        return 0;
    }

    public int compareTo(Home another) {
        if (this.totalArea > another.getArea()) {
            return 1;
        }

        if (this.totalArea < another.getArea()) {
            return -1;
        }

        return 0;
    }

    public String toString() {
        return String.format(
                "Квартира площадью %1$s метров на %2$s этаже",
                this.totalArea, this.floor
        );
    }
}
// END
