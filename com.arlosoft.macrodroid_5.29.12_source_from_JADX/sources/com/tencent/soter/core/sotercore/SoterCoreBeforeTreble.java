package com.tencent.soter.core.sotercore;

import android.content.Context;
import com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import com.tencent.soter.core.model.ConstantsSoter;
import com.tencent.soter.core.model.SLogger;
import com.tencent.soter.core.model.SoterCoreData;
import com.tencent.soter.core.model.SoterCoreResult;
import com.tencent.soter.core.model.SoterCoreUtil;
import com.tencent.soter.core.model.SoterDelegate;
import com.tencent.soter.core.model.SoterErrCode;
import com.tencent.soter.core.model.SoterPubKeyModel;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;

public class SoterCoreBeforeTreble extends SoterCoreBase implements ConstantsSoter, SoterErrCode {
    private static final String MAGIC_SOTER_PWD = "from_soter_ui";
    private static final String TAG = "Soter.SoterCoreBeforeTreble";
    private static boolean isAlreadyCheckedSetUp = false;
    protected String providerName;

    public SoterCoreBeforeTreble(String str) {
        this.providerName = str;
    }

    public static void setUp() {
        try {
            Method method = Class.forName("android.security.keystore.SoterKeyStoreProvider").getMethod("install", new Class[0]);
            method.setAccessible(true);
            method.invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException unused) {
            SLogger.m81941i(TAG, "soter: no SoterProvider found", new Object[0]);
        } catch (NoSuchMethodException unused2) {
            SLogger.m81941i(TAG, "soter: function not found", new Object[0]);
        } catch (IllegalAccessException unused3) {
            SLogger.m81941i(TAG, "soter: cannot access", new Object[0]);
        } catch (InvocationTargetException unused4) {
            SLogger.m81941i(TAG, "soter: InvocationTargetException", new Object[0]);
        } catch (Throwable th) {
            isAlreadyCheckedSetUp = true;
            throw th;
        }
        isAlreadyCheckedSetUp = true;
    }

    public byte[] finishSign(long j) throws Exception {
        return new byte[0];
    }

