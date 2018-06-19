package org.wecancodeit.Reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review ForrestGump = new Review(1L, "Forrest Gump", "Drama", "Forrest Review Content", "Images//Forrest Gump Image.jpg");
		Review ToyStory = new Review(2L, "Toy Story", "Animation","Toy Story Review Content", "Images//Toy Story image.jpg");
		Review DieHard = new Review(3L, "Die Hard", "Action", "Die Hard Review Content", "Images//Die Hard Image.jpg");
		
		reviewList.put(ForrestGump.getId(), ForrestGump);
		reviewList.put(ToyStory.getId(), ToyStory);
		reviewList.put(DieHard.getId(), DieHard);
	}

	//constructor for testing purposes
	public ReviewRepository(Review...reviews) {
		for(Review review: reviews) {
		reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		
		return reviewList.values();
	}

}
