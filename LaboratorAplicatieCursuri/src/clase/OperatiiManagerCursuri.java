package clase;

public interface OperatiiManagerCursuri {
    public void AdaugaCurs(Curs curs);
    public void ModificaCurs(Curs deModificat,String titluN,String descN,Profesor[] profiN,Student[] stuN);
    public void StergeCurs(String deSters);
}