package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".



        String str1 = "c";
        String str2 = "c";

        if (str1.length()==str2.length()) {
            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));

            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.equals(arr1, arr2));

                if(arr1.equals(arr2)) {
                    System.out.println("Given strings are anagrams");
                }
                  else
                    {
                    System.out.println("Given strings are not anagrams");
                }
        }   else
            System.out.println("The two words do not have the same siz");

    }
}
