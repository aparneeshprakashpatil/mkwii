public class Large extends MKWii{
    private String bigKart;
    private String bigBike;
    public Large(int CC, String Cup, String kart, String bike){
        super(CC, Cup);
        this.bigKart = kart;
        this.bigBike = bike;
    }

    public String getbigKart() {
        return bigKart;
    }

    public String getbigBike() {
        return bigBike;
    }

    public void setbigKart(String kart) {
        this.bigKart = kart;
    }

    public void setbigBike(String bike) {
        this.bigBike = bike;
    }

}
