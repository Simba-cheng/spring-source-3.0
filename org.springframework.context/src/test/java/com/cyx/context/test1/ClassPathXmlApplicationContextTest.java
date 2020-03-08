package com.cyx.context.test1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * @author: simba
 * @create: 2020/03/06 22:50
 */
public class ClassPathXmlApplicationContextTest {

    private static final String PATH = "/org/springframework/context/support/";

    private static final String FQ_SIMPLE_CONTEXT = PATH + "simpleContext.xml";

    @Test
    public void testSingleConfigLocation() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(FQ_SIMPLE_CONTEXT);
        assertTrue(ctx.containsBean("someMessageSource"));
        ctx.close();
    }

}
