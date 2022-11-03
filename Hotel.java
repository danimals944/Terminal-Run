package src.Guest;

import java.util.List;

public class Hotel {
    private Integer id;
    private String Company;
    private String City;
    private String timeZone;

    private List<Hotel> hotelList;

    public Integer getId() {
        return id;
    }

    public Hotel setId(Integer id) {
        this.id = id;
        return this;

    }

    public String getCompany() {
        return Company;
    }

    public Hotel setCompany(String company) {
        Company = company;
        return this;

    }

    public String getCity() {
        return City;
    }

    public Hotel setCity(String city) {
        City = city;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public Hotel setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public Hotel setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
        return this;
    }
}
