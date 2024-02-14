package p146p4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;
import p102h4.C7384g;
import p146p4.C8105n;

/* renamed from: p4.u */
/* compiled from: StringLoader */
public class C8123u<Data> implements C8105n<String, Data> {

    /* renamed from: a */
    private final C8105n<Uri, Data> f19739a;

    /* renamed from: p4.u$a */
    /* compiled from: StringLoader */
    public static final class C8124a implements C8107o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C8105n<String, AssetFileDescriptor> mo38078a(@NonNull C8113r rVar) {
            return new C8123u(rVar.mo38133d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: p4.u$b */
    /* compiled from: StringLoader */
    public static class C8125b implements C8107o<String, ParcelFileDescriptor> {
        @NonNull
        /* renamed from: a */
        public C8105n<String, ParcelFileDescriptor> mo38078a(@NonNull C8113r rVar) {
            return new C8123u(rVar.mo38133d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: p4.u$c */
    /* compiled from: StringLoader */
    public static class C8126c implements C8107o<String, InputStream> {
        @NonNull
        /* renamed from: a */
        public C8105n<String, InputStream> mo38078a(@NonNull C8113r rVar) {
            return new C8123u(rVar.mo38133d(Uri.class, InputStream.class));
        }
    }

    public C8123u(C8105n<Uri, Data> nVar) {
        this.f19739a = nVar;
    }

    @Nullable
    /* renamed from: e */
    private static Uri m33763e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m33764f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m33764f(str) : parse;
    }

    /* renamed from: f */
    private static Uri m33764f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull String str, int i, int i2, @NonNull C7384g gVar) {
        Uri e = m33763e(str);
        if (e == null || !this.f19739a.mo38073a(e)) {
            return null;
        }
        return this.f19739a.mo38074b(e, i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull String str) {
        return true;
    }
}
