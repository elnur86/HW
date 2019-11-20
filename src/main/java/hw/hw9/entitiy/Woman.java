package hw.hw9.entitiy;

import java.util.HashMap;
import java.util.Map;

public class Woman extends Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Woman mother;
    private Man father;
    private hw.hw6.family family;
    private Map<String,String> day=new HashMap<>();

    Woman(String name, String surname, int year,int iq)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
    }

    Woman(String name, String surname, int year, int iq, Man father, Woman mother)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.mother=mother;
        this.father=father;
        this.day.put("Monday","Get ready for the classes on Tuesday\n");
        this.day.put("Tuesday","Java classes today\n");
        this.day.put("Wednesday","Get ready for the classes on Thursday\n");
        this.day.put("Thursday","Java classes today\n");
        this.day.put("Friday","Get ready for the classes on Saturday\n");
        this.day.put("Saturday","Java classes today\n");
        this.day.put("Sunday","Relax, but not too much. Java is waiting for you\n");
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        return String.format("%s %s year of birth %d %s",name,surname,year, day);
    }

    @Override
    public boolean equals (Object that)
    {
        if(that==null) return false;
        if(!(that instanceof Woman)) return false;
        if(this==that) return true;

        Woman thatWoman = (Woman) that;

        if (this.name.equals(((Woman) that).name)&&
                this.surname.equals(((Woman) that).surname))
        {return true;}
        else {return false;}
    }
    @Override
    public int hashCode(){return 1;}

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called to destroy unreachable human class");
        System.out.println("Object garbage collected : " + this);
    }



    @Override
    void greetPet() {
        System.out.println("Hello");

    }
    void makeUp(){
        System.out.println("I love to spend hours for my makeup");
    }
}
