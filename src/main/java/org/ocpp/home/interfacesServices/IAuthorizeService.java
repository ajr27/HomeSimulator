package org.ocpp.home.interfacesServices;

import eu.chargetime.ocpp.model.core.AuthorizeConfirmation;

public interface IAuthorizeService {
    public AuthorizeConfirmation authorize();
}
