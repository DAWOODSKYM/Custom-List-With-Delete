package com.valerie.customlist;

public class Hero {
    int image;

   String name, team;

    public Hero(int image, String name, String team) {
        this.image = image;
        this.name = name;
        this.team = team;

    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
