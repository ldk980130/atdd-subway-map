package wooteco.subway.station;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import wooteco.subway.exception.VoidStationException;

@RestControllerAdvice
public class StationControllerAdvice {

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity overlappedStationExceptionResponse() {
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(VoidStationException.class)
    public ResponseEntity voidStationExceptionResponse() {
        return ResponseEntity.noContent().build();
    }

}
