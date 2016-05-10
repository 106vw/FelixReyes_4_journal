package arrays;

import java.util.Scanner;       // these are the imports for example I am trying to get beer and i ask for it but they diont have it they need to impoort it  

public class Arrays {

    static String movement;      // these things will allow me to type the movement of my @ symbol
    public static int startX = 5;
    public static int startY = 5;
    public static boolean letsplay = true;

    public static void main(String[] args) {
        while (letsplay) {   //this while loop is what keeps the game going 
            board();        //this makes the static board part at the bottom run its like the checklist
            move();
        }
    }

    static void board() { //this is the board that is mentioned in the main, this part of the code displays the little dots in the blue box at the bottom
        char[][] board = new char[10][10];
        board[0][0] = '.';
        board[1][1] = '.';
        board[2][2] = '.';
        board[3][3] = '.';
        board[4][4] = '.';
        board[5][5] = '.';
        board[6][6] = '.';
        board[7][7] = '.';
        board[8][8] = '.';
        board[9][9] = '.';
        board[startX][startY] = '@';
        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != '@') {
                        System.out.print(".");
                    } else {
                        System.out.print(board[i][j]);
                    }
                } else {
                    if (board[i][j] != 'x') {
                        System.out.println(".");
                    } else {
                        System.out.println(board[i][j]);
                    }
                }
            }
        }
    }

    static void move() {
        System.out.println("To move the '@' symbol you must type 'N' to go up 'S' to go down 'E' to go right 'W' to go left");

        Scanner compass = new Scanner(System.in);
        movement = compass.nextLine().trim().toLowerCase(); // this mobvement thing is being told that it works for compass
        if (movement.contains("n") && movement.contains("e")) {
            startX--;
            startY++;
            board();
            move();
        } else if (movement.contains("n") && movement.contains("w")) {      // diagonal movement till line 56 - 75
            startX--;
            startY--;
            board();
            move();
        } else if (movement.contains("s") && movement.contains("e")) {      // the && is like saying "is the person typing types S and E" but its just in java  
            startY++;
            startX++;
            board();
            move();
        } else if (movement.contains("s") && movement.contains("w")) {
            startY++;
            startY--;
            board();
            move();
        } else if (movement.contains("n")) {
            startX--;
            board();
            move();
        } else if (movement.contains("s")) {
            startX++;
            board();
            move();
        } else if (movement.contains("e")) {
            startY++;
            board();
            move();
        } else if (movement.contains("w")) {
            startY--;
            board();
            move();
        } else {
            System.out.println("Type only what I say or I will find and I will exterminate you");
        }

    }

}