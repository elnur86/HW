package hw.step.entity;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {
  private final List<TimetableLine> data = new ArrayList<>();

  public TimeTable() {
    if (isExisted()) {
      load();
    } else {
      create();
    }
  }

  public boolean isExisted() {
    return false;
  }

  public void load() {
    // load the timetable from file
  }

  public void create() {
    // read the cities from file
    // create the timetable
    // write the timetable to file
  }
}
