package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.ClearCacheRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ClearCacheRequestListener {
    @EventListener(ClearCacheRequestEvent.class)
    public void clearCacheRequest(ClearCacheRequestEvent event) {
        event.getRequest().getClass();
    }
}
