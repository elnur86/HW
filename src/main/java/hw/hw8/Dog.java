package hw.hw8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dog extends pet {


    private String  nickname;
    private int age;
    private int tricklevel;
    private Set<String> habit = new HashSet<String>();


    public Dog(String nickname, int age, int tricklevel )
    {
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habit.add("eat");
        this.habit.add("drink");
        this.habit.add("sleep");
        this.habit.add("jump");

    }


    @Override
    void eat() {System.out.println("I am eating");

    }

    @Override
    void respond() {System.out.printf("Hello, owner. I am - %s. I miss you!",this.nickname);
    }

    void foul(){System.out.println("I foul");}
    @Override
    public String toString(){
        return String.format("%s can %s",nickname, habit);
    }
}
