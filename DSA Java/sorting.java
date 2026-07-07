public class sorting {

    
    //Bubble Sort Algorithm
    public static void BubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // System.out.println(arr[j]);
                }
            }
        }
    }

    //Selection Sort
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


    //insertion sort
    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }


    //count sort
    public static void CountSort(int arr[]){
        
        int len = arr.length;
        
        //find max element
        int max = Integer.MIN_VALUE;
        for(int i=0; i<len; i++)
            if(max < arr[i])
                max = arr[i];
        
        //Caclulate Count of each element
        int counArr[] = new int[max+1];
        for(int i=0; i<len; i++)
            counArr[arr[i]] += 1;
        

        //sort array 
        int index = 0;
        for(int i=0; i<max+1; i++)
            while(counArr[i] > 0){
                arr[index] = i;
                counArr[i]--;
                index++;
            }
    }


    //conqure both the array while mergin
    public static void conqure(int arr[], int start, int end, int mid){
        int p1 = start, p2 = mid+1;
        int k = 0;
        int temp[] = new int[end-start+1];
        // {34, 57, 67, 12, 23, 45};

        while(p1<=mid && p2<=end){
            if(arr[p1] <= arr[p2]){
                temp[k++] = arr[p1++];
            }
            else{
                temp[k++] = arr[p2++];
            }
        }

        while(p1<=mid){
            temp[k++] = arr[p1++];
        }

        while(p2<=end){
            temp[k++] = arr[p2++];
        }

        k = 0;
        for(int i=start; i<=end; i++){
            arr[i] = temp[k++];
        }
    }

    //merge sort
    public static void Merge(int arr[], int start, int end){
        if(start>=end)
            return;

        // start = 0 mid = 2
        // start = 0 mid = 
        // {12, 23, 34, 45, 57, 67};

        int mid= start + (end-start)/2;
        Merge(arr, start, mid);
        Merge(arr, mid+1, end);
        conqure(arr, start, end, mid);
    }

    //partition of array by making pivot as first index
    public static int partition(int arr[], int start, int end){

        int i = end+1, pivot = arr[start];
        for(int j=end; j>start; j--){

            if(arr[j] > pivot){
                i-=1;
                int temp= arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        arr[start] = arr[i-1];
        arr[i-1] = pivot;

        return i-1;
    }

    //Quick Sort
    public static void QuickSort(int arr[], int start, int end){
        if(start>=end)
            return;
        
        int pi = partition(arr, start, end);

        QuickSort(arr, start, pi-1);
        QuickSort(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int arr[] = {34, 57, 67, 12, 23, 45};

        System.out.println("Before Sorting: ");
        for(int num: arr)
            System.out.print(num+" ");

        QuickSort(arr, 0, arr.length-1);

        System.out.println("\nAfter Sorting: ");
        for(int num: arr)
            System.out.print(num+" ");
    }

}
