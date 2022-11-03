package src.Guest;

import java.util.ArrayList;


public class People {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer roomNumber;
    private ArrayList<People> peopleList;


    public Integer getId() {
        return id;
    }

    public People setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public People setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public People setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public People setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }

    public People setPeopleList(ArrayList<People> peopleList) {
        this.peopleList = peopleList;
        return this;
    }
}
