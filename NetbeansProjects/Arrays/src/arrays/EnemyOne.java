/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Random;
public class EnemyOne {
    static Random randomNumber = new Random();
    public static int estartX = randomNumber.nextInt(8) + 1;          // the enemy cordinates
    public static int estartY = randomNumber.nextInt(8) + 1;
    public EnemyOne(int a, int b){
        this.estartX = a;
        this.estartY = b;
        
    }

    public static Random getRandomNumber() {
        return randomNumber;
    }

    public static int getEstartX() {
        return estartX;
    }

    public static int getEstartY() {
        return estartY;
    }

    public static void setRandomNumber(Random randomNumber) {
        EnemyOne.randomNumber = randomNumber;
    }

    public static void setEstartX(int estartX) {
        EnemyOne.estartX = estartX;
    }

    public static void setEstartY(int estartY) {
        EnemyOne.estartY = estartY;
    }
    
}
