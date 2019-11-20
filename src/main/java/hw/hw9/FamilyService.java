package hw.hw9;

import hw.hw9.DAO.FamilyDAO;
import hw.hw9.entitiy.Man;
import hw.hw9.entitiy.Woman;
import hw.hw9.entitiy.family;

import java.util.List;

public class FamilyService {

FamilyDAO<family> DAOFM= new CollectionFamilyDAO();

List<family> fam;


public int familyCount (family fmCount){
    return 2+fmCount.getChildren().size();
}

public void getAllFamilies(List<family> getAllFamilies){
    fam=DAOFM.getAllFamilies(getAllFamilies);
}

public void displayAllFamilies() {
    System.out.println(fam);
}

public List<family> getFamiliesBiggerThan(int count){
    List<family> biggerThan=null;
    for(family eachFamily: fam)
        if (familyCount(eachFamily)>count) biggerThan.add(eachFamily);
    return biggerThan;
}

public List<family> getFamiliesLessThan (int count){
    List<family> lessThan=null;
    for(family eachFamily:fam)
        if(familyCount(eachFamily)<count) lessThan.add(eachFamily);
    return lessThan;
}

public int countFamiliesWithMemberNumber (int count) {
    int familiesWithNumber=0;
    for (family eachFamily : fam)
        if(familyCount(eachFamily)==count) familiesWithNumber++;
    return familiesWithNumber;
}

public void createNewFamily(Man father, Woman mother){
    int index=fam.size();
    index++;
    family newFamily= new family(index,father,mother);
}

public void deleteFamilyByIndex(int index){
    DAOFM.deleteFamily(index);
}

public void bornChild(family family, String father, String mother){
    for(family eachFamily: fam)
        if( eachFamily.getFather().getName().equals(father) &&
            eachFamily.getMother().getName().equals(mother))
            eachFamily.getChildren().add(new Man("NewBorn",eachFamily.getFather().getSurname(),2019,120));
}

public void adoptChild(family family, Man child){
    for(family eachFamily: fam)
        if(eachFamily.equals(family))eachFamily.getChildren().add(child);

}

public void deleteAllChildrenOlderThan(int age){
    for(family eachFamily: fam)
        for(Man eachChild: eachFamily.getChildren())
            if (eachChild.getAge()>age) eachFamily.getChildren().remove(eachChild);
}

public int count (){
    return fam.size();
}

public family getFamilyById(int index){
    family familyLookingFor=null;
    for(family eachFamily: fam)
        if(eachFamily.getIndex()==index) familyLookingFor=eachFamily;
    return familyLookingFor;
}

}
