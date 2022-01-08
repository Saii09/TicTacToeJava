package com.tictac;

public class clearScreen {
    public static void clrscr(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}