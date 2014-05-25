package com.flatlike.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Review {
    public List<Rating> getRatings() {
        return new ArrayList<Rating>(){
            {
                add(new Rating());
            }
        };
    }
}
