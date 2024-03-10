/*
Class - Board
Purpose - Control game board function
Author - Michael Wegner
 */

package org.example;

import java.util.ArrayList;

public class Board {
private final ArrayList<ArrayList<Character>> game_board = new ArrayList<>();

    public Board(){
        make_board();
        set_board();
    }

    private void make_board(){
        for (int i = 0; i < 3; i++) {
            game_board.add(new ArrayList<>()); // Each row is an ArrayList
        }
    }

    private void set_board(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game_board.get(i).add('-'); // Add elements to each row
            }
        }
    }

    public void modify_board(int row_index, int column_index, Character player_code){
        game_board.get(row_index).set(column_index, player_code);
    }

    public void print_board(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(game_board.get(i).get(j) + " "); // Print each element
            }
            System.out.println(); // Move to the next row
        }
    }

    public boolean check_fill(int row_index, int column_index){
        return game_board.get(row_index).get(column_index).equals('-');
    }

    public boolean win(){
        return check_row() || check_col() || check_cross();
    }

    private boolean check_row(){
        if(!game_board.get(0).get(0).equals('-')){
            return game_board.get(0).get(0).equals(game_board.get(0).get(1)) &&
                    game_board.get(0).get(0).equals(game_board.get(0).get(2));
        }else if(!game_board.get(1).get(0).equals('-')){
            return game_board.get(1).get(0).equals(game_board.get(1).get(1)) &&
                    game_board.get(1).get(0).equals(game_board.get(1).get(2));

        }else if(!game_board.get(2).get(0).equals('-')){
            return game_board.get(2).get(0).equals(game_board.get(2).get(1)) &&
                    game_board.get(2).get(0).equals(game_board.get(2).get(2));
        }
        return false;
    }

    private boolean check_col(){
        if(!game_board.get(0).get(0).equals('-')){
            return game_board.get(0).get(0).equals(game_board.get(1).get(0)) &&
                    game_board.get(0).get(0).equals(game_board.get(2).get(0));
        }else if(!game_board.get(0).get(1).equals('-')){
            return game_board.get(0).get(1).equals(game_board.get(1).get(1)) &&
                    game_board.get(0).get(1).equals(game_board.get(2).get(1));

        }else if(!game_board.get(0).get(2).equals('-')){
            return game_board.get(0).get(2).equals(game_board.get(1).get(2)) &&
                    game_board.get(0).get(2).equals(game_board.get(2).get(2));
        }
        return false;
    }

    private boolean check_cross(){
        if(!game_board.get(0).get(0).equals('-')){
            return game_board.get(0).get(0).equals(game_board.get(1).get(1)) &&
                    game_board.get(0).get(0).equals(game_board.get(2).get(2));
        }else if(!game_board.get(0).get(2).equals('-')){
            return game_board.get(0).get(2).equals(game_board.get(1).get(1)) &&
                    game_board.get(0).get(2).equals(game_board.get(2).get(0));
        }
        return false;
    }
}
