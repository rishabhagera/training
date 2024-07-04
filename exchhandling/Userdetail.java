package exchhandling;

public class Userdetail {
    public static boolean validateMarks(int[] marks) throws InvalidMarksException {
        for (int value : marks) {
            if (value < 0 || value > 100) {
                throw new InvalidMarksException("Marks should be between 0-100");
            }
        }
        return true;
    }

    public static float calculatePercentage(int[] marks) {
        int total = 0;
        for (int result : marks) {
            total += result;
        }
        float per = (float) total / marks.length;
        return per;
    }
}
