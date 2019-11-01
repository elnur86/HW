package hw.hw5;

public class human
{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private human mother;
    private human father;
    private family family;
    private String[][] schedule = new String[][]{{"Monday", "Do HomeWork for Tuesday"},
                                                 {"Tuesday","Classes for Tuesday"},
                                                 {"Wednesday","Do HomeWork for Thursday"},
                                                 {"Thursday","Classes for Thursday"},
                                                 {"Friday","Do HomeWork for Saturday"},
                                                 {"Saturday","Classes for Saturday"},
                                                 {"Sunday","Relax"}};

    human(String name, String surname, int year,int iq)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
    }

    human(String name, String surname, int year, int iq, human mother, human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.mother=mother;
        this.father=father;
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        return String.format("%s %s year of birth %d",name,surname,year);
    }

    @Override
    public boolean equals (Object that)
    {
        if(that==null) return false;
        if(!(that instanceof human)) return false;
        if(this==that) return true;

        human thathuman = (human) that;

                if (this.name.equals(((human) that).name)&&
                    this.surname.equals(((human) that).surname))
                {return true;}
                else {return false;}
    }
    @Override
    public int hashCode(){return 1;}
}