package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.RemoteStopTransactionRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class RemoteStopTransactionRequestListener {
    @EventListener(RemoteStopTransactionRequestEvent.class)
    public void remoteStopTransactionRequest(RemoteStopTransactionRequestEvent event) {
        event.getRequest().getTransactionId();
    }
}
