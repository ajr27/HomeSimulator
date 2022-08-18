package org.ocpp.home.interfacesServices;

import eu.chargetime.ocpp.model.core.StartTransactionConfirmation;

public interface IStartTransactionService {
    public StartTransactionConfirmation startTransaction();
}
