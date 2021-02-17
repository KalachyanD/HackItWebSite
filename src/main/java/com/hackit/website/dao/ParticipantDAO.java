package com.hackit.website.dao;

import com.hackit.website.models.*;
import java.util.ArrayList;
import java.util.List;

public class ParticipantDAO {

    private static ParticipantDAO instance;

    private ParticipantDAO(){}

    public static ParticipantDAO runCommand() {
        if (instance == null) {
            instance = new ParticipantDAO();
        }
        return instance;
    }

    public List<Participant> getAll() {
        List<Participant> list = new ArrayList<Participant>();
        int name = 0;
        String value = String.valueOf(name);

        for(int i = 0 ;i<100 ; i++){
            list.add(new Participant(name, value, value));
            name++;
        }

        return list;
    }
}
