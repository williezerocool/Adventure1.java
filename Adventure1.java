/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure1;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Adventure1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String usersString;
        
        System.out.print("Hello, welcome to Game Of Thrones\n Pick a animal:\n 1. Dragon\n 2. Lion\n 3. Wolf\n 4. Deer \n");
        usersString = keyboard.next();
        
        if("dragon".equals(usersString)){
            System.out.println("you are in the Targaryen family and you have dragon blood flowing through you");
            System.out.print("Your family was killed and the Iron Throne was stolen! Do you want to fight for it back? yes or no\n");
            usersString = keyboard.next();
            if("yes".equals(usersString)){
                System.out.println("The mother of Dragons is the stronest Targaryen at the time. She has 3 fire spitting dragons, wealth, and a army of 10,000 killers");
                System.out.print("Do you want to go follow her or make a run for the throne on your own? follow or lead\n");
                usersString = keyboard.next();
                if("follow".equals(usersString)){
                    System.out.println("Your choice was wise! She has a great chance of winning back the Iron Throne, but a true Taragaryen could never choose to FOLLOW");
                }else{
                    System.out.println("Spoken like a true Targaryen, may you take your place on the Iron Throne.");
                }
            }else{
                System.out.println("your road ends here");
            }
        }else if("lion".equals(usersString)){
            System.out.println("you are in the Lannister family and you are in the most powerful family in all 7 kingdoms");
            System.out.print("The mother of dragons is coming, do you want to attack her 1st? yes or no\n");
            usersString = keyboard.next();
            if("yes".equals(usersString)){
                System.out.println("You'll have to kill her dragons");
                System.out.print("Do you want to follow Jammie in this war or lead? follow or lead\n");
                usersString = keyboard.next();
                if("follow".equals(usersString)){
                    System.out.println("Jammie will die in this war but the Lannisters might win if you can get pass the dragons");
                }else{
                    System.out.println("Lead Well or kill thousands");
                }
            }else{
                System.out.println("You'll have to deal with her sooner or later!");
            }
        }else if("wolf".equals(usersString)){
            System.out.println("you are in the Stark family and you are the only family that understands winter");
            System.out.print("Winter is coming! should you get ready for it ? yes or no\n");
            usersString = keyboard.next();
            if("yes".equals(usersString)){
                System.out.println("White walkers will soon push through the wall");
                System.out.print("Will you follow jhon snow or lead? follow or lead\n");
                usersString = keyboard.next();
                if("follow".equals(usersString)){
                    System.out.println("Protect Jhon, when this war and the Stark name will live forever ");
                }else{
                    System.out.println("Maybe you should lead this to Jhon");
                }
            }else{
                System.out.println("YOU ARE NOT A STARK!");
            }
        }else if("deer".equals(usersString)){
            System.out.println("you are in the Baratheon family and your name sits on the Iron Throne");
            System.out.print("Do you think the king really has your blood? yes or no\n");
            usersString = keyboard.next();
            if("yes".equals(usersString)){
                System.out.println("He doesn't he's a fake!");
                System.out.print("Will you follow this fake or lead a rebellion against him? follow or lead\n");
                usersString = keyboard.next();
                if("follow".equals(usersString)){
                    System.out.println("SMH & you call yourself a Baratheon");
                }else{
                    System.out.println("May you take the Iron Throne");
                }
            }else{
                System.out.println("Go get the Iron Throne!");
            }
        }
        
    }
    
}
