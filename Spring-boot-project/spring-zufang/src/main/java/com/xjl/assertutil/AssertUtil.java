package com.xjl.assertutil;

import com.xjl.exceptionhandler.XjlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

/**
 * 断言工具类
 *
 * @author xjl
 * @date
 */
public class AssertUtil {

    private static final Logger log = LoggerFactory.getLogger(AssertUtil.class);

    /**
     * 判断true
     *
     * @param cond
     * @param message
     */
    public static void assertTrue(boolean cond, String message) {
        if (cond) {
            log.error("errorCode : -1   message :" + message);
            throw new XjlException(-1, message);
        }
    }

    /**
     * 判断false
     *
     * @param cond
     * @param message
     */
    public static void assertFalse(boolean cond, String message) {
        if (cond) {
            log.error("errorCode : -1   message :" + message);
            throw new XjlException(-1, message);
        }
    }

    /**
     * 判断false
     *
     * @param cond
     * @param message
     */
    public static void assertFalse(boolean cond, Integer code, String message) {
        if (cond) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断true
     *
     * @param cond
     * @param code
     * @param message
     */
    public static void assertTrue(boolean cond, Integer code, String message) {
        if (cond) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断true(带动态传参方法)
     * @param cond
     * @param message
     */
    public static void assertTrue(boolean cond,int code, String message,Object... param) {
        if (cond) {
            log.error("errorCode :{} , message :" ,code , message);
            throw new XjlException(code,message,param);
        }
    }

    /**
     * 判断NULL
     *
     * @param object
     * @param message
     */
    public static void assertNotNull(Object object, String message) {
        if (object == null) {
            log.error("errorCode : -1   message :" + message);
            throw new XjlException(-1, message);
        }
    }

    /**
     * 判断NULL
     *
     * @param object
     * @param code
     * @param message
     */
    public static void assertNotNull(Object object, Integer code, String message) {
        if (object == null) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断对象为null
     *
     * @param object
     * @param code
     * @param message
     */
    public static void assertNull(Object object, Integer code, String message) {

        if (object != null) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断两个对象相等
     *
     * @param obj1
     * @param obj2
     * @param code
     * @param message
     */
    public static void assertEquals(Object obj1, Object obj2, Integer code, String message) {

        if (obj1 == null) {
            assertNull(obj2, code, message);
            return;
        }
        if (!obj1.equals(obj2)) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断两个字符字符串相等
     *
     * @param str1
     * @param str2
     */
    public static void assertEquals(String str1, String str2, Integer code, String message) {
        boolean isEqual =str1.equals(str2);
        if (!isEqual) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断对象至少等于容器中的一个
     *
     * @param obj1
     * @param objects
     * @param code
     * @param message
     */
    public static void assertEqualsAny(Object obj1, Object[] objects, Integer code, String message) {
        if (null == objects) {
            log.error("errorCode : " + code + "  message: " + message);
            throw new XjlException(code, message);
        }
        for (Object obj2 : objects) {
            if (obj1 == null) {
                if (obj2 == null) {
                    return;
                }
                continue;
            }
            if (obj1.equals(obj2)) {
                return;
            }
        }
        log.error("errorCode : " + code + "  message: " + message);
        throw new XjlException(code, message);
    }

    /**
     * 判断 等于 0
     *
     * @param count
     * @param message
     */
    public static void assertEqualZero(Integer count, Integer code, String message) {
        if (count == 0) {
            log.error("errorCode : " + code + "   message :" + message);
            throw new XjlException(code, message);
        }

    }

    /**
     * 判断 大于 0
     *
     * @param count
     * @param message
     */
    public static void assertGTZero(Integer count, Integer code, String message) {
        if (count > 0) {
            log.error("errorCode : " + code + "   message :" + message);
            throw new XjlException(code, message);
        }
    }

    /**
     * 判断集合 List 不等于为空 且 长度大于 0
     * @param list
     * @param message
     */
    public static void assertListNotNullAndGTZero(List list ,int code, String message) {
        if (null == list) {
            assertNotNull(list, code,message);
            return;
        }
        if (list.size() == 0) {
            log.error("errorCode : " + code + "   message :" + message);
            throw new XjlException(code,message);
        }
    }

    /**
     * 判断不为 ""  不为null
     * @param str
     * @param message
     */
    public static void assertNotIsEmpty(String str,String message) {

        if (Objects.isNull(str)) {
            log.error(" message :{}" , message );
            throw new XjlException(message);
        }
    }

}
