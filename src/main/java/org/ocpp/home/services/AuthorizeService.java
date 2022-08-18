package org.ocpp.home.services;

import eu.chargetime.ocpp.model.core.AuthorizeConfirmation;
import org.ocpp.client.client.interfaces.IClientRequestService;
import org.ocpp.home.interfacesServices.IAuthorizeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorizeService implements IAuthorizeService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IClientRequestService clientRequestService;
    public AuthorizeConfirmation authorize() {
        logger.info("Sending Authorize Request");
        return clientRequestService.authorize("");
    }
}
