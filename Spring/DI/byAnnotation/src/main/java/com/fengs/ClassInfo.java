package com.fengs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "Class1")
public class ClassInfo {
    @Value("MISS.WANG")
    String ClassMonitor;
    @Value("数据一班")
    String ClassNo;
    @Value("主楼三层")
    String Location;

    @Override
    public String toString() {
        return "ClassInfo{" +
                "ClassMonitor='" + ClassMonitor + '\'' +
                ", ClassNo='" + ClassNo + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
