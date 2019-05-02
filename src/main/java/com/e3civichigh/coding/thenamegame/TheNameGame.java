package com.e3civichigh.coding.thenamegame;

public class TheNameGame {
    public static void main(String[] args) {
        String name = "Martin"; // TODO 1 Change this to your name

        TheNameGame game = new TheNameGame();
        String song = game.createSong(name);
        System.out.println(song);
    }

    @SuppressWarnings("WeakerAccess")
    public String createSong(String name) {
        String sep = ", ";
        String b = "b";
        String x = name;
        String y = name.substring(1);

        // TODO 2 Create the name game song from the parameter name

        char letter = name.toLowerCase().charAt(0);
        if ("aeiou".indexOf(letter) > -1){
            y = name.toLowerCase();
        } else if (letter == 'b'){
            b = "";
        }

        String song = x + sep + x + sep + "bo-b" + y + "\n";
        song = song + "Banana-fana fo-f" + y + "\n";
        song = song + "Fee-fi-mo-" + y + "\n";
        song = song + x +"!" + "\n";
        return song;
    }
}
