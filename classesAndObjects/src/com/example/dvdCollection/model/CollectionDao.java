package com.example.dvdCollection.model;

import java.util.List;

public interface CollectionDao {
    //ClassRosterDao

    Collection addDVD(String dvdID, Collection dvd);

    List<Collection> getAlldvd();
    Collection getDVD(String title);
    Collection deleteDVD(String title);


}
