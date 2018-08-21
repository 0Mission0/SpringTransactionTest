package idv.mission.example.SpringTransactionTest;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

}