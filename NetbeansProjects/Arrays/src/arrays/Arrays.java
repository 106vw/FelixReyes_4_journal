package arrays;

import java.util.Scanner;       // these are the imports for example I am trying to get beer and i ask for it but they diont have it they need to impoort it  
import java.util.Random;
//import java.util.Music;

public class Arrays {

    public static boolean letsplay = true;
    static String movement;      // these things will allow me to type the movement of my @ symbol
    static Random randomNumber = new Random();
    public static int startX = 7;
    public static int startY = 7;
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
  //  public static Music gigap;
    //startX = randomNumber.nextInt(8)+1;
    //startY = randomNumber.nextInt(8)+1;
    //estartX= randomNumber.nextInt(8)+1;
    //estartY= randomNumber.nextInt(8)+1;
    //eOnestartX= randomNumber.nextInt(8)+1;
    //eOnestartY= randomNumber.nextInt(8)+1;
    //movingEX= randomNumber.nextInt(9)+1;
    //movingEY= randomNumber.nextInt(9)+1;

    public static void main(String[] args) {
        while (letsplay) {      //this while loop is what keeps the game going
            Board();        //this makes the static board part at the bottom run its like the checklist
            Move();
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
        board[startX][startY] = '@';
        board[estartX][estartY] = '*';
        board[eOnestartX][eOnestartY] = '*';
        board[movingEX][movingEY] = '0';
        board[winX][winY] = '$';

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

        if (startX == estartX && startY == estartY || startX == eOnestartX && startY == eOnestartY || startX == movingEX && startY == movingEY) {
            System.out.println("You lost, would you like to conitnue?");
            Scanner choice = new Scanner(System.in);
            choiceOne = choice.nextLine().trim().toLowerCase();
           // lose = true;
            //while (!lose) {       //the exclamation oint says not to keep going  
                if (choiceOne.contains("y")) {

                    startX = 7;
                    startY = 7;
                    Board();
                }

                if (choiceOne.contains("n")) {
                    System.out.println("Bye");
                    System.exit(0);
                }
        }
                if (startX == winX && startY == winY) {
                    System.out.println("You have won, would you like to continue to the next level?");
                    Scanner choiceq = new Scanner(System.in);
                    choiceTwo = choiceq.nextLine().trim().toLowerCase();
                    if (choiceTwo.contains("y")) {
                        Board();
                    }
                    if (choiceTwo.contains("n")) {
                        System.out.println("Bye");
                        System.exit(0);
                    }

                }
         //   }

            System.out.println("To move the '@' symbol you must type 'N' to go up 'S' to go down 'E' to go right 'W' to go left or 'NE' to up and left, 'NW' to go up and right 'SW' to go down and left, 'SE' to go down and left");
            Scanner compass = new Scanner(System.in);
            movement = compass.nextLine().trim().toLowerCase(); // this mobvement thing is being told that it works for compass

            if (movement.contains("n") && movement.contains("e")) {
                startX--;
                startY++;
                Board();
                Move();
            } else if (movement.contains("n") && movement.contains("w")) {      // diagonal movement till line 56 - 75
                startX--;
                startY--;
                Board();
                Move();
            } else if (movement.contains("s") && movement.contains("e")) {      // the && is like saying "is the person typing types S and E" but its just in java  
                startX++;
                startY++;
                Board();
                Move();
            } else if (movement.contains("s") && movement.contains("w")) {
                startY++;
                startY--;
                Board();
                Move();
            } else if (movement.contains("n")) {
                startX--;
                Board();
                Move();
            } else if (movement.contains("s")) {
                startX++;
                Board();
                Move();
            } else if (movement.contains("e")) {
                startY++;
                Board();
                Move();
            } else if (movement.contains("w")) {
                startY--;
                Board();
                Move();
            } else {
                System.out.println("Type only what I say or I will find and I will exterminate you");
                Board();
                Move();
            }

        }
    }
//}
