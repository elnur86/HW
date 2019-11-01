package hw.hw5;

import java.util.ArrayList;
import java.util.Arrays;

public class family {
    private human mother;
    private human father;
    private ArrayList<human> children = new ArrayList<>();
    private pet pet;

    family(human father, human mother)
    {
        this.mother=mother;
        this.father=father;

    }

    public human getMother() {return mother;}
    public human getFather() {return father;}
    public ArrayList<human> getChildren(){return children;}
    public hw.hw5.pet getPet(){return pet;}

    public void setMother(human mother){this.mother = mother;}
    public void setFather(human father){this.father = father;}
    public void setChildren(ArrayList<human> children){this.children = children;}
    public void setPet(pet pet){this.pet=pet;}
    public void addChild(human child){this.children.add(child);}
    public void deleteChild(human child){this.children.remove(child);}
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

        return String.format("Father:%s | Mother:%s | Children:%s | Pet: %s",father,mother,Arrays.toString(ArrayListToArray(children)),pet);
    }


}

/*
- Add the following fields of the `Family`: class
  - mother - `mother` (type `Human`)
  - father - `father` (type `Human`)
  - children - `children` (array `Human`)
  - pet - `pet` (type `Pet`)
- Add getters and setters, redefine `toString` so that it would show all the info about all the family members
- Make a constructor in the `Family`
  - The only condition for creating a new family is the presence of two parents, with the parents being referred to the current new family and the family being created with an empty array of children.
- Refactor the `Human` class, while taking the `Family` structure into account:
  - Remove all information duplicated in the Family class from Human (Human should only keep the information that describes itself)
  - add the `family` (type `Family`) field (теперь оно хранит всю информацию о семейных данных человека)
  - add necessary getters, setters, constructors; remove irrelevant designers and methods; make refactoring of the  ` to welcome the favourite `, ` to describe the favourite `, ` to feed ` methods
  - refactor the `toString()` method. It should output info in the following format:
  `Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}`
  - Add the following methods in `Family`:
  - add a child - `addChild` (accepts the `Human` type and adds it to the children array; adds a link to the current family to the child)
  - delete a child -  `deleteChild` (accepts and array index and deltes the following element; returns a boolean value - was the element deleted or not)
  - get the amount of family members - `countFamily` (the parents in the family never change. If the parents do change - it's a different family)
  - redefine the `toString()` method
  - Decide which fields to use for comparison in the `equals()` method (for example, animal habits may change).

Methods should not only add/remove items to the `Human` array, but also make the necessary modifications (to the added/removed item to set/remove the link to the current family). When deleting an item, there should be no empty spaces in the array - a new array should be created.

* */