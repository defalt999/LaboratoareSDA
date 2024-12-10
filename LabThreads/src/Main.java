public class Main {
    public static void main(String[] args) {

        Counter count1=new Counter(0,500);
        Counter count2=new Counter(501,1000);

        Suma suma1=new Suma(count1);
        Suma suma2=new Suma(count2);

        suma1.start();
        suma2.start();

        try{
            suma1.join();
            suma2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        int totalSum = suma1.suma + suma2.suma;

        System.out.println("Sum from thread 1: " + suma1.suma);
        System.out.println("Sum from thread 2: " + suma2.suma);
        System.out.println("Total sum: " + totalSum);












    }
}