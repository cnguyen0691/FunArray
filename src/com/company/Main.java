package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       ArrayList<String> colors = new ArrayList<String>();

       //Add at least 3 colors (string) to the array list and print out all its values.
       colors.add ("Red");
        colors.add ("Green");
        colors.add ("Orange");
        colors.add ("White");
        colors.add ("Black");
        colors.add ("Yellow");

       System.out.println("Colors: " + colors);

       //Using the array list created above, print out the value at index 1.
       System.out.println("Colors: " + colors.get(1));

       //Using the array list above, prompt the user for one new color,
        // and add that color to the array list.
        Scanner color = new Scanner(System.in);
        System.out.println("Add color: ");
        String newColor = color.nextLine();
        colors.add(newColor);
        System.out.println("Colors: "+colors);


        //Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
        // Each time the user enters a color, add that to the array list. Print out the list at the end.
       


    }
  }



