/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author cmarquez7180
 */
public class Player {
    public static int startX = 7;
    public static int startY = 7;
    static String movement;    
    public Player(int a, int b){
        this.startX = a;
        this.startY = b;
        
    }

    public static int getStartX() {
        return startX;
    }

    public static int getStartY() {
        return startY;
    }

    public static String getMovement() {
        return movement;
    }

    public static void setStartX(int startX) {
        Player.startX = startX;
    }

    public static void setStartY(int startY) {
        Player.startY = startY;
    }

    public static void setMovement(String movement) {
        Player.movement = movement;
    }
    
}
