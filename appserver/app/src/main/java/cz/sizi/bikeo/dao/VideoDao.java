package cz.sizi.bikeo.dao;

import java.util.List;

import cz.sizi.bikeo.model.Video;

public interface VideoDao extends GenericDao<Video, Integer> {
	List<Video> findByDate(String date);
			
	void enable(Video video);
	
	Video findByTitle(String title);

	List<Video> findByCategory(Integer category);
	
	int getEnabledCount();
	
	int getDisabledCount();
	
	int getUnconfirmedCount();
	
	void setViews(Video video);
	
	void confirm(Video video);
	
	List<Video> searchVideosByKeyword(String keyword);
	
	List<Video> findAllGroupedByPublishDateDesc();
	
	List<Video> findAllGroupedByViewsDesc();

	List<Video> findUnconfirmedAll();

}
