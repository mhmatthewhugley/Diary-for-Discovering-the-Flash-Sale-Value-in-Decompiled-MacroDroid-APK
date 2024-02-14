package dev.skomlach.biometric.compat.utils.activityView;

import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.common.misc.C12114c;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007RH\u0010\u000f\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f \r*\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000e0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R8\u0010\u0013\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u0002 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/IconStateHelper;", "", "Ldev/skomlach/biometric/compat/utils/activityView/IconStateHelper$IconStateListener;", "stateListener", "Lja/u;", "registerListener", "unregisterListener", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "errorType", "successType", "", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "", "iconsTasks", "Ljava/util/Map;", "", "", "listeners", "Ljava/util/Set;", "<init>", "()V", "IconStateListener", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: IconStateHelper.kt */
public final class IconStateHelper {
    public static final IconStateHelper INSTANCE = new IconStateHelper();
    private static final Map<BiometricType, Runnable> iconsTasks = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public static final Set<IconStateListener> listeners = Collections.synchronizedSet(new HashSet());

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/IconStateHelper$IconStateListener;", "", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "Lja/u;", "onError", "onSuccess", "reset", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: IconStateHelper.kt */
    public interface IconStateListener {
        void onError(BiometricType biometricType);

        void onSuccess(BiometricType biometricType);

        void reset(BiometricType biometricType);
    }

    private IconStateHelper() {
    }

    /* access modifiers changed from: private */
    /* renamed from: errorType$lambda-1  reason: not valid java name */
    public static final void m101355errorType$lambda1(BiometricType biometricType) {
        for (IconStateListener onError : listeners) {
            onError.onError(biometricType);
        }
        Runnable runnable = iconsTasks.get(biometricType);
        if (runnable != null) {
            C12114c.f58379a.mo68307i(runnable);
        }
        C12114c.f58379a.mo68306h(new IconStateHelper$errorType$1$2(biometricType), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: successType$lambda-2  reason: not valid java name */
    public static final void m101356successType$lambda2(BiometricType biometricType) {
        for (IconStateListener onSuccess : listeners) {
            onSuccess.onSuccess(biometricType);
        }
    }

    public final void errorType(BiometricType biometricType) {
        C12114c.f58379a.mo68305g(new C12089e(biometricType));
    }

    public final void registerListener(IconStateListener iconStateListener) {
        C13706o.m87929f(iconStateListener, "stateListener");
        listeners.add(iconStateListener);
    }

    public final void successType(BiometricType biometricType) {
        C12114c.f58379a.mo68305g(new C12088d(biometricType));
    }

    public final void unregisterListener(IconStateListener iconStateListener) {
        C13706o.m87929f(iconStateListener, "stateListener");
        listeners.remove(iconStateListener);
    }
}
