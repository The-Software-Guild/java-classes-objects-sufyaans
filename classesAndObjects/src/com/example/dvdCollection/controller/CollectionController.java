package com.example.dvdCollection.controller;

import com.example.dvdCollection.model.Collection;
import com.example.dvdCollection.model.CollectionDao;
import com.example.dvdCollection.model.CollectionDaoFile;
import com.example.dvdCollection.view.CollectionView;
import java.util.List;

public class CollectionController {
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
                    editDvd();
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
        Collection newDVD = view.getNewDvdInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayCreateSuccessBanner();

    }
    private void listDvds() {
        view.displayDisplayAllBanner();
        List<Collection> DVDList = dao.getAlldvd();
        view.displayDVDList(DVDList);
    }

    private void viewDvd() {
        view.displayDisplayStudentBanner();
        String title = view.getDvdtitle();
        Collection dvd = dao.viewDvd(title);
        view.displayDvd(dvd);
    }

    private void removeDvd() {
        view.displayRemoveStudentBanner();
        String title = view.getDvdtitle();
        Collection removeDvd = dao.removeDvd(title);
        view.displayRemoveResult(removeDvd);
    }

    private void editDvd(){
        view.displayEditDVDBanner();
        String dvdTitle = view.getDvdtitle();
        Collection dvd = dao.viewDvd(dvdTitle);
        if (dvd != null){
            view.displayDvd(dvd);
            int editSelection = view.editMenu();
            switch (editSelection) {
                case 1:
                    String newTitle = view.getNewTitle();
                    Collection newDVD = dao.removeDvd(dvdTitle);
                    newDVD.setTitle(newTitle);
                    dao.addDVD(newTitle,newDVD);
                    break;
                case 2:
                    String newReleaseDate = view.getNewReleaseDate();
                    dvd.setReleaseDate(newReleaseDate);
                    break;
                case 3:
                    String newDirector = view.getNewDirectorName();
                    dvd.setDirectorName(newDirector);
                    break;
                case 4:
                    String newStudio = view.getNewStudio();
                    dvd.setStudio(newStudio);
                    break;
                case 5:
                    String newMpaaRating = view.getNewMPAA();
                    dvd.setMpaaRating(newMpaaRating);
                    break;
                case 6:
                    String newUserRating = view.getNewUserNote();
                    dvd.setUserNote(newUserRating);
                    break;
                default:
                    unknownCommand();

            }
            view.displayEditSuccessBanner();

        } else {
            //Error message needed
        }
    }



    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}