package org.ocpp.home.services;

import org.ocpp.client.client.interfaces.IClientRequestService;
import org.ocpp.home.interfacesServices.IMeterValuesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterValuesService implements IMeterValuesService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    IClientRequestService clientRequestService;
    //public MeterValuesConfirmation meterValues() {}
}
