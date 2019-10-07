public class Printer {

    private int noOfSheetsRemaining;
   private int toner;


    public Printer(int noOfSheetsRemaining){

        this.noOfSheetsRemaining = noOfSheetsRemaining;
    }

    public int getNoOfSheets(){
        return this.noOfSheetsRemaining;
    }


    public int print(int noOfPagesToPrint, int noOfCopies){
        return noOfPagesToPrint * noOfCopies;
    }

}
