package com.comp;

public class Users implements User
{
     String name;
     String pass;
     String masage;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setMasage(String masage)
    {
        this.masage= masage;
    }
    public void setPass(String pass)
    {
        this.pass=pass;
    }

    public String getName()
    {
        return name;
    }
    public String getPass()
    {
        return pass;
    }
    public String getMasage()
    {
        return masage;
    }

    @Override
    public void create_masage()
    {
        String masage ="";
    }

    @Override
    public void edit_masage()
    {

    }

    @Override
    public void del_masage()
    {

    }
}

