package com.example.dvdCollection.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionDaoFile implements CollectionDao {

    private Map<String, Collection> dvd = new HashMap<>();


    @Override
    public Collection addDVD(String dvdID, Collection dvd) {
        Collection prevDvd = dvd.put(dvdID, dvd);
        return prevDvd;
    }

    @Override
    public List<Collection> getAlldvd() {
        return null;
    }

    @Override
    public Collection getDVD(String title) {
        return null;
    }

    @Override
    public Collection deleteDVD(String title) {
        return null;
    }
    //ClassRosterDaoFileImpl
}
