package p002a6;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: a6.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0016b implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C0016b f37a = new C0016b();

    private /* synthetic */ C0016b() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }
}
