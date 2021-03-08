package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getHealth();
        boss.getDamage();
        boss.getTypeProtection();
        boss.setHealth(650);
        boss.setDamage(20);
        boss.setTypeProtection("Magical");
        System.out.println(boss);
        createHeroes();
    }
    public static Hero[] createHeroes(){
        Hero boy = new Hero(250, 15, "Run");
        Hero floor = new Hero(150, 8, "Fly");
        Hero mal = new Hero(300,8,"Kinetic");
        Hero[] heroes = {boy, floor, mal};
        return heroes;
    }
}
