public class Medium extends MKWii{
    private String midKart;
    private String midBike;
    public Medium(int CC, String Cup, String kart, String bike){
        super(CC, Cup);
        this.midKart = kart;
        this.midBike = bike;
    }

    public String getmidKart() {
        return midKart;
    }

    public String getmidBike() {
        return midBike;
    }

    public void setmidKart(String kart) {
        this.midKart = kart;
    }

    public void setbigBike(String bike) {
        this.midBike = bike;
    }

}
