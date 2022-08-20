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
        String dvdID = io.readString("Please enter DVD ID");
        String title = io.readString("Please enter a title");
        String releaseDate = io.readString("Please enter Date");
        String mpaaRating = io.readString("Please enter an MPAA Rating");
        String directorName = io.readString("Please enter Director's name");
        String studio = io.readString("Please enter studio name");
        String userNote = io.readString("Please enter user note");

        Collection currentDvd = new Collection(dvdID);

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
        for (Collection currentDvd : DVDList) {
            String dvdInfo = String.format("#%s : %s %s %s %s %s %s",
                    currentDvd.getDvdID(),
                    currentDvd.getTitle(),
                    currentDvd.getReleaseDate());
                    currentDvd.getMpaaRating();
                    currentDvd.getDirectorName();
                    currentDvd.getUserNote();

            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }


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

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }










}
