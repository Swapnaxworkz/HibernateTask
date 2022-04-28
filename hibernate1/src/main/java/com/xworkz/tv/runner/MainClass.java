package com.xworkz.tv.runner;

import com.xworkz.tv.dao.TvChannelDAO;
import com.xworkz.tv.dao.TvChannelDAOImpl;
import com.xworkz.tv.entity.TVChannel;

public class MainClass {

	public static void main(String []args) {
		TVChannel channelEntity = new TVChannel();
		channelEntity.setChannnelId(2);
		channelEntity.setChannnelName("TV9");
		channelEntity.setLanguage("Kannada");
		channelEntity.setFree(true);
		channelEntity.setPrice(600.00);
		
		TvChannelDAO channelDAO = new TvChannelDAOImpl();
		channelDAO.saveTVChannel(channelEntity);
		System.out.println("saved successfully");
	}
}
