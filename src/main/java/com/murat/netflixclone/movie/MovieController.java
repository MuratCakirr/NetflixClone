package com.murat.netflixclone.movie;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

  private final MovieService movieService;

  @GetMapping("/list")
  public ResponseEntity<List<Movie>> getMovies() {
    return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
  }
}
