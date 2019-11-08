package hw.step.controller;

import hw.step.Console;
import hw.step.Database;
import hw.step.dao.DAO;
import hw.step.entity.TimetableLine;
import hw.step.service.Service;

import java.io.IOException;
import java.util.ArrayList;

public class BookingController {
DAO<TimetableLine> DAOTTL =new Service();

  public void add() throws IOException {

      ArrayList<TimetableLine> TTL=new ArrayList<>(DAOTTL.getAll());
      Console console=null;
      console.printLn("Please insert flight number: ");
      String fltnumber= console.readLn();

      for (TimetableLine ttlCheck: TTL)
          if (fltnumber.equals(ttlCheck.getFlightNumber()))
              DAOTTL.put(ttlCheck);
          else console.printLn("There is no such flight exist.\n Please try again");



  }

  public void remove() {

  }

  public void show() {

  }
}
