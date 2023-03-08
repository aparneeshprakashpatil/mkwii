public class Small extends MKWii{
    private String smallKart;
    private String smallBike;
    public Small(int CC, String Cup, String kart, String bike){
        super(CC, Cup);
        this.smallKart = kart;
        this.smallBike = bike;
    }

    public String getsmallKart() {
        return smallKart;
    }

    public String getsmallBike() {
        return smallBike;
    }

    public void setsmallKart(String kart) {
        this.smallKart = kart;
    }

    public void setbigBike(String bike) {
        this.smallBike = bike;
    }

}
