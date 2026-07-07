public class binarySearch {

    public static int BinarySearch(int arr[], int key){
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = l+ (r-l)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] < key)
                l = mid+1;
            else
                r = mid-1; 
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9,12,15,18,20};

        int val = BinarySearch(arr,2);
        System.out.println(val);
    }
}