package com.example.dvdCollection.model;

import java.util.ArrayList;
import java.util.List;

public interface CollectionDao {
    //ClassRosterDao

    Collection addDVD(String dvdID, Collection dvd);

    List<Collection> getAlldvd();
    Collection getDVD(String dvdID);
    Collection deleteDVD(String dvdID);


    Collection removeDvd(String title);
}
