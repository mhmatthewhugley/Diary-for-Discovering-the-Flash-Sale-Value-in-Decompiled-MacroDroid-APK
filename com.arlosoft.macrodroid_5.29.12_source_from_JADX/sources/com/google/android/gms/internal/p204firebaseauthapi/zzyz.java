package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzyz {

    /* renamed from: a */
    private static final Map f40675a = new ArrayMap();

    /* renamed from: b */
    private static final Map f40676b = new ArrayMap();

    @NonNull
    /* renamed from: a */
    public static String m58513a(String str) {
        zzyx zzyx;
        Map map = f40675a;
        synchronized (map) {
            zzyx = (zzyx) map.get(str);
        }
        if (zzyx != null) {
            return m58520h(zzyx.mo50086b(), zzyx.mo50085a(), zzyx.mo50086b().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    @NonNull
    /* renamed from: b */
    public static String m58514b(String str) {
        zzyx zzyx;
        Map map = f40675a;
        synchronized (map) {
            zzyx = (zzyx) map.get(str);
        }
        return (zzyx != null ? "".concat(m58520h(zzyx.mo50086b(), zzyx.mo50085a(), zzyx.mo50086b().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    @NonNull
    /* renamed from: c */
    public static String m58515c(String str) {
        zzyx zzyx;
        Map map = f40675a;
        synchronized (map) {
            zzyx = (zzyx) map.get(str);
        }
        return (zzyx != null ? "".concat(m58520h(zzyx.mo50086b(), zzyx.mo50085a(), zzyx.mo50086b().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2");
    }

    @NonNull
    /* renamed from: d */
    public static String m58516d(String str) {
        zzyx zzyx;
        Map map = f40675a;
        synchronized (map) {
            zzyx = (zzyx) map.get(str);
        }
        return (zzyx != null ? "".concat(m58520h(zzyx.mo50086b(), zzyx.mo50085a(), zzyx.mo50086b().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    /* renamed from: e */
    public static void m58517e(String str, zzyy zzyy) {
        Map map = f40676b;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(zzyy));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzyy));
                map.put(str, arrayList);
            }
        }
    }

    /* renamed from: f */
    public static void m58518f(@NonNull FirebaseApp firebaseApp, @NonNull String str, int i) {
        String b = firebaseApp.mo61952p().mo61961b();
        Map map = f40675a;
        synchronized (map) {
            map.put(b, new zzyx(str, i));
        }
        Map map2 = f40676b;
        synchronized (map2) {
            if (map2.containsKey(b)) {
                boolean z = false;
                for (WeakReference weakReference : (List) map2.get(b)) {
                    zzyy zzyy = (zzyy) weakReference.get();
                    if (zzyy != null) {
                        zzyy.mo50045g();
                        z = true;
                    }
                }
                if (!z) {
                    f40675a.remove(b);
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m58519g(@NonNull FirebaseApp firebaseApp) {
        return f40675a.containsKey(firebaseApp.mo61952p().mo61961b());
    }

    /* renamed from: h */
    private static String m58520h(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + ":" + i + "/";
    }
}
