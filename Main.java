public class Main {
    public static void main(String[] args) {
        RanNumbFacade facade = new RanNumbFacade(new RanNumb(),new ListFilter(),new ListPrinter());
        facade.printRandomEvenList();
    }
}
