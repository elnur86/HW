package hw.hw5;

public class pet {
    private String species;
    private String  nickname;
    private int age;
    private int tricklevel;
    private String[] habit = new String[]{"eat", "drink", "sleep"};;



    public pet(String species, String nickname, int age, int tricklevel)
    {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        }

    public void eat() {System.out.println("I am eating");}
    public void respond(){System.out.printf("Hello, owner. I am - %s. I miss you!",this.nickname);}
    public void foul(){System.out.println("I need to cover it up");}

    public String getName(){return this.nickname;}
    public int getAge(){return this.age;}
    public String getSpecies(){return this.species;}
    public int getTricklevel(){return this.tricklevel;}

    public String toString(){
        return String.format("%s", nickname);
    }
}


/*
    Describe the Pet with the following fields:
        - (`species`)
        - (`nickname`)
        - (`age`)
        - (`trickLevel`) (a whole number from 1 to 100)
        - (`habits`) (array of strings)
        - Describe and implement the following methods for Pet:
        - (`eat`) (method displays a message 'I am eating')
        - (`respond`) (method displays a message 'Hello, owner. I am - [the name of the pet]. I miss you!')
        - (`foul`) (method displays a message 'I need to cover it up')

*/