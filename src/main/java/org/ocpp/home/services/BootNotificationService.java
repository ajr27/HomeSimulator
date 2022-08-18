package org.ocpp.home.services;

import eu.chargetime.ocpp.model.core.BootNotificationConfirmation;
import org.ocpp.client.client.interfaces.IClientRequestService;
import org.ocpp.home.interfacesServices.IBootNotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BootNotificationService implements IBootNotificationService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IClientRequestService clientRequestService;
    public BootNotificationConfirmation bootNotification() {
        logger.info("Sending Boot Notification Request");
        return clientRequestService.bootNotification("", "");
    }
}
