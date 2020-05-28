/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author andrewbrennan
 */
public class OverlappingRectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the first rectangle ");
        int width1 = input.nextInt();
        System.out.println("Enter the height of the first rectangle ");
        int height1 = input.nextInt();
        System.out.println("Enter the x coordinate of center 1 ");
        int x1 = input.nextInt();
        System.out.println("Enter the y coordinate of center 1 ");
        int y1 = input.nextInt();
        System.out.println("Enter the width of the second rectangle ");
        int width2 = input.nextInt();
        System.out.println("Enter the height of the second rectangle ");
        int height2 = input.nextInt();
        System.out.println("Enter the x coordinate of center 2 ");
        int x2 = input.nextInt();
        System.out.println("Enter the y coordinate of center 2 ");
        int y2 = input.nextInt();
        if(width2 < width1 && height2 <height1){
            if(x2<= x1 + width1/2 && x2 >= x1-width1/2){
                if(y2<= y1 + height1/2 && y2 >= y1-height1/2){
                    System.out.println("Rectangle 1 contains Rectangle 2");
                }else{
                    System.out.println("Rectangle 1 does not contain Rectangle 2");
                }
            }else{
                System.out.println("Rectangle 1 does not contain Rectangle 2");
            }
        }else{
            System.out.println("Rectangle 1 does not contain Rectangle 2");
        }
    }
    
}
