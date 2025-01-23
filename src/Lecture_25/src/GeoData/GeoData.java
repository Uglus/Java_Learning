package Lecture_25.src.GeoData;

public class GeoData {

    private final int id;
    private final double longitude;
    private final double latitide;

    public GeoData(int id, double longitude, double latitide) {
        this.id = id;
        this.longitude = longitude;
        this.latitide = latitide;
    }

    @Override
    public String toString() {
        return "GeoData{" +
                "id=" + id +
                ", longitude=" + longitude +
                ", latitide=" + latitide +
                '}';
    }
}
