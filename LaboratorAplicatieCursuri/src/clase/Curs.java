package clase;

import java.util.Arrays;

public class Curs implements OperatiiCurs{
    String nume;
    String descriere;
    Profesor[] profesori;
    Student[] studenti;

    int[] note;

    public Curs(String nume, String descriere, Profesor[] profesori, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesori = profesori;
        this.studenti = studenti;
        this.note=new int[studenti.length];
    }

    @Override
    public String toString() {
        return "Curs{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", profesori=" + Arrays.toString(profesori) +
                ", studenti=" + Arrays.toString(studenti) +
                '}';
    }

    public Curs() {
        this.nume = "";
        this.descriere = "";
        this.profesori = new Profesor[0];
        this.studenti = new Student[0];
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Profesor[] getProfesori() {
        return profesori;
    }

    public void setProfesori(Profesor[] profesori) {
        this.profesori = profesori;
    }

    public Student[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }
    ////////////////////////////////////////////////


    public void AdaugaStudent(Student deAdaugat){

        int lungimenoua= studenti.length+1;
        Student[] aux=new Student[lungimenoua];
        int index=0;
        for(Student s : studenti)
        {
            aux[index++] = s;
        }
        aux[index]=deAdaugat;
        this.studenti=aux;

        int indexn=0;
        int[] auxi=new int[lungimenoua];
        for(int n : note)
        {
            auxi[indexn++] = n;
        }
        auxi[indexn]=0;
        this.note=auxi;


    }
    public void StergeStudent(String numeS,String prenS){
        int lungimenoua=studenti.length-1;
        Student[] aux=new Student[lungimenoua];
        int[] auxi=new int[lungimenoua];
        int index=0;
        for(int i=0;i< studenti.length;i++){
            if(!studenti[i].nume.equals(numeS) && !studenti[i].prenume.equals(prenS)){
                aux[index]=studenti[i];
                auxi[index]=note[i];
                index++;
            }

        }


        this.studenti = new Student[lungimenoua];
        System.arraycopy(aux, 0, studenti, 0, lungimenoua);
        this.note = new int[lungimenoua];
        System.arraycopy(auxi, 0, note   , 0, lungimenoua);



        System.out.println(studenti.length);
        System.out.println(lungimenoua);








    }
    public void ModificaStudent(Student stu,String nums,String prenums){
        stu.nume=nums;
        stu.prenume=prenums;
    }
    public void AfiseazaStudenti(){
        for(int i=0;i< studenti.length;i++){
            System.out.println(studenti[i].nume+" "+studenti[i].prenume+" ");
        }
    }

    public void AdaugaProf(Profesor deAdaugat){

        int lungimenoua= profesori.length+1;
        Profesor[] aux=new Profesor[lungimenoua];
        int index=0;
        for(Profesor s : profesori)
        {
            aux[index++] = s;
        }
        aux[index]=deAdaugat;
        this.profesori=aux;
    }
    public void StergeProf(String numeS,String prenS){
        int lungimenoua=profesori.length-1;
        Profesor[] aux=new Profesor[lungimenoua];
        for(int i=0;i<= profesori.length;i++){
            if(profesori[i].nume!=numeS && profesori[i].prenume!=prenS){
                aux[i]=profesori[i];
            }
        }
        this.profesori=aux;
    }
    public void ModificaProf(Profesor prof,String nums,String prenums){
        prof.nume=nums;
        prof.prenume=prenums;
    }

    public void NoteazaStudent(int nota,Student deNotat){

        for(int i=0;i<studenti.length;i++){
            if(studenti[i].equals(deNotat))
                note[i]=nota;
        }



    }

    public void AfiseazaStudentiNota(){

        for(int i=0;i<studenti.length;i++){
            System.out.println(studenti[i].nume+" "+studenti[i].prenume+" "+note[i]);

        }

    }

    public void CalculeazaMedia(){

        double medie=0;
        int contor=0;
        for(int i=0;i<note.length;i++){

            if(note[i]!=0){
                medie=medie+note[i];
                contor++;
            }
        }
        medie=medie/contor;
        System.out.println("Media este: "+medie);

    }


}
