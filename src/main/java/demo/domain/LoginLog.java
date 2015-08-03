package demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Created by root on 2015/08/01.
 */
@Document
public class LoginLog {
    @Id
    private String id;
    //@Column(unique = true)
    private int code;
    private String date;

    @DBRef private Patient patient;
    @DBRef private Doctor doctor;
    @DBRef private Management management;
    @DBRef private Pharmacist pharmacist;

    private LoginLog(){}

    private LoginLog(Builder builder){
        id = builder.id;
        code = builder.code;
        date = builder.date;
        patient = builder.patient;
        doctor = builder.doctor;
        management = builder.management;
        pharmacist = builder.pharmacist;
    }

    public static class Builder{
        private String id;

        private int code;
        private String date;

         private Patient patient;
         private Doctor doctor;
         private Management management;
         private Pharmacist pharmacist;

        public Builder(int code){this.code = code;}

        public Builder date(String date){
            this.date= date;
            return this;
        }
        public Builder patient(Patient patient){
            this.patient = patient;
            return this;
        }
        public Builder doctor(Doctor doctor){
            this.doctor=doctor;
            return this;
        }
        public Builder management(Management management){
            this.management=management;
            return this;
        }
        public Builder pharmacist(Pharmacist pharmacist){
            this.pharmacist=pharmacist;
            return this;
        }

        public Builder copy(LoginLog loginLog){
            id = loginLog.getId();
            //and the rest to be added later
            return this;
        }

        public LoginLog build(){
            return new LoginLog(this);
        }

    }

    public String getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Management getManagement() {
        return management;
    }

    public Pharmacist getPharmacist() {
        return pharmacist;
    }
}
