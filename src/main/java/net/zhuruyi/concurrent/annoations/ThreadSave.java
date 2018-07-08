package net.zhuruyi.concurrent.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author :zhuruyi
 * @Description:课程里面用来标记线程安全的类
 * @Date:Create in 16:19 2018/7/8
 * @Modified By:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSave {

    String value() default "";
}
