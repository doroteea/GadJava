package lab4.exceptions.ex1;

public class PaymentCalculator {

    public int process(int nr){
        if(nr == 0){
            //THROW UNCHECKED EXCEPTION (divide with 0)
            throw new DivByZeroException();
        }
        return 5000/nr + 300;
        //return nr;
    }
    public int calculate (int nrOfHours){
        int result=0;
        try {
            checkHours(nrOfHours);
        } catch (FewHoursException ex){
            System.out.println("Not enough hours exception occured.");
            nrOfHours = 31;
        }
        result = process (nrOfHours);
        return result;
    }

    private void checkHours(int nrOfHours) throws FewHoursException {
        if(nrOfHours < 30 && nrOfHours > 0){
            //THROW CHECKED EXCEPTION (checked = putem sa o rezolvam)
            throw new FewHoursException();

        }
    }
}
