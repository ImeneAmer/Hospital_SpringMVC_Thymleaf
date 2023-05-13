package ma.imeneamer.hospital_mvc_thymleaf;

import ma.imeneamer.hospital_mvc_thymleaf.entities.Patient;
import ma.imeneamer.hospital_mvc_thymleaf.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalMvcThymleafApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(HospitalMvcThymleafApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient=new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);


        Patient patient2=new Patient(null,"Yassine",new Date(),false,123);

        Patient patient3=Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build();

        patientRepository.save(patient);
        patientRepository.save(patient2);
        patientRepository.save(patient3);
    }
}
