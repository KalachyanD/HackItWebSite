package com.hackit.website.dao;

import com.hackit.website.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventDAO {

    private static EventDAO instance;

    private EventDAO(){}

    public static EventDAO runCommand() {
        if (instance == null) {
            instance = new EventDAO();
        }
        return instance;
    }

    public List<Event> getAll() {
        List<Event> list = new ArrayList<Event>();
        int name = 0;
        String value = String.valueOf(name);
        Date date = new Date();

        for(int i = 0 ;i<100 ; i++){
            list.add(new Event(value, date, date));
            name++;
            date = new Date();
        }

        return list;
    }

}
