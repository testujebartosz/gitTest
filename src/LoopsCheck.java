public class LoopsCheck {
    //wypisz liczby z zakresu 1-100 podzielone przez 3
    //odwrócic elementy tablicy [1,3,5] -> [5,3,1]
    public static void main(String[] args) {

        int number = 100;
        for (int i=0; i<=number; i++){
            if (i%3==0){
                System.out.println("Jestem podzielna przez 3: " + i);
            }
        }

     /*   int[] tab = new int[]{1,3,5};
       *//* System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);*//*
        int[] arr = new int[tab.length];
        System.out.println(tab.length);

        for(int i=0; i<tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();

        for(int i=0; i< tab.length; i++)
            arr[i] = tab[tab.length - 1 - i];*/


       /* for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();*/

        int[] numbers = new int[] {1,3,5,7,0};

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i=0; i<(numbers.length/2) /*do którego momentu chcemy dojść - do połowy tabeli, element w połowie nie będzie się zamieniał */; i++){
            int temp = numbers[i]; //zmienna tymaczasowa dla i=0 1 i=1 3
            numbers[i]=numbers[numbers.length-1-i]; // dla pierwszej iteracji ; dla i=0 4 element = 0, dla i=3=>7
            numbers[numbers.length-1-i]= temp; //temp = 1 // numbers[3]=7
            System.out.println("Iteracja numer " + i);

        }

        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");;
        }



    }
}
