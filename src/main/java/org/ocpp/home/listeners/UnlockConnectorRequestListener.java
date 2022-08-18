package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.UnlockConnectorRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UnlockConnectorRequestListener {
    @EventListener(UnlockConnectorRequestEvent.class)
    public void unlockConnectorRequest(UnlockConnectorRequestEvent event) {
        event.getRequest().getConnectorId();
    }
}
