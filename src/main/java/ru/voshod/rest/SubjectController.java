package ru.voshod.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@AllArgsConstructor
@RestController
public class SubjectController {

    @GetMapping(value = "/api/v1/test", produces = APPLICATION_JSON_VALUE)
    public String get() {
        return UUID.randomUUID().toString();
    }

}
