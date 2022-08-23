package com.example.dvdCollection.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionDaoFile implements CollectionDao {
    //ClassRosterDaoFileImpl

    private Map<String, Collection> dvd1 = new HashMap<>();
    @Override
    public Collection addDVD(String dvdID, Collection dvd) {
        Collection prevDvd = dvd1.put(dvdID, dvd);
        return prevDvd;
    }
    @Override
    public List<Collection> getAlldvd() {
        return new ArrayList<Collection>(dvd1.values());
    }
    @Override
    public Collection getDVD(String title) {
        return dvd1.get(title);
    }

    @Override
    public Collection deleteDVD(String title) {
        return null;
    }

    @Override
    public Collection removeDvd(String title) {
        Collection removeDvd = dvd1.remove(title);
        return removeDvd;
    }


}
