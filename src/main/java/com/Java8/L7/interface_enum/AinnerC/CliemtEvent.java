package com.Java8.L7.interface_enum.AinnerC;

public class CliemtEvent {
    private Client client;

    public CliemtEvent(Client client) {
        this.client = client;
    }

    public String getName() {
        return client.name;
    }
    
    public String getIp() {
        return client.ip;
    }
    
}
