package ru.rick_Sanchez.company.homeWork;

public class Bird extends Animals{

    private int runMaxMetres = 5;
    private int swimMaxMetres = 0;
    private float jumpMaxMetres = 0.2f;

    public Bird(int runMaxMetres, int swimMaxMetres, float jumpMaxMetres) {
        super(runMaxMetres, swimMaxMetres, jumpMaxMetres);
    }

    @Override
    public boolean run(int runMetres) {
        if(runMetres > runMaxMetres){
            return false;
        }else if(runMetres < 1){
            return false;
        }
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
        }else if(jumpMetres == 0){
            return false;
        }
        return true;
    }
}
