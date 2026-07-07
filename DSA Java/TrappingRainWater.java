
public class TrappingRainWater {

    public static void trap(int height[]){
        int size = height.length;
        int right[]=new int[size], left[]=new int[size];
        right[0] = height[0];
        left[size-1] = height[size-1];
        for(int i=1; i<size; i++)
            right[i] = Math.max(right[i-1], height[i]);

        for(int i=size-2; i>=0; i--)
            left[i] = Math.max(height[i], left[i+1]);

        int sum = 0;
        for(int i=0; i<size; i++){
            int trap = Math.min(right[i],left[i]) - height[i];
            if(trap>0)
                sum+=trap;
        }
        System.out.println(sum);

    }


    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};

        trap(height);

    }
    
    
}
