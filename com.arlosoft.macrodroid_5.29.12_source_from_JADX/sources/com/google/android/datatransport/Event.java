package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Event<T> {
    /* renamed from: d */
    public static <T> Event<T> m956d(T t) {
        return new AutoValue_Event((Integer) null, t, Priority.DEFAULT);
    }

    /* renamed from: e */
    public static <T> Event<T> m957e(T t) {
        return new AutoValue_Event((Integer) null, t, Priority.VERY_LOW);
    }

    /* renamed from: f */
    public static <T> Event<T> m958f(T t) {
        return new AutoValue_Event((Integer) null, t, Priority.HIGHEST);
    }

    @Nullable
    /* renamed from: a */
    public abstract Integer mo19261a();

    /* renamed from: b */
    public abstract T mo19262b();

    /* renamed from: c */
    public abstract Priority mo19263c();
}
