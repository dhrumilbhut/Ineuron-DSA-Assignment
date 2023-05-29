import java.util.HashSet;
import java.util.Set;

/* Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

Example 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3 */

public class q2 {
    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        int ans = distributeCandies(candies);

        System.out.println(ans);
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> typeCandySet = new HashSet<>();
        int halfLength = candyType.length/2;

        for (int c : candyType) {
            if (typeCandySet.size() >= halfLength)
                return halfLength;
            typeCandySet.add(c);
        }
        return Math.min(typeCandySet.size(), halfLength);
    }
}
