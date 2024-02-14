package p152q4;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p084e5.C7284c;
import p102h4.C7384g;
import p114j4.C7451b;
import p114j4.C7452c;
import p146p4.C8105n;
import p146p4.C8107o;
import p146p4.C8113r;
import p164s4.C10226w;

/* renamed from: q4.d */
/* compiled from: MediaStoreVideoThumbLoader */
public class C8173d implements C8105n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f19805a;

    /* renamed from: q4.d$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C8174a implements C8107o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f19806a;

        public C8174a(Context context) {
            this.f19806a = context;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, InputStream> mo38078a(C8113r rVar) {
            return new C8173d(this.f19806a);
        }
    }

    public C8173d(Context context) {
        this.f19805a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m33921e(C7384g gVar) {
        Long l = (Long) gVar.mo37379c(C10226w.f23360d);
        return l != null && l.longValue() == -1;
    }

    @Nullable
    /* renamed from: c */
    public C8105n.C8106a<InputStream> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        if (!C7451b.m30934d(i, i2) || !m33921e(gVar)) {
            return null;
        }
        return new C8105n.C8106a<>(new C7284c(uri), C7452c.m30938g(this.f19805a, uri));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        return C7451b.m30933c(uri);
    }
}
