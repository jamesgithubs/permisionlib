package com.ccj.permission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ccj on 2016/11/10.
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface RequestPermission {



}
