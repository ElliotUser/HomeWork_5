package ru.rick_Sanchez.company.homeWork;

public class Horse extends Animals{

    private int runMaxMetres;
    private int swimMaxMetres;
    private int jumpMaxMetres;

    public Horse(int runMaxMetres, int swimMaxMetres, float jumpMaxMetres) {
        super(runMaxMetres, swimMaxMetres, jumpMaxMetres);
    }

    @Override
    public boolean run(int runMetres) {
        if(runMetres > runMaxMetres){
            return false;
        }else if(runMetres < 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean swim(int swimMetres) {
        if(swimMetres > swimMaxMetres){
            return false;
        }else if(swimMetres < 1 ){
            return false;
        }
        return true;
    }

    @Override
    public boolean jump(float jumpMetres) {
        if(jumpMetres > jumpMaxMetres){
            return false;
        }else if(jumpMetres < 1){
            return false;
        }
        return true;
    }
}
