package org.ocpp.home.listeners;

import org.ocpp.client.event.client.request.ClientDataTransferRequestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ClientDataTransferRequestListener {
    @EventListener(ClientDataTransferRequestEvent.class)
    public void clientDataTransferRequest(ClientDataTransferRequestEvent event) {
        event.getRequest().getData();
    }
}
