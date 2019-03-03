package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

// function to calculate Smallresult between two arrays
static int findSmallestDifference(int array1[], int array2[], int m, int n){
    Arrays.sort(array1); // sorting both arrays
    Arrays.sort(array2);

    int a = 0, b = 0;
    int min = Integer.MAX_VALUE;

    while (a < m && b < n){
        if (Math.abs(array1[a] - array2[b]) < min)
            min = Math.abs(array1[a] - array2[b]);
            if (array1[a] < array2[b])
                a++;

            else
                b++;
    }
    return min;
}

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int m = array1.length;
        int n = array2.length;

                // Call function to
                // print smallest result

        System.out.println("The smallest difference between Array1 and Array2 is: "+findSmallestDifference(array1, array2, m, n));

        System.out.print("Array1 after sorted: ");
        for( int i=0; i<n; i++){
            System.out.print(array1[i]+",");
        }
        System.out.println();
        System.out.print("Array2 after sorted:  ");
        for( int j=0; j<n; j++) {
            System.out.print(array2[j] + ",");
        }
    }
}




