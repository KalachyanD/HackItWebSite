package com.hackit.website.dao;

import com.hackit.website.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganaizerDAO {

    private static OrganaizerDAO instance;

    private OrganaizerDAO(){}

    public static OrganaizerDAO runCommand() {
        if (instance == null) {
            instance = new OrganaizerDAO();
        }
        return instance;
    }

    public List<Organaizer> getAll() {

        List<Organaizer> list = new ArrayList<Organaizer>();
        int name = 0;
        String value = String.valueOf(name);

        for(int i = 0 ;i<100 ; i++){
            list.add(new Organaizer(value, value, value));
            name++;
        }

        return list;
    }
}
