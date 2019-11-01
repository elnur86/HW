package hw.hw5;

public class hw5 {
    public static void main(String[] args) {
        human h1,h2,h3,h4,h5,h6;
        family f1,f2;
        pet p1,p2;

        p1=new pet("dog","rex",3,64);
        h1=new human("Tom","Lyn",1980,100);
        h2=new human("Julia","Onail",1983,120);
        h3=new human("Mike","Tot",1990,80);
        h4=new human("Jony","Fox",1995,50);

        f1= new family(h1,h2);
        f1.setPet(p1);

        System.out.println(f1);
        f1.addChild(h3);
        System.out.println(f1);
        f1.addChild(h4);
        System.out.println(f1);
        f1.deleteChild(h3);
        System.out.println(f1);
    }
}
