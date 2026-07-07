    import java.util.*;
    
    public class SubArraySum {

        public static int[] PrefixSumArr(int arr[]){
            int PrefixArr[] = new int[arr.length];
            PrefixArr[0] = arr[0];
            for(int i=1; i<arr.length; i++)
                PrefixArr[i] = PrefixArr[i-1] + arr[i];

            for(int num: PrefixArr){
                System.out.print(num+" ");
            }
            return PrefixArr;
        }

        // Brute Force Approach to find maximum subarray sum
        // Time Complexity: O(n^3)
        // Space Complexity: O(1)
        public static void BruteForcemaxSubArraySum(int arr[]){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++){
                for(int j=i; j<arr.length; j++){
                    int sum = 0;
                    for(int k=i; k<=j; k++){
                        System.out.print(arr[k]+" ");
                        sum+=arr[k];
                    }
                    System.out.println("\tSUM:  "+ sum);
                    if(max<sum)
                        max = sum;
                    if(min>sum)
                        min = sum;
                    
                }
                System.out.println();

            }

            System.out.println("MINIMUM SUM: "+ min);
            System.out.println("MAXIMUM SUM: "+ max);
        }


        // Prefix Sum Approach to find maximum subarray sum 
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        // This is the optimized way to find maximum subarray sum
        public static void PrefixSumMaxSubArray(int arr[]){
            int max = Integer.MIN_VALUE;
            int PrefixArr[] = PrefixSumArr(arr);
            for(int i=0; i<arr.length; i++){
                for(int j=i; j<arr.length; j++){
                    int sum;
                    if(i==0)
                        sum =PrefixArr[j];
                    else
                        sum = PrefixArr[j] - PrefixArr[i-1];

                    if(max<sum)
                        max=sum;
                }
            }

            System.out.println("MAX SUM: "+ max);
        }


        // ----
        //Kaddan's Algorithm to find maximum subarray sum
        //------
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // This is the most optimized way to find maximum subarray sum
        public static void KaddansSummaxSubArray(int arr[]){

            int n = arr.length;
            int sum = 0;
            int ms = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                sum += arr[i];
                if(sum<0)
                    sum = 0;
                ms = Math.max(ms,sum);
            }
            System.out.println(ms);
        }


        public static void main(String[] args) {
            int arr[] = {1,-2,6,-1,3};

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            KaddansSummaxSubArray(arr);
            

        }
    }



class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = triangle.get(0).get(0);
        int n = triangle.size();
        if(n==1) return result;

        int i=0, j=0;
        while(i<n){
            if(j<triangle.get(i).size()-1 && triangle.get(i).get(j+1) < triangle.get(i).get(j))
                j = j+1;
            result += triangle.get(i).get(j);
            i++;
        }

        return result;
    }
}