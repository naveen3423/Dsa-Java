package com.java.dsa;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LeapYear {
    public static void main(String[] args){
        LeapYear leap = new LeapYear();
        System.out.println(leap.leapyear(2100));
    }
    private String leapyear(int year){
        String y="common year";
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    y="Leap year";
                }
                else{
                    y="Common year";
                }

            }else
            {
                y="Leap year";
            }
        }
            else{

            y="Common year";
            }
        return y;
    }
}
