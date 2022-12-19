package mate.academy.spring.service.mapper;

import mate.academy.spring.model.Movie;
import mate.academy.spring.model.dto.MovieRequestDto;
import mate.academy.spring.model.dto.MovieResponseDto;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieResponseDto parse(Movie movie) {
        MovieResponseDto responseDto = new MovieResponseDto();
        responseDto.setId(movie.getId());
        responseDto.setDescription(movie.getDescription());
        responseDto.setTitle(movie.getTitle());
        return responseDto;
    }

    public Movie toMovie(MovieRequestDto requestDto) {
        Movie movie = new Movie();
        movie.setDescription(requestDto.getDescription());
        movie.setTitle(requestDto.getTitle());
        return movie;
    }
}
