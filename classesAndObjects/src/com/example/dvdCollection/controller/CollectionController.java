package com.example.dvdCollection.controller;

import com.example.dvdCollection.model.Collection;
import com.example.dvdCollection.model.CollectionDao;
import com.example.dvdCollection.model.CollectionDaoFile;
import com.example.dvdCollection.view.CollectionIO;
import com.example.dvdCollection.view.CollectionIoConsole;
import com.example.dvdCollection.view.CollectionView;

public class CollectionController {
    private CollectionView view = new CollectionView();
    private CollectionIO io = new CollectionIoConsole();


    private CollectionDao dao = new CollectionDaoFile();



    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    io.print("LIST DVDs");
                    break;
                case 2:
                    createDvd();
                    break;
                case 3:
                    io.print("VIEW DVD");
                    break;
                case 4:
                    io.print("DELETE DVD");
                    break;
                case 5:
                    io.print("EDIT DVD");
                    break;
                case 6:
                    io.print("SEARCH DVD");
                    break;
                case 7:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }
    private int getMenuSelection() {
        return view.outputMenu();
    }



    private void createDvd() {
        view.displayCreateDVDBanner();
        Collection newDvd = view.getNewDvdInfo();
        dao.addDVD(newDvd.getDvdID(), newDvd);
        view.displayCreateSuccessBanner();
    }


}
