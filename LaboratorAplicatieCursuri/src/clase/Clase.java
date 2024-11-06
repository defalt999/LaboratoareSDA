package clase;

public class Clase {
    public static void main(String[] args) {

        ManagerCursuri cursuri=new ManagerCursuri();

        Student[] stu1=new Student[]{new Student ("Mihai","Ionescu",1),new Student("Adrian","Corduneanu",2),new Student("Marian","Popescu",2)};
        Profesor[] profi1=new Profesor[]{new Profesor("Sebastian","Dorobantu"),new Profesor("Luca","Stefan")};
        Student extra=new Student("Colegu","Nou",12);
        Student extra1=new Student("Colegu","Mai nou",12);
        Profesor profuRau=new Profesor("Serban","Mihai");


        Curs curs1=new Curs("Curs1","Test1",profi1,stu1);
        Curs curs2=new Curs("Curs2","Test2",profi1,stu1);
        Curs curs3=new Curs("Curs3","Test3",profi1,stu1);
        Curs curs4=new Curs("Curs4","Test4",profi1,stu1);

        cursuri.AdaugaCurs(curs1);
        cursuri.AdaugaCurs(curs2);
        cursuri.AdaugaCurs(curs3);
        cursuri.AdaugaCurs(curs4);

        curs3.AdaugaStudent(extra);
        curs3.AdaugaStudent(extra1);






        //cursuri.AfiseazaCursuriLaConsola();
        System.out.println();
        //curs3.StergeStudent("Adrian","Corduneanu");


        curs3.NoteazaStudent(10,stu1[2]);
        curs3.NoteazaStudent(5,stu1[0]);
        curs3.NoteazaStudent(7,stu1[1]);
        curs3.NoteazaStudent(7,curs3.studenti[3]);

        //curs3.AfiseazaStudentiNota();
        //curs3.CalculeazaMedia();
        cursuri.ArataNoteCursuri();
        curs3.CalculeazaMedia();
        System.out.println();
        curs3.AfiseazaStudentiNota();







    }
}