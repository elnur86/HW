package hw.hw7;

import java.util.Arrays;

public class Fish extends pet {

    private String  nickname;
    private int age;
    private int tricklevel;
    private String[] habit = new String[]{"eat", "drink", "sleep"};



    public Fish(String nickname, int age, int tricklevel)
    {
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
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
        return String.format("%s can %s",nickname, Arrays.toString(habit));
    }
}
