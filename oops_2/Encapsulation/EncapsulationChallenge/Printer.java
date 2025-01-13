package oops_2.Encapsulation.EncapsulationChallenge;

public class Printer {
    private  int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    private int printTotal;

   
   
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel>0 && tonerLevel<=100)?tonerLevel:-1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }
            this.tonerLevel=this.tonerLevel+tonerAmount;
            return this.tonerLevel;
        }
        return -1;
    }
    public void printPages(int pages){
            int pagesToPrint=0;
            if(this.duplex){
                pagesToPrint=(pages/2)+(pages%2);
                System.out.println("Duplex printer & pages = "+pagesToPrint);
            }else{
                pagesToPrint=pages;
                System.out.println("Non-Duplex printer & pages = "+pagesToPrint);
            }
            printTotal+=pagesToPrint;
            System.out.println("Total pages printed = "+printTotal);
            System.out.println("***************************");
        // return pagesToPrint;
    }
}
