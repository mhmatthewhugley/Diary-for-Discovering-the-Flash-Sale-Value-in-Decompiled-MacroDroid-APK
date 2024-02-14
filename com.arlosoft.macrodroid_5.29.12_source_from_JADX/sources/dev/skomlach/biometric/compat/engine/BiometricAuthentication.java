package dev.skomlach.biometric.compat.engine;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptographyPurpose;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.engine.core.Core;
import dev.skomlach.biometric.compat.engine.core.interfaces.BiometricModule;
import dev.skomlach.biometric.compat.engine.core.interfaces.RestartPredicate;
import dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule;
import dev.skomlach.biometric.compat.engine.internal.face.android.AndroidFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.face.facelock.FacelockOldModule;
import dev.skomlach.biometric.compat.engine.internal.face.huawei.HuaweiFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.face.miui.MiuiFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.face.oppo.OppoFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.face.samsung.SamsungFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.face.soter.SoterFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.face.vivo.VivoFaceUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.fingerprint.API23FingerprintModule;
import dev.skomlach.biometric.compat.engine.internal.fingerprint.FlymeFingerprintModule;
import dev.skomlach.biometric.compat.engine.internal.fingerprint.SamsungFingerprintModule;
import dev.skomlach.biometric.compat.engine.internal.fingerprint.SoterFingerprintUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.fingerprint.SupportFingerprintModule;
import dev.skomlach.biometric.compat.engine.internal.iris.android.AndroidIrisUnlockModule;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J&\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0007J\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ*\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J2\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00192\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u000eJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004RT\u0010#\u001aB\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0012\f\u0012\n !*\u0004\u0018\u00010\u00060\u0006 !* \u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0012\f\u0012\n !*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\"0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0019\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00198F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010+¨\u0006/"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/BiometricAuthentication;", "", "Landroid/app/Activity;", "context", "Ldev/skomlach/biometric/compat/BiometricType;", "method", "Ldev/skomlach/biometric/compat/engine/core/interfaces/BiometricModule;", "biometricModule", "", "openSettings", "Ldev/skomlach/biometric/compat/engine/BiometricInitListener;", "globalInitListener", "", "mlist", "Lja/u;", "init", "hasEnrolled", "isEnrollChanged", "Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose;", "biometricCryptographyPurpose", "Landroid/view/View;", "targetView", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "listener", "authenticate", "", "requestedMethods", "cancelAuthentication", "type", "biometricMethod", "getAvailableBiometricModule", "", "Ldev/skomlach/biometric/compat/engine/BiometricMethod;", "kotlin.jvm.PlatformType", "", "moduleHashMap", "Ljava/util/Map;", "getAvailableBiometrics", "()Ljava/util/List;", "availableBiometrics", "getAvailableBiometricMethods", "availableBiometricMethods", "isLockOut", "()Z", "isHardwareDetected", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricAuthentication.kt */
public final class BiometricAuthentication {
    public static final BiometricAuthentication INSTANCE = new BiometricAuthentication();
    /* access modifiers changed from: private */
    public static final Map<BiometricMethod, BiometricModule> moduleHashMap = Collections.synchronizedMap(new HashMap());

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: BiometricAuthentication.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BiometricMethod.values().length];
            iArr[BiometricMethod.DUMMY_BIOMETRIC.ordinal()] = 1;
            iArr[BiometricMethod.FACELOCK.ordinal()] = 2;
            iArr[BiometricMethod.FINGERPRINT_API23.ordinal()] = 3;
            iArr[BiometricMethod.FINGERPRINT_SUPPORT.ordinal()] = 4;
            iArr[BiometricMethod.FINGERPRINT_SAMSUNG.ordinal()] = 5;
            iArr[BiometricMethod.FINGERPRINT_FLYME.ordinal()] = 6;
            iArr[BiometricMethod.FINGERPRINT_SOTERAPI.ordinal()] = 7;
            iArr[BiometricMethod.FACE_HUAWEI.ordinal()] = 8;
            iArr[BiometricMethod.FACE_MIUI.ordinal()] = 9;
            iArr[BiometricMethod.FACE_SOTERAPI.ordinal()] = 10;
            iArr[BiometricMethod.FACE_OPPO.ordinal()] = 11;
            iArr[BiometricMethod.FACE_SAMSUNG.ordinal()] = 12;
            iArr[BiometricMethod.FACE_ANDROIDAPI.ordinal()] = 13;
            iArr[BiometricMethod.FACE_VIVO.ordinal()] = 14;
            iArr[BiometricMethod.IRIS_SAMSUNG.ordinal()] = 15;
            iArr[BiometricMethod.IRIS_ANDROIDAPI.ordinal()] = 16;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BiometricAuthentication() {
    }

    public static /* synthetic */ void init$default(BiometricAuthentication biometricAuthentication, BiometricInitListener biometricInitListener, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricInitListener = null;
        }
        if ((i & 2) != 0) {
            collection = null;
        }
        biometricAuthentication.init(biometricInitListener, collection);
    }

    /* access modifiers changed from: private */
    /* renamed from: init$lambda-0  reason: not valid java name */
    public static final void m101301init$lambda0(BiometricMethod biometricMethod, BiometricInitListener biometricInitListener) {
        C13706o.m87929f(biometricMethod, "$method");
        C13706o.m87929f(biometricInitListener, "$initListener");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68220e("BiometricAuthentication.check started for " + biometricMethod);
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[biometricMethod.ordinal()]) {
                case 1:
                    new DummyBiometricModule(biometricInitListener);
                    return;
                case 2:
                    new FacelockOldModule(biometricInitListener);
                    return;
                case 3:
                    new API23FingerprintModule(biometricInitListener);
                    return;
                case 4:
                    new SupportFingerprintModule(biometricInitListener);
                    return;
                case 5:
                    new SamsungFingerprintModule(biometricInitListener);
                    return;
                case 6:
                    new FlymeFingerprintModule(biometricInitListener);
                    return;
                case 7:
                    new SoterFingerprintUnlockModule(biometricInitListener);
                    return;
                case 8:
                    new HuaweiFaceUnlockModule(biometricInitListener);
                    return;
                case 9:
                    new MiuiFaceUnlockModule(biometricInitListener);
                    return;
                case 10:
                    new SoterFaceUnlockModule(biometricInitListener);
                    return;
                case 11:
                    new OppoFaceUnlockModule(biometricInitListener);
                    return;
                case 12:
                    new SamsungFaceUnlockModule(biometricInitListener);
                    return;
                case 13:
                    new AndroidFaceUnlockModule(biometricInitListener);
                    return;
                case 14:
                    new VivoFaceUnlockModule(biometricInitListener);
                    return;
                case 15:
                    new SamsungIrisUnlockModule(biometricInitListener);
                    return;
                case 16:
                    new AndroidIrisUnlockModule(biometricInitListener);
                    return;
                default:
                    throw new IllegalStateException("Uknowon biometric type - " + biometricMethod);
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68219e(th, "BiometricAuthentication");
            biometricInitListener.initFinished(biometricMethod, (BiometricModule) null);
        }
    }

    public final void authenticate(BiometricCryptographyPurpose biometricCryptographyPurpose, View view, BiometricType biometricType, BiometricAuthenticationListener biometricAuthenticationListener) {
        C13706o.m87929f(biometricType, "method");
        C13706o.m87929f(biometricAuthenticationListener, "listener");
        authenticate(biometricCryptographyPurpose, view, (List<? extends BiometricType>) C13612s.m87736e(biometricType), biometricAuthenticationListener);
    }

    public final void cancelAuthentication() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricAuthentication.cancelAuthentication");
        for (BiometricType availableBiometricModule : getAvailableBiometrics()) {
            BiometricModule availableBiometricModule2 = getAvailableBiometricModule(availableBiometricModule);
            if (availableBiometricModule2 instanceof FacelockOldModule) {
                ((FacelockOldModule) availableBiometricModule2).stopAuth();
            }
        }
        Core.INSTANCE.cancelAuthentication();
    }

    public final List<BiometricMethod> getAvailableBiometricMethods() {
        HashSet hashSet = new HashSet();
        for (BiometricMethod biometricMethod : new HashMap(moduleHashMap).keySet()) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68220e("Module:" + biometricMethod);
            hashSet.add(biometricMethod);
        }
        return new ArrayList(hashSet);
    }

    public final BiometricModule getAvailableBiometricModule(BiometricType biometricType) {
        HashMap hashMap = new HashMap(moduleHashMap);
        BiometricMethod biometricMethod = null;
        for (BiometricMethod biometricMethod2 : hashMap.keySet()) {
            if (biometricMethod2.getBiometricType() == biometricType && (biometricMethod == null || biometricMethod.getId() > biometricMethod2.getId())) {
                biometricMethod = biometricMethod2;
            }
        }
        if (biometricMethod == null) {
            return null;
        }
        return (BiometricModule) hashMap.get(biometricMethod);
    }

    public final List<BiometricType> getAvailableBiometrics() {
        HashSet hashSet = new HashSet();
        for (BiometricMethod biometricMethod : new HashMap(moduleHashMap).keySet()) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68220e("Module:" + biometricMethod);
            hashSet.add(biometricMethod.getBiometricType());
        }
        return new ArrayList(hashSet);
    }

    public final boolean hasEnrolled() {
        boolean z;
        Iterator<BiometricType> it = getAvailableBiometrics().iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            BiometricModule availableBiometricModule = getAvailableBiometricModule(it.next());
            if (availableBiometricModule != null && availableBiometricModule.hasEnrolled()) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    public final void init() {
        init$default(this, (BiometricInitListener) null, (Collection) null, 3, (Object) null);
    }

    public final void init(BiometricInitListener biometricInitListener) {
        init$default(this, biometricInitListener, (Collection) null, 2, (Object) null);
    }

    public final void init(BiometricInitListener biometricInitListener, Collection<? extends BiometricType> collection) {
        BiometricLoggerImpl.INSTANCE.mo68220e("BiometricAuthentication.init()");
        ArrayList<BiometricMethod> arrayList = new ArrayList<>();
        arrayList.add(BiometricMethod.DUMMY_BIOMETRIC);
        arrayList.add(BiometricMethod.FACELOCK);
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            arrayList.add(BiometricMethod.FINGERPRINT_SAMSUNG);
        }
        if (i < 23) {
            arrayList.add(BiometricMethod.FINGERPRINT_FLYME);
        }
        if (i >= 23) {
            arrayList.add(BiometricMethod.FINGERPRINT_SOTERAPI);
            arrayList.add(BiometricMethod.FINGERPRINT_API23);
            arrayList.add(BiometricMethod.FINGERPRINT_SUPPORT);
        }
        if (i >= 24) {
            arrayList.add(BiometricMethod.FACE_SOTERAPI);
            arrayList.add(BiometricMethod.FACE_SAMSUNG);
            arrayList.add(BiometricMethod.IRIS_SAMSUNG);
            arrayList.add(BiometricMethod.FACE_MIUI);
        }
        if (i >= 26) {
            arrayList.add(BiometricMethod.FACE_VIVO);
            arrayList.add(BiometricMethod.FACE_HUAWEI);
        }
        if (i >= 28) {
            arrayList.add(BiometricMethod.FACE_ANDROIDAPI);
            arrayList.add(BiometricMethod.IRIS_ANDROIDAPI);
        }
        moduleHashMap.clear();
        if (collection != null) {
            try {
                if (!collection.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        BiometricMethod biometricMethod = (BiometricMethod) it.next();
                        for (BiometricType biometricType : collection) {
                            if (biometricMethod.getBiometricType() == biometricType) {
                                C13706o.m87928e(biometricMethod, "method");
                                arrayList2.add(biometricMethod);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, "BiometricAuthentication");
                return;
            }
        }
        BiometricAuthentication$init$initListener$1 biometricAuthentication$init$initListener$1 = new BiometricAuthentication$init$initListener$1(new AtomicInteger(arrayList.size()), biometricInitListener);
        for (BiometricMethod aVar : arrayList) {
            C12114c.f58379a.mo68308k(new C12032a(aVar, biometricAuthentication$init$initListener$1));
        }
    }

    public final boolean isEnrollChanged() {
        boolean z;
        Iterator<BiometricType> it = getAvailableBiometrics().iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            BiometricModule availableBiometricModule = getAvailableBiometricModule(it.next());
            if (availableBiometricModule != null && availableBiometricModule.isBiometricEnrollChanged()) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    public final boolean isHardwareDetected() {
        boolean z;
        Iterator<BiometricType> it = getAvailableBiometrics().iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            BiometricModule availableBiometricModule = getAvailableBiometricModule(it.next());
            if (availableBiometricModule != null && availableBiometricModule.isHardwarePresent()) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    public final boolean isLockOut() {
        boolean z = !getAvailableBiometrics().isEmpty();
        for (BiometricType availableBiometricModule : getAvailableBiometrics()) {
            BiometricModule availableBiometricModule2 = getAvailableBiometricModule(availableBiometricModule);
            if (availableBiometricModule2 != null && !availableBiometricModule2.isLockOut()) {
                z = false;
            }
        }
        return z;
    }

    public final boolean openSettings(Activity activity, BiometricType biometricType) {
        C13706o.m87929f(activity, "context");
        C13706o.m87929f(biometricType, "type");
        if (getAvailableBiometricMethods().isEmpty()) {
            return false;
        }
        return openSettings(activity, biometricType, getAvailableBiometricModule(biometricType));
    }

    public final void authenticate(BiometricCryptographyPurpose biometricCryptographyPurpose, View view, List<? extends BiometricType> list, BiometricAuthenticationListener biometricAuthenticationListener) {
        C13706o.m87929f(list, "requestedMethods");
        C13706o.m87929f(biometricAuthenticationListener, "listener");
        if (!list.isEmpty()) {
            BiometricLoggerImpl.INSTANCE.mo68217d("BiometricAuthentication.authenticate");
            HashMap hashMap = new HashMap();
            Core.INSTANCE.cleanModules();
            boolean z = false;
            for (BiometricType biometricType : list) {
                BiometricModule availableBiometricModule = getAvailableBiometricModule(biometricType);
                if (availableBiometricModule != null && availableBiometricModule.hasEnrolled()) {
                    Core.INSTANCE.registerModule(availableBiometricModule);
                    if (availableBiometricModule instanceof FacelockOldModule) {
                        ((FacelockOldModule) availableBiometricModule).setCallerView(view);
                    }
                    hashMap.put(Integer.valueOf(availableBiometricModule.tag()), biometricType);
                    z = true;
                }
            }
            if (!z) {
                biometricAuthenticationListener.onFailure(AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED, (BiometricType) list.get(0));
                return;
            }
            BiometricCryptographyPurpose biometricCryptographyPurpose2 = biometricCryptographyPurpose;
            Core.authenticate$default(Core.INSTANCE, biometricCryptographyPurpose2, new BiometricAuthentication$authenticate$1(new SoftReference(biometricAuthenticationListener), hashMap), (RestartPredicate) null, 4, (Object) null);
        }
    }

    private final boolean openSettings(Activity activity, BiometricType biometricType, BiometricModule biometricModule) {
        if ((biometricModule instanceof SamsungFingerprintModule) && biometricType == BiometricType.BIOMETRIC_FINGERPRINT && ((SamsungFingerprintModule) biometricModule).openSettings(activity)) {
            return true;
        }
        if ((biometricModule instanceof FacelockOldModule) && biometricType == BiometricType.BIOMETRIC_FACE && C12120d.f58384a.mo68318e(new Intent("android.app.action.SET_NEW_PASSWORD"), activity)) {
            return true;
        }
        if ((biometricModule instanceof MiuiFaceUnlockModule) && biometricType == BiometricType.BIOMETRIC_FACE) {
            C12120d dVar = C12120d.f58384a;
            Intent putExtra = new Intent().setClassName("com.android.settings", "com.android.settings.Settings").putExtra(":android:show_fragment", "com.android.settings.security.MiuiSecurityAndPrivacySettings");
            C13706o.m87928e(putExtra, "Intent().setClassName(\"c…gs\"\n                    )");
            if (dVar.mo68318e(putExtra, activity)) {
                return true;
            }
        }
        if ((biometricModule instanceof HuaweiFaceUnlockModule) && biometricType == BiometricType.BIOMETRIC_FACE) {
            C12120d dVar2 = C12120d.f58384a;
            Intent className = new Intent().setClassName("com.android.settings", "com.android.settings.facechecker.unlock.FaceUnLockSettingsActivity");
            C13706o.m87928e(className, "Intent().setClassName(\n …tivity\"\n                )");
            if (dVar2.mo68318e(className, activity)) {
                return true;
            }
        }
        if (BiometricType.BIOMETRIC_FINGERPRINT == biometricType && Build.VERSION.SDK_INT >= 28) {
            if (C12120d.f58384a.mo68318e(new Intent("android.settings.FINGERPRINT_ENROLL"), activity)) {
                return true;
            }
        }
        if (BiometricType.BIOMETRIC_FACE == biometricType && Build.VERSION.SDK_INT >= 28 && C12120d.f58384a.mo68318e(new Intent("android.settings.FACE_ENROLL"), activity)) {
            return true;
        }
        if (BiometricType.BIOMETRIC_IRIS != biometricType || Build.VERSION.SDK_INT < 28 || !C12120d.f58384a.mo68318e(new Intent("android.settings.IRIS_ENROLL"), activity)) {
            return false;
        }
        return true;
    }
}
