package demo.repository;

import demo.domain.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by root on 2015/08/02.
 */
public interface PatientCRUDrepo extends MongoRepository<Patient,String> {
}
