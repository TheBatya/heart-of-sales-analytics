package org.heartsales.services;

import org.heartsales.model.rest.PongModel;
import org.heartsales.repositories.PingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PingService {

    private final PingRepository pingRepository;

    @Autowired
    public PingService(PingRepository pingRepository) {
        this.pingRepository = pingRepository;
    }

    public PongModel getPong(){
        PongModel pongModel = new PongModel();
        pongModel.setResult(pingRepository.findAll().get(0).getValue());
        return pongModel;
    }

}
