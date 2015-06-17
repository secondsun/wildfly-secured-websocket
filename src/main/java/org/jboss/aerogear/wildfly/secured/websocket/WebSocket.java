package org.jboss.aerogear.wildfly.secured.websocket;

import javax.annotation.security.RolesAllowed;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/sync")

public class WebSocket {

    
    @OnMessage
    public String onMessage(String message, Session webSocketSession) {
        return message;
    }

    @OnOpen
    public void myOnOpen(Session session) {
        System.out.println("WebSocket opened: " + session.getId());
    }

    @OnClose
    public void myOnClose(CloseReason reason, Session webSocketSession) {
        System.out.println("Closing a WebSocket due to " + reason.getReasonPhrase());
        

    }

}
