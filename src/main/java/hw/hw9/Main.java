package hw.hw9;


import hw.hw9.entitiy.family;
import hw.hw9.entitiy.Man;
import hw.hw9.entitiy.Woman;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        FamilyController fmCtrl =new FamilyController();

        Man m1=new Man("Tom","Lyn",1980,100);
        Man m2 =new Man("Mike","Tot",1990,80);
        Man m3=new Man("Jony","Fox",1995,50);
        Man m4=new Man("Ahmed","Coni",1995,50);
        Woman w1 =new Woman("Julia","Onail",1983,120);
        Woman w2 =new Woman("Jennet","Mc",1989,120);
        Woman w3 =new Woman("Chirstina","Agulera",1975,120);
        Woman w4 =new Woman("Jessica","Alba",1990,120);

        Man ch1=new Man("Pirt","Lyn",2010,50);
        Man ch2=new Man("Zirt","Mammed",2012,50);
        Man ch3=new Man("Mirt","Coni",2015,50);

        family f1= new family(1,m1,w1);
        family f2= new family(2,m2,w2);
        family f3= new family(3,m3,w3);

        List<family> allFm=new ArrayList<family>();

        allFm.add(f1);
        allFm.add(f2);
        allFm.add(f3);

        fmCtrl.getAllFm(allFm);
        fmCtrl.disAllFm();
        fmCtrl.brnChld(f1,"Tom","Julia");
        fmCtrl.disAllFm();
        fmCtrl.adptChld(f1,ch1);
        fmCtrl.disAllFm();

    }
}
