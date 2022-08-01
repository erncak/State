package com.company;

public interface State {
    void dealDamage(HeroContext target, double damage);

    void takeDamage(HeroContext target, double damage);

    void disappear(HeroContext target);

    void appear(HeroContext target);

    void revive(HeroContext target);

    void silenced(HeroContext target);

    void recover(HeroContext target);
}