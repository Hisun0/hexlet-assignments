package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            int result = (int) Math.ceil(circle.getSquare());
            System.out.println(result);
        } catch (NegativeRadiusException err) {
            System.out.println(err.getMessage());
        }

        System.out.println("Вычисление окончено");
    }
}
// END
