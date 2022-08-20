package com.example.dvdCollection;

import com.example.dvdCollection.controller.CollectionController;

public class App {

    //Problem viewing all DVDs and specific DVD's
    public static void main(String[] args) {
        CollectionController controller = new CollectionController();
        controller.run();
    }
}
