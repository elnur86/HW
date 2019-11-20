package hw.hw9.DAO;

import java.util.List;

public interface DAO<T> {
        T get(int index);
        List<T> getAll();
        boolean remove(Object T);
        void put (Object T);

}
