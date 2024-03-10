public class Lesson05Homework10 {
    public static void main(String[] args) {
        System.out.println("There are numbers of shuttles proceeding to Mars: ");
        for (int shuttle = 1; shuttle <= 100; shuttle++) {
            if (shuttle % 10 != 4 && shuttle % 10 != 9 && shuttle / 10 != 4 && shuttle / 10 != 9) {
                System.out.println(shuttle);
            } else {
                System.out.println("--");
            }
        }
        System.out.println("Indication -- is missing numbers because contain 4 or 9.");
    }
}
