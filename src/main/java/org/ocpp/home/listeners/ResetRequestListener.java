package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.ResetRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ResetRequestListener {
    @EventListener(ResetRequestEvent.class)
    public void resetRequest(ResetRequestEvent event) {
        event.getRequest().getType();
    }
}
