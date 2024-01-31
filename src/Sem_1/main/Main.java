package Sem_1.main;

import Sem_1.main.clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Animal cat = new Animal("Barsic",
                new Owner("Petr"),
                LocalDate.of(2021, 12, 12),
                new Illness("bb")); // создали экземпляр


//        System.out.println(cat.nickname);

//        System.out.println(cat.getBirthDate());

//        cat.setIllness(new Illness("good"));
//        System.out.println(cat.getIllness());

//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNickname());
//        cat.wakeUp();
//        cat.hunt();
//        cat.eat();
//        cat.sleep();
//        cat.lifeCycle();
//        System.out.println(cat.getType());
//        System.out.println(cat);

//        Cat catty = new Cat();
//        Dog goodDog = new Dog();

//        System.out.println(catty.getType());
//        System.out.println(catty);
//        System.out.println(goodDog.getType());

//        Cat.meow();

        Animal birdie = new Bird("Птичка", new Owner("non"),
                LocalDate.of(2023, 12, 31), new Illness("блохи"), 0d);

        birdie.skills();


        Animal fishball = new Fishy("Рыбка", new Owner("non"),
                LocalDate.of(2023, 12, 31), new Illness("плохо спит"), 0d);

        fishball.skills();
    }

}
