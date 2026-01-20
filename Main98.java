// Calculate the average marks from an array containing marks of all subjects in Physics using for-each loop.
class Main98 { // AverageMarks.
    public static void main(String[] args) {
        int[] marks = { 65, 70, 80, 75, 60 };
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        float average = (float) sum / marks.length;
        System.out.println("Average Marks = " + average);
    }
}