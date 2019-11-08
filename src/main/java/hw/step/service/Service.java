package hw.step.service;

import hw.step.dao.DAO;
import hw.step.entity.City;
import hw.step.entity.TimetableLine;

import java.io.*;
import java.lang.reflect.Array;
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
        String[] linettl = new String[3];

        for (String s: ttlStr)
        {
            linettl=s.split(" ");

            City C1= new City(linettl[0]);
            int time = Integer.parseInt(linettl[1]);
            City C2 =new City(linettl[2]);
            TimetableLine ttlLongLine= new TimetableLine(C1,time,C2);
            ttlarl.add(ttlLongLine);
        }

        return ttlarl;
    }

    @Override
    public TimetableLine get(int id)  {
        return null;
    }

    @Override
    public void put(TimetableLine timetableLine) {

    }

    @Override
    public void delete(int id) {

    }
}
