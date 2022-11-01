public class TestStock {
    public static void main(String[] args) {
        Stock stock=new Stock("ORCL","Oracle Corporation",34.5);
        stock.currentPrice = 34.35;
        System.out.printf("The product of "+stock.symbol+" "+stock.name+" of the percentage of change from previous closing  %.3f ",stock.getChangePercent());
    }
}
 class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){


    }
    Stock(String symbol,String name){
        name="Star";
        symbol="*";
    }
    Stock(String symbol,String name,double previousClosingPrice){
        this.symbol=symbol;
        this.name=name;
        this.previousClosingPrice=previousClosingPrice;

    }
    public  double getChangePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice;
    }
}


