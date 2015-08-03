package demo.repository;

import demo.domain.Management;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by root on 2015/08/02.
 */
public interface ManagementCRUDrepo extends MongoRepository<Management,String> {
}
