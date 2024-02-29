package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Game;

public class MinesweeperGamev3 extends Game {
    private static final int SIDE = 9;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
}