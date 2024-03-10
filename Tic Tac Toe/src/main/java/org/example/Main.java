/*
Class - Main
Purpose - Run all interactions with user
Author - Michael Wegner
 */

package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static boolean play;
    public static void main(String[] args) throws InputMismatchException {
        Player player = new Player();
        Board board = new Board();
        int count = 0;
        play = board.win();
        while(!play){
            System.out.println("Enter location of move: (1-9)");
            board.print_board();
            try{
                Scanner in = new Scanner(System.in);
                int move = in.nextInt();
                Game game = new Game(move);
                if(count % 2 != 0){
                    if(board.check_fill(game.row_index(), game.col_index())){
                        board.modify_board(game.row_index(), game.col_index(), player.getPlayer_one());
                        count++;
                    }else{
                        System.out.println("The location you selected is filled already, please try again");
                    }
                }else{
                    if(board.check_fill(game.row_index(), game.col_index())){
                        board.modify_board(game.row_index(), game.col_index(), player.getPlayer_two());
                        count++;
                    }else{
                        System.out.println("The location you selected is filled already, please try again");
                    }
                }
                board.print_board();
                play = board.win();
            }catch (InputMismatchException e){
                System.out.println("Please enter an Integer (1-9)");
            }
        }
        System.out.println("Congrats you win!");
    }
}