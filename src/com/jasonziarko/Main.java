package com.jasonziarko;

public class Main {

    public static void main(String[] args) {

    calcFeetAndInchesToCentimeters(100, 12);



    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches)
    {
       if(feet >=0 && inches >=0 && inches <=12)
       {
           return 1;
       }
        else return -1;
    }
}
