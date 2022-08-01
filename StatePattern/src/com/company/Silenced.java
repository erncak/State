package com.company;

public class Silenced implements State {
    @Override
    public void dealDamage(HeroContext target, double damage) {

    }

    @Override
    public void takeDamage(HeroContext target, double damage) {
        target.setHp(target.getHp() - damage);
        if (target.getHp() <= 0) {
            target.setState(new Dead());
        }
    }

    @Override
    public void disappear(HeroContext target) {
        target.setState(new Invisible());
    }

    @Override
    public void appear(HeroContext target) {

    }

    @Override
    public void revive(HeroContext target) {

    }

    @Override
    public void silenced(HeroContext target) {

    }

    @Override
    public void recover(HeroContext target) {
        target.setState(new Alive());
    }
}