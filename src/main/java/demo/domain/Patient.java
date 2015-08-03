package demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by root on 2015/08/01.
 */
@Document
public class Patient {
    @Id
    private String id;
    //should be made unique
    //@Column(unique = true)
    private int code;

    private String name ;
    private String surname ;
    private String password;
    private String username;

    //not sure if patient knows doc or if doctor will only appear on their record
//    @DBRef
//    private List<Doctor> doctors;

    private Patient(){}
    private Patient(Builder builder){
        this.id=builder.id;
        this.code=builder.code;
        this.name=builder.name;
        this.surname=builder.surname;
        this.password=builder.password;
        this.username=builder.username;
    }

    public static class Builder{
        private String name ;
        private String surname ;
        private String password;
        private String username;
        private String id;
        private int code;

        public Builder(int code){
            this.code=code;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }
        public Builder username(String username){
            this.username=username;
            return this;
        }
        public Builder copy(Patient patient){
            this.id=patient.getId();
            return this;
        }
        public Patient build(){
            return new Patient(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
