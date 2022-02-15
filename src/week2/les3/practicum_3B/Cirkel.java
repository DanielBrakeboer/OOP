package week2.les3.practicum_3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        if (rad <= 0)
            throw new IllegalArgumentException("Radius mag niet 0 of lager zijn");
        this.radius = rad;
        this.xPositie = x;
        this. yPositie = y;
    }

    public String toString(){
        return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}
