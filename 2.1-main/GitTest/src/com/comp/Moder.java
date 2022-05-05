package com.comp;

public class Moder implements User
{
    String name;
    String pass;
    int ID;

    @Override
    public void creat_com() {

    }

    @Override
    public void edi_com() {

    }

    @Override
    public void del_com() {

    }

    @Override
    public void setId(int ID)
    {
        this.ID =ID;
    }

    @Override
    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public void setPass(String pass)
    {
        this.pass=pass;
    }

    @Override
    public int getId()
    {
        return 0;
    }

    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public String getPass()
    {
        return null;
    }
}
