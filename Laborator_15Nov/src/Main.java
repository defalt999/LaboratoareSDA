public class Main {
    public static void main(String[] args) {
        Pair<Integer>[] perechi = new Pair[] {
                new Pair<>(3, 8),
                new Pair<>(5, 2),
                new Pair<>(1, 7),
                new Pair<>(4, 6)
        };

        Pair<Integer> rezultat = PairUtil.minmax(perechi);
        System.out.println("Minim: " + rezultat.getUnuEl());
        System.out.println("Maxim: " + rezultat.getDoiEl());
    }
}
