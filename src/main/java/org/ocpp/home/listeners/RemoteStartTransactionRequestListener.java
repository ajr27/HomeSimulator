package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.RemoteStartTransactionRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class RemoteStartTransactionRequestListener {
    @EventListener(RemoteStartTransactionRequestEvent.class)
    public void remoteStartTransactionRequest(RemoteStartTransactionRequestEvent event) {
        event.getRequest().getChargingProfile();
    }
}
