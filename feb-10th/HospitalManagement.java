import java.util.*;

class Doctor {
    String specialization;
    Doctor(String s) {
        specialization = s;
    }
}

class Patient {
    Doctor doctor;
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        h.doctors.add(new Doctor("Cardiology"));
        System.out.println(h.doctors.size());
    }
}
