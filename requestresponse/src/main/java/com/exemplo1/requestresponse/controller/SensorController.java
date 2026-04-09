package com.exemplo1.requestresponse.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo1.requestresponse.dto.SensorDataDTO;

@RestController
@RequestMapping("/api/sensor")
@CrossOrigin(origins = "")
public class SensorController {
    private final Random random = new Random();

    @GetMapping("/leitura")
    public SensorDataDTO getLeitura(){
        double temp = 20 + (15 * random.nextDouble());
        String hora = LocalTime.now()
        .format(DateTimeFormatter.ofPattern("HH:mm:ss"));


    return new SensorDataDTO("SENSOR-01",
    Math.round(temp * 100.0) / 100.0,
            hora);
    }

    
}
