package demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
/**
 * Created by Root on 2015/08/01.
 */
@Document
public class Person {
    @Id
    private String id;



}
