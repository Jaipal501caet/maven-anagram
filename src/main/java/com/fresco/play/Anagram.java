package com.fresco.play;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram
{
    public static void main(String a[])
    {
      Scanner sc = new Scanner(System.in);
        String str1=null;
        String str2=null;

        // Write code to get 2 strings/sentences from command line and check if they are Anagrams
        System.out.println("Wanna check if your strings are anagrams???");
        System.out.print("Enter String1 : ");
        //Get user input in str1
        str1 = sc.nextLine();


        System.out.print("Enter String2 : ");
        //Get user input in str2
        str2 = sc.nextLine();
       
        boolean status = isAnagram(str1,str2);

         if (status) 
         {
            System.out.println("Whoa!!!! "+str1 + " is a perfect ANAGRAM of " + str2 );

        } 
         else 
         {
            System.out.println("Oh no!!! "+str1 + " and " + str2 + " do not match up to be Anagrams...");

         }

    }


     static boolean isAnagram(String in1, String in2) 
     {

        /*Compare if in1 and in2 are Anagrams and return true or false.
        This method should satisfy all the tests in AnagramTest.java*/
       String s1 = in1.replaceAll("\\s", "");
       String s2 = in2.replaceAll("\\s", "");
       boolean status = true;
       
       if(s1.length()!=s2.length())
       {
    	   status = false;
    	   return status;
       }
       else
       {
    	   char[] ArrayS1=s1.toLowerCase().toCharArray();
    	   char[] ArrayS2=s2.toLowerCase().toCharArray();
    	   
    	   Arrays.sort(ArrayS1);
    	   Arrays.sort(ArrayS2);
    	   
    	   status = Arrays.equals(ArrayS1, ArrayS2);
    	}
       if(status)
       {
    	   return true;
       }
       else
       {
    	   return false;
       }
       
   }

}
