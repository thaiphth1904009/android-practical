package com.phamthongthai_practical.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "feedback")
public class Feedback {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "mail")
    public String mail;

    @ColumnInfo(name = "gender")
    public String gender;

    @ColumnInfo(name = "feedback")
    public String feedback;

    @ColumnInfo(name = "checkbox")
    public boolean checkbox;

    public Feedback(int id, String name, String mail, String gender, String feedback, boolean checkbox) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.gender = gender;
        this.feedback = feedback;
        this.checkbox = checkbox;
    }

    public Feedback() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
}
