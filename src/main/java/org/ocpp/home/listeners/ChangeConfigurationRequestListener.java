package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.ChangeConfigurationRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ChangeConfigurationRequestListener {
    @EventListener(ChangeConfigurationRequestEvent.class)
    public void changeConfigurationRequestEvent(ChangeConfigurationRequestEvent event) {
        event.getRequest().getValue();
    }
}
