package org.heartsales.controllers;

import org.heartsales.model.rest.PongModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController implements IntegrationApi {

    @Override
    public ResponseEntity<PongModel> ping() {
        PongModel pongModel = new PongModel();
        pongModel.setResult("pong");
        return ResponseEntity.ok(pongModel);

    }

}