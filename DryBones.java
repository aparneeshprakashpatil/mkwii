public class DryBones extends Small {
    private String koopa;
    private int speed;
    public DryBones(int CC, String Cup, String kart, String bike, String koopa, int speed){
        super(CC, Cup, kart, bike);
        this.koopa = koopa;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String koopa() {
        return koopa;
    }

    public void setSpeed(int Speed) {
        this.speed = Speed;
    }

    public void setkoopa(String koopa) {
        this.koopa = koopa;
    }
    

}
