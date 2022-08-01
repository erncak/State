package com.company;

public class Invisible implements State {
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
        target.setState(new Alive());
    }

    @Override
    public void revive(HeroContext target) {

    }

    @Override
    public void silenced(HeroContext target) {

    }

    @Override
    public void recover(HeroContext target) {

    }
}
