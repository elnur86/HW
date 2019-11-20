package hw.hw9.DAO;

import java.util.List;

public interface FamilyDAO <T>{
    List<T> getAllFamilies ();
    T getFamilyByIndex (int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(T family);
    void saveFamily (T family);


}
