package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class CreationContext {
    /* renamed from: a */
    public static CreationContext m1307a(Context context, Clock clock, Clock clock2, String str) {
        return new AutoValue_CreationContext(context, clock, clock2, str);
    }

    /* renamed from: b */
    public abstract Context mo19481b();

    @NonNull
    /* renamed from: c */
    public abstract String mo19482c();

    /* renamed from: d */
    public abstract Clock mo19483d();

    /* renamed from: e */
    public abstract Clock mo19484e();
}
