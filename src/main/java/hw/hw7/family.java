package hw.hw7;

import java.util.ArrayList;
import java.util.Arrays;

public class family {
    private human mother;
    private human father;
    private ArrayList<human> children = new ArrayList<>();
    private pet familypet;

    family(human father, human mother)
    {
        this.mother=mother;
        this.father=father;

    }

    family(ArrayList<human> children)
    {
        this.children=children;
    }

    public human getMother() {return mother;}
    public human getFather() {return father;}
    public ArrayList<human> getChildren(){return children;}
    public pet getFamilypet(){return familypet;}

    public void setMother(human mother){this.mother = mother;}
    public void setFather(human father){this.father = father;}
    public void setChildren(ArrayList<human> children){this.children = children;}
    public void setFamilypet(pet familypet){this.familypet = familypet;}
    public void addChild(human child){this.children.add(child);}
    public void deleteChild(human child){this.children.remove(child);}
    public void deleteChild(int index){this.children.remove(index);}
    public int countFamily(){return 2+this.children.size();}


    public human[] ArrayListToArray (ArrayList<human> humArl)
    {
        int size=humArl.size();
        human humAr[]= new human[size];
        for (int i=0;i<humArl.size();i++)
            humAr[i] = humArl.get(i);
        return humAr;
    }

    public String toString()
    {

        return String.format("Father:%s | Mother:%s | Children:%s | Pet: %s",father,mother,Arrays.toString(ArrayListToArray(children)), familypet);
    }

    @Override
    public boolean equals(Object that) {
        if (that==null) return false;
        if(!(that instanceof family)) return false;
        if (this==that) return true;

        family thatfamily = (family) that;
        if( this.father==((family) that).father &&
            this.mother==((family) that).mother &&
            this.children.equals(((family) that).children) &&
            this.familypet == ((family) that).familypet)
        {return true;}
        else {return false;}
    }

    @Override
    public int hashCode(){return 1;}

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called to destroy unreachable family class");
        System.out.println("Object garbage collected : " + this);
    }
}
