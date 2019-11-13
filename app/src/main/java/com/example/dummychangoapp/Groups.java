package com.example.dummychangoapp;

class Groups {
    private String groupName;
    private String members;
    private String date;
    private String groupType;
    private int imageID;


    public Groups(String groupName, String members, String date, String groupType, int imageID){
        this.groupName = groupName;
        this.members = members;
        this.date = date;
        this.groupType = groupType;
        this.imageID = imageID;
    }


    String getGroupName(){ return groupName;}

    String getMembers(){ return members;}

    String getDate(){ return date;}

    String getGroupType(){return groupType;}

    public int getImageID(){return imageID;}

    public void add(Groups group) {
    }
}
