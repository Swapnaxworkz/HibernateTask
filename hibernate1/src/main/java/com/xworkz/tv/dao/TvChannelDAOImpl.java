package com.xworkz.tv.dao;

import com.xworkz.tv.entity.TVChannel;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class TvChannelDAOImpl implements TvChannelDAO {

	@Override
	public void saveTVChannel(TVChannel tvChannel) {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		EntityTransaction tx = null;

		try {
			factory = Persistence.createEntityManagerFactory("tv");
			entityManager = factory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(tvChannel);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}

	@Override
	public void getChannel() {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		EntityTransaction tx = null;

		try {
			factory = Persistence.createEntityManagerFactory("tv");
			entityManager = factory.createEntityManager();
			tx = entityManager.getTransaction();
			tx.begin();
			TVChannel channel = entityManager.find(TVChannel.class, 1);
			System.out.println("channelId =" + channel.getChannnelId());
			System.out.println("channelId =" + channel.getChannnelName());
			System.out.println("channelId =" + channel.getLanguage());
			System.out.println("channelId =" + channel.getPrice());
			System.out.println(channel.toString());
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}
}