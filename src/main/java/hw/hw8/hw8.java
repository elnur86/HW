package hw.hw8;

public class hw8 {

    public static void main(String[] args) {
        Man h1,h3,h4,h5,h6;
        Woman h2;
        family f1,f2;
        pet p1,p2;

        p1 = new Dog("Rex", 3, 64);
        p2= new DomesticCat("Jerry",5,99);
        h1=new Man("Tom","Lyn",1980,100);
        h2=new Woman("Julia","Onail",1983,120);
        h3=new Man("Mike","Tot",1990,80);
        h4=new Man("Jony","Fox",1995,50);
        h5=new Man("Ahmed","Coni",1995,50,h1,h2);

        f1= new family(h1,h2);
        f1.setFamilypet(p1);
        f1.setFamilypet(p2);

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
