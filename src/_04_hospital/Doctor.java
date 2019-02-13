package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<>();
	public Object performsSurgery() {
		return false;
	}

	public Object makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if(patients.size() == 3) {
			throw new DoctorFullException();
		} else {
			patients.add(patient);
		}	
	}

	public List<Patient> getPatients() {
		return this.patients;
	}

	public void doMedicine() {
		for(Patient p : this.patients) {
			p.checkPulse();
		}
	}

}
