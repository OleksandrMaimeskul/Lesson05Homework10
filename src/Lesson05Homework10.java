public class Lesson05Homework10 {
    public static void main(String[] args) {
        System.out.println("There are numbers of shuttles proceeding to Mars: ");
        int shuttleNumber = 1;
        for (int shuttle = 1; shuttleNumber <= 100; shuttle++) {
            if (shuttle % 10 != 4 && shuttle % 10 != 9 && shuttle / 10 != 4 && shuttle / 10 != 9
                    && shuttle % 100 != 40 && shuttle % 100 != 41 && shuttle % 100 != 42 && shuttle % 100 != 43
                    && shuttle % 100 != 44 && shuttle % 100 != 45 && shuttle % 100 != 46 && shuttle % 100 != 47
                    && shuttle % 100 != 48 && shuttle % 100 != 49) {
                System.out.println(shuttleNumber + "." + "Shuttle # " + shuttle);
                shuttleNumber++;
            }
        }
    }
}
