public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer (int sheetsOfPaper, int tonerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void setSheetsOfPaper(int sheetsOfPaper) {
        this.sheetsOfPaper = sheetsOfPaper;
    }

    public int print(int pages, int copies){
        if ((pages * copies) <= sheetsOfPaper) {
            return (this.sheetsOfPaper = this.sheetsOfPaper - (pages * copies));
        } else {
            return sheetsOfPaper;
        }
    }

    public int reduceTonerLevel(int pages, int copies) {
        if ((pages * copies) <= sheetsOfPaper) {
            return (this.tonerVolume = this.tonerVolume - (pages * copies));
        } else {
            return tonerVolume;
        }
    }
}
