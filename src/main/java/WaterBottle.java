public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int takeDrink(){
        return (this.volume = this.volume - 10);
    }

    public int emptyBottle(){
        return (this.volume = 0);
    }

    public int refillBottle(){
        return (this.volume = 100);
    }

}
