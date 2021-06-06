package base;

import java.util.Scanner;

public class app {

    public static void main(String[] args){


        int legaldrive = 16;
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age?");
        String input0 = in.nextLine();
        int i0 = Integer.parseInt(input0);

        if(i0>legaldrive){
            System.out.println("You are old enough to legally drive.");
        }

        else{
            System.out.println("You are not old enough to legally drive.");
        }









    }
}