    public SoterCoreResult generateAppGlobalSecureKey() {
        SLogger.m81941i(TAG, "soter: start generate ask", new Object[0]);
        if (isNativeSupportSoter()) {
            try {
                KeyStore.getInstance(this.providerName).load((KeyStore.LoadStoreParameter) null);
                KeyPairGenerator instance = KeyPairGenerator.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_RSA, ConstantsSoter.SOTER_PROVIDER_NAME);
                instance.initialize(KeyGenParameterSpecCompatBuilder.newInstance(SoterCoreData.getInstance().getAskName() + ".addcounter.auto_signed_when_get_pubkey_attk", 4).setDigests(KeyPropertiesCompact.DIGEST_SHA256).setSignaturePaddings(KeyPropertiesCompact.SIGNATURE_PADDING_RSA_PSS).build());
                long currentTicks = SoterCoreUtil.getCurrentTicks();
                instance.generateKeyPair();
                SLogger.m81941i(TAG, "soter: generate successfully. cost: %d ms", Long.valueOf(SoterCoreUtil.ticksToNowInMs(currentTicks)));
                SoterDelegate.reset();
                return new SoterCoreResult(0);
            } catch (Exception e) {
                SLogger.m81940e(TAG, "soter: generateAppGlobalSecureKey " + e.toString(), new Object[0]);
                SLogger.printErrStackTrace(TAG, e, "soter: generateAppGlobalSecureKey error");
                return new SoterCoreResult(4, e.toString());
            } catch (OutOfMemoryError e2) {
                SLogger.printErrStackTrace(TAG, e2, "soter: out of memory when generate ASK!! maybe no attk inside");
                SoterDelegate.onTriggerOOM();
            }
        } else {
            SLogger.m81940e(TAG, "soter: not support soter", new Object[0]);
            return new SoterCoreResult(2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.tencent.soter.core.model.SLogger.m81940e(TAG, "soter: cause exception. maybe reflection exception: " + r9.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cb, code lost:
        return new com.tencent.soter.core.model.SoterCoreResult(6, r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cc, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
        com.tencent.soter.core.model.SLogger.printErrStackTrace(TAG, r9, "soter: out of memory when generate AuthKey!! maybe no attk inside");
        com.tencent.soter.core.model.SoterDelegate.onTriggerOOM();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc A[ExcHandler: OutOfMemoryError (r9v5 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:7:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.soter.core.model.SoterCoreResult generateAuthKey(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = com.tencent.soter.core.model.SoterCoreUtil.isNullOrNil((java.lang.String) r9)
            r1 = 1
            java.lang.String r2 = "Soter.SoterCoreBeforeTreble"
            r3 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = "soter: auth key name is null or nil. abort."
            com.tencent.soter.core.model.SLogger.m81940e(r2, r0, r9)
            com.tencent.soter.core.model.SoterCoreResult r9 = new com.tencent.soter.core.model.SoterCoreResult
            java.lang.String r0 = "no authKeyName"
            r9.<init>(r1, r0)
            return r9
        L_0x0019:
            boolean r0 = r8.isNativeSupportSoter()
            if (r0 == 0) goto L_0x00fb
            r0 = 6
            boolean r4 = r8.hasAppGlobalSecureKey()     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            if (r4 != 0) goto L_0x002f
            com.tencent.soter.core.model.SoterCoreResult r9 = new com.tencent.soter.core.model.SoterCoreResult     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            r1 = 3
            java.lang.String r4 = "app secure key not exist"
            r9.<init>(r1, r4)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            return r9
        L_0x002f:
            java.lang.String r4 = r8.providerName     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            r5 = 0
            r4.load(r5)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.String r4 = "RSA"
            java.lang.String r5 = r8.providerName     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.security.KeyPairGenerator r4 = java.security.KeyPairGenerator.getInstance(r4, r5)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r5.<init>()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r5.append(r9)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r9 = ".addcounter.auto_signed_when_get_pubkey(%s).secmsg_and_counter_signed_when_sign"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.model.SoterCoreData r7 = com.tencent.soter.core.model.SoterCoreData.getInstance()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r7 = r7.getAskName()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r6[r3] = r7     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r9 = java.lang.String.format(r9, r6)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r5.append(r9)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r9 = r5.toString()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r5 = 4
            com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder r9 = com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder.newInstance(r9, r5)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r5 = "SHA-256"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder r9 = r9.setDigests(r5)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder r9 = r9.setUserAuthenticationRequired(r1)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r5 = "PSS"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder r9 = r9.setSignaturePaddings(r5)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.security.spec.AlgorithmParameterSpec r9 = r9.build()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r4.initialize(r9)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            long r5 = com.tencent.soter.core.model.SoterCoreUtil.getCurrentTicks()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r4.generateKeyPair()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            long r4 = com.tencent.soter.core.model.SoterCoreUtil.ticksToNowInMs(r5)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.String r9 = "soter: generate successfully, cost: %d ms"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r1[r3] = r4     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.model.SLogger.m81941i(r2, r9, r1)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.model.SoterDelegate.reset()     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.model.SoterCoreResult r9 = new com.tencent.soter.core.model.SoterCoreResult     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            r9.<init>(r3)     // Catch:{ Exception -> 0x00a7, OutOfMemoryError -> 0x00cc }
            return r9
        L_0x00a7:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            r1.<init>()     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.String r4 = "soter: cause exception. maybe reflection exception: "
            r1.append(r4)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            r1.append(r4)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.model.SLogger.m81940e(r2, r1, r4)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            com.tencent.soter.core.model.SoterCoreResult r1 = new com.tencent.soter.core.model.SoterCoreResult     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            r1.<init>(r0, r9)     // Catch:{ Exception -> 0x00d6, OutOfMemoryError -> 0x00cc }
            return r1
        L_0x00cc:
            r9 = move-exception
            java.lang.String r0 = "soter: out of memory when generate AuthKey!! maybe no attk inside"
            com.tencent.soter.core.model.SLogger.printErrStackTrace(r2, r9, r0)
            com.tencent.soter.core.model.SoterDelegate.onTriggerOOM()
            goto L_0x0102
        L_0x00d6:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "soter: generate auth key failed: "
            r1.append(r4)
            java.lang.String r4 = r9.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.soter.core.model.SLogger.m81940e(r2, r1, r3)
            com.tencent.soter.core.model.SoterCoreResult r1 = new com.tencent.soter.core.model.SoterCoreResult
            java.lang.String r9 = r9.toString()
            r1.<init>(r0, r9)
            return r1
        L_0x00fb:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = "soter: not support soter"
            com.tencent.soter.core.model.SLogger.m81940e(r2, r0, r9)
        L_0x0102:
            com.tencent.soter.core.model.SoterCoreResult r9 = new com.tencent.soter.core.model.SoterCoreResult
            r0 = 2
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.soter.core.sotercore.SoterCoreBeforeTreble.generateAuthKey(java.lang.String):com.tencent.soter.core.model.SoterCoreResult");
    }

    public SoterPubKeyModel getAppGlobalSecureKeyModel() {
        SLogger.m81941i(TAG, "soter: start get app global secure key pub", new Object[0]);
        if (isNativeSupportSoter()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.providerName);
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    Key key = instance.getKey(SoterCoreData.getInstance().getAskName(), MAGIC_SOTER_PWD.toCharArray());
                    if (key != null) {
                        SoterDelegate.reset();
                        return SoterCoreBase.retrieveJsonFromExportedData(key.getEncoded());
                    }
                    SLogger.m81940e(TAG, "soter: key can not be retrieved", new Object[0]);
                    return null;
                } catch (ClassCastException e) {
                    SLogger.m81940e(TAG, "soter: cast error: " + e.toString(), new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                SLogger.printErrStackTrace(TAG, e2, "soter: error when get ask");
            } catch (OutOfMemoryError e3) {
                SLogger.printErrStackTrace(TAG, e3, "soter: out of memory when getting ask!! maybe no attk inside");
                SoterDelegate.onTriggerOOM();
            }
        } else {
            SLogger.m81940e(TAG, "soter: not support soter", new Object[0]);
            return null;
        }
    }

    public Signature getAuthInitAndSign(String str) {
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        } else if (isNativeSupportSoter()) {
            try {
                SoterDelegate.reset();
                return initAuthKeySignature(str);
            } catch (InvalidKeyException | UnrecoverableEntryException unused) {
                SLogger.m81940e(TAG, "soter: key invalid. Advice remove the key", new Object[0]);
                return null;
            } catch (Exception e) {
                SLogger.m81940e(TAG, "soter: exception when getSignatureResult: " + e.toString(), new Object[0]);
                SLogger.printErrStackTrace(TAG, e, "soter: exception when getSignatureResult");
                return null;
            } catch (OutOfMemoryError e2) {
                SLogger.printErrStackTrace(TAG, e2, "soter: out of memory when getAuthInitAndSign!! maybe no attk inside");
                SoterDelegate.onTriggerOOM();
                return null;
            }
        } else {
            SLogger.m81940e(TAG, "soter: not support soter" + this.providerName, new Object[0]);
            return null;
        }
    }

    public SoterPubKeyModel getAuthKeyModel(String str) {
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        } else if (isNativeSupportSoter()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.providerName);
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    Key key = instance.getKey(str, MAGIC_SOTER_PWD.toCharArray());
                    SoterDelegate.reset();
                    if (key != null) {
                        return SoterCoreBase.retrieveJsonFromExportedData(key.getEncoded());
                    }
                    SLogger.m81940e(TAG, "soter: key can not be retrieved", new Object[0]);
                    return null;
                } catch (ClassCastException e) {
                    SLogger.m81940e(TAG, "soter: cast error: " + e.toString(), new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                SLogger.printErrStackTrace(TAG, e2, "soter: error in get auth key model");
            } catch (OutOfMemoryError e3) {
                SLogger.printErrStackTrace(TAG, e3, "soter: out of memory when getAuthKeyModel!! maybe no attk inside");
                SoterDelegate.onTriggerOOM();
            }
        } else {
            SLogger.m81940e(TAG, "soter: not support soter " + this.providerName, new Object[0]);
            return null;
        }
    }

    public boolean hasAppGlobalSecureKey() {
        try {
            KeyStore instance = KeyStore.getInstance(this.providerName);
            instance.load((KeyStore.LoadStoreParameter) null);
            if (instance.getCertificate(SoterCoreData.getInstance().getAskName()) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            SLogger.m81940e(TAG, "soter: hasAppGlobalSecureKey exception: " + e.toString(), new Object[0]);
            return false;
        }
    }

    public boolean hasAuthKey(String str) {
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: authkey name not correct", new Object[0]);
            return false;
        }
        try {
            KeyStore instance = KeyStore.getInstance(this.providerName);
            instance.load((KeyStore.LoadStoreParameter) null);
            if (instance.getCertificate(str) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            SLogger.m81940e(TAG, "soter: hasAppGlobalSecureKey exception: " + e.toString(), new Object[0]);
            return false;
        }
    }

    public Signature initAuthKeySignature(String str) throws InvalidKeyException, NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        }
        Signature instance = Signature.getInstance("SHA256withRSA/PSS", "AndroidKeyStoreBCWorkaround");
        KeyStore instance2 = KeyStore.getInstance(this.providerName);
        instance2.load((KeyStore.LoadStoreParameter) null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance2.getEntry(str, (KeyStore.ProtectionParameter) null);
        if (privateKeyEntry != null) {
            instance.initSign(privateKeyEntry.getPrivateKey());
            return instance;
        }
        SLogger.m81940e(TAG, "soter: entry not exists", new Object[0]);
        return null;
    }

    public SoterSessionResult initSigh(String str, String str2) {
        return null;
    }

    public boolean initSoter(Context context) {
        setUp();
        return true;
    }

    public boolean isAppGlobalSecureKeyValid() {
        return hasAppGlobalSecureKey() && getAppGlobalSecureKeyModel() != null;
    }

    public boolean isAuthKeyValid(String str, boolean z) {
        SLogger.m81941i(TAG, String.format("soter: checking key valid: auth key name: %s, autoDelIfNotValid: %b ", new Object[]{str, Boolean.valueOf(z)}), new Object[0]);
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: checking key valid: authkey name not correct", new Object[0]);
            return false;
        }
        try {
            initAuthKeySignature(str);
            SLogger.m81941i(TAG, "soter: key valid", new Object[0]);
            SoterDelegate.reset();
            return true;
        } catch (InvalidKeyException | UnrecoverableEntryException unused) {
            SLogger.m81940e(TAG, "soter: key invalid.", new Object[0]);
            if (z) {
                removeAuthKey(str, false);
            }
            return false;
        } catch (Exception e) {
            SLogger.m81940e(TAG, "soter: occurs other exceptions: %s", e.toString());
            SLogger.printErrStackTrace(TAG, e, "soter: occurs other exceptions");
            return false;
        } catch (OutOfMemoryError e2) {
            SLogger.printErrStackTrace(TAG, e2, "soter: out of memory when isAuthKeyValid!! maybe no attk inside");
            SoterDelegate.onTriggerOOM();
            return false;
        }
    }

    public boolean isNativeSupportSoter() {
        if (!isAlreadyCheckedSetUp) {
            setUp();
        }
        if (SoterDelegate.isTriggeredOOM()) {
            SLogger.m81943w(TAG, "hy: the device has already triggered OOM. mark as not support", new Object[0]);
            return false;
        }
        Provider[] providers = Security.getProviders();
        if (providers == null) {
            SLogger.m81940e(TAG, "soter: no provider supported", new Object[0]);
            return false;
        }
        int length = providers.length;
        int i = 0;
        while (i < length) {
            String name = providers[i].getName();
            if (name == null || !name.startsWith(ConstantsSoter.SOTER_PROVIDER_NAME)) {
                i++;
            } else {
                SLogger.m81941i(TAG, "soter: found soter provider", new Object[0]);
                return true;
            }
        }
        SLogger.m81941i(TAG, "soter: soter provider not found", new Object[0]);
        return false;
    }

    public SoterCoreResult removeAppGlobalSecureKey() {
        SLogger.m81941i(TAG, "soter: start remove app global secure key", new Object[0]);
        if (isNativeSupportSoter()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.providerName);
                instance.load((KeyStore.LoadStoreParameter) null);
                instance.deleteEntry(SoterCoreData.getInstance().getAskName());
                return new SoterCoreResult(0);
            } catch (Exception e) {
                SLogger.m81940e(TAG, "soter: removeAppGlobalSecureKey " + e.toString(), new Object[0]);
                return new SoterCoreResult(5, e.toString());
            }
        } else {
            SLogger.m81940e(TAG, "soter: not support soter", new Object[0]);
            return new SoterCoreResult(2);
        }
    }

    public SoterCoreResult removeAuthKey(String str, boolean z) {
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: auth key name is null or nil. abort.", new Object[0]);
            return new SoterCoreResult(1, "no authKeyName");
        }
        SLogger.m81941i(TAG, "soter: start remove key: " + str, new Object[0]);
        if (isNativeSupportSoter()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.providerName);
                instance.load((KeyStore.LoadStoreParameter) null);
                instance.deleteEntry(str);
                if (z) {
                    SLogger.m81941i(TAG, "soter: auto delete ask", new Object[0]);
                    if (hasAppGlobalSecureKey()) {
                        removeAppGlobalSecureKey();
                    }
                }
                return new SoterCoreResult(0);
            } catch (Exception e) {
                SLogger.m81940e(TAG, "soter: removeAuthKey " + e.toString(), new Object[0]);
                return new SoterCoreResult(7, e.toString());
            }
        } else {
            SLogger.m81940e(TAG, "soter: not support soter", new Object[0]);
            return new SoterCoreResult(2);
        }
    }
}
