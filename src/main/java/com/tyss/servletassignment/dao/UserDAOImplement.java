package com.tyss.servletassignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.servletassignment.dto.UserBean;

public class UserDAOImplement implements UserDAO {
	private final static EntityManagerFactory factory=
			Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public UserBean login(String email, String password) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			String jpql = "select e from UserBean e where e.email = :email and e.password = :password";
			TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
			query.setParameter("email", email);
			query.setParameter("password", password);
			UserBean bean = query.getSingleResult();
			return bean;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean update(UserBean info, int id) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			UserBean bean = manager.find(UserBean.class, id);
			bean.setPassword(info.getPassword());
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean delete(int id) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql="delete from UserBean e where e.id = :id";
			Query query= manager.createQuery(jpql);
			query.setParameter("id", id);
			query.executeUpdate();
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean create(UserBean info) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public List<UserBean> getAllInfoOfUser() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			String jpql = "select e from UserBean e";
			TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
			List<UserBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}
	}

}
