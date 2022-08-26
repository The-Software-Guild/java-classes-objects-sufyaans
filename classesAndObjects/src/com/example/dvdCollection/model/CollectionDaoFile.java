package com.example.dvdCollection.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionDaoFile implements CollectionDao {


    private Map<String, Collection> dvd1 = new HashMap<>();
    @Override
    public Collection addDVD(String title, Collection dvd) {
        Collection prevDvd = dvd1.put(title, dvd);
        return prevDvd;
    }
    @Override
    public List<Collection> getAlldvd() {
        return new ArrayList(dvd1.values());
    }
    @Override
    public Collection viewDvd(String title) {
        return dvd1.get(title);
    }

    @Override
    public Collection editDvd(String title) {
        return null;
    }

    @Override
    public Collection removeDvd(String title) {
        Collection removeDvd = dvd1.remove(title);
        return removeDvd;
    }


}
