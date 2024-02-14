package com.tencent.soter.core;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.soter.core.model.ConstantsSoter;
import com.tencent.soter.core.model.SLogger;
import com.tencent.soter.core.model.SoterCoreResult;
import com.tencent.soter.core.model.SoterCoreUtil;
import com.tencent.soter.core.model.SoterDelegate;
import com.tencent.soter.core.model.SoterErrCode;
import com.tencent.soter.core.model.SoterPubKeyModel;
import com.tencent.soter.core.model.SoterSignatureResult;
import com.tencent.soter.core.sotercore.CertSoterCore;
import com.tencent.soter.core.sotercore.SoterCoreBase;
import com.tencent.soter.core.sotercore.SoterCoreBeforeTreble;
import com.tencent.soter.core.sotercore.SoterCoreTreble;
import com.tencent.soter.core.sotercore.SoterCoreTrebleServiceListener;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;

public class SoterCore implements ConstantsSoter, SoterErrCode {
    private static SoterCoreBase IMPL = null;
    public static final int IS_NOT_TREBLE = 0;
    public static final int IS_TREBLE = 1;
    private static final int RAW_LENGTH_PREFIX = 4;
    private static final String TAG = "Soter.SoterCore";
    private static SoterCoreTrebleServiceListener serviceListener;

    static {
        SLogger.m81941i(TAG, "soter: SoterCore is call static block to init SoterCore IMPL", new Object[0]);
        SoterCoreBase providerSoterCore = getProviderSoterCore();
        IMPL = providerSoterCore;
        boolean z = true;
        Object[] objArr = new Object[1];
        if (providerSoterCore != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        SLogger.m81941i(TAG, "soter: SoterCore is call static block to init SoterCore IMPL, IMPL is null[%b]", objArr);
    }

    public static SoterSignatureResult convertFromBytesToSignatureResult(byte[] bArr) {
        if (SoterCoreUtil.isNullOrNil(bArr)) {
            SLogger.m81940e(TAG, "origin is null or nil. abort", new Object[0]);
            return null;
        } else if (bArr.length < 4) {
            SLogger.m81940e(TAG, "soter: length not correct 1", new Object[0]);
            return null;
        } else {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            int i = toInt(bArr2);
            SLogger.m81939d("Soter", "parsed raw length: " + i, new Object[0]);
            if (i > 1048576) {
                SLogger.m81940e(TAG, "soter: too large signature result!", new Object[0]);
                return null;
            }
            byte[] bArr3 = new byte[i];
            int i2 = i + 4;
            if (bArr.length <= i2) {
                SLogger.m81940e(TAG, "soter: length not correct 2", new Object[0]);
                return null;
            }
            System.arraycopy(bArr, 4, bArr3, 0, i);
            SoterSignatureResult convertFromJson = SoterSignatureResult.convertFromJson(new String(bArr3));
            int length = bArr.length - i2;
            SLogger.m81939d(TAG, "soter: signature length: " + length, new Object[0]);
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i2, bArr4, 0, length);
            if (convertFromJson != null) {
                convertFromJson.setSignature(Base64.encodeToString(bArr4, 2));
            }
            return convertFromJson;
        }
    }

