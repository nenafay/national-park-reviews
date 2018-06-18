package org.wecancodeit.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	
	private Map <Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review grandCanyonNorthRim = new Review(1111L, "The Grand Canyon, North Rim", "image of Grand Canyon", "National Parks Reviews", "review content", "synopsis");
		Review joshuaTree = new Review(1112L, "Joshua Tree", "image of Joshua Tree", "National Parks Reviews", "review content", "synopsis");
		Review carlsbadCaverns = new Review(1113L, "Carlsbad Caverns", "image of Carlsbad Caverns", "National Parks Reviews", "review content", "synopsis");
		Review yosemite = new Review(1114L, "Yosemite", "image of Yosemite", "National Parks Reviews", "review content", "synopsis");
		
		reviewList.put(grandCanyonNorthRim.getID(), grandCanyonNorthRim);
		reviewList.put(joshuaTree.getID(), joshuaTree);
		reviewList.put(carlsbadCaverns.getID(), carlsbadCaverns);
		reviewList.put(yosemite.getID(), yosemite);
		
	}
	//constructor for testing purposes
	public ReviewRepository(Review...reviews) {
		for(Review review : reviews) {
			reviewList.put(review.getID(), review);
		}
	}

	public Review findOne(Long id) {
		return reviewList.get(id);
	}
	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
