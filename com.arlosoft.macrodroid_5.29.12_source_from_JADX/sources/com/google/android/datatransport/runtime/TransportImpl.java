package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

final class TransportImpl<T> implements Transport<T> {

    /* renamed from: a */
    private final TransportContext f1363a;

    /* renamed from: b */
    private final String f1364b;

    /* renamed from: c */
    private final Encoding f1365c;

    /* renamed from: d */
    private final Transformer<T, byte[]> f1366d;

    /* renamed from: e */
    private final TransportInternal f1367e;

    TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, TransportInternal transportInternal) {
        this.f1363a = transportContext;
        this.f1364b = str;
        this.f1365c = encoding;
        this.f1366d = transformer;
        this.f1367e = transportInternal;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m1265e(Exception exc) {
    }

    /* renamed from: a */
    public void mo19272a(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        this.f1367e.mo19463a(SendRequest.m1240a().mo19424e(this.f1363a).mo19422c(event).mo19425f(this.f1364b).mo19423d(this.f1366d).mo19421b(this.f1365c).mo19420a(), transportScheduleCallback);
    }

    /* renamed from: b */
    public void mo19273b(Event<T> event) {
        mo19272a(event, C1665a.f1378a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public TransportContext mo19462d() {
        return this.f1363a;
    }
}
