package clase;

import java.util.*;

public class Curs implements OperatiiCurs{
    String nume;
    String descriere;
    Profesor profesor;
    Set<Student> studenti;
    HashMap<Student, Integer> notee;



    public Curs(String nume, String descriere, Profesor profesor, Student[] studentii) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesor = profesor;
        this.studenti = new HashSet<>();
        this.notee = new HashMap<>();
        for(Student student : studentii) {
            this.studenti.add(student);
        }

    }



    public Curs() {
        this.nume = "";
        this.descriere = "";
        this.profesor = new Profesor("","");
        this.studenti = new HashSet<>();
        this.notee = new HashMap<>();
    }

    ////////////////////////////////////////////////


    public void AdaugaStudent(Student deAdaugat){
       studenti.add(deAdaugat);
    }
    public void StergeStudent(Student deSters){
        studenti.remove(deSters);

    }
    public void ModificaStudent(Student stu,String nums,String prenums){
        studenti.remove(stu);
        stu.nume = nums;
        stu.prenume=prenums;
        studenti.add(stu);

    }
    public void AfiseazaStudenti(){
        for(Student stu : studenti){
            System.out.println(stu.nume+" "+stu.prenume);
        }
    }


    public void ModificaProf(Profesor prof,String nums,String prenums){
        prof.nume=nums;
        prof.prenume=prenums;
    }

    public void NoteazaStudent(Student deNotat,Integer nota){

        notee.put(deNotat,nota);
    }

    public void AfiseazaStudentiNota(){
        for(HashMap.Entry<Student, Integer> entry : notee.entrySet()){
            Student student = entry.getKey();
            Integer nota = entry.getValue();
            System.out.println(student+" "+nota);
        }
        
    }

    public void CalculeazaMedia(){
        int medie=0;
        int contor=0;
        for(HashMap.Entry<Student, Integer> entry : notee.entrySet()){
            Integer nota = entry.getValue();
            medie=medie+nota;
            contor++;
        }
        medie=medie/contor;
        System.out.println("Media este: "+medie);
    }


}
