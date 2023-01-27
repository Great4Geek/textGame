package project;

import java.util.ArrayList;

public class Weapon 
{
    public String weaponName;
    private int damage;
    private String level;
     
    public Weapon(String weapon, int damage, String level)
    {
        this.weaponName = weapon;
        this.damage = damage;
        this.level = level;
    }
    
    public void use(Person p)
    {
        boolean durability = checkDurability();
        if(durability == false)
        {
            System.out.println("Weapon Unusable");
        }
        else
        {
            if(level.equalsIgnoreCase("BEST"))
            {
                damage -= 3;
                System.out.println("Damage Done");
                p.health -= damage;
            }
            else if(level.equalsIgnoreCase("MID"))
            {
                damage -= 8;
                System.out.println("Damage Done");
                p.health -= damage;
            }
            else
            {
                damage -= 1;
                System.out.println("Damage Done");
                p.health -= damage;
            }
        }
        
    }

    public boolean checkDurability()
    {
        if(damage == 0)
        {
            damage = 0;
            level = "LOW";
            return false;
        }
        return true;
    }

    public String getWeapon()
    {
        return weaponName;
    }

    public int getDamage()
    {
        return damage;
    }
}
