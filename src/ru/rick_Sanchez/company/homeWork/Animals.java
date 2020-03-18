package ru.rick_Sanchez.company.homeWork;

public abstract class Animals {

    private int runMaxMetres;
    private int swimMaxMetres;
    private float jumpMaxMetres;

    public Animals(int runMaxMetres, int swimMaxMetres, float jumpMaxMetres) {
        this.runMaxMetres = runMaxMetres;
        this.swimMaxMetres = swimMaxMetres;
        this.jumpMaxMetres = jumpMaxMetres;
    }

    public abstract boolean run(int runMetres);

    public abstract boolean swim(int swimMetres);

    public abstract boolean jump(float jumpMetres);

}
