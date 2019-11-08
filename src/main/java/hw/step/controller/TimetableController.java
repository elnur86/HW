package hw.step.controller;

import hw.step.Console;
import hw.step.dao.DAO;
import hw.step.entity.TimetableLine;
import hw.step.service.Service;

import java.io.IOException;
import java.util.ArrayList;

public class TimetableController {

DAO<TimetableLine> DAOTTL =new Service();

  public void show() throws IOException {

    ArrayList<TimetableLine> ttlArrL = new ArrayList<>(DAOTTL.getAll());

    for(TimetableLine s: ttlArrL)
      System.out.println(s);

  }

}
