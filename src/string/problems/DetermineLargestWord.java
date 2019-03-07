package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class DetermineLargestWord {
   // public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
//        String s="Human brain is a biological learning machine";
//        Map<Integer, String> wordNLength = findTheLargestWord(s);
//        //implement


        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String s1= sc.nextLine();

            String s="Human brain is a biological learning machine";
            System.out.println("The longest world in the given sentence "+lengthiestString(s));




        }


    public static String lengthiestString(String s1) {
        int max=0;
        String s2=new String();
        StringTokenizer t=new StringTokenizer(s1," ");
        while(t.hasMoreTokens()){
            String s3=t.nextToken();
            int n=s3.length();
            if(n>max){
                max=n;
                s2=s3;}
        }
        return s2;
    }


   // public static Map<Integer, String> findTheLargestWord(String wordGiven){


//        Map<Integer, String> map = new HashMap<Integer, String>();
//        String st = "";
//        //implement
//
//        return map;
    }
