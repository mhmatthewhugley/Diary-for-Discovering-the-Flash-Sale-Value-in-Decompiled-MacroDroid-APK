package p152q4;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p084e5.C7284c;
import p102h4.C7384g;
import p114j4.C7451b;
import p114j4.C7452c;
import p146p4.C8105n;
import p146p4.C8107o;
import p146p4.C8113r;

/* renamed from: q4.c */
/* compiled from: MediaStoreImageThumbLoader */
public class C8171c implements C8105n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f19803a;

    /* renamed from: q4.c$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C8172a implements C8107o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f19804a;

        public C8172a(Context context) {
            this.f19804a = context;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, InputStream> mo38078a(C8113r rVar) {
            return new C8171c(this.f19804a);
        }
    }

    public C8171c(Context context) {
        this.f19803a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C8105n.C8106a<InputStream> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        if (C7451b.m30934d(i, i2)) {
            return new C8105n.C8106a<>(new C7284c(uri), C7452c.m30937e(this.f19803a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        return C7451b.m30931a(uri);
    }
}
