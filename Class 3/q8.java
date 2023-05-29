/* Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.
Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false */
import java.util.Arrays;
public class q8 {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = canAttendMeetings(intervals);
        System.out.println(result);
    }
    


    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        // Check for any overlap
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false; // Overlapping intervals
            }
        }
        
        return true; // No overlapping intervals
    }
}







