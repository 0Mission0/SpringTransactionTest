package idv.mission.example.SpringTransactionTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public User findById(int id) {
		return dao.findOne(id);
	}
	
	public long getSize() {
		return dao.count();
	}

	@Transactional(rollbackFor = Exception.class)
	public void newTwoUser() {
		User user1 = new User(4, "user4", "444@444.com");
		User user2 = new User(5, "user5", "555@555.com");
		dao.save(user1);
		Integer.parseInt(null);
		dao.save(user2);
	}
	
}