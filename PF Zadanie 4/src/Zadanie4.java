public class Zadanie4 {

    static void printPowerSet(char []set, int set_size) {
        long pow_set_size = (long)Math.pow(2, set_size);
        int counter, j;

        for(counter = 0; counter < pow_set_size; counter++) {
            System.out.print("[");
            for(j = 0; j < set_size; j++) {

                if((counter & (1 << j)) > 0){
                    System.out.print(set[j]);
                }
            }
            System.out.print("],");
        }
    }

    public static void main (String[] args) {
        char []set = {'1', '2', '3'};
        printPowerSet(set, 3);
    }
}