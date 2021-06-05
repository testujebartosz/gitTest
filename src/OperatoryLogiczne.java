public class OperatoryLogiczne {
    public static void main(String[] args) {

        boolean firstValue = 2 > 1; // ture
        boolean secondValue = 2 < 1; // false
        boolean thirdValue = false;
        boolean fourthValue = true;
        boolean warunek = thirdValue == fourthValue;

        System.out.println(warunek);

        //&& -> true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);

        // || lub -> true gdy jedno wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || thirdValue);

        // ! negacja - zwraca wartość przeciwną do wyrażenia przed kórym się znajduje
        System.out.println(!firstValue);
        System.out.println(!thirdValue);
        System.out.println(!(firstValue&&secondValue));
    }
}
