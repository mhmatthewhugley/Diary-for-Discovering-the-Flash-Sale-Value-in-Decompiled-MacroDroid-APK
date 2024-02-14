package dev.skomlach.biometric.compat.crypto.rsa;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.crypto.rsa.RsaKeyHeader;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/RsaPrivateKey;", "", "rsaKeyHeader", "Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader;", "publicExponent", "Ljava/math/BigInteger;", "modulus", "prime1", "prime2", "exponent1", "exponent2", "coefficient", "privateExponent", "(Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", "factory", "Ljava/security/KeyFactory;", "rsaPrivateCrtKeySpec", "Ljava/security/spec/RSAPrivateCrtKeySpec;", "toByteArray", "", "sizeOfLong", "", "toRsaKey", "Ljava/security/interfaces/RSAPrivateCrtKey;", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RsaPrivateKey.kt */
public final class RsaPrivateKey {
    public static final Companion Companion = new Companion((C13695i) null);
    private final BigInteger coefficient;
    private final BigInteger exponent1;
    private final BigInteger exponent2;
    private KeyFactory factory;
    private final BigInteger modulus;
    private final BigInteger prime1;
    private final BigInteger prime2;
    private final BigInteger privateExponent;
    private final BigInteger publicExponent;
    private final RsaKeyHeader rsaKeyHeader;
    private final RSAPrivateCrtKeySpec rsaPrivateCrtKeySpec;

    @Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/RsaPrivateKey$Companion;", "", "()V", "fromByteArray", "Ldev/skomlach/biometric/compat/crypto/rsa/RsaPrivateKey;", "bytes", "", "sizeOfLong", "", "fromRsaKey", "rsaPrivateCrtKey", "Ljava/security/interfaces/RSAPrivateCrtKey;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: RsaPrivateKey.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final RsaPrivateKey fromByteArray(byte[] bArr, int i) throws RsaKeyDataException {
            byte[] bArr2 = bArr;
            int i2 = i;
            C13706o.m87929f(bArr2, "bytes");
            RsaKeyHeader.Companion companion = RsaKeyHeader.Companion;
            int headerLength = companion.getHeaderLength(i2);
            if (bArr2.length >= headerLength) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte[] bArr3 = new byte[headerLength];
                wrap.get(bArr3);
                RsaKeyHeader fromByteArray = companion.fromByteArray(bArr3, i2);
                if (fromByteArray.getMagic() != 859919186) {
                    int magic = fromByteArray.getMagic();
                    throw new RsaKeyDataException("RsaPrivateKey: Unexpected magic byte in header: " + magic + ". Expected 859919186");
                } else if (fromByteArray.getExpectedDataLength() == bArr2.length - headerLength) {
                    byte[] bArr4 = new byte[fromByteArray.getCbPublicExp()];
                    wrap.get(bArr4);
                    BigInteger bigInteger = new BigInteger(1, bArr4);
                    byte[] bArr5 = new byte[fromByteArray.getCbModulus()];
                    wrap.get(bArr5);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    byte[] bArr6 = new byte[fromByteArray.getCbPrime1()];
                    wrap.get(bArr6);
                    BigInteger bigInteger3 = new BigInteger(1, bArr6);
                    byte[] bArr7 = new byte[fromByteArray.getCbPrime2()];
                    wrap.get(bArr7);
                    BigInteger bigInteger4 = new BigInteger(1, bArr7);
                    byte[] bArr8 = new byte[fromByteArray.getCbPrime1()];
                    wrap.get(bArr8);
                    BigInteger bigInteger5 = new BigInteger(1, bArr8);
                    byte[] bArr9 = new byte[fromByteArray.getCbPrime2()];
                    wrap.get(bArr9);
                    BigInteger bigInteger6 = new BigInteger(1, bArr9);
                    byte[] bArr10 = new byte[fromByteArray.getCbPrime1()];
                    wrap.get(bArr10);
                    BigInteger bigInteger7 = new BigInteger(1, bArr10);
                    byte[] bArr11 = new byte[fromByteArray.getCbModulus()];
                    wrap.get(bArr11);
                    BigInteger bigInteger8 = new BigInteger(1, bArr11);
                    if (!wrap.hasRemaining()) {
                        return new RsaPrivateKey(fromByteArray, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, (C13695i) null);
                    }
                    throw new RuntimeException("RsaPrivateKey: Not all bytes has been read from input");
                } else {
                    int length = bArr2.length - headerLength;
                    int expectedDataLength = fromByteArray.getExpectedDataLength();
                    throw new RsaKeyDataException("RsaPrivateKey: Unexpected bytes length: " + length + ". Expected " + expectedDataLength);
                }
            } else {
                throw new RsaKeyDataException("RsaPrivateKey: Unexpected bytes length, expected at least: " + headerLength);
            }
        }

        public final RsaPrivateKey fromRsaKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
            C13706o.m87929f(rSAPrivateCrtKey, "rsaPrivateCrtKey");
            RsaKeyHeader rsaKeyHeader = new RsaKeyHeader(RsaKeyHeader.MAGIC_RSAKEY_PRIVATE, rSAPrivateCrtKey.getModulus().bitLength(), BigIntHelper.divAndRoundUp(rSAPrivateCrtKey.getPublicExponent().bitLength(), 8), BigIntHelper.divAndRoundUp(rSAPrivateCrtKey.getModulus().bitLength(), 8), BigIntHelper.divAndRoundUp(rSAPrivateCrtKey.getPrimeP().bitLength(), 8), BigIntHelper.divAndRoundUp(rSAPrivateCrtKey.getPrimeQ().bitLength(), 8));
            BigInteger publicExponent = rSAPrivateCrtKey.getPublicExponent();
            C13706o.m87928e(publicExponent, "rsaPrivateCrtKey.publicExponent");
            BigInteger modulus = rSAPrivateCrtKey.getModulus();
            C13706o.m87928e(modulus, "rsaPrivateCrtKey.modulus");
            BigInteger primeP = rSAPrivateCrtKey.getPrimeP();
            C13706o.m87928e(primeP, "rsaPrivateCrtKey.primeP");
            BigInteger primeQ = rSAPrivateCrtKey.getPrimeQ();
            C13706o.m87928e(primeQ, "rsaPrivateCrtKey.primeQ");
            BigInteger primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
            C13706o.m87928e(primeExponentP, "rsaPrivateCrtKey.primeExponentP");
            BigInteger primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
            C13706o.m87928e(primeExponentQ, "rsaPrivateCrtKey.primeExponentQ");
            BigInteger crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
            C13706o.m87928e(crtCoefficient, "rsaPrivateCrtKey.crtCoefficient");
            BigInteger privateExponent = rSAPrivateCrtKey.getPrivateExponent();
            C13706o.m87928e(privateExponent, "rsaPrivateCrtKey.privateExponent");
            return new RsaPrivateKey(rsaKeyHeader, publicExponent, modulus, primeP, primeQ, primeExponentP, primeExponentQ, crtCoefficient, privateExponent, (C13695i) null);
        }
    }

    private RsaPrivateKey(RsaKeyHeader rsaKeyHeader2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.rsaKeyHeader = rsaKeyHeader2;
        BigInteger bigInteger9 = bigInteger;
        this.publicExponent = bigInteger9;
        BigInteger bigInteger10 = bigInteger2;
        this.modulus = bigInteger10;
        BigInteger bigInteger11 = bigInteger3;
        this.prime1 = bigInteger11;
        BigInteger bigInteger12 = bigInteger4;
        this.prime2 = bigInteger12;
        BigInteger bigInteger13 = bigInteger5;
        this.exponent1 = bigInteger13;
        BigInteger bigInteger14 = bigInteger6;
        this.exponent2 = bigInteger14;
        BigInteger bigInteger15 = bigInteger7;
        this.coefficient = bigInteger15;
        BigInteger bigInteger16 = bigInteger8;
        this.privateExponent = bigInteger16;
        this.rsaPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigInteger10, bigInteger9, bigInteger16, bigInteger11, bigInteger12, bigInteger13, bigInteger14, bigInteger15);
    }

    public /* synthetic */ RsaPrivateKey(RsaKeyHeader rsaKeyHeader2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, C13695i iVar) {
        this(rsaKeyHeader2, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8);
    }

    public final byte[] toByteArray(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(RsaKeyHeader.Companion.getHeaderLength(i) + this.rsaKeyHeader.getExpectedDataLength());
        allocate.put(this.rsaKeyHeader.toByteArray(i));
        allocate.put(BigIntHelper.bigInt2Bytes(this.publicExponent, this.rsaKeyHeader.getCbPublicExp()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.modulus, this.rsaKeyHeader.getCbModulus()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.prime1, this.rsaKeyHeader.getCbPrime1()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.prime2, this.rsaKeyHeader.getCbPrime2()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.exponent1, this.rsaKeyHeader.getCbPrime1()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.exponent2, this.rsaKeyHeader.getCbPrime2()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.coefficient, this.rsaKeyHeader.getCbPrime1()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.privateExponent, this.rsaKeyHeader.getCbModulus()));
        if (!allocate.hasRemaining()) {
            byte[] array = allocate.array();
            C13706o.m87928e(array, "data.array()");
            return array;
        }
        throw new RuntimeException("Not all data has been written to output");
    }

    public final RSAPrivateCrtKey toRsaKey() throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        if (this.factory == null) {
            synchronized (RsaPrivateKey.class) {
                if (this.factory == null) {
                    KeyFactory instance = KeyFactory.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_RSA);
                    C13706o.m87928e(instance, "getInstance(\"RSA\")");
                    this.factory = instance;
                }
                C13339u uVar = C13339u.f61331a;
            }
        }
        KeyFactory keyFactory = this.factory;
        if (keyFactory == null) {
            C13706o.m87945v("factory");
            keyFactory = null;
        }
        PrivateKey generatePrivate = keyFactory.generatePrivate(this.rsaPrivateCrtKeySpec);
        C13706o.m87927d(generatePrivate, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateCrtKey");
        return (RSAPrivateCrtKey) generatePrivate;
    }
}
