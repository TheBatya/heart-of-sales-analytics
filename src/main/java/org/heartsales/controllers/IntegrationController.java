package org.heartsales.controllers;

import org.heartsales.model.rest.PongModel;
import org.heartsales.services.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController implements IntegrationApi {

    final private PingService pingService;

    @Autowired
    public IntegrationController(PingService pingService) {
        this.pingService = pingService;
    }

    @Override
    public ResponseEntity<PongModel> ping() {
        PongModel pongModel = pingService.getPong();
        return ResponseEntity.ok(pongModel);

    }

}