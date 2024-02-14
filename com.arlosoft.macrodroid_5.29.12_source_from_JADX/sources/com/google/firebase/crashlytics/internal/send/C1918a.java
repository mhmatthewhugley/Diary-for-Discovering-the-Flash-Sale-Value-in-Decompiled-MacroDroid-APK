package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.Transformer;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;

/* renamed from: com.google.firebase.crashlytics.internal.send.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1918a implements Transformer {

    /* renamed from: a */
    public static final /* synthetic */ C1918a f5470a = new C1918a();

    private /* synthetic */ C1918a() {
    }

    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.f5451c.mo23480E((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
