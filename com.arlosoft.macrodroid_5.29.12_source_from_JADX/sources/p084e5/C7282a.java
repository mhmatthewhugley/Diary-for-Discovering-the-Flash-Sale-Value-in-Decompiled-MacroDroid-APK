package p084e5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p102h4.C7380e;

/* renamed from: e5.a */
/* compiled from: ApplicationVersionSignature */
public final class C7282a {

    /* renamed from: a */
    private static final ConcurrentMap<String, C7380e> f17792a = new ConcurrentHashMap();

    @Nullable
    /* renamed from: a */
    private static PackageInfo m30087a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    private static String m30088b(@Nullable PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @NonNull
    /* renamed from: c */
    public static C7380e m30089c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, C7380e> concurrentMap = f17792a;
        C7380e eVar = (C7380e) concurrentMap.get(packageName);
        if (eVar != null) {
            return eVar;
        }
        C7380e d = m30090d(context);
        C7380e putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    @NonNull
    /* renamed from: d */
    private static C7380e m30090d(@NonNull Context context) {
        return new C7284c(m30088b(m30087a(context)));
    }
}
