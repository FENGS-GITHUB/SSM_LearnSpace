package com.fengs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("School1")
public class SchoolInfo {
    @Override
    public String toString() {
        return "SchoolInfo{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                '}';
    }

    @Value("黑龙江大学")
    String schoolName;
    @Value("哈尔滨市南岗区学府路")
    String schoolAddress;

}
