package demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by root on 2015/08/01.
 */
@Document
public class Pharmacist {
    /*Have no idea what this would be linked with*/
    @Id
    private String id;

    private String name ;
    private String surname ;
    private String password;
    private String username;

    private Pharmacist(){}
    private Pharmacist(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.password=builder.password;
        this.surname=builder.surname;
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
        public Builder copy(Pharmacist pharmacist){
            return this;
        }
        public Pharmacist build(){
            return new Pharmacist(this);
        }
    }

    public String getId() {
        return id;
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
