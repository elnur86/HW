package hw.hw7;

import java.util.Arrays;

public class RobotCat extends pet{

    private String  nickname;
    private int age;
    private int tricklevel;



    public RobotCat(String nickname, int age, int tricklevel)
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
    @Override
    public String toString(){
        return String.format("%s",nickname);
    }
}
