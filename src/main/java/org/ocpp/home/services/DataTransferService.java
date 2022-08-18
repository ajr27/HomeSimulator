package org.ocpp.home.services;

import eu.chargetime.ocpp.model.core.DataTransferConfirmation;
import org.ocpp.client.client.interfaces.IClientRequestService;
import org.ocpp.home.interfacesServices.IDataTransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataTransferService implements IDataTransferService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IClientRequestService clientRequestService;
    public DataTransferConfirmation dataTransfer() {
        logger.info("Sending Data Transfer Request");
        return clientRequestService.dataTransfer("", "");
    }
}
