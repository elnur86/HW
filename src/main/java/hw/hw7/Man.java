package hw.hw7;

public class Man extends Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Woman mother;
    private Man father;
    private hw.hw6.family family;
    private Day day;

    Man(String name, String surname, int year,int iq)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
    }

    Man(String name, String surname, int year, int iq, Man father, Woman mother, Day day)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.mother=mother;
        this.father=father;
        this.day=day;
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
        if(!(that instanceof Man)) return false;
        if(this==that) return true;

        Man thatMan = (Man) that;

        if (this.name.equals(((Man) that).name)&&
                this.surname.equals(((Man) that).surname))
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
void repairCar(){
    System.out.println("I like to repair car myself");
}
}
