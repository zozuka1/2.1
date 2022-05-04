package com.company;

import java.util.ArrayList;
import java.util.Random;

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
    public void reg(String name)
    {
        String pass="";
        String poss ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random poss
    }
    public void del(String name,String pass)
    {

    }
}
