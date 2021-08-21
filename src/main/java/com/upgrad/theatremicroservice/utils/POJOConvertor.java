package com.upgrad.theatremicroservice.utils;

import com.upgrad.theatremicroservice.dto.TheatreDTO;
import com.upgrad.theatremicroservice.entities.Theatre;


public class POJOConvertor {

  public static TheatreDTO covertTheatreEntityToDTO(Theatre theatre) {
    TheatreDTO theatreDTO = new TheatreDTO();

    theatreDTO.setTheatreId(theatre.getTheatreId());
    theatreDTO.setTheatreName(theatre.getTheatreName());
    theatreDTO.setMovieId(theatre.getMovieId());

    return theatreDTO;
  }

  public static Theatre covertTheatreDTOToEntity(TheatreDTO theatreDTO) {
    Theatre theatre = new Theatre();

    theatre.setTheatreId(theatreDTO.getTheatreId());
    theatre.setTheatreName(theatreDTO.getTheatreName());
    theatre.setMovieId(theatreDTO.getMovieId());

    return theatre;
  }
}
