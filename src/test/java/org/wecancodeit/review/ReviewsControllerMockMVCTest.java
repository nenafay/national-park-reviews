package org.wecancodeit.review;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import java.util.Collection;


@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsController.class)

public class ReviewsControllerMockMVCTest {
	
	@Resource
	private MockMvc mvc;
	
	@Mock
	private Review firstReviewItem;
	@Mock
	private Review secondReviewItem;
	
	@MockBean
	private ReviewRepository repository;
	
	@Test
	public void shouldBeOkForAllReviews()throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToAllReviewsView()throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(view().name(is("reviews")));
	}

	@Test
	public void shouldPutAllReviewsIntoModel()throws Exception{
		Collection<Review>allReviews = asList(firstReviewItem, secondReviewItem);
		when(repository.findAll()).thenReturn(allReviews);
		mvc.perform(get("/show-reviews")).andExpect(model().attribute("reviews",is(allReviews)));
	}
	@Test
	public void shouldBeOkForSingleReview()throws Exception {
		mvc.perform(get("/review?id=1")).andExpect(status().isOk());
		
	}
	@Test
	public void shouldRouteToSingleReviewView() throws Exception{
		mvc.perform(get("/review?id=1")).andExpect(view().name(is("review")));
	}
	@Test
	public void shouldPutASingleReviewIntoModel() throws Exception{
		when(repository.findOne(1L)).thenReturn(firstReviewItem);
		mvc.perform(get("/review?id=1")).andExpect(model().attribute("review",is(firstReviewItem)));
	}
	
}
