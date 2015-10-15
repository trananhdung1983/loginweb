package mavenffff.services;

import mavenffff.domain.UserEntity;

/**
 * Service providing service methods to work with user data and entity.
 * 
 * @author TADUNG
 */

public interface UserService {
	/**
	 * Create user - persist to database
	 * 
	 * @param userEntity
	 * @return true if success
	 */
	boolean createUser(UserEntity userEntity);

}
