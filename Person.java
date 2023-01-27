package project;
import java.util.Scanner; 

public class Person
{
    private String name;
    private int age;
    public int health;
    
    public Person()
    {
        this.health = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
    }
    
    public int attack(Weapon wp, Person otherPerson)
    {
        if(wp.getWeapon().equals("Baseball Bat"))
        {
            wp.use(otherPerson);
            if(checkHealth() == -1)
            {
                System.out.println("Your opponent has been defeated.");
                return -1;
            }
            return health;
        }
        else
        {
            int number = (int) ((Math.random() * 2) + 1);
            if(number == 2)
            {
                wp.use(otherPerson);
                if(checkHealth() == -1)
                {
                    System.out.println("Your opponent has been defeated.");
                    return -1;
                }
                return health;
            }
        }
        return health; 
    }

    public int checkHealth()
    {
        if(this.health == 0)
        {
            return -1;
        }
        else
        {
            return this.health;
        }
    }
}