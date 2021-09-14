public class GenericDemo {
    public static void main(String[] args) {
        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b', 'u', 'c', 'y'};

        printMe(iray);
        printMe(cray);
    }

//    private static void printMe(Integer[] i){
////        for(Integer x : i)
////            System.out.println(x);
////        System.out.println();
////    }
////    private static void printMe(Character[] i){
////        for(Character x : i)
////            System.out.println(x);
////        System.out.println();
////    }

    // generic method
    private static <T> void printMe(T[] arr){
        for(T a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }


}
