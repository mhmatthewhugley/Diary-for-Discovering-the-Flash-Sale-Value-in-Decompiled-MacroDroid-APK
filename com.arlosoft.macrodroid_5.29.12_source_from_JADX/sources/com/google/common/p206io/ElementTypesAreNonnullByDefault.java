package com.google.common.p206io;

import com.google.common.annotations.GwtCompatible;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@GwtCompatible
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.common.io.ElementTypesAreNonnullByDefault */
@interface ElementTypesAreNonnullByDefault {
}
