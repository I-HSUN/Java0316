package com.Java8.L7.interface_enum.AinnerC;

import java.util.ArrayList;

public class ClientQueue {
    private ArrayList clients = new ArrayList();    //收集連線的Client
    private ArrayList listeners = new ArrayList();  //收集對ClientQueue有興趣的ClientListener
    
    public  void addClientListener(ClientListener listener){//註冊ClientListener
        listeners.add(listener);
    }
    
    public void  add(Client client){
        clients.add(client);//註冊Client
        CliemtEvent event = new CliemtEvent(client);//通知資訊包裝為CliemtEvent
        for (int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener)listeners.get(i);
            listener.clientAdded(event);//逐一取出ClientListener通知
        }
    }
    public void remove(Client client) {
        clients.remove(client);
        CliemtEvent event = new CliemtEvent(client);
        for (int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener)listeners.get(i);
            listener.clientRemove(event);
        }
    }
}
