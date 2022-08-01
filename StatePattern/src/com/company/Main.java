package com.company;

public class Main {

    public static void main(String[] args) {
//alive
        HeroContext heroContext = new HeroContext(10);
        System.out.println(heroContext);

        heroContext.attacked(5);
        System.out.println(heroContext);

        heroContext.attack(heroContext,2);
        System.out.println(heroContext);

        //alive
        heroContext.getHp();
        heroContext.setHp(10);

        //alive->dead
        heroContext.attacked(10);
        System.out.println(heroContext);

        //dead
        heroContext.attack();
        heroContext.attacked(5);
        heroContext.setHp(10);
        heroContext.d;

        //dead->alive
        heroContext.revived(10);
        System.out.println(heroContext);

        //alive->silenced
        heroContext.silenced();
        System.out.println(heroContext);

        //silenced
        heroContext.attack();
        heroContext.silenced();
        heroContext.revived(10);

        //silenced
        heroContext.attacked(5);
        System.out.println(heroContext);

        //silenced->alive
        heroContext.recovered();
        System.out.println(heroContext);

        //alive->silenced->dead
        heroContext.silenced();
        heroContext.attacked(10);
        System.out.println(heroContext);

        //silenced->alive
        heroContext.revived(10);
        System.out.println(heroContext);
    }
}    }
}
