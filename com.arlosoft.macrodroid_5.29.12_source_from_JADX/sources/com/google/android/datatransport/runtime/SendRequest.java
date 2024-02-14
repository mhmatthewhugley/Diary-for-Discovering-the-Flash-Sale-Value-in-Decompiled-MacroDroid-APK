package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class SendRequest {

    @AutoValue.Builder
    public static abstract class Builder {
        /* renamed from: a */
        public abstract SendRequest mo19420a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Builder mo19421b(Encoding encoding);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Builder mo19422c(Event<?> event);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Builder mo19423d(Transformer<?, byte[]> transformer);

        /* renamed from: e */
        public abstract Builder mo19424e(TransportContext transportContext);

        /* renamed from: f */
        public abstract Builder mo19425f(String str);
    }

    SendRequest() {
    }

    /* renamed from: a */
    public static Builder m1240a() {
        return new AutoValue_SendRequest.Builder();
    }

    /* renamed from: b */
    public abstract Encoding mo19412b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Event<?> mo19413c();

    /* renamed from: d */
    public byte[] mo19458d() {
        return mo19414e().apply(mo19413c().mo19262b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Transformer<?, byte[]> mo19414e();

    /* renamed from: f */
    public abstract TransportContext mo19416f();

    /* renamed from: g */
    public abstract String mo19417g();
}
