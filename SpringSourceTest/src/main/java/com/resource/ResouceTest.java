package com.resource;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author CYX
 * @create 2019-05-31-0:17
 */
public class ResouceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResouceTest.class);

    /**
     * 测试使用ClassPathResource读取指定资源
     */
    @Test
    public void test_ClassPathResource() {
        try {
            Resource resource = new ClassPathResource("spring/XmlBeanFactoryTests-localCollectionsUsingXsd.xml");
            LOGGER.info(IOUtils.toString(resource.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
