package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.p007os.TraceCompat;
import java.io.File;
import p052x.C2157b;
import p052x.C2160e;
import p052x.C2161f;
import p052x.C2162g;
import p052x.C2163h;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.c */
/* compiled from: L */
public class C1461c {

    /* renamed from: a */
    public static boolean f881a = false;

    /* renamed from: b */
    private static boolean f882b = false;

    /* renamed from: c */
    private static String[] f883c;

    /* renamed from: d */
    private static long[] f884d;

    /* renamed from: e */
    private static int f885e;

    /* renamed from: f */
    private static int f886f;

    /* renamed from: g */
    private static C2161f f887g;

    /* renamed from: h */
    private static C2160e f888h;

    /* renamed from: i */
    private static volatile C2163h f889i;

    /* renamed from: j */
    private static volatile C2162g f890j;

    /* renamed from: com.airbnb.lottie.c$a */
    /* compiled from: L */
    class C1462a implements C2160e {

        /* renamed from: a */
        final /* synthetic */ Context f891a;

        C1462a(Context context) {
            this.f891a = context;
        }

        @NonNull
        /* renamed from: a */
        public File mo17051a() {
            return new File(this.f891a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m735a(String str) {
        if (f882b) {
            int i = f885e;
            if (i == 20) {
                f886f++;
                return;
            }
            f883c[i] = str;
            f884d[i] = System.nanoTime();
            TraceCompat.beginSection(str);
            f885e++;
        }
    }

    /* renamed from: b */
    public static float m736b(String str) {
        int i = f886f;
        if (i > 0) {
            f886f = i - 1;
            return 0.0f;
        } else if (!f882b) {
            return 0.0f;
        } else {
            int i2 = f885e - 1;
            f885e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f883c[i2])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - f884d[f885e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f883c[f885e] + ".");
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public static C2162g m737c(@NonNull Context context) {
        C2162g gVar = f890j;
        if (gVar == null) {
            synchronized (C2162g.class) {
                gVar = f890j;
                if (gVar == null) {
                    C2160e eVar = f888h;
                    if (eVar == null) {
                        eVar = new C1462a(context);
                    }
                    gVar = new C2162g(eVar);
                    f890j = gVar;
                }
            }
        }
        return gVar;
    }

    @NonNull
    /* renamed from: d */
    public static C2163h m738d(@NonNull Context context) {
        C2163h hVar = f889i;
        if (hVar == null) {
            synchronized (C2163h.class) {
                hVar = f889i;
                if (hVar == null) {
                    C2162g c = m737c(context);
                    C2161f fVar = f887g;
                    if (fVar == null) {
                        fVar = new C2157b();
                    }
                    hVar = new C2163h(c, fVar);
                    f889i = hVar;
                }
            }
        }
        return hVar;
    }
}
