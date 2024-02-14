package p002a6;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: a6.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0015a implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C0015a f36a = new C0015a();

    private /* synthetic */ C0015a() {
    }

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.m7517t(file, str);
    }
}
