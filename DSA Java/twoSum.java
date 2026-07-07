import java.util.*;

public class twoSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

    }



    // two pointers method
    public static int[] two(int[] nums, int target) {
        int num1 = -1, num2 = -1;
        int start = 0, end = nums.length - 1;
        int Cnums[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(Cnums);
        while (start < end) {
            int sum = Cnums[start] + Cnums[end];
            if (sum == target) {
                num1 = start;
                num2 = end;
                break;
            }
            if (sum < target)
                start++;
            else
                end--;
        }

        int i1 = -1, i2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i1 == -1) {
                if (Cnums[num1] == nums[i] && i2 != i)
                    i1 = i;
            }
            if (i2 == -1) {
                if (Cnums[num2] == nums[i] && i1 != i)
                    i2 = i;
            }
        }
        int[] ans = { i1, i2 };
        return ans;
    }


    
    // Optimize way usign HashMap
    public int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int more = target - nums[i];
            if (map.containsKey(more)) {
                return new int[] { map.get(more), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

}
