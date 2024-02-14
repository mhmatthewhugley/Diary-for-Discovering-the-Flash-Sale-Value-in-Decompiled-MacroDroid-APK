package com.tencent.soter.core.keystore;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.tencent.soter.core.SoterCore;
import com.tencent.soter.core.model.SLogger;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import java.util.Objects;
import javax.security.auth.x500.X500Principal;

public abstract class KeyGenParameterSpecCompatBuilder {
    private static final String TAG = "Soter.KeyGenParameterSpecCompatBuilder";

    static class DummyKeyGenParameterSpecCompatBuilder extends KeyGenParameterSpecCompatBuilder {
        public DummyKeyGenParameterSpecCompatBuilder(String str, int i) {
            super(str, i);
        }

        public AlgorithmParameterSpec build() {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setAlgorithmParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setBlockModes(String... strArr) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateNotAfter(Date date) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateNotBefore(Date date) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateSerialNumber(BigInteger bigInteger) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateSubject(X500Principal x500Principal) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setDigests(String... strArr) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setEncryptionPaddings(String... strArr) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setKeySize(int i) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityEnd(Date date) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityStart(Date date) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setRandomizedEncryptionRequired(boolean z) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setSignaturePaddings(String... strArr) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setUserAuthenticationRequired(boolean z) {
            return null;
        }

        public KeyGenParameterSpecCompatBuilder setUserAuthenticationValidityDurationSeconds(int i) {
            return null;
        }
    }

    private static class NormalKeyGenParameterSpecCompatBuilder extends KeyGenParameterSpecCompatBuilder {
        private KeyGenParameterSpec.Builder builder = null;

        public NormalKeyGenParameterSpecCompatBuilder(String str, int i) {
            super(str, i);
            this.builder = new KeyGenParameterSpec.Builder(str, i);
        }

        public AlgorithmParameterSpec build() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.builder.build();
        }

