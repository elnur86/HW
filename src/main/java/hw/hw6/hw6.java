package hw.hw6;

import java.awt.*;

public class hw6 {
    public static void main(String[] args) {
        human h1,h2,h3,h4,h5,h6;
        family f1,f2;
        pet p1,p2;
        Day day=Day.MONDAY;
        Species species=Species.DOG;


        p1=new pet(species,"rex",3,64);
        h1=new human("Tom","Lyn",1980,100);
        h2=new human("Julia","Onail",1983,120);
        h3=new human("Mike","Tot",1990,80);
        h4=new human("Jony","Fox",1995,50);
        h5=new human("Ahmed","Coni",1995,50,h1,h2,day);

        f1= new family(h1,h2);
        f1.setFamilypet(p1);

        System.out.println(f1+" count "+f1.countFamily());
        f1.addChild(h3);
        System.out.println(f1+" count "+f1.countFamily());
        f1.addChild(h4);
        f1.addChild(h4);
        f1.addChild(h3);
        f1.addChild(h4);
        f1.addChild(h4);
        f1.addChild(h4);
        System.out.println(f1+" count "+f1.countFamily());
        f1.deleteChild(h5);
        System.out.println(f1+" count "+f1.countFamily());
        f1.deleteChild(2);
        System.out.println(f1+" count "+f1.countFamily());
        System.out.printf("\n%s",h5);
        System.out.printf("\n%s",h3);
    }

}
