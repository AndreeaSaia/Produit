package fr.adhoc.mondressing.domain.repositories;


import fr.adhoc.mondressing.domain.entities.User;

/** Loads an user by its identifier and its email
 */


public interface UserRepository {
	
	public User findById(int identifier);
	public User findByEmail(String email);
    public void save(User user);

}
