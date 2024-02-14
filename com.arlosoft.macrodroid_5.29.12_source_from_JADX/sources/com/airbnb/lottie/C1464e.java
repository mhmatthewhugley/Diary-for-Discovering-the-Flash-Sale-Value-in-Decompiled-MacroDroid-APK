package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p001a0.C0006d;
import p001a0.C0010h;
import p048t.C2099g;
import p054y.C2196t;
import p055z.C2205c;
import p226cd.C11186d;
import p226cd.C11196l;

/* renamed from: com.airbnb.lottie.e */
/* compiled from: LottieCompositionFactory */
public class C1464e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, C1494m<C1463d>> f907a = new HashMap();

    /* renamed from: b */
    private static final byte[] f908b = {80, 75, 3, 4};

    /* renamed from: com.airbnb.lottie.e$a */
    /* compiled from: LottieCompositionFactory */
    class C1465a implements C1489h<C1463d> {

        /* renamed from: a */
        final /* synthetic */ String f909a;

        C1465a(String str) {
            this.f909a = str;
        }

        /* renamed from: a */
        public void onResult(C1463d dVar) {
            C1464e.f907a.remove(this.f909a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$b */
    /* compiled from: LottieCompositionFactory */
    class C1466b implements C1489h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f910a;

        C1466b(String str) {
            this.f910a = str;
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            C1464e.f907a.remove(this.f910a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$c */
    /* compiled from: LottieCompositionFactory */
    class C1467c implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ Context f911a;

        /* renamed from: c */
        final /* synthetic */ String f912c;

        /* renamed from: d */
        final /* synthetic */ String f913d;

        C1467c(Context context, String str, String str2) {
            this.f911a = context;
            this.f912c = str;
            this.f913d = str2;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            C1493l<C1463d> c = C1461c.m738d(this.f911a).mo24387c(this.f912c, this.f913d);
            if (!(this.f913d == null || c.mo17162b() == null)) {
                C2099g.m8665b().mo24222c(this.f913d, c.mo17162b());
            }
            return c;
        }
    }

    /* renamed from: com.airbnb.lottie.e$d */
    /* compiled from: LottieCompositionFactory */
    class C1468d implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ Context f914a;

        /* renamed from: c */
        final /* synthetic */ String f915c;

        /* renamed from: d */
        final /* synthetic */ String f916d;

        C1468d(Context context, String str, String str2) {
            this.f914a = context;
            this.f915c = str;
            this.f916d = str2;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            return C1464e.m767g(this.f914a, this.f915c, this.f916d);
        }
    }

    /* renamed from: com.airbnb.lottie.e$e */
    /* compiled from: LottieCompositionFactory */
    class C1469e implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ WeakReference f917a;

        /* renamed from: c */
        final /* synthetic */ Context f918c;

        /* renamed from: d */
        final /* synthetic */ int f919d;

        /* renamed from: f */
        final /* synthetic */ String f920f;

        C1469e(WeakReference weakReference, Context context, int i, String str) {
            this.f917a = weakReference;
            this.f918c = context;
            this.f919d = i;
            this.f920f = str;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            Context context = (Context) this.f917a.get();
            if (context == null) {
                context = this.f918c;
            }
            return C1464e.m776p(context, this.f919d, this.f920f);
        }
    }

    /* renamed from: com.airbnb.lottie.e$f */
    /* compiled from: LottieCompositionFactory */
    class C1470f implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ InputStream f921a;

        /* renamed from: c */
        final /* synthetic */ String f922c;

        C1470f(InputStream inputStream, String str) {
            this.f921a = inputStream;
            this.f922c = str;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            return C1464e.m769i(this.f921a, this.f922c);
        }
    }

    /* renamed from: com.airbnb.lottie.e$g */
    /* compiled from: LottieCompositionFactory */
    class C1471g implements Callable<C1493l<C1463d>> {

        /* renamed from: a */
        final /* synthetic */ C1463d f923a;

        C1471g(C1463d dVar) {
            this.f923a = dVar;
        }

        /* renamed from: a */
        public C1493l<C1463d> call() {
            return new C1493l<>(this.f923a);
        }
    }

    /* renamed from: b */
    private static C1494m<C1463d> m762b(@Nullable String str, Callable<C1493l<C1463d>> callable) {
        C1463d a = str == null ? null : C2099g.m8665b().mo24221a(str);
        if (a != null) {
            return new C1494m<>(new C1471g(a));
        }
        if (str != null) {
            Map<String, C1494m<C1463d>> map = f907a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C1494m<C1463d> mVar = new C1494m<>(callable);
        if (str != null) {
            mVar.mo17166f(new C1465a(str));
            mVar.mo17165e(new C1466b(str));
            f907a.put(str, mVar);
        }
        return mVar;
    }

    @Nullable
    /* renamed from: c */
    private static C1488g m763c(C1463d dVar, String str) {
        for (C1488g next : dVar.mo17060i().values()) {
            if (next.mo17155b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C1494m<C1463d> m764d(Context context, String str) {
        return m765e(context, str, "asset_" + str);
    }

    /* renamed from: e */
    public static C1494m<C1463d> m765e(Context context, String str, @Nullable String str2) {
        return m762b(str2, new C1468d(context.getApplicationContext(), str, str2));
    }

    @WorkerThread
    /* renamed from: f */
    public static C1493l<C1463d> m766f(Context context, String str) {
        return m767g(context, str, "asset_" + str);
    }

    @WorkerThread
    /* renamed from: g */
    public static C1493l<C1463d> m767g(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return m769i(context.getAssets().open(str), str2);
                }
            }
            return m779s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C1493l<>((Throwable) e);
        }
    }

    /* renamed from: h */
    public static C1494m<C1463d> m768h(InputStream inputStream, @Nullable String str) {
        return m762b(str, new C1470f(inputStream, str));
    }

    @WorkerThread
    /* renamed from: i */
    public static C1493l<C1463d> m769i(InputStream inputStream, @Nullable String str) {
        return m770j(inputStream, str, true);
    }

    @WorkerThread
    /* renamed from: j */
    private static C1493l<C1463d> m770j(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return m771k(C2205c.m9032r(C11196l.m75163b(C11196l.m75168g(inputStream))), str);
        } finally {
            if (z) {
                C0010h.m73c(inputStream);
            }
        }
    }

    @WorkerThread
    /* renamed from: k */
    public static C1493l<C1463d> m771k(C2205c cVar, @Nullable String str) {
        return m772l(cVar, str, true);
    }

    /* renamed from: l */
    private static C1493l<C1463d> m772l(C2205c cVar, @Nullable String str, boolean z) {
        try {
            C1463d a = C2196t.m9017a(cVar);
            if (str != null) {
                C2099g.m8665b().mo24222c(str, a);
            }
            C1493l<C1463d> lVar = new C1493l<>(a);
            if (z) {
                C0010h.m73c(cVar);
            }
            return lVar;
        } catch (Exception e) {
            C1493l<C1463d> lVar2 = new C1493l<>((Throwable) e);
            if (z) {
                C0010h.m73c(cVar);
            }
            return lVar2;
        } catch (Throwable th) {
            if (z) {
                C0010h.m73c(cVar);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static C1494m<C1463d> m773m(Context context, @RawRes int i) {
        return m774n(context, i, m783w(context, i));
    }

    /* renamed from: n */
    public static C1494m<C1463d> m774n(Context context, @RawRes int i, @Nullable String str) {
        return m762b(str, new C1469e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    @WorkerThread
    /* renamed from: o */
    public static C1493l<C1463d> m775o(Context context, @RawRes int i) {
        return m776p(context, i, m783w(context, i));
    }

    @WorkerThread
    /* renamed from: p */
    public static C1493l<C1463d> m776p(Context context, @RawRes int i, @Nullable String str) {
        try {
            C11186d b = C11196l.m75163b(C11196l.m75168g(context.getResources().openRawResource(i)));
            if (m782v(b).booleanValue()) {
                return m779s(new ZipInputStream(b.mo62442k2()), str);
            }
            return m769i(b.mo62442k2(), str);
        } catch (Resources.NotFoundException e) {
            return new C1493l<>((Throwable) e);
        }
    }

    /* renamed from: q */
    public static C1494m<C1463d> m777q(Context context, String str) {
        return m778r(context, str, "url_" + str);
    }

    /* renamed from: r */
    public static C1494m<C1463d> m778r(Context context, String str, @Nullable String str2) {
        return m762b(str2, new C1467c(context, str, str2));
    }

    @WorkerThread
    /* renamed from: s */
    public static C1493l<C1463d> m779s(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return m780t(zipInputStream, str);
        } finally {
            C0010h.m73c(zipInputStream);
        }
    }

    @WorkerThread
    /* renamed from: t */
    private static C1493l<C1463d> m780t(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1463d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = m772l(C2205c.m9032r(C11196l.m75163b(C11196l.m75168g(zipInputStream))), (String) null, false).mo17162b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new C1493l<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C1488g c = m763c(dVar, (String) entry.getKey());
                if (c != null) {
                    c.mo17159f(C0010h.m82l((Bitmap) entry.getValue(), c.mo17158e(), c.mo17156c()));
                }
            }
            for (Map.Entry next : dVar.mo17060i().entrySet()) {
                if (((C1488g) next.getValue()).mo17154a() == null) {
                    return new C1493l<>((Throwable) new IllegalStateException("There is no image for " + ((C1488g) next.getValue()).mo17155b()));
                }
            }
            if (str != null) {
                C2099g.m8665b().mo24222c(str, dVar);
            }
            return new C1493l<>(dVar);
        } catch (IOException e) {
            return new C1493l<>((Throwable) e);
        }
    }

    /* renamed from: u */
    private static boolean m781u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: v */
    private static Boolean m782v(C11186d dVar) {
        try {
            C11186d peek = dVar.peek();
            for (byte b : f908b) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C0006d.m31b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: w */
    private static String m783w(Context context, @RawRes int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m781u(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
