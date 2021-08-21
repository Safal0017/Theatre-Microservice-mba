package com.upgrad.theatremicroservice.controller;

import com.upgrad.theatremicroservice.dto.TheatreDTO;
import com.upgrad.theatremicroservice.entities.Theatre;
import com.upgrad.theatremicroservice.services.TheatreService;
import com.upgrad.theatremicroservice.utils.POJOConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/theatre_app/v1")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    /**
     * ENDPOINT: http://localhost:8082/theatre_app/v1/theatres/1/movie/1
     * @param theatreId
     * @param movieId
     * @return
     */

    @GetMapping(value = "/theatres/{theatreId}/movie/{movieId}",produces = "application/json")
    public ResponseEntity getTheatreFromId(@PathVariable(name = "theatreId") int theatreId,
                                           @PathVariable(name = "movieId") int movieId){
        Theatre responseTheatre = theatreService.getTheatreDetails(theatreId,movieId);

        if(responseTheatre!=null) {
            TheatreDTO responseTheatreDTO = POJOConvertor.covertTheatreEntityToDTO(responseTheatre);
            return new ResponseEntity(responseTheatreDTO, HttpStatus.OK);
        }else{
            return null;
        }
    }
}
