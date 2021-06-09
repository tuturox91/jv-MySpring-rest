package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.Movie;
import mate.academy.spring.service.MovieService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieService bean = context.getBean(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious");
        bean.add(movie);
    }
}
