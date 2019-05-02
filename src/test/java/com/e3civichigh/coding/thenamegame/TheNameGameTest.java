package com.e3civichigh.coding.thenamegame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheNameGameTest {

    @Test
    public void createSong() {
        String name = "Stephen";
        TheNameGame game = new TheNameGame();
        String song = game.createSong(name);
        System.out.println(song);
    }
}