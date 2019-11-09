package hw.step.controller;

import hw.step.Console;
import hw.step.Database;
import hw.step.SystemConsole;
import hw.step.dao.DAO;
import hw.step.entity.TimetableLine;
import hw.step.service.Service;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BookingController {
DAO<TimetableLine> DAOTTL =new Service();

  public void add() throws Exception {

      TimetableLine addLine;
      Console console = new SystemConsole();
      console.printLn ("Please insert flight number: ");
      String fltnumber= console.readLn();

      addLine= getbyFlightNum(fltnumber);
      DAOTTL.put(addLine);

  }

    public TimetableLine getbyFlightNum(String flightNumber) throws Exception {

        List<TimetableLine> ttlList =new ArrayList<>();
        ttlList=DAOTTL.getAll();
        TimetableLine exactMatch = new TimetableLine();
        int i=0;
        for(TimetableLine ttlFlightNumber: ttlList)
        {
            if (flightNumber.equals(ttlFlightNumber.getFlightNumber()))
                {
                exactMatch = ttlFlightNumber;
                i++;
            }
        }
        if (i==0) {
            System.out.println("There is no such a flight");
            add();
        }
            return exactMatch;
    }

    public void remove() throws IOException {
        TimetableLine removeLine;
        Console console = new SystemConsole();
        console.printLn ("Please insert flight number: ");
        String fltnumber= console.readLn();

        DAOTTL.delete(1,fltnumber);

  }

  public void show() throws IOException {

      ArrayList<TimetableLine> ttlMyBooking = new ArrayList<>(DAOTTL.get(1));

      for(TimetableLine s: ttlMyBooking)
          System.out.println(s);

  }
}
