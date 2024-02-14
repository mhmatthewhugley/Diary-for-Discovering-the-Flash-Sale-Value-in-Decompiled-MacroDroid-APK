package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

public class DataTransportCrashlyticsReportSender {

    /* renamed from: c */
    private static final CrashlyticsReportJsonTransform f5451c = new CrashlyticsReportJsonTransform();

    /* renamed from: d */
    private static final String f5452d = m7555e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    private static final String f5453e = m7555e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    private static final Transformer<CrashlyticsReport, byte[]> f5454f = C1918a.f5470a;

    /* renamed from: a */
    private final ReportQueue f5455a;

    /* renamed from: b */
    private final Transformer<CrashlyticsReport, byte[]> f5456b;

    DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer<CrashlyticsReport, byte[]> transformer) {
        this.f5455a = reportQueue;
        this.f5456b = transformer;
    }

    /* renamed from: b */
    public static DataTransportCrashlyticsReportSender m7553b(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TransportRuntime.m1273f(context);
        Encoding b = Encoding.m954b("json");
        Transformer<CrashlyticsReport, byte[]> transformer = f5454f;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(TransportRuntime.m1271c().mo19465g(new CCTDestination(f5452d, f5453e)).mo19274a("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, b, transformer), settingsProvider.mo23526b(), onDemandCounter), transformer);
    }

    /* renamed from: e */
    private static String m7555e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: c */
    public Task<CrashlyticsReportWithSessionId> mo23512c(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.f5455a.mo23513i(crashlyticsReportWithSessionId, z).mo56137a();
    }
}
