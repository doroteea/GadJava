package lab3.ch5;

public class AscBubleSort extends TemplateMethodBubbleSort {

    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1>i2)
            return false;
        else
            return true;
    }
}
