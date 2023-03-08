public class FunkyKong extends Large{
    private String monke;
    private int size;
    public FunkyKong(int CC, String Cup, String kart, String bike, String monke, int size){
        super(CC, Cup, kart, bike);
        this.monke = monke;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String monke() {
        return monke;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setmonke(String monke) {
        this.monke = monke;
    }
}
