public class Printer {

    private int sheetsOfPaper;

    public Printer (int sheetsOfPaper){
        this.sheetsOfPaper = sheetsOfPaper;
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

}
