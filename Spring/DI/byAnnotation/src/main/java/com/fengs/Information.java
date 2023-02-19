package com.fengs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("Info1")
public class Information {

    @Autowired
    @Qualifier(value="Class1")
    ClassInfo classInfo;

    @Resource(name = "School1")
    SchoolInfo schoolInfo;

    @Value(value="12")

    Integer ID;
    @Value("里斯")
    String Name;
    @Value(value="111111")
    Integer tel;
    Integer age;

    @Override
    public String toString() {
        return "Information{" +
                "classInfo=" + classInfo +
                ", schoolInfo=" + schoolInfo +
                ", ID=" + ID +
                ", Name='" + Name + '\'' +
                ", tel=" + tel +
                ", age=" + age +
                '}';
    }

    @Value("22")
    public void setter(Integer age) {
        System.out.println("setAge:"+(age+11));
        this.age = age;
    }

}
