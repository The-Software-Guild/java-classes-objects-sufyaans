package com.example.dvdCollection.view;

import com.example.dvdCollection.model.Collection;

import java.util.Date;
import java.util.List;

public class CollectionView {
    //ClassRosterView

    private CollectionIO io = new CollectionIoConsole();

    public int outputMenu() {
        io.print("Main Menu");
        io.print("1. List DVDs");
        io.print("2. Add new DVD");
        io.print("3. View a DVD");
        io.print("4. Delete a DVD");
        io.print("5. Edit a DVD");
        io.print("6. Search for a DVD");
        io.print("7. Exit");

        return io.readInt("Please select from the"
                + " above choices.", 1, 7);
    }

    //ADD DVD
    public void displayCreateDVDBanner() {
        io.print("=== Add a DVD ===");
    }

    public Collection getNewDvdInfo() {

        String title = io.readString("Please enter a title");
        String releaseDate = io.readString("Please enter Date");
        String mpaaRating = io.readString("Please enter an MPAA Rating");
        String directorName = io.readString("Please enter Director's name");
        String studio = io.readString("Please enter studio name");
        String userNote = io.readString("Please enter user note");

        Collection currentDvd = new Collection(title, releaseDate, directorName, studio, mpaaRating,  userNote);

        currentDvd.setTitle(title);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setStudio(studio);
        currentDvd.setUserNote(userNote);

        return currentDvd;

    }

    public void displayCreateSuccessBanner() {
        io.readString(
                "DVD successfully Added. Press enter to continue");
    }



    //DISPLAY ALL DVD
    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }
    public void displayDVDList(List<Collection> DVDList) {
        io.print("Title: Release Date");
        for (Collection currentDvd : DVDList) {
            String dvdInfo = String.format("%s : %s",

                    currentDvd.getTitle(),
                    currentDvd.getReleaseDate());
                    currentDvd.getMpaaRating();
                    currentDvd.getDirectorName();
                    currentDvd.getStudio();
                    currentDvd.getUserNote();

            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    //View DVD
    public void displayDisplayStudentBanner () {
        io.print("=== Display DVD ===");
    }

    public String getDvdtitle() {
        return io.readString("Please enter the title.");
    }

    public void displayDvd(Collection dvd) {
        if (dvd != null) {
            io.print(dvd.getTitle());
            io.print("title: " + dvd.getTitle());
            io.print("date: " + dvd.getReleaseDate());
            io.print("mpaa rating: " + dvd.getMpaaRating());
            io.print("director name: " + dvd.getDirectorName());
            io.print("user note: " + dvd.getUserNote());
            io.print("");
        } else {
            io.print("DVD doesn't exist");
        }
        io.readString("Please hit enter to continue.");
    }


    //Remove DVD
    public void displayRemoveStudentBanner () {
        io.print("=== Remove DVD ===");
    }

    public void displayRemoveResult(Collection dvdRecord) {
        if(dvdRecord != null){
            io.print("DVD successfully removed.");
        }else{
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    //Edit DVD
    public void displayEditStudentBanner () {
        io.print("=== Edit DVD ===");
    }

    public void displayEditDVDBanner() {
        io.print("=== Edit DVD ===");
    }

    public int editMenu() {

        io.print("Edit Options Menu");
        io.print("1. Edit title");
        io.print("2. Edit release date");
        io.print("3. Edit director");
        io.print("4. Edit studio");
        io.print("5. Edit mmpaa rating");
        io.print("6. Edit user rating");
        io.print("7. Edit note");

        return io.readInt("Please select from the above choices.", 1, 7);
    }

    public String getNewTitle() {
        String title = io.readString("Please enter the dvd title: ");
        return title;
    }

    public String getNewReleaseDate() {
        String releaseDate = io.readString("Please enter the release date: ");
        return releaseDate;
    }

    public String getNewDirectorName() {
        String directorName = io.readString("Please enter the name of the director: ");
        return directorName;
    }

    public String getNewStudio() {
        String studio = io.readString("Please enter the name of the studio: ");
        return studio;
    }

    public String getNewMPAA() {
        String mpaaRating = io.readString("Please enter the dvd mpaa rating: ");
        return mpaaRating;
    }

    public String getNewUserNote() {
        String userNote = io.readString("Please enter the user rating: ");
        return userNote;
    }


    public void displayEditSuccessBanner() {
        io.print("DVD successfully edited. Please hit enter to continue");
    }




    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }










}
