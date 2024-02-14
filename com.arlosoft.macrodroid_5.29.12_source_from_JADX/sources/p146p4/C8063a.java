package p146p4;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p084e5.C7284c;
import p102h4.C7384g;
import p108i4.C7401d;
import p108i4.C7409h;
import p108i4.C7417m;
import p146p4.C8105n;

/* renamed from: p4.a */
/* compiled from: AssetUriLoader */
public class C8063a<Data> implements C8105n<Uri, Data> {

    /* renamed from: c */
    private static final int f19657c = 22;

    /* renamed from: a */
    private final AssetManager f19658a;

    /* renamed from: b */
    private final C8064a<Data> f19659b;

    /* renamed from: p4.a$a */
    /* compiled from: AssetUriLoader */
    public interface C8064a<Data> {
        /* renamed from: b */
        C7401d<Data> mo38077b(AssetManager assetManager, String str);
    }

    /* renamed from: p4.a$b */
    /* compiled from: AssetUriLoader */
    public static class C8065b implements C8107o<Uri, ParcelFileDescriptor>, C8064a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f19660a;

        public C8065b(AssetManager assetManager) {
            this.f19660a = assetManager;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, ParcelFileDescriptor> mo38078a(C8113r rVar) {
            return new C8063a(this.f19660a, this);
        }

        /* renamed from: b */
        public C7401d<ParcelFileDescriptor> mo38077b(AssetManager assetManager, String str) {
            return new C7409h(assetManager, str);
        }
    }

    /* renamed from: p4.a$c */
    /* compiled from: AssetUriLoader */
    public static class C8066c implements C8107o<Uri, InputStream>, C8064a<InputStream> {

        /* renamed from: a */
        private final AssetManager f19661a;

        public C8066c(AssetManager assetManager) {
            this.f19661a = assetManager;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Uri, InputStream> mo38078a(C8113r rVar) {
            return new C8063a(this.f19661a, this);
        }

        /* renamed from: b */
        public C7401d<InputStream> mo38077b(AssetManager assetManager, String str) {
            return new C7417m(assetManager, str);
        }
    }

    public C8063a(AssetManager assetManager, C8064a<Data> aVar) {
        this.f19658a = assetManager;
        this.f19659b = aVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(uri), this.f19659b.mo38077b(this.f19658a, uri.toString().substring(f19657c)));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
