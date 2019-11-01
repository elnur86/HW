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

//        void greetPet(){System.out.printf("Hello, %s",this.pet.getName());}
//        void describePet(){
//        if (this.pet.getTricklevel()>50) System.out.printf("I have a %s, he is %d years old, he is very sly",this.pet.getSpecies(),this.pet.getAge());
//        else System.out.printf("I have a %s, he is %d years old, he is almost not sly",this.pet.getSpecies(),this.pet.getAge());}

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

/*
 Describe Human with the following fields:
  - (`name`)
  - (`surname`)
  - date of birth (`year`), number
  - IQ level (`iq`) (a whole number from 1 to 100))
  - (`pet`) (object type Pet)
  - (`mother`) (object type Human)
  - (`father`) (object type Human)
  - Schedule of non-working activities (`schedule`) (2d array: [day of the week] x [type of the activity])
- Describe and implement the following methods for Human:
  - (`greetPet`)("Hello, [the name of the pet]")
  - (`describePet`): (display the information about your pet: "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".



*/