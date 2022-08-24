package com.example.dvdCollection;

import com.example.dvdCollection.controller.CollectionController;
import com.example.dvdCollection.model.CollectionDao;
import com.example.dvdCollection.model.CollectionDaoFile;
import com.example.dvdCollection.view.CollectionIO;
import com.example.dvdCollection.view.CollectionIoConsole;
import com.example.dvdCollection.view.CollectionView;

public class App {

    //Problem viewing all DVDs
    public static void main(String[] args) {
        CollectionController controller = new CollectionController();
        controller.run();
//        CollectionIO myIo = new CollectionIoConsole();
//        CollectionView myView = new CollectionView(myIo);
//        CollectionDao myDao = new CollectionDaoFile();
//        CollectionController controller =
//                new CollectionController(myDao, myView);
//        controller.run();
    }
}


