package hw.hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class family {
    private Woman mother;
    private Man father;
    private ArrayList<Man> children = new ArrayList<>();
    private Set<pet> familypet= new HashSet<pet>();

    family(Man father, Woman mother)
    {
        this.mother=mother;
        this.father=father;

    }

    family(ArrayList<Man> children)
    {
        this.children=children;
    }

    public Woman getMother() {return mother;}
    public Man getFather() {return father;}
    public ArrayList<Man> getChildren(){return children;}
    public Set<pet> getFamilypet(){return familypet;}

    public void setMother(Woman mother){this.mother = mother;}
    public void setFather(Man father){this.father = father;}
    public void setChildren(ArrayList<Man> children){this.children = children;}
    public void setFamilypet(pet pet1){this.familypet.add(pet1);}
    public void addChild(Man child){this.children.add(child);}
    public void deleteChild(Man child){this.children.remove(child);}
    public void deleteChild(int index){this.children.remove(index);}
    public int countFamily(){return 2+this.children.size();}


    public Man[] ArrayListToArray (ArrayList<Man> humArl)
    {
        int size=humArl.size();
        Man humAr[]= new Man[size];
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
