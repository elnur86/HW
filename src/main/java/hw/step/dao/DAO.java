package hw.step.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DAO<T> {
  T get(int id) throws IOException;
  List<T> getAll() throws IOException;
  void put(T t);
  void delete(int id);
}
