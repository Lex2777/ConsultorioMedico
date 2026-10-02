import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("++++++++CONSULTORIO MEDICO+++++++++");
        System.out.println("Sistema de Gestion de Pacientes y Citas");
        System.out.println();

        // la primera entrada
        System.out.print("Ingrese ID del paciente: ");
        String id = leer.nextLine();
        System.out.print("Ingrese nombre del paciente: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese telefono: ");
        String telefono = leer.nextLine();
        System.out.print("Ingrese correo: ");
        String correo = leer.nextLine();
        System.out.print("Ingrese direccion: ");
        String direccion = leer.nextLine();

        System.out.print("Ingrese ID de la cita: ");
        String idCita = leer.nextLine();
        System.out.print("Ingrese fecha (dd/mm/aaaa): ");
        String fecha = leer.nextLine();
        System.out.print("Ingrese hora (hh:mm): ");
        String hora = leer.nextLine();
        System.out.print("Ingrese motivo: ");
        String motivo = leer.nextLine();

        // aqui yace el proceso
        Paciente paciente1 = new Paciente();
        paciente1.idPaciente = id;
        paciente1.nombre = nombre;
        paciente1.edad = edad;
        paciente1.telefono = telefono;
        paciente1.correo = correo;
        paciente1.direccion = direccion;

        Cita cita1 = new Cita();
        cita1.idCita = idCita;
        cita1.fecha = fecha;
        cita1.hora = hora;
        cita1.motivo = motivo;
        cita1.estado = "Programada";
        cita1.paciente = paciente1;

        AgendaConsultorio agenda = new AgendaConsultorio();
        agenda.nombreConsultorio = "Consultorio San Jose";
        agenda.medico = "Dr. Martinez";
        agenda.direccion = "Av. Salud 456";

        // esta es la salida
        System.out.println();
        paciente1.mostrarInformacion();
        System.out.println();
        cita1.mostrarCita();
        System.out.println();
        agenda.mostrarAgenda();
    }
}