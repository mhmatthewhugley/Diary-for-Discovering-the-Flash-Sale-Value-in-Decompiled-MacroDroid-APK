package p002a6;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

/* renamed from: a6.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0018d implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C0018d f39a = new C0018d();

    private /* synthetic */ C0018d() {
    }

    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.m7520x((File) obj, (File) obj2);
    }
}
