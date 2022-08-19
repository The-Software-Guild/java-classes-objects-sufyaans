package com.example.dvdCollection.view;

import com.example.dvdCollection.model.Collection;

import java.util.Date;

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






}
