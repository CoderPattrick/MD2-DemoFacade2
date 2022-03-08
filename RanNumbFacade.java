import java.util.ArrayList;

public class RanNumbFacade {
    private RanNumb core;
    private ListFilter filter;
    private ListPrinter printer;

    public RanNumbFacade(RanNumb core, ListFilter filter, ListPrinter printer) {
        this.core = core;
        this.filter = filter;
        this.printer = printer;
    }
    public void printRandomEvenList(){
        ArrayList<Integer> list = core.generateLists();
        list = filter.filterOdd(list);
        printer.printList(list);
    }


}
