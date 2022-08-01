package com.company;

public class Dead implements State {
    @Override
    public void dealDamage(HeroContext target, double damage) {

    }

    @Override
    public void takeDamage(HeroContext target, double damage) {

    }

    @Override
    public void disappear(HeroContext target) {

    }

    @Override
    public void appear(HeroContext target) {

    }

    @Override
    public void revive(HeroContext target) {
        target.setHp(HeroContext.MAX_HP);
        target.setState(new Alive());
    }

    @Override
    public void silenced(HeroContext target) {

    }

    @Override
    public void recover(HeroContext target) {

    }
}