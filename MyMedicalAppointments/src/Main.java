import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Juana de Arco", "Neurología");
        myDoctor.addAvailableAppointment(new Date(),"10 am.");
        myDoctor.addAvailableAppointment(new Date(),"1 pm.");
        myDoctor.addAvailableAppointment(new Date(),"4 pm.");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        /*Patient patient = new Patient("Michael Jackson", "michaeljc@mail.com");
        patient.setWeight(89.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("32565478");
        System.out.println(patient.getPhoneNumber());*/
    }
}

