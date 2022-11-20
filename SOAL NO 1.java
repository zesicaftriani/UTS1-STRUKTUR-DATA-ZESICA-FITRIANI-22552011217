public class Main {
    public static void main(String[] args) {
        int [] nilai = {13,23,12,117,98,10,45,19,89,220,33,67,93,86,9};

        System.out.println( "\n__________________");
        System.out.println( "| Zesica Fitriani |");
        System.out.println( "| 22552011217 |");
        System.out.println( "------------------\n");

        for ( int i =0; i< nilai.length; i++){
            if (i % 2 == 0) {
                System.out.println("Angka " + nilai[i] + " Adalah Genap");

            }
            else {
                System.out.println("Angka " + nilai[i] + " Adalah Ganjil");
            }
        }


    }
}