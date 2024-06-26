/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author Student
 */
public class PalindromeManager implements PalindroneChecker{

    @Override
    public String wordChecker(String word)
    {

        int length = word.length();
        String reversed = "";
       for(int i = length-1;i >=0 ;--i)
       {
           char c = word.charAt(i);
           reversed=reversed+(c);
       }
       
       return reversed;
    }

    @Override
    public String validPalendrone(String word, String reversed) {
         String outCome ="";
         
         if(word.toLowerCase().equals(reversed.toLowerCase()))
       {
            outCome = "It is a palendrone";
       }else
       {
           outCome = "It is not a palendrone";
       }
         
         return outCome;
    }

    @Override
    public int numOfPalendrome(String word, String reversed)
    {
       int count =0;
       
       if(word.toLowerCase().equals(reversed.toLowerCase()))
       {
            count++;
       }
       return count; 
    }
    
}
