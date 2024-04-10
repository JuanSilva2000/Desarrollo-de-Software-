package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
    private Address address = new Address("street A");
    private Address secondAddres = new Address("street B");

    private Client client;
    @BeforeEach //Ejecute setUp antes de ejecutar cada metodo de prueba
    void setUp(){
        client = new Client();
    }

    @Test
    void afterCreationShouldHaveNoAddress(){

    }

    @Test
    void shouldAllowToAddress(){
        client.addAddress(address);
    }

    @Test
    void shouldAllowToAddManyAddresses(){
        client.addAddress(address);
        client.addAddress(secondAddres);
    }
}
