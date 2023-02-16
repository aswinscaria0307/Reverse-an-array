package com.jap;

import java.util.Arrays;

public class ReverseArrayDemo {


    public static void main(String[] args) {

        ReverseArrayDemo obj=new ReverseArrayDemo();
        int[] array={23,34,43,56,67,78,43,35};
        int[] rev=obj.getReverseArray(array);
        System.out.println("reverse array: "+ Arrays.toString(rev));
    }
    public int[] getReverseArray(int [] array){
            int[] reverse=new int[array.length];
            int j=0;
            for(int i= array.length-1;i>=0;i--){
                reverse[j]=array[i];
                j++;
                }
            return reverse;
            }


    }

