package ru.rick_Sanchez.company.homeWork;

public class Cat extends Animals {

    private int runMaxMetres = 200;
    private int swimMaxMetres = 0;
    private int jumpMaxMetres = 2;

    public Cat(int runMaxMetres, int swimMaxMetres, float jumpMaxMetres) {
        super(runMaxMetres, swimMaxMetres, jumpMaxMetres);
    }

    @Override
    public boolean run(int runMetres) {
        if(runMetres > runMaxMetres){
            return false;
        }else if(runMetres < 1)
            return false;
        return true;
    }

    @Override
    public boolean swim(int swimMetres) {
        return false;
    }

    @Override
    public boolean jump(float jumpMetres) {
        if(jumpMetres > jumpMaxMetres){
            return false;
        }else if(jumpMetres < 1) {
            return false;
        }
        return true;
    }
}
