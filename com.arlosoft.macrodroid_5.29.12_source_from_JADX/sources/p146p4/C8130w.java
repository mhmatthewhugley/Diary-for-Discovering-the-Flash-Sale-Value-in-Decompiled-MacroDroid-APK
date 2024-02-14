package p146p4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p084e5.C7284c;
import p102h4.C7384g;
import p108i4.C7398a;
import p108i4.C7401d;
import p108i4.C7410i;
import p108i4.C7418n;
import p146p4.C8105n;

/* renamed from: p4.w */
/* compiled from: UriLoader */
public class C8130w<Data> implements C8105n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f19743b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C8133c<Data> f19744a;

    /* renamed from: p4.w$a */
    /* compiled from: UriLoader */
    public static final class C8131a implements C8107o<Uri, AssetFileDescriptor>, C8133c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f19745a;

        public C8131a(ContentResolver contentResolver) {
            this.f19745a = contentResolver;
        }

        /* renamed from: a */
        public C8105n<Uri, AssetFileDescriptor> mo38078a(C8113r rVar) {
            return new C8130w(this);
        }

        /* renamed from: b */
        public C7401d<AssetFileDescriptor> mo38145b(Uri uri) {
            return new C7398a(this.f19745a, uri);
        }
    }

    /* renamed from: p4.w$b */
    /* compiled from: UriLoader */
    public static class C8132b implements C8107o<Uri, ParcelFileDescriptor>, C8133c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f19746a;

        public C8132b(ContentResolver contentResolver) {
            this.f19746a = contentResolver;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, ParcelFileDescriptor> mo38078a(C8113r rVar) {
            return new C8130w(this);
        }

        /* renamed from: b */
        public C7401d<ParcelFileDescriptor> mo38145b(Uri uri) {
            return new C7410i(this.f19746a, uri);
        }
    }

    /* renamed from: p4.w$c */
    /* compiled from: UriLoader */
    public interface C8133c<Data> {
        /* renamed from: b */
        C7401d<Data> mo38145b(Uri uri);
    }

    /* renamed from: p4.w$d */
    /* compiled from: UriLoader */
    public static class C8134d implements C8107o<Uri, InputStream>, C8133c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f19747a;

        public C8134d(ContentResolver contentResolver) {
            this.f19747a = contentResolver;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, InputStream> mo38078a(C8113r rVar) {
            return new C8130w(this);
        }

        /* renamed from: b */
        public C7401d<InputStream> mo38145b(Uri uri) {
            return new C7418n(this.f19747a, uri);
        }
    }

    public C8130w(C8133c<Data> cVar) {
        this.f19744a = cVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(uri), this.f19744a.mo38145b(uri));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        return f19743b.contains(uri.getScheme());
    }
}
