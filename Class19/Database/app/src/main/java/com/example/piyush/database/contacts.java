package com.example.piyush.database;

public class contacts {
    private int id;
    private String name;
    private  String email;
    private  String Phoneno;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return Phoneno;
    }

    public void setPhoneno(String phoneno) {
        Phoneno = phoneno;
    }

    public contacts(int id, String name, String email, String phoneno) {
        this.id = id;
        this.name = name;
        this.email = email;
        Phoneno = phoneno;
    }
}
