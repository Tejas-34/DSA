public class reverseArray {

    public static void ReverseArray(int arr[]){
        int start=0, end= arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }


    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9,12,15,18,20};

        ReverseArray(arr);

        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
