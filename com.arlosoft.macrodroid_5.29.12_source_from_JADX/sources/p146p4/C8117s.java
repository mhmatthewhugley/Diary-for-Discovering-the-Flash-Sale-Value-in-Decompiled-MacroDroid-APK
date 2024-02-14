package p146p4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p102h4.C7384g;
import p146p4.C8105n;

/* renamed from: p4.s */
/* compiled from: ResourceLoader */
public class C8117s<Data> implements C8105n<Integer, Data> {

    /* renamed from: a */
    private final C8105n<Uri, Data> f19732a;

    /* renamed from: b */
    private final Resources f19733b;

    /* renamed from: p4.s$a */
    /* compiled from: ResourceLoader */
    public static final class C8118a implements C8107o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f19734a;

        public C8118a(Resources resources) {
            this.f19734a = resources;
        }

        /* renamed from: a */
        public C8105n<Integer, AssetFileDescriptor> mo38078a(C8113r rVar) {
            return new C8117s(this.f19734a, rVar.mo38133d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: p4.s$b */
    /* compiled from: ResourceLoader */
    public static class C8119b implements C8107o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f19735a;

        public C8119b(Resources resources) {
            this.f19735a = resources;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Integer, ParcelFileDescriptor> mo38078a(C8113r rVar) {
            return new C8117s(this.f19735a, rVar.mo38133d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: p4.s$c */
    /* compiled from: ResourceLoader */
    public static class C8120c implements C8107o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f19736a;

        public C8120c(Resources resources) {
            this.f19736a = resources;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Integer, InputStream> mo38078a(C8113r rVar) {
            return new C8117s(this.f19736a, rVar.mo38133d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: p4.s$d */
    /* compiled from: ResourceLoader */
    public static class C8121d implements C8107o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f19737a;

        public C8121d(Resources resources) {
            this.f19737a = resources;
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Integer, Uri> mo38078a(C8113r rVar) {
            return new C8117s(this.f19737a, C8127v.m33772c());
        }
    }

    public C8117s(Resources resources, C8105n<Uri, Data> nVar) {
        this.f19733b = resources;
        this.f19732a = nVar;
    }

    @Nullable
    /* renamed from: d */
    private Uri m33752d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f19733b.getResourcePackageName(num.intValue()) + '/' + this.f19733b.getResourceTypeName(num.intValue()) + '/' + this.f19733b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull Integer num, int i, int i2, @NonNull C7384g gVar) {
        Uri d = m33752d(num);
        if (d == null) {
            return null;
        }
        return this.f19732a.mo38074b(d, i, i2, gVar);
    }

    /* renamed from: e */
    public boolean mo38073a(@NonNull Integer num) {
        return true;
    }
}
