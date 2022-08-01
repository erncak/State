package com.company;

public class HeroContext {
    public static final int MAX_HP = 100;
    private State state;
    private double hp;


    public HeroContext() {
        state = new Alive();
        hp = MAX_HP;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void attack(HeroContext target, double damage) {
        action("dealDamage", target, damage);
    }

    public void attacked(double damage) {
        action("takeDamage", this, damage);
    }

    public void action(String action) {
        this.action(action, this, 0);
    }

    private void action(String action, HeroContext target, double damage) {
        if (action.equalsIgnoreCase("dealDamage")) {
            state.dealDamage(target, damage);
        } else if (action.equalsIgnoreCase("takeDamage")) {
            state.takeDamage(target, damage);
        } else if (action.equalsIgnoreCase("disappear")) {
            state.disappear(target);
        } else if (action.equalsIgnoreCase("appear")) {
            state.appear(target);
        } else if (action.equalsIgnoreCase("revive")) {
            state.revive(target);
        } else if (action.equalsIgnoreCase("silenced")) {
            state.silenced(target);
        } else if (action.equalsIgnoreCase("recover")) {
            state.recover(target);
        }
    }
}