package eTrade.dataAccess.abstracts;


import java.util.ArrayList;
import eTrade.entities.concretes.User;

public interface UserDao {

	boolean add(User user);
	ArrayList<User> getAll();
	User get(String email);
	
	
}
