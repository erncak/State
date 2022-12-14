package com.company;

public class Alive implements State {
    public AliveState(HeroContext heroContext) {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("\n...Hero is attacking others.");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("\n...Hero is being attacked with damage: " + damage);
        heroContext.hp -= damage;
        if (heroContext.hp <=0 ) {
            heroContext.hp = 0;
            heroContext.setState(heroContext.getDeadState());
        }
    }

    @Override
    public void silenced() {
        System.out.println("\n...Hero is being silenced.");
        heroContext.setState(heroContext.getSilencedState());
    }

    @Override
    public void recovered() {
        System.out.println("\n...Hero is already recovered, and cannot be recovered.");
    }

    @Override
    public void revived(int hp) {
        System.out.println("\n...Hero is already alive, and cannot be revived.");
    }

    public String toString() {
        return "alive";
    }
}}