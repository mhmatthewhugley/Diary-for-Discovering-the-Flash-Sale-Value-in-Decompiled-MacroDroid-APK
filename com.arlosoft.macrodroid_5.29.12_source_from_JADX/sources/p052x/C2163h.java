package p052x;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.C1463d;
import com.airbnb.lottie.C1464e;
import com.airbnb.lottie.C1493l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p001a0.C0006d;

/* renamed from: x.h */
/* compiled from: NetworkFetcher */
public class C2163h {
    @NonNull

    /* renamed from: a */
    private final C2162g f6769a;
    @NonNull

    /* renamed from: b */
    private final C2161f f6770b;

    public C2163h(@NonNull C2162g gVar, @NonNull C2161f fVar) {
        this.f6769a = gVar;
        this.f6770b = fVar;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    private C1463d m8939a(@NonNull String str, @Nullable String str2) {
        Pair<C2158c, InputStream> a;
        C1493l<C1463d> lVar;
        if (str2 == null || (a = this.f6769a.mo24384a(str)) == null) {
            return null;
        }
        C2158c cVar = (C2158c) a.first;
        InputStream inputStream = (InputStream) a.second;
        if (cVar == C2158c.ZIP) {
            lVar = C1464e.m779s(new ZipInputStream(inputStream), str);
        } else {
            lVar = C1464e.m769i(inputStream, str);
        }
        if (lVar.mo17162b() != null) {
            return lVar.mo17162b();
        }
        return null;
    }

    @WorkerThread
    @NonNull
    /* renamed from: b */
    private C1493l<C1463d> m8940b(@NonNull String str, @Nullable String str2) {
        C0006d.m30a("Fetching " + str);
        C2159d dVar = null;
        try {
            dVar = this.f6770b.mo24381a(str);
            if (dVar.mo24377J0()) {
                C1493l<C1463d> d = m8941d(str, dVar.mo24380u0(), dVar.mo24379r0(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(d.mo17162b() != null);
                C0006d.m30a(sb.toString());
                try {
                    dVar.close();
                } catch (IOException e) {
                    C0006d.m33d("LottieFetchResult close failed ", e);
                }
                return d;
            }
            C1493l<C1463d> lVar = new C1493l<>((Throwable) new IllegalArgumentException(dVar.mo24376G1()));
            try {
                dVar.close();
            } catch (IOException e2) {
                C0006d.m33d("LottieFetchResult close failed ", e2);
            }
            return lVar;
        } catch (Exception e3) {
            C1493l<C1463d> lVar2 = new C1493l<>((Throwable) e3);
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e4) {
                    C0006d.m33d("LottieFetchResult close failed ", e4);
                }
            }
            return lVar2;
        } catch (Throwable th) {
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e5) {
                    C0006d.m33d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @NonNull
    /* renamed from: d */
    private C1493l<C1463d> m8941d(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        C2158c cVar;
        C1493l<C1463d> lVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            C0006d.m30a("Handling zip response.");
            cVar = C2158c.ZIP;
            lVar = m8943f(str, inputStream, str3);
        } else {
            C0006d.m30a("Received json response.");
            cVar = C2158c.JSON;
            lVar = m8942e(str, inputStream, str3);
        }
        if (!(str3 == null || lVar.mo17162b() == null)) {
            this.f6769a.mo24385e(str, cVar);
        }
        return lVar;
    }

    @NonNull
    /* renamed from: e */
    private C1493l<C1463d> m8942e(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        if (str2 == null) {
            return C1464e.m769i(inputStream, (String) null);
        }
        return C1464e.m769i(new FileInputStream(new File(this.f6769a.mo24386f(str, inputStream, C2158c.JSON).getAbsolutePath())), str);
    }

    @NonNull
    /* renamed from: f */
    private C1493l<C1463d> m8943f(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        if (str2 == null) {
            return C1464e.m779s(new ZipInputStream(inputStream), (String) null);
        }
        return C1464e.m779s(new ZipInputStream(new FileInputStream(this.f6769a.mo24386f(str, inputStream, C2158c.ZIP))), str);
    }

    @WorkerThread
    @NonNull
    /* renamed from: c */
    public C1493l<C1463d> mo24387c(@NonNull String str, @Nullable String str2) {
        C1463d a = m8939a(str, str2);
        if (a != null) {
            return new C1493l<>(a);
        }
        C0006d.m30a("Animation for " + str + " not found in cache. Fetching from network.");
        return m8940b(str, str2);
    }
}
