package hw.hw9.entitiy;

import java.util.HashSet;
import java.util.Set;

public class RobotCat extends pet {

    private String  nickname;
    private int age;
    private int tricklevel;
    private Set<String> habit= new HashSet<>();



    public RobotCat(String nickname, int age, int tricklevel)
    {
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habit.add("move");
    }
    @Override
    void eat() {System.out.println("I am eating");
    }

    @Override
    void respond() {System.out.printf("Hello, owner. I am - %s. I miss you!",this.nickname);

    }
    @Override
    public String toString(){
        return String.format("%s can %s",nickname, habit);
    }
}
