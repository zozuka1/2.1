package com.company;

import java.util.ArrayList;

public class Register
{
    ArrayList<User> registrated =new ArrayList<>();

    public void reg(String name,String pass)
    {
        User use = new User();
        use.setName(name);
        use.setPassword(pass);
        registrated.add(use);
    }
    public int random(int min,int max)
    {
        return (int) ((Math.random() * (max-min))+min);
    }
    public void reg(String name)
    {
        String pass="";
        String poss ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        for(int i=0;i<10;i++)
        {
            pass+=poss.charAt(random(0,61));
        }
        User new_user=new User();
        new_user.setName(name);
        new_user.setPassword(pass);
        registrated.add(new_user);



    }
    public void del(String name,String pass)
    {
        for(int i=0;i<10;i++)
        registrated.remove(pass);
        for(int i=0;i<registrated.size();i++)
        {
            if(registrated.get(i).getPassword().equals(pass)&& registrated.get(i).getName().equals(name));
            break;
        }
    }
}
