package com.academy.lesson07.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// определяем новую аннотацию
@Retention(RetentionPolicy.RUNTIME)
public @interface RunTest {
}
