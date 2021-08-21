package com.upgrad.theatremicroservice.services;

import com.upgrad.theatremicroservice.entities.Theatre;

public interface TheatreService {
    public Theatre getTheatreDetails(int theatreId, int movieId);
}
