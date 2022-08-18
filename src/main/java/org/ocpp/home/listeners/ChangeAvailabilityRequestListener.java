package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.ChangeAvailabilityRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ChangeAvailabilityRequestListener {
    @EventListener(ChangeAvailabilityRequestEvent.class)
    public void changeAvailabilityRequest(ChangeAvailabilityRequestEvent event) {
        event.getRequest().getType();
    }
}
