package com.memorynotfound.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@WebService(endpointInterface = "com.memorynotfound.ws.OrderService")
public class OrderServiceImpl implements OrderService {

    public String[] getOrders() throws Exception {

        return new String[]{"SSD", "Graphic Card", "GPU"};
    }

    public boolean addOrder(String order) throws Exception {

        System.out.println("Saving new order: " + order);
        return true;
    }
}
