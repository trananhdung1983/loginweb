package mavenffff.services;

import mavenffff.domain.UserEntity;

/**
 * Provides processing service to set user authentication session
 * 
 * @author TADUNG
 */
public interface UserAuthenticationProviderService {
	/**
	 * Process user authentication
	 * 
	 * @param user
	 * @return
	 */
	boolean processUserAuthentication(UserEntity user);

}
