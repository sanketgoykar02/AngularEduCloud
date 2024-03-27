package in.codetech.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.codetech.model.User;
import in.codetech.model.UserRole;
import in.codetech.repository.RoleRepository;
import in.codetech.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);

	}
	



//	@Override
//	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
//		
//		User local = this.userRepository.findByUserName(user.getUserName());
//		if(local != null) {
//			System.out.println("User already present !!!");
//			throw new Exception("Duplicate User");
//		}else {
//			//create user
//			for(UserRole ur : userRoles) {
//				roleRepository.save(ur.getRole());
//			}
//			user.getUserRoles().addAll(userRoles);
//			local = this.userRepository.save(user);
//			
//		}
//		return local;
//	}
//}





//	@Override
//	public ResponseEntity<ResponseStructure<User>> findUserById(long id) {
//		Optional<User> optional = userRepository.findById(id);
//		ResponseStructure<User> structure = new ResponseStructure<>();
//		if (optional.isPresent()) {
//			User user1 = optional.get();
//			structure.setMessage("Data Found");
//			structure.setStatus(HttpStatus.FOUND.value());
//			structure.setData(user1);
//			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.FOUND);
//		} else {
//			throw new IdNotFoundException("Data Not Available!!!");
//		}
//	}
//
//	@Override
//	public ResponseStructure<List<User>> findAllUser() {
//		List<User> list = userRepository.findAll();
//		ResponseStructure<List<User>> structure = new ResponseStructure<>();
//		if (list.isEmpty()) {
//			throw new DataNotPresentException("Data not available!!!");
//		} else {
//			structure.setMessage("Data Found!!");
//			structure.setStatus(HttpStatus.FOUND.value());
//			structure.setData(list);
//		}
//		return structure;
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<User>> deleteUserById(long id) {
//		Optional<User> optional = userRepository.findById(id);
//		ResponseStructure<User> structure = new ResponseStructure<>();
//		if (optional.isPresent()) {
//			userRepository.deleteById(id);
//			structure.setMessage("Data Deleted Successfully!!!");
//			structure.setStatus(HttpStatus.OK.value());
//			structure.setData(optional.get());
//			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.OK);
//		} else {
//			throw new IdNotFoundException("Data Not Available!!!");
//		}
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<User>> updateUser(long id, User user, Set<UserRole> userRoles) {
//		Optional<User> optional = userRepository.findById(id);
//		ResponseStructure<User> structure = new ResponseStructure<>();
//		if (optional.isPresent()) {
//			user.setId(id);
//
//			for (UserRole uR : userRoles) {
//				roleRepository.save(uR.getRole());
//			}
//			user.getUserRoles().addAll(userRoles);
//			user = this.userRepository.save(user);
//			structure.setMessage("Data Updated");
//			structure.setStatus(HttpStatus.OK.value());
//			structure.setData(user);
//			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.OK);
//		} else {
//			throw new IdNotFoundException("Data Not Available");
//		}
	}
	
	


