public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int startVolume(){
        return this.volume;
    }

public int reduceBy10(){
        return this.volume -= 10;
}

public int empty() {
        return this.volume = 0;
}

public int fill() {
        return this.volume = 100;
}



}

