package com.example.dvdCollection.controller;

import com.example.dvdCollection.model.Collection;
import com.example.dvdCollection.model.CollectionDao;
import com.example.dvdCollection.model.CollectionDaoFile;
import com.example.dvdCollection.view.CollectionIO;
import com.example.dvdCollection.view.CollectionIoConsole;
import com.example.dvdCollection.view.CollectionView;

import java.util.List;

public class CollectionController {


    //Controller
    private CollectionView view = new CollectionView();

    private CollectionDao dao = new CollectionDaoFile();

//    private CollectionView view;
//
//    private CollectionDao dao;
//
//    public CollectionController(CollectionDaoFile dao, CollectionView view) {
//        this.view = view;
//        this.dao = dao;
//    }






    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listDvds();
                    break;
                case 2:

                    createDvd();
                    break;
                case 3:
                    viewDvd();
                    break;
                case 4:
                    removeDvd();
                    break;
                case 5:
                    //io.print("EDIT DVD");
                    break;
                case 6:
                    //io.print("SEARCH DVD");
                    break;
                case 7:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    }
    private int getMenuSelection() {
        return view.outputMenu();
    }




    private void createDvd() {
        view.displayCreateDVDBanner();
        Collection newDvd = view.getNewDvdInfo();
        dao.addDVD(newDvd.getDvdID(), newDvd);
        view.displayCreateSuccessBanner();
        System.out.println(newDvd);

    }
    private void listDvds() {
        view.displayDisplayAllBanner();
        List<Collection> dvdList = dao.getAlldvd();
        view.displayDVDList(dvdList);
        System.out.println(dvdList);
    }

    private void viewDvd() {
        view.displayDisplayStudentBanner();
        String title = view.getDvdtitle();
        Collection dvd = dao.getDVD(title);
        view.displayDvd(dvd);
    }

    private void removeDvd() {
        view.displayRemoveStudentBanner();
        String title = view.getDvdtitle();
        Collection removeDvd = dao.removeDvd(title);
        view.displayRemoveResult(removeDvd);
    }



    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}