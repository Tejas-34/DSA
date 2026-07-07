public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};


        int size = prices.length;
        int[] rightMin = new int[size], leftMax = new int[size];

        rightMin[0] = prices[0];
        leftMax[size-1] = prices[size-1];
        for(int i=1; i<size; i++)
            rightMin[i] = Math.min(rightMin[i-1], prices[i]);
        
        for(int i=size-2; i>=0; i--)
            leftMax[i] = Math.max(leftMax[i+1], prices[i]);
        
        int maxPrice = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            int curr = leftMax[i] - rightMin[i];
            maxPrice = Math.max(maxPrice,curr);
        }

        System.out.println(maxPrice);


    }
}
