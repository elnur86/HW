package hw.hw9;

import hw.hw9.entitiy.Man;
import hw.hw9.entitiy.Woman;
import hw.hw9.entitiy.family;
import java.util.List;

public class FamilyController {
FamilyService fmSer =new FamilyService();

public void getAllFm(List<family> allFmLst) {fmSer.getAllFamilies(allFmLst);}

public void disAllFm() {fmSer.displayAllFamilies();}

public List<family> getFmsBigThan(int count){return  fmSer.getFamiliesBiggerThan(count);}

public List<family> getFmsLessThan (int count){return fmSer.getFamiliesLessThan(count);}

public int cntFmsWithMbrNum (int count) {return fmSer.countFamiliesWithMemberNumber(count);}

public void crtNewFm(Man father, Woman mother){fmSer.createNewFamily(father,mother);}

public void dltFmById(int index) {fmSer.deleteFamilyByIndex(index);}

public void brnChld(family family, String father, String mother){fmSer.bornChild(family,father,mother);}

public void adptChld(family family, Man child){fmSer.adoptChild(family,child);}

public void dltAllChldOldThan(int age) {fmSer.deleteAllChildrenOlderThan(age);}

public int fmCount () {return fmSer.count();}

public family getFmById(int index) {return fmSer.getFamilyById(index);}




}
