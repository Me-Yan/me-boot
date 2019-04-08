package com.me.inner.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Me on 2019/4/4.
 */
@Configuration
@MapperScan("com.me.inner.mapper")
public class JavaConfig {
}