        public KeyGenParameterSpecCompatBuilder setAlgorithmParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
            this.builder.setAlgorithmParameterSpec(algorithmParameterSpec);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setBlockModes(String... strArr) {
            this.builder.setBlockModes(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateNotAfter(Date date) {
            this.builder.setCertificateNotAfter(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateNotBefore(Date date) {
            this.builder.setCertificateNotBefore(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateSerialNumber(BigInteger bigInteger) {
            this.builder.setCertificateSerialNumber(bigInteger);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateSubject(X500Principal x500Principal) {
            this.builder.setCertificateSubject(x500Principal);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setDigests(String... strArr) {
            this.builder.setDigests(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setEncryptionPaddings(String... strArr) {
            this.builder.setEncryptionPaddings(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeySize(int i) {
            this.builder.setKeySize(i);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityEnd(Date date) {
            this.builder.setKeyValidityEnd(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityStart(Date date) {
            this.builder.setKeyValidityStart(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setRandomizedEncryptionRequired(boolean z) {
            this.builder.setRandomizedEncryptionRequired(z);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setSignaturePaddings(String... strArr) {
            this.builder.setSignaturePaddings(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setUserAuthenticationRequired(boolean z) {
            this.builder.setUserAuthenticationRequired(z);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setUserAuthenticationValidityDurationSeconds(int i) {
            this.builder.setUserAuthenticationValidityDurationSeconds(i);
            return this;
        }
    }

    static class ReflectKeyGenParameterSpecCompatBuilder extends KeyGenParameterSpecCompatBuilder {
        private static final String CLASSNAME = "android.security.keystore.KeyGenParameterSpec";
        private String[] mBlockModes;
        private Date mCertificateNotAfter;
        private Date mCertificateNotBefore;
        private BigInteger mCertificateSerialNumber;
        private X500Principal mCertificateSubject;
        private String[] mDigests;
        private String[] mEncryptionPaddings;
        private int mKeySize = -1;
        private Date mKeyValidityForConsumptionEnd;
        private Date mKeyValidityForOriginationEnd;
        private Date mKeyValidityStart;
        private final String mKeystoreAlias;
        private int mPurposes;
        private boolean mRandomizedEncryptionRequired = true;
        private String[] mSignaturePaddings;
        private AlgorithmParameterSpec mSpec;
        private boolean mUserAuthenticationRequired;
        private int mUserAuthenticationValidityDurationSeconds = -1;

        public ReflectKeyGenParameterSpecCompatBuilder(String str, int i) {
            super(str, i);
            Objects.requireNonNull(str, "keystoreAlias == null");
            if (!str.isEmpty()) {
                this.mKeystoreAlias = str;
                this.mPurposes = i;
                return;
            }
            throw new IllegalArgumentException("keystoreAlias must not be empty");
        }

        public AlgorithmParameterSpec build() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Class<String[]> cls = String[].class;
            Class<?> cls2 = Class.forName(CLASSNAME);
            Class cls3 = Integer.TYPE;
            Class cls4 = Boolean.TYPE;
            return (AlgorithmParameterSpec) cls2.getConstructor(new Class[]{String.class, cls3, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, Date.class, Date.class, Date.class, Date.class, Date.class, cls3, cls, cls, cls, cls, cls4, cls4, cls3}).newInstance(new Object[]{this.mKeystoreAlias, Integer.valueOf(this.mKeySize), this.mSpec, this.mCertificateSubject, this.mCertificateSerialNumber, this.mCertificateNotBefore, this.mCertificateNotAfter, this.mKeyValidityStart, this.mKeyValidityForOriginationEnd, this.mKeyValidityForConsumptionEnd, Integer.valueOf(this.mPurposes), this.mDigests, this.mEncryptionPaddings, this.mSignaturePaddings, this.mBlockModes, Boolean.valueOf(this.mRandomizedEncryptionRequired), Boolean.valueOf(this.mUserAuthenticationRequired), Integer.valueOf(this.mUserAuthenticationValidityDurationSeconds)});
        }

        public KeyGenParameterSpecCompatBuilder setAlgorithmParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
            Objects.requireNonNull(algorithmParameterSpec, "spec == null");
            this.mSpec = algorithmParameterSpec;
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setBlockModes(String... strArr) {
            this.mBlockModes = KeyGenParameterSpecCompatBuilder.cloneIfNotEmpty(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateNotAfter(Date date) {
            Objects.requireNonNull(date, "date == null");
            this.mCertificateNotAfter = KeyGenParameterSpecCompatBuilder.cloneIfNotNull(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateNotBefore(Date date) {
            Objects.requireNonNull(date, "date == null");
            this.mCertificateNotBefore = KeyGenParameterSpecCompatBuilder.cloneIfNotNull(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateSerialNumber(BigInteger bigInteger) {
            Objects.requireNonNull(bigInteger, "serialNumber == null");
            this.mCertificateSerialNumber = bigInteger;
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setCertificateSubject(X500Principal x500Principal) {
            Objects.requireNonNull(x500Principal, "subject == null");
            this.mCertificateSubject = x500Principal;
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setDigests(String... strArr) {
            this.mDigests = KeyGenParameterSpecCompatBuilder.cloneIfNotEmpty(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setEncryptionPaddings(String... strArr) {
            this.mEncryptionPaddings = KeyGenParameterSpecCompatBuilder.cloneIfNotEmpty(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeySize(int i) {
            if (i >= 0) {
                this.mKeySize = i;
                return this;
            }
            throw new IllegalArgumentException("keySize < 0");
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityEnd(Date date) {
            setKeyValidityForOriginationEnd(date);
            setKeyValidityForConsumptionEnd(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityForConsumptionEnd(Date date) {
            this.mKeyValidityForConsumptionEnd = KeyGenParameterSpecCompatBuilder.cloneIfNotNull(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityForOriginationEnd(Date date) {
            this.mKeyValidityForOriginationEnd = KeyGenParameterSpecCompatBuilder.cloneIfNotNull(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setKeyValidityStart(Date date) {
            this.mKeyValidityStart = KeyGenParameterSpecCompatBuilder.cloneIfNotNull(date);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setRandomizedEncryptionRequired(boolean z) {
            this.mRandomizedEncryptionRequired = z;
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setSignaturePaddings(String... strArr) {
            this.mSignaturePaddings = KeyGenParameterSpecCompatBuilder.cloneIfNotEmpty(strArr);
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setUserAuthenticationRequired(boolean z) {
            this.mUserAuthenticationRequired = z;
            return this;
        }

        public KeyGenParameterSpecCompatBuilder setUserAuthenticationValidityDurationSeconds(int i) {
            if (i >= -1) {
                this.mUserAuthenticationValidityDurationSeconds = i;
                return this;
            }
            throw new IllegalArgumentException("seconds must be -1 or larger");
        }
    }

    public KeyGenParameterSpecCompatBuilder(String str, int i) {
    }

    public static String[] cloneIfNotEmpty(String[] strArr) {
        return (strArr == null || strArr.length <= 0) ? strArr : (String[]) strArr.clone();
    }

    static Date cloneIfNotNull(Date date) {
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public static KeyGenParameterSpecCompatBuilder newInstance(String str, int i) {
        if (!SoterCore.isNativeSupportSoter()) {
            SLogger.m81940e(TAG, "soter: not support soter. return dummy", new Object[0]);
            return new DummyKeyGenParameterSpecCompatBuilder(str, i);
        } else if (Build.VERSION.SDK_INT >= 23) {
            return new NormalKeyGenParameterSpecCompatBuilder(str, i);
        } else {
            return new ReflectKeyGenParameterSpecCompatBuilder(str, i);
        }
    }

    public abstract AlgorithmParameterSpec build() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    public abstract KeyGenParameterSpecCompatBuilder setAlgorithmParameterSpec(AlgorithmParameterSpec algorithmParameterSpec);

    public abstract KeyGenParameterSpecCompatBuilder setBlockModes(String... strArr);

    public abstract KeyGenParameterSpecCompatBuilder setCertificateNotAfter(Date date);

    public abstract KeyGenParameterSpecCompatBuilder setCertificateNotBefore(Date date);

    public abstract KeyGenParameterSpecCompatBuilder setCertificateSerialNumber(BigInteger bigInteger);

    public abstract KeyGenParameterSpecCompatBuilder setCertificateSubject(X500Principal x500Principal);

    public abstract KeyGenParameterSpecCompatBuilder setDigests(String... strArr);

    public abstract KeyGenParameterSpecCompatBuilder setEncryptionPaddings(String... strArr);

    public abstract KeyGenParameterSpecCompatBuilder setKeySize(int i);

    public abstract KeyGenParameterSpecCompatBuilder setKeyValidityEnd(Date date);

    public abstract KeyGenParameterSpecCompatBuilder setKeyValidityStart(Date date);

    public abstract KeyGenParameterSpecCompatBuilder setRandomizedEncryptionRequired(boolean z);

    public abstract KeyGenParameterSpecCompatBuilder setSignaturePaddings(String... strArr);

    public abstract KeyGenParameterSpecCompatBuilder setUserAuthenticationRequired(boolean z);

    public abstract KeyGenParameterSpecCompatBuilder setUserAuthenticationValidityDurationSeconds(int i);

    public static byte[] cloneIfNotEmpty(byte[] bArr) {
        return (bArr == null || bArr.length <= 0) ? bArr : (byte[]) bArr.clone();
    }
}
