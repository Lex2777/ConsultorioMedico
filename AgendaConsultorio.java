public class AgendaConsultorio {
    String nombreConsultorio;
    String medico;
    String direccion;

    public void mostrarAgenda() {
        System.out.println("+++++Agenda del Consultorio+++++");
        System.out.println("Consultorio: " + nombreConsultorio);
        System.out.println("Medico: " + medico);
        System.out.println("Direccion: " + direccion);
    }
}
