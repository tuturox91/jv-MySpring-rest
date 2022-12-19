package mate.academy.spring.controller;

import mate.academy.spring.model.dto.request.CinemaHallRequestDto;
import mate.academy.spring.model.dto.response.CinemaHallResponseDto;
import mate.academy.spring.service.CinemaHallService;
import mate.academy.spring.service.mapper.CinemaHallDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cinema-halls")
public class CinemaHallController {

    private CinemaHallService hallService;

    private CinemaHallDtoMapper hallDtoMapper;

    public CinemaHallController(CinemaHallService hallService, CinemaHallDtoMapper hallDtoMapper) {
        this.hallService = hallService;
        this.hallDtoMapper = hallDtoMapper;
    }

    @GetMapping
    public List<CinemaHallResponseDto> getAll() {
        return hallService.getAll().stream()
                .map(hallDtoMapper::parse).collect(Collectors.toList());
    }

    @PostMapping
    public CinemaHallResponseDto create(@RequestBody CinemaHallRequestDto requestDto) {
        return hallDtoMapper.parse(hallService.add(
                hallDtoMapper.toModel(requestDto)));
    }



}
