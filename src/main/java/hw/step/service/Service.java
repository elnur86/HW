package hw.step.service;

import hw.step.dao.DAO;
import hw.step.entity.City;
import hw.step.entity.TimetableLine;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Service implements DAO<TimetableLine> {

    @Override
    public List<TimetableLine> getAll() throws IOException {


        ArrayList<String> ttlStr = new ArrayList<>();
        ArrayList<TimetableLine> ttlarl = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/hw/step/data/timetable.txt")));
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) break;
            ttlStr.add(line);
        }
        br.close();
        String[] linettl = new String[4];

        for (String s: ttlStr)
        {
            linettl=s.split(" ");

            String flightNumber = linettl[0];
            City C1= new City(linettl[1]);
            int time = Integer.parseInt(linettl[2]);
            City C2 =new City(linettl[3]);
            TimetableLine ttlLongLine= new TimetableLine(flightNumber, C1,time,C2);
            ttlarl.add(ttlLongLine);
        }

        return ttlarl;
    }

    @Override
    public List<TimetableLine> get(int id) throws IOException {

        ArrayList<String> ttlStr = new ArrayList<>();
        ArrayList<TimetableLine> ttlarl = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/hw/step/data/mybookings.txt")));
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) break;
            ttlStr.add(line);
        }
        br.close();
        String[] linettl = new String[4];

        for (String s: ttlStr)
        {
            linettl=s.split(" ");

            String flightNumber = linettl[0];
            City C1= new City(linettl[1]);
            int time = Integer.parseInt(linettl[2]);
            City C2 =new City(linettl[3]);
            TimetableLine ttlLongLine= new TimetableLine(flightNumber, C1,time,C2);
            ttlarl.add(ttlLongLine);
        }

        return ttlarl;
    }

    @Override
    public void put(TimetableLine myBooking) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        new File("src/main/java/hw/step/data/mybookings.txt")));
        // -------------
        bw.write(myBooking.toString1());
        bw.newLine();
        bw.close();
    }



            @Override
    public void delete(int id) {




    }



}
