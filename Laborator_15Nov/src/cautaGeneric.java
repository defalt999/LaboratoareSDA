public class cautaGeneric {
    public static <T extends Comparable> int Search(T[] a, T key) {
        try {
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(key)) {
                    //System.out.println("Pozitia este:" + i);
                    return i;
                }

            }
        } catch (Exception e) {
            System.out.println("Eroare");
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer[] sirTest ={12,432,51,632,66};
        System.out.println(cautaGeneric.Search(sirTest, 66));

    }
}

