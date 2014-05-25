package com.flatlike.prototype;

import java.util.ArrayList;
import java.util.List;

public class Property {
    public Review getOverallReview() {
        return new Review();
    }

    public List<Review> getReviews() {
        if(isLoggedInUser()){
            return new ArrayList<Review>(){
                {
                    add(new Review());
                }
            };
        }
        else {
            throw new UnsupportedOperationException();
        }
    }

    private boolean isLoggedInUser() {
        return false;
    }
}
