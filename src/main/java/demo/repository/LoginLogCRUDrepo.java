package demo.repository;

import demo.domain.LoginLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by root on 2015/08/02.
 */
public interface LoginLogCRUDrepo extends MongoRepository<LoginLog,String> {
}
