package com.tencent.soter.core.sotercore;

import com.tencent.soter.core.keystore.KeyGenParameterSpecCompatBuilder;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import com.tencent.soter.core.model.SLogger;
import com.tencent.soter.core.model.SoterCoreData;
import com.tencent.soter.core.model.SoterCoreResult;
import com.tencent.soter.core.model.SoterCoreUtil;
import com.tencent.soter.core.model.SoterDelegate;
import com.tencent.soter.core.model.SoterPubKeyModel;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

public class CertSoterCore extends SoterCoreBeforeTreble {
    private static final String TAG = "Soter.CertSoterCore";

    public CertSoterCore(String str) {
        super(str);
    }

    public SoterCoreResult generateAppGlobalSecureKey() {
        SLogger.m81941i(TAG, "soter: start generate ask", new Object[0]);
        if (isNativeSupportSoter()) {
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_RSA, this.providerName);
                instance.initialize(KeyGenParameterSpecCompatBuilder.newInstance(SoterCoreData.getInstance().getAskName() + ".addcounter.auto_signed_when_get_pubkey_attk", 16).setDigests(KeyPropertiesCompact.DIGEST_SHA256).setSignaturePaddings(KeyPropertiesCompact.SIGNATURE_PADDING_RSA_PSS).build());
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

    public SoterPubKeyModel getAppGlobalSecureKeyModel() {
        SLogger.m81941i(TAG, "soter: start get app global secure key pub", new Object[0]);
        if (isNativeSupportSoter()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.providerName);
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    Certificate[] certificateChain = instance.getCertificateChain(SoterCoreData.getInstance().getAskName());
                    if (certificateChain != null) {
                        SoterDelegate.reset();
                        return new SoterPubKeyModel(certificateChain);
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

    public Signature initAuthKeySignature(String str) throws InvalidKeyException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {
        SLogger.m81939d("Monday", "CertSoterCore initAuthKeySignature", new Object[0]);
        if (SoterCoreUtil.isNullOrNil(str)) {
            SLogger.m81940e(TAG, "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        }
        Signature instance = Signature.getInstance("SHA256withRSA/PSS");
        KeyStore instance2 = KeyStore.getInstance(this.providerName);
        instance2.load((KeyStore.LoadStoreParameter) null);
        Key key = instance2.getKey(str, (char[]) null);
        if (key != null) {
            instance.initSign((PrivateKey) key);
            return instance;
        }
        SLogger.m81940e(TAG, "soter: entry not exists", new Object[0]);
        return null;
    }
}
