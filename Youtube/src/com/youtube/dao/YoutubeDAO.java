package com.youtube.dao;

import com.youtube.entity.YoutubeEmployee;

public class YoutubeDAO implements YoutubeDAOInterface {
	
	private YoutubeDAO() {} 

	public static YoutubeDAOInterface createdaoObject() {
	
		return new YoutubeDAO();
		
	}

	@Override
	public int createProfile(YoutubeEmployee ye) {
		
		return 1;
	}

}
