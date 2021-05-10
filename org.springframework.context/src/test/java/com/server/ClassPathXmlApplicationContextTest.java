package com.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @author: simba
 * @create: 2020/03/06 22:50
 */
@Component
public class ClassPathXmlApplicationContextTest {

    private static final String FQ_SIMPLE_CONTEXT = "/com/applicationContext.xml";

    @Resource
    private AnalysisOperation analysisOperation;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(FQ_SIMPLE_CONTEXT);
        ClassPathXmlApplicationContextTest contextBean = applicationContext.getBean(ClassPathXmlApplicationContextTest.class);
        contextBean.test();
    }

    private void test() {
        System.out.println("name : " + analysisOperation.getName() + " , address : " + analysisOperation.getAddress());
    }

}
