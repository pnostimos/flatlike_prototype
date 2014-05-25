package com.flatlike.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlatLikeEngine {
    public List<Property> getProperties(String postCode) {
        if (!postCode.equals("INVALID POSTCODE")) {
            return new ArrayList<Property>(){
                {
                    add(new Property());
                }
            };
        } else {
            return Collections.emptyList();
        }
    }

    public void addReview(Review review) {
        if(!isLoggedIn()) {
            throw new UnsupportedOperationException();
        }
    }

    private boolean isLoggedIn() {
        return false;
    }

    public List<Review> getRecentReviews() {
        return new ArrayList<Review>(){
            {
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
                add(new Review());
            }
        };
    }
}
