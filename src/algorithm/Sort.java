package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
 /***********************************************************************************************/


    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        //implement here
        int j;
        for(int i=1; i<array.length ;i++) {
            j=i-1;
            int pass = array[i];
            while (j>=0 && array[j] > pass) {
                array[j+1] = array[j];
                j=j-1;
	    		}
            array[j+1] = pass;

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /******************************************************************************************************************************/

    public int[] bubbleSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here

        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    /************************************************************************************************************************************/

    public int [] merge(int [] array, int l, int m, int r){
        int [] list = array;

        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        //void merge(int arr[]){
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;
            /* Create temp arrays */
            int L[] = new int [n1];
            int R[] = new int [n2];
            /*Copy data to temp arrays*/
            for (int i=0; i<n1; ++i)
                L[i] = array[l + i];
            for (int j=0; j<n2; ++j)
                R[j] = array[m + 1+ j];
            /* Merge the temp arrays */
            // Initial indexes of first and second subarrays
            int i = 0, j = 0;
            // Initial index of merged subarry array
            int k = l;
            while (i < n1 && j < n2)
            {
                if (L[i] <= R[j]){
                    array[k] = L[i];
                    i++;
                } else{
                    array[k] = R[j];
                    j++;
                } k++;
            }

            /* Copy remaining elements of L[] if any */
            while (i < n1){
                array[k] = L[i];
                i++;
                k++;
            }
            /* Copy remaining elements of R[] if any */
            while (j < n2){
                array[k] = R[j];
                j++;
                k++;
            }
            return list;
        }
        // Main function that sorts arr[l..r] using
        // merge()
        void  mergeSort(int array[], int l, int r){
            final long startTime = System.currentTimeMillis();
            int [] list = array;
            if (l < r) {
                // Find the middle point
                int m = (l+r)/2;
                // Sort first and second halves
                mergeSort(array, l, m);
                mergeSort(array , m+1, r);
                // Merge the sorted halves
                merge(array, l, m, r);
            }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        //return list;
    }
    

    /*************************************************************************************************************************************/

    public int [] quickSort(int [] array, int start, int end){
        int [] list = array;
        final long startTime = System.currentTimeMillis();

        int partition = partition(array, start, end);

        if(partition-1>start){
           quickSort(array, start, partition - 1);
        }
            if(partition+1<end) {
                quickSort(array, partition + 1, end);
            }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

        public static int partition(int[] array, int start, int end){
            int pivot = array[end];

            for(int i=start; i<end; i++){
                if(array[i]<pivot){
                    int temp= array[start];
                    array[start]=array[i];
                    array[i]=temp;
                    start++;
                }
            }

            int temp = array[start];
            array[start] = pivot;
            array[end] = temp;

            return start;
   }
     /***********************************************  Heap Sort ******************************************************/

    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

       // public void sort(int arrA[]) {
            int size = array.length;

            // Build heap
            for (int i = size / 2 - 1; i >= 0; i--)
                heapify(array, size, i);

            // One by one extract (Max) an element from heap and
            // replace it with the last element in the array
            for (int i=size-1; i>=0; i--) {

                //arrA[0] is a root of the heap and is the max element in heap
                int x = array[0];
                array[0] = array[i];
                array[i] = x;

                // call max heapify on the reduced heap
                heapify(array, i, 0);
            }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        }

        // To heapify a subtree with node i
        void heapify(int arrA[], int heapSize, int i) {
            int largest = i; // Initialize largest as root
            int leftChildIdx  = 2*i + 1; // left = 2*i + 1
            int rightChildIdx  = 2*i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (leftChildIdx  < heapSize && arrA[leftChildIdx ] > arrA[largest])
                largest = leftChildIdx ;

            // If right child is larger than largest so far
            if (rightChildIdx  < heapSize && arrA[rightChildIdx ] > arrA[largest])
                largest = rightChildIdx ;

            // If largest is not root
            if (largest != i) {
                int swap = arrA[i];
                arrA[i] = arrA[largest];
                arrA[largest] = swap;

                // Recursive call to  heapify the sub-tree
                heapify(arrA, heapSize, largest);
            }
        }


    /***********************************************  Bucket Sort ******************************************************/


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
