package com.LongestIncresing;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
public class LargestSubsequent 
{
    public static void main(String[] args) 
    
    {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("Your Given Arrays");
    	 int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
         List<Integer> list = new ArrayList<Integer>();
          for (int i = 0; i < arr.length; i++) 
          {
            int j = 0;
            boolean elementUpdate = false;
            for (; j < list.size(); j++) 
            {
                if (list.get(j) > arr[i]) 
                {
                    list.add(j, arr[i]);
                    list.remove(j + 1);
                    elementUpdate = true;
                    break;
                }
            }
            if (!elementUpdate) 
            {
                list.add(j, arr[i]);
            }
        }
        //System.out.println("Longest Increasing Subsequence" + list);
    }


}
