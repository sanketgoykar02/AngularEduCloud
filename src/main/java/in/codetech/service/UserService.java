package in.codetech.service;

import java.util.List;

import in.codetech.model.User;

public interface UserService {

	//public User createUser(User user, Set<UserRole> userRoles) throws Exception ;
	
	public User getUserById(Long id);

	public List<User> findAllUsers();
	public User saveUser(User user);

//	public User updateUser(Long id, User user);

	public void deleteUserById(Long id);
}
