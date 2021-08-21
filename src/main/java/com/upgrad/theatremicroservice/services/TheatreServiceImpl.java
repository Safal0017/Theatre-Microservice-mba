package com.upgrad.theatremicroservice.services;

import com.upgrad.theatremicroservice.entities.Theatre;
import com.upgrad.theatremicroservice.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TheatreServiceImpl implements TheatreService{

    @Autowired
    TheatreRepository theatreRepository;

    @Override
    public Theatre getTheatreDetails(int theatreId, int movieId) {
        Theatre requestedTheatre = theatreRepository.findByTheatreIdAndMovieId(theatreId, movieId);

        if(requestedTheatre!=null)
            return requestedTheatre;
        return null;
    }
}
