package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.internal.common.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1873d implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C1873d f5037a = new C1873d();

    private /* synthetic */ C1873d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.CustomAttribute) obj).mo23174b().compareTo(((CrashlyticsReport.CustomAttribute) obj2).mo23174b());
    }
}
