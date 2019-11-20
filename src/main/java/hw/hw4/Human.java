package hw.hw4;


public class Human {

    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;

    Human ()
    {}

    Human (String name, String surname, int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    Human (String name, String surname, int year, Human mother, Human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother=mother;
        this.father=father;
    }

    Human (String name, String surname, int year, int iq, Pet pet, Human mother, Human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;

    }
    void greetPet()
    {
        System.out.printf("Hello, %s \n",pet.nickname);
    }

    void describePet()
    {
        System.out.printf("I have a %s, he is %d years old, he is [very sly]>50/[almost not sly]<50",pet.species,pet.age);
    }

    @Override
    public String toString() {
        return String.format("Human{name="+name+" surname=" +surname+", year="+year+", iq=" +iq+ ", mother=" +mother.name +", father=" + father.name+ ", pet=" +pet.species+"{nickname=" +pet.nickname +", age=" +pet.age+ ", trickLevel=" +pet.trickLevel+", habits=[eat, drink, sleep]");
    }
}

