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

public void getAllFamilies(){
    fam=DAOFM.getAllFamilies();
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




}
