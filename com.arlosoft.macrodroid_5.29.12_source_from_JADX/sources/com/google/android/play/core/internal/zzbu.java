package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzbu extends zzbv {
    zzbu(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: f */
    private final Class m70878f() {
        return mo59840b().getType().getComponentType();
    }

    /* renamed from: d */
    public final void mo59837d(Collection collection) {
        int i;
        Object[] objArr = (Object[]) mo59839a();
        if (objArr == null) {
            i = 0;
        } else {
            i = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(m70878f(), collection.size() + i);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo59841c(objArr2);
    }

    /* renamed from: e */
    public final void mo59838e(Collection collection) {
        int i;
        Object[] objArr = (Object[]) mo59839a();
        int i2 = 0;
        if (objArr == null) {
            i = 0;
        } else {
            i = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(m70878f(), i + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i2] = obj;
            i2++;
        }
        mo59841c(objArr2);
    }
}
