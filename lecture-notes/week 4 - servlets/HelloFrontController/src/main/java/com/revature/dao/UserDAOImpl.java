package com.revature.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.User;
import com.revature.util.HibernateUtil;

public class UserDAOImpl implements UserDAO{
	private static Logger log = Logger.getLogger(UserDAOImpl.class);
	
	@Override
	public int insert(User user) {
		log.info("adding user to database. User info: " + user);
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		int pk = (int) ses.save(user);
		
		tx.commit();
		log.info("Insert successful! New user id is " + pk);
		
		return pk; // return the auto-generated PK
	}

	@Override
	public User selectById(int id) {
		System.out.println("searching user by id: " + id);
		Session ses = HibernateUtil.getSession();
		User user = (User) ses.createNativeQuery("SELECT * FROM store_users WHERE store_user_id = " + id + "", User.class).getSingleResult();
		
		System.out.println("Search complete! Found: " + user);
		
		return user;
	}

	@Override
	public User selectByName(String name) {
		System.out.println("searching user by name: " + name);
		Session ses = HibernateUtil.getSession();
		User user = (User) ses.createNativeQuery("SELECT * FROM store_users WHERE store_user_firstname = '" + name + "'", User.class).getSingleResult();
		
		System.out.println("Search complete! Found: " + user);
		
		return user;
	}

	@Override
	public List<User> selectAll() {
		System.out.println("getting all users...");
		Session ses = HibernateUtil.getSession();
		List<User> userList = ses.createQuery("from User", User.class).list();
		
		System.out.println("User list retrieval complete! Size: " + userList.size());
		
		return userList;
	}

	@Override
	public boolean update(User user) {
		System.out.println("Updating user. New user info: " + user);
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.clear();
		ses.update(user);
		
		tx.commit();
		
		System.out.println("Update complete!");
		
		return true;
	}

	@Override
	public boolean delete(User user) {
		System.out.println("Deleting user. Removed user info: " + user);
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.clear();
		ses.delete(user);
		
		tx.commit();
		
		System.out.println("Deletion complete!");
		
		return true;
	}

}
