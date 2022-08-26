package com.example.dvdCollection.model;

import java.util.List;

public interface CollectionDao {
    Collection addDVD(String title, Collection dvd);

    List<Collection> getAlldvd();
    Collection viewDvd(String title);
    Collection editDvd(String title);


    Collection removeDvd(String title);
}
