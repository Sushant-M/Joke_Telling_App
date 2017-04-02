package com.example.sushant.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;
    private String joke;

    public String getJoke(){ return joke;}

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public void setJoke(String data){joke= data;}
}