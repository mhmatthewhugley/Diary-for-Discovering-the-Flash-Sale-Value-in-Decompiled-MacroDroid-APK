package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

@RetainForClient
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* renamed from: a */
    private final Object f4020a;

    private ObjectWrapper(Object obj) {
        this.f4020a = obj;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: A1 */
    public static <T> T m5050A1(@NonNull IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).f4020a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            Preconditions.m4488k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g8 */
    public static <T> IObjectWrapper m5051g8(@NonNull T t) {
        return new ObjectWrapper(t);
    }
}
