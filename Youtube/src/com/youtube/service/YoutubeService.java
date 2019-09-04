package com.youtube.service;

import com.youtube.dao.YoutubeDAO;
import com.youtube.dao.YoutubeDAOInterface;
import com.youtube.entity.YoutubeEmployee;

public class YoutubeService implements  YoutubeServiceInterface {
	private YoutubeService() {
		
	}
	
	

	public static YoutubeServiceInterface createServiceObject() {
		
		return new YoutubeService();
	}



	@Override
	public int createProfile(YoutubeEmployee ye) {
		YoutubeDAOInterface yd=YoutubeDAO.createdaoObject();

		return yd.createProfile(ye);
	}

}
