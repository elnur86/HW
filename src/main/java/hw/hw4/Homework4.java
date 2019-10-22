package hw.hw4;

public class Homework4 {
    public static void main(String[] args) {

        Pet p1= new Pet("Dog","bobik",10,20);
        Pet p2= new Pet("Cat","tom",5,20);

        Human father1= new Human("Adam", "Adamov",1970);
        Human mather1= new Human("Eva", "Adamova",1975);
        Human child1=new Human("Bob","Adamov",1995,100,p1,mather1,father1);

        Human father2= new Human("Jon", "Lyn",1960);
        Human mather2= new Human("Laura", "Lyn",1963);
        Human child2=new Human("Mark","Lyn",1988,100,p2,mather2,father2);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(p1);
        System.out.println(p2);
        p1.eat();
        p2.foul();
        p1.respond();
        child1.describePet();
        child2.greetPet();

    }
}
