//package Practice3.Task4;
//public class Runner {
//    public static void main(String[] args) {
//        int[] massa = {0, 0, 0};
//        int[] massb = {20, 40, 50};
//        int[] massh = {20, 40, 30};
//        int[] A = new int[massa.length];
//        int[] B = new int [massa.length];
//        int S = 0;
//        for (int i = 0; i < massa.length; i++) {
//            for (int z = i + 1; z < massa.length; z++) {
//                if (massa[i] == massa[z]) {
//                    if (massh[i] >= massh[z]) {
//                        S = S + massh[i]*(massb[i]-massa[i]);
//                    } S = S + massh[z]*(massb[i]-massa[i]);
//                    continue;
//                }
//            }
//        }
//        System.out.println(S);
//    }
//}