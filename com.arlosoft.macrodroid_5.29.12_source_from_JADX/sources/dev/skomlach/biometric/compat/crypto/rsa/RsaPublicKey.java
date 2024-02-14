package dev.skomlach.biometric.compat.crypto.rsa;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.crypto.rsa.RsaKeyHeader;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/RsaPublicKey;", "", "rsaKeyHeader", "Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader;", "publicExponent", "Ljava/math/BigInteger;", "modulus", "(Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", "factory", "Ljava/security/KeyFactory;", "rsaPublicKeySpec", "Ljava/security/spec/RSAPublicKeySpec;", "toByteArray", "", "sizeOfLong", "", "toRsaKey", "Ljava/security/interfaces/RSAPublicKey;", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RsaPublicKey.kt */
public final class RsaPublicKey {
    public static final Companion Companion = new Companion((C13695i) null);
    private KeyFactory factory;
    private final BigInteger modulus;
    private final BigInteger publicExponent;
    private final RsaKeyHeader rsaKeyHeader;
    private final RSAPublicKeySpec rsaPublicKeySpec;

    @Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/RsaPublicKey$Companion;", "", "()V", "fromByteArray", "Ldev/skomlach/biometric/compat/crypto/rsa/RsaPublicKey;", "bytes", "", "sizeOfLong", "", "fromRsaKey", "rsaPublicKey", "Ljava/security/interfaces/RSAPublicKey;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: RsaPublicKey.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final RsaPublicKey fromByteArray(byte[] bArr, int i) throws RsaKeyDataException {
            C13706o.m87929f(bArr, "bytes");
            RsaKeyHeader.Companion companion = RsaKeyHeader.Companion;
            int headerLength = companion.getHeaderLength(i);
            if (bArr.length >= headerLength) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte[] bArr2 = new byte[headerLength];
                wrap.get(bArr2);
                RsaKeyHeader fromByteArray = companion.fromByteArray(bArr2, i);
                if (fromByteArray.getMagic() != 826364754) {
                    int magic = fromByteArray.getMagic();
                    throw new RsaKeyDataException("RsaPublicKey: Unexpected magic byte in header: " + magic + ". Expected 826364754");
                } else if (fromByteArray.getExpectedDataLength() == bArr.length - headerLength) {
                    byte[] bArr3 = new byte[fromByteArray.getCbPublicExp()];
                    wrap.get(bArr3);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    byte[] bArr4 = new byte[fromByteArray.getCbModulus()];
                    wrap.get(bArr4);
                    BigInteger bigInteger2 = new BigInteger(1, bArr4);
                    if (!wrap.hasRemaining()) {
                        return new RsaPublicKey(fromByteArray, bigInteger, bigInteger2);
                    }
                    throw new RuntimeException("RsaPublicKey: Not all bytes has been read from input");
                } else {
                    int length = bArr.length - headerLength;
                    int expectedDataLength = fromByteArray.getExpectedDataLength();
                    throw new RsaKeyDataException("RsaPublicKey: Unexpected bytes length: " + length + ". Expected " + expectedDataLength);
                }
            } else {
                throw new RsaKeyDataException("RsaPrivateKey: Unexpected bytes length, expected at least: " + headerLength);
            }
        }

        public final RsaPublicKey fromRsaKey(RSAPublicKey rSAPublicKey) {
            C13706o.m87929f(rSAPublicKey, "rsaPublicKey");
            RsaKeyHeader rsaKeyHeader = new RsaKeyHeader(RsaKeyHeader.MAGIC_RSAKEY_PUBLIC, rSAPublicKey.getModulus().bitLength(), BigIntHelper.divAndRoundUp(rSAPublicKey.getPublicExponent().bitLength(), 8), BigIntHelper.divAndRoundUp(rSAPublicKey.getModulus().bitLength(), 8), 0, 0);
            BigInteger publicExponent = rSAPublicKey.getPublicExponent();
            C13706o.m87928e(publicExponent, "rsaPublicKey.publicExponent");
            BigInteger modulus = rSAPublicKey.getModulus();
            C13706o.m87928e(modulus, "rsaPublicKey.modulus");
            return new RsaPublicKey(rsaKeyHeader, publicExponent, modulus);
        }
    }

    public RsaPublicKey(RsaKeyHeader rsaKeyHeader2, BigInteger bigInteger, BigInteger bigInteger2) {
        C13706o.m87929f(rsaKeyHeader2, "rsaKeyHeader");
        C13706o.m87929f(bigInteger, "publicExponent");
        C13706o.m87929f(bigInteger2, "modulus");
        this.rsaKeyHeader = rsaKeyHeader2;
        this.publicExponent = bigInteger;
        this.modulus = bigInteger2;
        this.rsaPublicKeySpec = new RSAPublicKeySpec(bigInteger2, bigInteger);
    }

    public final byte[] toByteArray(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(RsaKeyHeader.Companion.getHeaderLength(i) + this.rsaKeyHeader.getExpectedDataLength());
        allocate.put(this.rsaKeyHeader.toByteArray(i));
        allocate.put(BigIntHelper.bigInt2Bytes(this.publicExponent, this.rsaKeyHeader.getCbPublicExp()));
        allocate.put(BigIntHelper.bigInt2Bytes(this.modulus, this.rsaKeyHeader.getCbModulus()));
        if (!allocate.hasRemaining()) {
            byte[] array = allocate.array();
            C13706o.m87928e(array, "data.array()");
            return array;
        }
        throw new RuntimeException("Some unexpected bytes remaining when converting public key to byte array");
    }

    public final RSAPublicKey toRsaKey() throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        if (this.factory == null) {
            synchronized (RsaPublicKey.class) {
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
        PublicKey generatePublic = keyFactory.generatePublic(this.rsaPublicKeySpec);
        C13706o.m87927d(generatePublic, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
        return (RSAPublicKey) generatePublic;
    }
}
