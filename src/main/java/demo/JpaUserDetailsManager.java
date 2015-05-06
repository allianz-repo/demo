package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.GroupManager;
import org.springframework.security.provisioning.UserDetailsManager;

import demo.domain.User;
import demo.repositories.UserRepository;

public class JpaUserDetailsManager implements UserDetailsManager, GroupManager {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		User user = this.userRepository.findOne(username);
		
		return null;
	}

	@Override
	public void addGroupAuthority(String arg0, GrantedAuthority arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserToGroup(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createGroup(String arg0, List<GrantedAuthority> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroup(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> findAllGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrantedAuthority> findGroupAuthorities(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findUsersInGroup(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGroupAuthority(String arg0, GrantedAuthority arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUserFromGroup(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renameGroup(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createUser(UserDetails arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(UserDetails arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userExists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}