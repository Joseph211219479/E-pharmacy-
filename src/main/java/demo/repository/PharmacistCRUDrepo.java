package demo.repository;

import demo.domain.Pharmacist;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by root on 2015/08/02.
 */
public interface PharmacistCRUDrepo extends MongoRepository<Pharmacist,String> {
}
