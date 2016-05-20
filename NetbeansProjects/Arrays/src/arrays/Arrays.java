package arrays;

import java.util.Scanner;       // these are the imports for example I am trying to get beer and i ask for it but they diont have it they need to impoort it  
import java.util.Random;

public class Arrays {

    public static boolean letsplay = true;
    static String movement;      // these things will allow me to type the movement of my @ symbol
    static Random randomNumber = new Random();
    //public static int startX = 7;
    //public static int startY = 7;
    public static int estartX = randomNumber.nextInt(8) + 1;          // the enemy cordinates
    public static int estartY = randomNumber.nextInt(8) + 1;
    public static int eOnestartX = randomNumber.nextInt(8) + 1;
    public static int eOnestartY = randomNumber.nextInt(8) + 1;
    public static int movingEX = randomNumber.nextInt(8) + 1;
    public static int movingEY = randomNumber.nextInt(8) + 1;
    static String choiceOne;
    static String choiceTwo;
    public static int winX = 1;
    public static int winY = 1;
    public static boolean lose;
    public static int eTwoStartX = randomNumber.nextInt(8) + 1;
    public static int eTwoStartY = randomNumber.nextInt(8) + 1;
    public static Player player; 

    public static void main(String[] args) {
        while (letsplay) {      //this while loop is what keeps the game going
            Board();        //this makes the static board part at the bottom run its like the checklist
            Move();
            player = new Player(7,7);
        }
    }

    static void Board() { //this is the board that is mentioned in the main, this part of the code displays the little dots in the blue box at the bottom
        char[][] board = new char[15][15];
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
        board[player.startX][player.startY] = '@';
        board[estartX][estartY] = '*';
        board[eOnestartX][eOnestartY] = '*';
        board[movingEX][movingEY] = '0';
        board[winX][winY] = '$';
        board[eTwoStartX][eTwoStartY] = '*';
        MovingEnemy();

        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
                    if (board[i][j] != '@' && board[i][j] != '*' && board[i][j] != '0' && board[i][j] != '$') {
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

    static void Move() {

        if (player.startX == estartX && player.startY == estartY || player.startX == eOnestartX && player.startY == eOnestartY || player.startX == movingEX && player.startY == movingEY || player.startX == eTwoStartX && player.startY == eTwoStartY) {
            System.out.println("You lost, would you like to conitnue?");
            Scanner choice = new Scanner(System.in);
            choiceOne = choice.nextLine().trim().toLowerCase();

            if (choiceOne.contains("y")) {

                player.startX = 7;
                player.startY = 7;
                estartX = randomNumber.nextInt(5) + 1;          // the enemy cordinates
                estartY = randomNumber.nextInt(8) + 1;
                eOnestartX = randomNumber.nextInt(3) + 1;
                eOnestartY = randomNumber.nextInt(8) + 1;
                movingEX = randomNumber.nextInt(7) + 1;
                movingEY = randomNumber.nextInt(8) + 1;
                eTwoStartX = randomNumber.nextInt(1) + 1;
                eTwoStartY = randomNumber.nextInt(8) + 1;
                Board();
            }

            if (choiceOne.contains("n")) {
                System.out.println(
                        "/******   /**    **  /********\n"
                        + "/*////**  //**  **   /**///// \n"
                        + "/*   /**   //****    /**      \n"
                        + "/******     //**     /******* \n"
                        + "/*//// **    /**     /**////  \n"
                        + "/*    /**    /**     /**      \n"
                        + "/*******     /**     /********\n"
                        + "///////      //      //////// ");
                System.exit(0);
            }
        }
        if (player.startX == winX && player.startY == winY) {
            System.out.println("+--- 3-d\n"
                    + "\n"
                    + " **    **                                              \n"
                    + "//**  **                                               \n"
                    + " //****    ******  **   ** ***     **  ******  ******* \n"
                    + "  //**    **////**/**  /**//**  * /** **////**//**///**\n"
                    + "   /**   /**   /**/**  /** /** ***/**/**   /** /**  /**\n"
                    + "   /**   /**   /**/**  /** /****/****/**   /** /**  /**\n"
                    + "   /**   //****** //****** ***/ ///**//******  ***  /**\n"
                    + "   //     //////   ////// ///    ///  //////  ///   // ");
            Scanner choiceq = new Scanner(System.in);
            choiceTwo = choiceq.nextLine().trim().toLowerCase();
            if (choiceTwo.contains("y")) {
                player.startX = 7;
                player.startY = 7;
                estartX = randomNumber.nextInt(5) + 1;          // the enemy cordinates
                estartY = randomNumber.nextInt(8) + 1;
                eOnestartX = randomNumber.nextInt(3) + 1;
                eOnestartY = randomNumber.nextInt(8) + 1;
                movingEX = randomNumber.nextInt(7) + 1;
                movingEY = randomNumber.nextInt(8) + 1;
                eTwoStartX = randomNumber.nextInt(1) + 1;
                eTwoStartY = randomNumber.nextInt(8) + 1;
                Board();
            }
            if (choiceTwo.contains("n")) {
                System.out.println("Bye");
                System.exit(0);
            }

        }

        System.out.println("To move the '@' symbol you must type 'N' to go up 'S' to go down 'E' to go right 'W' to go left or 'NE' to up and left, 'NW' to go up and right 'SW' to go down and left, 'SE' to go down and left");
        Scanner compass = new Scanner(System.in);
        movement = compass.nextLine().trim().toLowerCase(); // this mobvement thing is being told that it works for compass

        if (movement.contains("n") && movement.contains("e")) {
            player.startX--;
            player.startY++;
            Board();
            Move();
        } else if (movement.contains("n") && movement.contains("w")) {      // diagonal movement till line 56 - 75
            player.startX--;
            player.startY--;
            Board();
            Move();
        } else if (movement.contains("s") && movement.contains("e")) {      // the && is like saying "is the person typing types S and E" but its just in java  
            player.startX++;
            player.startY++;
            Board();
            Move();
        } else if (movement.contains("s") && movement.contains("w")) {
            player.startY++;
            player.startY--;
            Board();
            Move();
        } else if (movement.contains("n")) {
            player.startX--;
            Board();
            Move();
        } else if (movement.contains("s")) {
            player.startX++;
            Board();
            Move();
        } else if (movement.contains("e")) {
            player.startY++;
            Board();
            Move();
        } else if (movement.contains("w")) {
            player.startY--;
            Board();
            Move();
        } else {
            System.out.println("Type only what I say or I will find and I will exterminate you");
            Board();
            Move();
        }

    }

    static void MovingEnemy() {
        if (movingEX == estartX && movingEY == estartY || movingEX == eOnestartX && movingEY == eOnestartY || movingEX == eTwoStartX && movingEY == eTwoStartY) {

            movingEX = randomNumber.nextInt(8) + 1;
            movingEY = randomNumber.nextInt(8) + 1;
            Board();
        }
        if (player.startX > movingEX) {      // this is the code where the enemy moves
            movingEX++;
        }
        if (player.startX < movingEX) {
            movingEX--;
        }
        if (player.startY > movingEY) {
            movingEY++;
        }
        if (player.startY < movingEY) {
            movingEY--;
        }
    }
}
