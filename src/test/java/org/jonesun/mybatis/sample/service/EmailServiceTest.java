package org.jonesun.mybatis.sample.service;

import org.jonesun.mybatis.sample.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jone.sun
 * @date 2021-07-13 09:58
 */
@SpringBootTest
class EmailServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired(required = false)
    IEmailService emailService;

    @Value("${spring.profiles.active}")
    private String env;

    @Test
    void testSend() {
        if(emailService == null) {
            logger.error("当前环境：{} 不支持发送邮件",env);
        } else {
            emailService.send("这是一封测试邮件");
        }
    }


}