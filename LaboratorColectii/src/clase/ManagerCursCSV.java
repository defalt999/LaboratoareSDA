package clase;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ManagerCursCSV extends ManagerCursuri implements OperatiiManagerCursuri {
    String cursPath="C:\\Users\\defalt\\Desktop\\LaboratorColectii\\src\\clase\\CSVuri\\cursuri.csv";
    String profPath="C:\\Users\\defalt\\Desktop\\LaboratorColectii\\src\\clase\\CSVuri\\profesori.csv";
    String studPath="C:\\Users\\defalt\\Desktop\\LaboratorColectii\\src\\clase\\CSVuri\\studenti.csv";
    String outPath="C:\\Users\\defalt\\Desktop\\LaboratorColectii\\src\\clase\\CSVuri\\output.csv";

    public ManagerCursCSV() {
        try {
            File studenti = new File(studPath);
            File profesori = new File(profPath);
            File cursuri = new File(cursPath);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void CitesteDate(){
        List<Student> students=CitireStudenti();
        List<Profesor> profesors=CitireProfesori();
        List<Curs> cursuri=PopuleazaCurs(students,profesors);
        try {
            File f = new File(outPath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
            try {
                bw.write(cursuri.get(0) + "\r\n"+cursuri.get(1) + "\r\n");
                bw.flush();
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                bw.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }



        
    }

    public List<Student> CitireStudenti() {
        List<Student> students = new ArrayList<Student>();
        try {

            File f = new File(studPath);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line != null) {
                line = br.readLine();
            }
            while (line != null) {
                String[] splituri = line.split(",");

                Student s = new Student(splituri[0], splituri[1].trim(), Integer.parseInt(splituri[2].trim()));
                students.add(s);
                line = br.readLine();
            }
            return students;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return students;
    }
    public List<Profesor> CitireProfesori() {
        List<Profesor> profesors = new ArrayList<Profesor>();
        try {
            File f = new File(profPath);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line != null) {
                line = br.readLine();
            }
            while (line != null) {
                String[] splituri = line.split(",");
                Profesor prof=new Profesor(splituri[0],splituri[1]);
                profesors.add(prof);
                line = br.readLine();
            }return profesors;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void ScrieStud(Student student) {
        try {
            File f = new File(outPath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
            try {
                bw.write(student.getNume() + "," + student.getPrenume() + "," + student.getGrupa() + "\r\n");
                bw.flush();
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                bw.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public List<Curs> PopuleazaCurs(List<Student> studenti, List<Profesor> profesori){

        List<Curs> cursuri = new ArrayList<Curs>();
        try {
            int contor=0;
            Student[] studentz=new Student[studenti.size()];
            for (int i = 0; i < studenti.size(); i++)
                studentz[i] = studenti.get(i);

            File f = new File(cursPath);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line != null) {
                line = br.readLine();
            }
            while (line != null) {
                String[] splituri = line.split(",");
                Curs deAdaugat= new Curs(splituri[0],splituri[1],profesori.get(contor),studentz);
                cursuri.add(deAdaugat);
                contor++;
                line = br.readLine();
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }



        return cursuri;

    }

}









