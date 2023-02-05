package com.injin.me.effectivejava.chapter03.item20.me;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    private void start() {
        System.out.println("Common Beginnings");
    }

    public final void play() {
        start();
        initialize();
        startPlay();
        endPlay();
    }

    public static void main(String[] args) {
        /* Common Beginnings
           Football Game Initialized! Start playing.
           Football Game Started. Enjoy the game!
           Football Game Finished!*/
        Football football = new Football();
        football.play();
    }
}

class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}

class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }
    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}

