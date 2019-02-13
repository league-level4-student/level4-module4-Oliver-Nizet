package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		return this.doctors;
	}

	public void addPatient(Patient patient) {
		this.patients.add(patient);	
	}

	public List<Patient> getPatients() {
		return this.patients;
	}

	public void assignPatientsToDoctors() {
		int dn = 0;
		int dc = 0;
		for(int i = 0; i < this.patients.size(); i++) {
			if(dc == 3) {
				dc = 0;
				dn++;
			}
			try {
				this.doctors.get(dn).assignPatient(this.patients.get(i));
			} catch (DoctorFullException e) {
				e.printStackTrace();
			}
			dc++;
		}
	}

}
