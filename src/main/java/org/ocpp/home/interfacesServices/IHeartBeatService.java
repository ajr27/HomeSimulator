package org.ocpp.home.interfacesServices;

import eu.chargetime.ocpp.model.core.HeartbeatConfirmation;

public interface IHeartBeatService {
    public HeartbeatConfirmation heartbeat();
}
