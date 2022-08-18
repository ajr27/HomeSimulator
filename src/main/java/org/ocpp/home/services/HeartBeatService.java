package org.ocpp.home.services;

import eu.chargetime.ocpp.model.core.HeartbeatConfirmation;
import org.ocpp.client.client.interfaces.IClientRequestService;
import org.ocpp.home.interfacesServices.IHeartBeatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeartBeatService implements IHeartBeatService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IClientRequestService clientRequestService;
    public HeartbeatConfirmation heartbeat() {
        logger.info("Sending Authorize Request");
        return clientRequestService.heartbeat();
    }
}
