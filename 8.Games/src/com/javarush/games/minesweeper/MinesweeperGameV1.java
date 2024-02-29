package com.javarush.games.minesweeper;

//import com.javarush.engine.cell.Color;
//import com.javarush.engine.cell.Game;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class MinesweeperGameV1 extends Game {
    @Override
    public void initialize() {
        //  Тут выполняем все действия по инициализации игры и ее объектов
        setScreenSize(9, 9);
        showGrid(true);
        setCellColor(0, 0, Color.RED);
        setCellColor(3, 6, Color.BLACK);
        setCellColor(6, 8, Color.NONE);


        Color myColor = getCellColor(2, 0);


        setCellValue(3, 3, "text");
        setCellValue(0, 8, "W");
        setCellValue(4, 1, "2222");
        setCellValue(6, 6, "");


        String s = getCellValue(3, 3);
        System.out.println(getCellValue(4, 1));


        setCellTextSize(2 , 0, 70);


        int size = getCellTextSize(2 , 0);



        int size2 = getCellTextSize(2 , 0);



        int i = getCellNumber(3, 3);
        System.out.println(getCellNumber(4, 1));

        Color cellColor = Color.values()[10];
        Color textColor = Color.values()[15];

        showMessageDialog(cellColor, "hi", textColor, 12);
    }
}
