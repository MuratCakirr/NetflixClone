package com.murat.netflixclone.movie;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService{

  private final MovieRepository movieRepository;

  public List<Movie> getMovies() {
    return movieRepository.findAll();
  }
}
