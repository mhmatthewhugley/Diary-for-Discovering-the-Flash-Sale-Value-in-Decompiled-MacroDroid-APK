package com.google.android.play.core.internal;

import java.lang.reflect.Field;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class zzbv {

    /* renamed from: a */
    private final Object f51702a;

    /* renamed from: b */
    private final Field f51703b;

    /* renamed from: c */
    private final Class f51704c;

    zzbv(Object obj, Field field, Class cls) {
        this.f51702a = obj;
        this.f51703b = field;
        this.f51704c = cls;
    }

    /* renamed from: a */
    public final Object mo59839a() {
        try {
            return this.f51704c.cast(this.f51703b.get(this.f51702a));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f51703b.getName(), this.f51702a.getClass().getName(), this.f51704c.getName()}), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Field mo59840b() {
        return this.f51703b;
    }

    /* renamed from: c */
    public final void mo59841c(Object obj) {
        try {
            this.f51703b.set(this.f51702a, obj);
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f51703b.getName(), this.f51702a.getClass().getName(), this.f51704c.getName()}), e);
        }
    }
}
