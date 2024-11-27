package clase;

public class Clase {
    public static void main(String[] args) {

        ManagerCursuri cursuri=new ManagerCursuri();

        Student[] stu1=new Student[]{new Student ("Mihai","Ionescu",1),new Student("Adrian","Corduneanu",2),new Student("Marian","Popescu",2)};
        Student[] stu2=new Student[]{new Student ("Cerebel","Marin",1),new Student("Ionut","Mosailov",2),new Student("Unguru","Florin",2)};
        Profesor profi1=new Profesor("Sebastian","Dorobantu");
        Student extra=new Student("Colegu","Nou",12);
        Student extra1=new Student("Colegu","Mai nou",12);


        Curs curs1=new Curs("Curs1","Descriere",profi1,stu1);
        Curs curs2=new Curs("Curs2","Descriere",profi1,stu2);

        curs1.NoteazaStudent(stu1[0],8);
        curs1.AdaugaStudent(extra);

        curs1.NoteazaStudent(extra,10);

        curs1.AfiseazaStudenti();
        curs1.AfiseazaStudentiNota();
        curs1.CalculeazaMedia();
        System.out.println("///////////////////////////////");
        curs2.NoteazaStudent(stu2[0],5);
        curs2.NoteazaStudent(stu2[1],5);
        curs2.NoteazaStudent(stu2[2],5);
        curs2.AfiseazaStudentiNota();
        curs2.CalculeazaMedia();








    }
}