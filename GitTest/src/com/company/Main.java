package com.company;

public class Main {

    public static void main(String[] args)
    {
        Register R1 = new Register();
        R1.reg("Zozuka","132231aabb");
        System.out.println(R1.registrated.get(0).getName());
    }
}
