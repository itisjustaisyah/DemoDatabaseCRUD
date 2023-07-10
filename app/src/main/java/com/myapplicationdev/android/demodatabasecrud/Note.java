package com.myapplicationdev.android.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by Nuur Aisyah Binte Farouk on 10/7/2023.
 * C346-1D-E63A-A
 */
public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    @Override
    public String toString(){
        return "ID:" + id +", " + noteContent;}
}

