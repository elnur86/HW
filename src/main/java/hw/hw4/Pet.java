package hw.hw4;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    //String[] habits;

    Pet()
    {}

    Pet (String species, String nickname)
    {
        this.species=species;
        this.nickname=nickname;
    }
    Pet (String species, String nickname, int age, int trickLevel)
    {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        //this.habits=habits;
    }
    void eat()
    {
        System.out.println("I am eating");
    }
    void respond()
    {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n",this.nickname);
    }
    void foul()
    {
        System.out.println("I need to cover it up");
    }
    @Override
    public String toString() {
        return String.format(species + "{nickname=" + nickname +", age="+age+", tricklevel=" +trickLevel+", habits");
    }

}



