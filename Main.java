package project;

import java.util.ArrayList;
import java.util.Scanner; 


public class Main
{

    //public ArrayList<Weapon> weaponArrayList = new ArrayList<Weapon>();
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person();
        Person opponent = new Person();
        Weapon w1 = new Weapon("Baseball Bat", 10, "LOW");
        Weapon w2 = new Weapon("Pistol",20,"HIGH");

        System.out.println("Welcome to the Arena!\n you will be competing in a gladiator tournament. \n to do an action, enter the letter option you see\n when given a choice.");
        System.out.println("You will start the simulation with a baseball bat. \n The Baseball bat does 10 damage, but has a 2/3 chance of working.  \n You will also have a pistol. \nThe pistol does 20 damage, but has a 1/3 chance of working.");
        

        while(p1.health>= 0 && opponent.health >=0){

            System.out.println("There is a guy right in front of you that has intent to kill.");
            System.out.println("What will you do?");
            System.out.print("enter 'A' to run up to him, and try to attack, \n or enter 'B' to try to run away and dodge");
            String userChoice = scan.nextLine();
            while(userChoice != "A" || userChoice != "B"){
                System.out.println("That's not one of the choices. Reenter.");
                System.out.print("enter 'A' to run up to him, and try to attack, \n or enter 'B' to try to run away and dodge");
                String userChoiceEvent = scan.nextLine();
            }
            if(userChoice == "A"){
                System.out.println("pick a weapon to attack with.\n  Enter either 'BB' to use baseball bat, or \n 'P'to use pistol.");
                String weaponchoice = scan.nextLine();
                if(weaponchoice == "BB")
                {
                    p1.attack(w1, opponent);
                    int tempUserValue = p1.health;
                opponent.attack(w2, p1);
                if (opponent.health<tempUserValue){
                    System.out.println("Your opponent lost health. Current Health:" + opponent.health );
                }else{
                    System.out.println("You haven't lost any health. Try another attack.");
                }
                }
                else
                {
                    p1.attack(w2,opponent);
                    int tempUserValue = p1.health;
                opponent.attack(w2, p1);
                if (opponent.health<tempUserValue){
                    System.out.println("You lost health. Current Health:" + opponent.health );
                }else{
                    System.out.println("You haven't lost any health. Try another attack.");
                }
                    
                }
            }
            else//if the bot attacks
            {
                int tempUserValue = p1.health;
                opponent.attack(w2, p1);
                if (p1.health<tempUserValue){
                    System.out.println("You lost health. Current Health:" + p1.health );
                }else{
                    System.out.println("You haven't lost any health. Try another attack.");

                }
    
            }
    

        }
        if(opponent.health <=0){
            System.out.println("Congrats, you've beat the enemy!\n You win!");           
        }
        else{
            System.out.println("you've lost the game. Try again.   :("); 
        }
        
    }
}