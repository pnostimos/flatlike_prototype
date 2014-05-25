package com.flatlike.prototype;

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
