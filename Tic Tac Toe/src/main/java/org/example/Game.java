/*
Class - Game
Purpose - Control gameplay functions
Author - Michael Wegner
 */

package org.example;

public class Game {
    private int row;
    private int col;
    private final int player_index;

    public Game(int player_index) {
        this.player_index = player_index;
        set_index();
    }

    private void set_index() {
        switch (player_index) {
            case 1:
                row = 0;
                col = 0;
                break;

            case 2:
                row = 0;
                col = 1;
                break;

            case 3:
                row = 0;
                col = 2;
                break;

            case 4:
                row = 1;
                col = 0;
                break;

            case 5:
                row = 1;
                col = 1;
                break;

            case 6:
                row = 1;
                col = 2;
                break;

            case 7:
                row = 2;
                col = 0;
                break;

            case 8:
                row = 2;
                col = 1;
                break;

            case 9:
                row = 2;
                col = 2;
                break;
        }
    }

    public int row_index(){
        return row;
    }

    public int col_index(){
        return col;
    }
}
