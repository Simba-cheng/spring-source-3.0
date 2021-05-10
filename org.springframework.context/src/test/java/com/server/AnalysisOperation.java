package com.server;

import org.springframework.stereotype.Component;

/**
 * @author: simba
 * @create: 2020/03/06 22:50
 */
@Component
public class AnalysisOperation {

    private String name = "ccc";
    private String address = "nanjing";

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
