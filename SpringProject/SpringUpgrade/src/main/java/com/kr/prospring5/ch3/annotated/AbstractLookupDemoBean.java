
package com.kr.prospring5.ch3.annotated;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import com.kr.prospring5.ch3.annotated.DemoBean;
import com.kr.prospring5.ch3.annotated.Singer;

@Component("abstractLookupBean")
public class AbstractLookupDemoBean implements DemoBean {
    @Lookup("singer")
    public Singer getMySinger() {
        return null; // 동적으로 오버라이드 됨
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}