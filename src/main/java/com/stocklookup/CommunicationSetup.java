package com.stocklookup;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.ip.udp.UdpServerListeningEvent;

@SpringBootApplication
public class CommunicationSetup {
    

    @Bean
    public UdpServerListeningEvent connection(){
        
    }
}
