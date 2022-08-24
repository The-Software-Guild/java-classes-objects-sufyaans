package com.example.dvdCollection.model;

import java.util.ArrayList;
import java.util.List;

public interface CollectionDao {
    //ClassRosterDao

    Collection addDVD(String title, Collection dvd);

    List<Collection> getAlldvd();
    Collection viewDvd(String title);
    Collection editDvd(String title);


    Collection removeDvd(String title);
}
