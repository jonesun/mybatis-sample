package org.jonesun.mybatis.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author jone.sun
 * @date 2021-07-13 09:53
 */
@Service
@Profile("prod")
public class EmailService implements IEmailService{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void send(String content) {
        logger.info("发送邮件: {}", content);
    }
}
