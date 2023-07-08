import java.util.LinkedList;
import java.util.Queue;

public class Question3 {
    private static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qStudents = new LinkedList<>();

        for (int value : students) {
            qStudents.add(value);
        }

        int topPositionOfSandwich = 0;
        int numStudentsUnableEat = 0;
        while (!qStudents.isEmpty() && numStudentsUnableEat < qStudents.size()) {
            if (sandwiches[topPositionOfSandwich] == qStudents.peek()) {
                numStudentsUnableEat = 0;

                ++topPositionOfSandwich;
                qStudents.poll();
            } else {
                ++numStudentsUnableEat;

                qStudents.add(qStudents.poll());
            }
        }

        return numStudentsUnableEat;
    }
    public static void main(String[] args) {
        int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
        System.out.println(countStudents(students, sandwiches));
    }
}
