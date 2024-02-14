package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import android.os.Build;
import androidx.biometric.C0265R;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.device.DeviceInfoManager;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12120d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/DevicesWithKnownBugs;", "", "()V", "appContext", "Landroid/content/Context;", "hasUnderDisplayFingerprint", "", "getHasUnderDisplayFingerprint", "()Z", "isHideDialogInstantly", "isMissedBiometricUI", "isOnePlus", "isOnePlusWithBiometricBug", "isSamsung", "lgWithMissedBiometricUI", "", "", "[Ljava/lang/String;", "onePlusModelsWithoutBiometricBug", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: DevicesWithKnownBugs.kt */
public final class DevicesWithKnownBugs {
    public static final DevicesWithKnownBugs INSTANCE = new DevicesWithKnownBugs();
    private static final Context appContext = C12104a.f58372a.mo68283g();
    private static final String[] lgWithMissedBiometricUI = {"G820", "G810", "G850", "G900", "G910"};
    private static final String[] onePlusModelsWithoutBiometricBug = {"A0001", "ONE A2001", "ONE A2003", "ONE A2005", "ONE E1001", "ONE E1003", "ONE E1005", "ONEPLUS A3000", "ONEPLUS SM-A3000", "ONEPLUS A3003", "ONEPLUS A3010", "ONEPLUS A5000", "ONEPLUS A5010", "ONEPLUS A6000", "ONEPLUS A6003"};

    private DevicesWithKnownBugs() {
    }

    public final boolean getHasUnderDisplayFingerprint() {
        return DeviceInfoManager.INSTANCE.hasUnderDisplayFingerprint(BiometricPromptCompat.Companion.getDeviceInfo());
    }

    public final boolean isHideDialogInstantly() {
        String[] stringArray = appContext.getResources().getStringArray(C0265R.array.hide_fingerprint_instantly_prefixes);
        C13706o.m87928e(stringArray, "appContext.resources.get…print_instantly_prefixes)");
        for (String str : stringArray) {
            String str2 = Build.MODEL;
            C13706o.m87928e(str2, "MODEL");
            C13706o.m87928e(str, "modelPrefix");
            if (C15176v.m93634I(str2, str, false, 2, (Object) null)) {
                return true;
            }
        }
        if ((isSamsung() || (isOnePlus() && C12120d.f58384a.mo68316c())) && getHasUnderDisplayFingerprint()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMissedBiometricUI() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "LG"
            r2 = 1
            boolean r0 = kotlin.text.C15176v.m93641v(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.String[] r0 = lgWithMissedBiometricUI
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.util.List r0 = kotlin.collections.C13614t.m87751m(r0)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0023
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0041
        L_0x0023:
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r5 = "MODEL"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            boolean r3 = kotlin.text.C15177w.m93659L(r4, r3, r2)
            if (r3 == 0) goto L_0x0027
            r0 = 1
        L_0x0041:
            if (r0 != 0) goto L_0x004f
        L_0x0043:
            dev.skomlach.biometric.compat.utils.CheckBiometricUI r0 = dev.skomlach.biometric.compat.utils.CheckBiometricUI.INSTANCE
            android.content.Context r3 = appContext
            boolean r0 = r0.hasExists(r3)
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.DevicesWithKnownBugs.isMissedBiometricUI():boolean");
    }

    public final boolean isOnePlus() {
        return C15176v.m93641v(Build.BRAND, "OnePlus", true);
    }

    public final boolean isOnePlusWithBiometricBug() {
        if (C15176v.m93641v(Build.BRAND, "OnePlus", true)) {
            String[] strArr = onePlusModelsWithoutBiometricBug;
            if (!C13614t.m87751m(Arrays.copyOf(strArr, strArr.length)).contains(Build.MODEL)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSamsung() {
        return C15176v.m93641v(Build.BRAND, "Samsung", true);
    }
}
