package p146p4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import p083e4.C7275g;
import p084e5.C7284c;
import p102h4.C7376a;
import p102h4.C7384g;
import p108i4.C7401d;
import p114j4.C7451b;
import p146p4.C8105n;

/* renamed from: p4.k */
/* compiled from: MediaStoreFileLoader */
public final class C8098k implements C8105n<Uri, File> {

    /* renamed from: a */
    private final Context f19696a;

    /* renamed from: p4.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C8099a implements C8107o<Uri, File> {

        /* renamed from: a */
        private final Context f19697a;

        public C8099a(Context context) {
            this.f19697a = context;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, File> mo38078a(C8113r rVar) {
            return new C8098k(this.f19697a);
        }
    }

    /* renamed from: p4.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C8100b implements C7401d<File> {

        /* renamed from: d */
        private static final String[] f19698d = {"_data"};

        /* renamed from: a */
        private final Context f19699a;

        /* renamed from: c */
        private final Uri f19700c;

        C8100b(Context context, Uri uri) {
            this.f19699a = context;
            this.f19700c = uri;
        }

        @NonNull
        /* renamed from: a */
        public Class<File> mo37430a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo37435b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: d */
        public C7376a mo37438d() {
            return C7376a.LOCAL;
        }

        /* renamed from: f */
        public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super File> aVar) {
            Cursor query = this.f19699a.getContentResolver().query(this.f19700c, f19698d, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo33006c(new FileNotFoundException("Failed to find file path for: " + this.f19700c));
                return;
            }
            aVar.mo33008e(new File(str));
        }
    }

    public C8098k(Context context) {
        this.f19696a = context;
    }

    /* renamed from: c */
    public C8105n.C8106a<File> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(uri), new C8100b(this.f19696a, uri));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        return C7451b.m30932b(uri);
    }
}
