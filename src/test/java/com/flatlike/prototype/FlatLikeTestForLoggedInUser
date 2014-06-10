package com.flatlike.prototype;

import com.flatlike.prototype.core.FlatLikeEngine;
import com.flatlike.prototype.model.Property;
import com.flatlike.prototype.model.Review;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class FlatLikeTestForAnonymousUser {

    private FlatLikeEngine flatLikeEngine;

    @Before
    public void setup() {
        flatLikeEngine = new FlatLikeEngine();
    }

    @Test
    public void as_an_anonymous_user_I_should_be_able_to_retrieve_a_list_of_properties_for_a_given_post_code() {

        List<Property> properties = flatLikeEngine.getProperties("SE16DB");

        assertThat(properties, is(notNullValue()));
    }

    @Test
    public void an_anonymous_user_should_be_able_to_retrieve_the_most_recent_overall_reviews() {
        List<Review> recentReviews = flatLikeEngine.getRecentReviews();

        assertThat(recentReviews.size(), is(equalTo(10)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void an_anonymous_user_should_not_be_able_to_add_a_review() {
        flatLikeEngine.addReview(new Review());
    }

    @Test
    public void an_invalid_post_code_should_result_in_an_empty_list_of_properties() {
        List<Property> properties = flatLikeEngine.getProperties("INVALID POSTCODE");

        assertThat(properties.size(), is(0));
    }

    @Test
    public void as_anonymous_user_I_should_be_able_to_retrieve_the_overall_review_for_a_particular_property() {
        List<Property> properties = flatLikeEngine.getProperties("SE16DB");

        Property property = properties.get(0);

        Review review = property.getOverallReview();

        assertThat(review, is(notNullValue()));

        assertThat(review.getRatings(), is(notNullValue()));

        assertThat(review.getRatings().size(), is(greaterThan(0)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void as_an_anonymous_user_I_should_not_be_able_to_retrieve_individual_reviews() {
        List<Property> properties = flatLikeEngine.getProperties("SE16DB");

        Property property = properties.get(0);

        List<Review> reviews = property.getReviews();
    }
}
