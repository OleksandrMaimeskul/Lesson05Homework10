public class Lesson05Homework10 {
    public static void main(String[] args) {
        System.out.println("There are numbers of shuttles proceeding to Mars: ");
        int shuttleNumber = 1;
        for (int shuttle = 1; shuttleNumber <= 100; shuttle++)
            if (shuttle % 10 != 4 && shuttle % 10 != 9 && shuttle / 10 != 4 && shuttle / 10 != 9)
                if ((shuttle / 10) % 10 != 4 && (shuttle / 10) % 10 != 9) {
                    System.out.println(shuttleNumber + "." + "Shuttle # " + shuttle);
                    shuttleNumber++;
                }
    }
}



