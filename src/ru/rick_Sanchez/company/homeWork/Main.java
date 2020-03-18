package ru.rick_Sanchez.company.homeWork;

public class Main {
    public static void main(String[] args) {
        Animals bird;
        Animals cat;
        Animals dog;
        Animals horse;

        bird = new Bird(5,3,0.5f);
        if(bird.run(4) == false){
            System.out.println("The bird is still standing.");
        }else System.out.println("The bird ran.");

        if(bird.jump(0.1f) == false){
            System.out.println("The bird can't jump.");
        }else System.out.println("The bird jumped.");

        if(bird.swim(3) == false){
            System.out.println("The bird can't swim.");
        }
        System.out.println("-------------------------------------------------------------");



        cat = new Cat(200,0,2);
        if(cat.run(100) == false){
            System.out.println("The cat is sitting still.");
        }else System.out.println("The cat ran.");

        if(cat.jump(2) == false){
            System.out.println("The cat doesn't jump");
        }else System.out.println("The cat jumped.");

        if(cat.swim(4) == false){
            System.out.println("The cat can't swim.");
        }
        System.out.println("-------------------------------------------------------------");


        dog = new Dog(500,10,0.5f);
        if(dog.run(400) == false){
            System.out.println("The dog is sitting still.");
        }else System.out.println("The dog ran.");

        if(dog.jump(2) == false){
            System.out.println("The dog can't jump.");
        }else System.out.println("The dog jumped.");


        if(dog.swim(8) == false){
            System.out.println("The dog can't swim.");
        }else System.out.println("The dog swam.");
        System.out.println("-------------------------------------------------------------");


        horse = new Horse(1500,100,3);

        if(horse.run(1000) == false){
            System.out.println("The horse can't run.");
        }else System.out.println("Run horse, run!");


        if(horse.jump(2) == false){
            System.out.println("The horse can't jump.");
        }else System.out.println("The horse jumped over the obstacle.");


        if(horse.swim(200) == false){
            System.out.println("A horse can't swim.");
        }else System.out.println("The horse is swimming.");
        System.out.println("-------------------------------------------------------------");

    }
}
