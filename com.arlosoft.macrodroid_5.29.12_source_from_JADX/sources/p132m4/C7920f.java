package p132m4;

import android.content.Context;
import java.io.File;
import p132m4.C7917d;

/* renamed from: m4.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C7920f extends C7917d {

    /* renamed from: m4.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C7921a implements C7917d.C7918a {

        /* renamed from: a */
        final /* synthetic */ Context f19028a;

        /* renamed from: b */
        final /* synthetic */ String f19029b;

        C7921a(Context context, String str) {
            this.f19028a = context;
            this.f19029b = str;
        }

        /* renamed from: a */
        public File mo37813a() {
            File cacheDir = this.f19028a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f19029b != null ? new File(cacheDir, this.f19029b) : cacheDir;
        }
    }

    public C7920f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C7920f(Context context, String str, long j) {
        super(new C7921a(context, str), j);
    }
}