    public static byte[] finishSign(long j) throws Exception {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.finishSign(j);
        }
        SLogger.m81940e(TAG, "soter: finishSign IMPL is null, not support soter", new Object[0]);
        return new byte[0];
    }

    public static SoterCoreResult generateAppGlobalSecureKey() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.generateAppGlobalSecureKey();
        }
        SLogger.m81940e(TAG, "soter: generateAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
        return new SoterCoreResult(2);
    }

    public static SoterCoreResult generateAuthKey(String str) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.generateAuthKey(str);
        }
        SLogger.m81940e(TAG, "soter: generateAuthKey IMPL is null, not support soter", new Object[0]);
        return new SoterCoreResult(2);
    }

    public static String generateRemoteCheckRequestParam() {
        StringBuilder sb = new StringBuilder();
        sb.append("<deviceinfo>");
        sb.append("<MANUFACTURER name=\"");
        sb.append(Build.MANUFACTURER);
        sb.append("\">");
        sb.append("<MODEL name=\"");
        sb.append(Build.MODEL);
        sb.append("\">");
        sb.append("<VERSION_RELEASE name=\"");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\">");
        sb.append("<VERSION_INCREMENTAL name=\"");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append("\">");
        sb.append("<DISPLAY name=\"");
        sb.append(Build.DISPLAY);
        sb.append("\">");
        sb.append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
        SLogger.m81939d(TAG, "soter: getFingerprint  " + sb.toString(), new Object[0]);
        return sb.toString();
    }

    public static SoterPubKeyModel getAppGlobalSecureKeyModel() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.getAppGlobalSecureKeyModel();
        }
        SLogger.m81940e(TAG, "soter: getAppGlobalSecureKeyModel IMPL is null, not support soter", new Object[0]);
        return null;
    }

    public static Signature getAuthInitAndSign(String str) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.getAuthInitAndSign(str);
        }
        SLogger.m81940e(TAG, "soter: getAuthInitAndSign IMPL is null, not support soter", new Object[0]);
        return null;
    }

    public static SoterPubKeyModel getAuthKeyModel(String str) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.getAuthKeyModel(str);
        }
        SLogger.m81940e(TAG, "soter: getAuthKeyModel IMPL is null, not support soter", new Object[0]);
        return null;
    }

    public static SoterCoreBase getProviderSoterCore() {
        Provider[] providers;
        SoterCoreBeforeTreble.setUp();
        if (SoterDelegate.isTriggeredOOM() || (providers = Security.getProviders()) == null) {
            return null;
        }
        int length = providers.length;
        int i = 0;
        while (i < length) {
            String name = providers[i].getName();
            if (name == null || !name.startsWith(ConstantsSoter.SOTER_PROVIDER_NAME)) {
                i++;
            } else if (name.split("\\.").length > 1) {
                return new CertSoterCore(name);
            } else {
                return new SoterCoreBeforeTreble(name);
            }
        }
        return null;
    }

    public static int getSoterCoreType() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase == null) {
            return 0;
        }
        if (soterCoreBase instanceof SoterCoreTreble) {
            SLogger.m81939d(TAG, "getSoterCoreType is TREBLE", new Object[0]);
            return 1;
        }
        SLogger.m81939d(TAG, "getSoterCoreType is not TREBLE", new Object[0]);
        return 0;
    }

    public static boolean hasAppGlobalSecureKey() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.hasAppGlobalSecureKey();
        }
        SLogger.m81940e(TAG, "soter: hasAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
        return false;
    }

    public static boolean hasAuthKey(String str) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.hasAuthKey(str);
        }
        SLogger.m81940e(TAG, "soter: hasAuthKey IMPL is null, not support soter", new Object[0]);
        return false;
    }

    private static Signature initAuthKeySignature(String str) throws InvalidKeyException, NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.initAuthKeySignature(str);
        }
        SLogger.m81940e(TAG, "soter: initAuthKeySignature IMPL is null, not support soter", new Object[0]);
        return null;
    }

    public static SoterSessionResult initSigh(String str, String str2) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.initSigh(str, str2);
        }
        SLogger.m81940e(TAG, "soter: initSigh IMPL is null, not support soter", new Object[0]);
        return null;
    }

    public static boolean isAppGlobalSecureKeyValid() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.isAppGlobalSecureKeyValid();
        }
        SLogger.m81940e(TAG, "soter: isAppGlobalSecureKeyValid IMPL is null, not support soter", new Object[0]);
        return false;
    }

    public static boolean isAuthKeyValid(String str, boolean z) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.isAuthKeyValid(str, z);
        }
        SLogger.m81940e(TAG, "soter: isAuthKeyValid IMPL is null, not support soter", new Object[0]);
        return false;
    }

    public static boolean isCurrentBiometricFrozen(Context context, int i) {
        return !BiometricManagerCompat.from(context, Integer.valueOf(i)).isCurrentFailTimeAvailable() && !BiometricManagerCompat.from(context, Integer.valueOf(i)).isCurrentTweenTimeAvailable(context);
    }

    @Deprecated
    public static boolean isCurrentFingerprintFrozen(Context context) {
        if (BiometricManagerCompat.from(context, 1).isCurrentFailTimeAvailable() || BiometricManagerCompat.from(context, 1).isCurrentTweenTimeAvailable(context)) {
            return false;
        }
        return true;
    }

    public static boolean isNativeSupportSoter() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase == null) {
            SLogger.m81940e(TAG, "soter: isNativeSupportSoter IMPL is null, not support soter", new Object[0]);
            return false;
        }
        boolean isNativeSupportSoter = soterCoreBase.isNativeSupportSoter();
        SLogger.m81940e(TAG, "soter: isNativeSupportSoter return[" + isNativeSupportSoter + "]", new Object[0]);
        return isNativeSupportSoter;
    }

    public static boolean isSupportBiometric(Context context, int i) {
        boolean isHardwareDetected = BiometricManagerCompat.from(context, Integer.valueOf(i)).isHardwareDetected();
        SLogger.m81940e(TAG, "soter: isSupportBiometric type[" + i + "] return[" + isHardwareDetected + "]", new Object[0]);
        return isHardwareDetected;
    }

    @Deprecated
    public static boolean isSupportFingerprint(Context context) {
        boolean isHardwareDetected = BiometricManagerCompat.from(context, 1).isHardwareDetected();
        SLogger.m81940e(TAG, "soter: isSupportFingerprint return[" + isHardwareDetected + "]", new Object[0]);
        return isHardwareDetected;
    }

    public static boolean isSystemHasBiometric(Context context, int i) {
        return BiometricManagerCompat.from(context, Integer.valueOf(i)).hasEnrolledBiometric();
    }

    @Deprecated
    public static boolean isSystemHasFingerprint(Context context) {
        return BiometricManagerCompat.from(context, 1).hasEnrolledBiometric();
    }

    public static boolean isTrebleServiceConnected() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.isTrebleServiceConnected();
        }
        SLogger.m81940e(TAG, "soter: isTrebleServiceConnected IMPL is null, not support soter", new Object[0]);
        return false;
    }

    public static void releaseTrebleServiceConnection() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase == null) {
            SLogger.m81940e(TAG, "soter: releaseServiceConnection IMPL is null, not support soter", new Object[0]);
        } else {
            soterCoreBase.triggerTrebleServiceConnecting();
        }
    }

    public static SoterCoreResult removeAppGlobalSecureKey() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.removeAppGlobalSecureKey();
        }
        SLogger.m81940e(TAG, "soter: removeAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
        return new SoterCoreResult(2);
    }

    public static SoterCoreResult removeAuthKey(String str, boolean z) {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase != null) {
            return soterCoreBase.removeAuthKey(str, z);
        }
        SLogger.m81940e(TAG, "soter: removeAuthKey IMPL is null, not support soter", new Object[0]);
        return new SoterCoreResult(2);
    }

    private static SoterPubKeyModel retrieveJsonFromExportedData(byte[] bArr) {
        if (bArr == null) {
            SLogger.m81940e(TAG, "soter: raw data is null", new Object[0]);
            return null;
        }
        if (bArr.length < 4) {
            SLogger.m81940e(TAG, "soter: raw data length smaller than RAW_LENGTH_PREFIX", new Object[0]);
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int i = toInt(bArr2);
        SLogger.m81939d(TAG, "soter: parsed raw length: " + i, new Object[0]);
        if (i > 1048576) {
            SLogger.m81940e(TAG, "soter: too large json result!", new Object[0]);
            return null;
        }
        byte[] bArr3 = new byte[i];
        int i2 = i + 4;
        if (bArr.length <= i2) {
            SLogger.m81940e(TAG, "length not correct 2", new Object[0]);
            return null;
        }
        System.arraycopy(bArr, 4, bArr3, 0, i);
        String str = new String(bArr3);
        SLogger.m81939d(TAG, "soter: to convert json: " + str, new Object[0]);
        SoterPubKeyModel soterPubKeyModel = new SoterPubKeyModel(str, "");
        int length = bArr.length - i2;
        SLogger.m81939d(TAG, "soter: signature length: " + length, new Object[0]);
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, i2, bArr4, 0, length);
        soterPubKeyModel.setSignature(Base64.encodeToString(bArr4, 2));
        return soterPubKeyModel;
    }

    public static void setTrebleServiceListener(SoterCoreTrebleServiceListener soterCoreTrebleServiceListener) {
        serviceListener = soterCoreTrebleServiceListener;
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase == null) {
            SLogger.m81940e(TAG, "soter: setTrebleServiceListener IMPL is null, not support soter", new Object[0]);
        } else {
            soterCoreBase.setTrebleServiceListener(soterCoreTrebleServiceListener);
        }
    }

    public static void setUp() {
        SoterCoreBeforeTreble.setUp();
    }

    private static int toInt(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i += (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public static void triggerTrebleServiceConnecting() {
        SoterCoreBase soterCoreBase = IMPL;
        if (soterCoreBase == null) {
            SLogger.m81940e(TAG, "soter: triggerConnecting IMPL is null, not support soter", new Object[0]);
        } else {
            soterCoreBase.triggerTrebleServiceConnecting();
        }
    }

    public static void tryToInitSoterBeforeTreble() {
        if (IMPL == null) {
            SLogger.m81941i(TAG, "soter: SoterCore IMPL is null then call getProviderSoterCore to init", new Object[0]);
            SoterCoreBase providerSoterCore = getProviderSoterCore();
            IMPL = providerSoterCore;
            boolean z = true;
            Object[] objArr = new Object[1];
            if (providerSoterCore != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            SLogger.m81941i(TAG, "soter: SoterCore IMPL is null[%b], after call getProviderSoterCore to init", objArr);
        }
    }

    public static synchronized void tryToInitSoterTreble(Context context) {
        synchronized (SoterCore.class) {
            if (IMPL == null) {
                SLogger.m81941i(TAG, "soter: SoterCore IMPL is null then call tryToInitSoterTreble to init", new Object[0]);
                if (!SoterCoreTreble.isInitializing()) {
                    SoterCoreTreble soterCoreTreble = new SoterCoreTreble();
                    IMPL = soterCoreTreble;
                    soterCoreTreble.setTrebleServiceListener(serviceListener);
                    if (!IMPL.initSoter(context)) {
                        IMPL = null;
                        SLogger.m81941i(TAG, "soter: SoterCore IMPL is null after call tryToInitSoterTreble to init", new Object[0]);
                    }
                } else {
                    SLogger.m81941i(TAG, "soter: treble is initializing", new Object[0]);
                }
            }
        }
    }
}
