package demo.repository;

import demo.domain.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by root on 2015/08/02.
 */
public interface DoctorCRUDrepo extends MongoRepository<Doctor,String> {
}
