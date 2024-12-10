public class Suma extends Thread{
    int suma=0;
    Counter counter;

    public Suma(Counter counter){
        this.counter = counter;
        this.suma=0;
    }
    @Override
    public void run(){
        for(int i=counter.min; i<=counter.max; i++){
            suma=suma+i;
        }
        System.out.println(suma);
    }
}
