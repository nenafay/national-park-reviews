package org.wecancodeit.review;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	ReviewRepository underTest;
	
	private Long firstReviewItemID = 1L;
	private Review firstReviewItem = new Review(firstReviewItemID, "item title 1", "img url 1", "review category 1", "content1", "synopsis1");
	
	private Long secondReviewItemID = 2L;
	private Review secondReviewItem = new Review(secondReviewItemID, "item title 2", "img url 2", "review category2", "content2", "synopsis2");
	
	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReviewItem);
		Review result = underTest.findOne(firstReviewItemID);
		assertThat(result, is(firstReviewItem));
		
	}
	
	@Test
	public void shouldFindASecondReview() {
		underTest = new ReviewRepository(secondReviewItem);
		Review result = underTest.findOne(secondReviewItemID);
		assertThat(result, is(secondReviewItem));
		
	}
	@Test 
	public void shouldFIndAllReviews() {
		underTest = new ReviewRepository(firstReviewItem, secondReviewItem);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReviewItem, secondReviewItem));
		
	}

}
