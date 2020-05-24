package com.xjl.base;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 *系统启动时加载配置文件
 * @Author xiaojinlu
 * @Description
 * @Date 2020/3/31 20:07
 * @Param
 * @return
 **/

@Component
public class SysConfigMsg implements CommandLineRunner {

   private final static Logger log = org.slf4j.LoggerFactory.getLogger(SysConfigMsg.class);

   /**
    * 信息键值对
    */
   public static final Properties sysConfig = new Properties();

   @Override
   public void run(String... strings) {
       init();
   }

   public void init() {
       log.info("——————————————初始化自定义参数——————————————");
       if (loadSysConfig()) {
           log.info("|             资源初始化成功                                    |");
       } else {
           log.info("|             资源初始化失败                            |");
       }
       log.info("——————————————初始化系统完成——————————————");
   }

    /**
     *
     * @Author xiaojinlu
     * @Description 加载 properties 配置文件
     * @Date 2020/5/24 21:19
     * @Param
     * @return
     **/
   boolean loadSysConfig() {
       boolean result = true;

       try {
           Resource resource = new ClassPathResource("/biz_message.properties");
           Properties properties = PropertiesLoaderUtils.loadProperties(resource);
           Set<String> strings = properties.stringPropertyNames();
           List<String> keys = new ArrayList<>(strings);
           for (int i = 0; i < keys.size(); i++) {
               String key = keys.get(i);
               if (null != key) {
                   sysConfig.setProperty(key, properties.getProperty(key));
               }
           }
       } catch (IOException e) {
           log.error("加载 properties 配置文件异常 {}", e.getStackTrace());
           result = false;
       }
       return result;
   }

}
