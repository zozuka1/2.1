package com.company;

public class Main {

    public static void main(String[] args)
    {
        Register R1 = new Register();
        R1.reg("Zozuka");
        System.out.println("Имя  :"+R1.registrated.get(0).getName());

        R1.reg("Zozuka");
        System.out.println("Пароль :"+R1.registrated.get(0).getPassword());

        R1.del("Zozuka","132231aabb");
        System.out.println("Удаление");
    }
}
