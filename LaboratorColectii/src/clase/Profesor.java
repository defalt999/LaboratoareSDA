package clase;

public class Profesor extends Persoana {



    public Profesor(String nume, String prenume) {
        super(nume,prenume);

    }
    ////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }





}
