package com.comp;

import java.util.ArrayList;
public class Addres
{
    ArrayList<Users> registrated = new ArrayList<>();
    public void reg(String name,String pass,String masage)
    {
        Users use = new Users();
        use.setName(name);
        use.setPass(pass);
        use.setMasage(masage);
        registrated.add(use);
    }
    public void del(String name,String pass,String masage)
    {
        for(int i=0;i<10;i++)
            registrated.remove(pass);
        for(int i=0;i<registrated.size();i++) {
            if (registrated.get(i).getPass().equals(pass) && registrated.get(i).getName().equals(name)&& registrated.get(i).equals(masage));
            break;
        }
    }
}
