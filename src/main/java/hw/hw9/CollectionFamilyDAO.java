package hw.hw9;

import hw.hw9.DAO.FamilyDAO;
import hw.hw9.entitiy.family;

import java.util.List;

public class CollectionFamilyDAO implements FamilyDAO<family> {

    List<family> fm;

    @Override
    public List<family> getAllFamilies(List<family> origin) {
        fm=origin;
        return fm;
    }

    @Override
    public family getFamilyByIndex(int index) {

        family result=null;
        for(int i=0;i<fm.size();i++)
            if (index==i) result=fm.get(i);

        return result;
    }

    @Override
    public boolean deleteFamily(int index) {

        for(int i=0;i<fm.size();i++){
            if(index==i) fm.remove(i);
            return true;}
        return false;
    }

    @Override
    public boolean deleteFamily(family family) {
        if (fm.contains(family)){fm.remove(family); return true;}

        return false;   }

    @Override
    public void saveFamily(family family) {
        if(!fm.contains(family)){fm.add(family);}
    }
}
