package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpx {
    /* renamed from: a */
    public static int m57930a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (m57931b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: b */
    public static BigInteger m57931b(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: c */
    public static BigInteger m57932c(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigInteger2;
        BigInteger b = m57931b(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(b);
        if (b.signum() == 1) {
            BigInteger mod2 = mod.mod(b);
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (!b.testBit(0) || !b.testBit(1)) {
                    if (b.testBit(0) && !b.testBit(1)) {
                        bigInteger3 = BigInteger.ONE;
                        BigInteger shiftRight = b.subtract(bigInteger3).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(b);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, b);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            if (modPow.add(bigInteger4).equals(b)) {
                                BigInteger shiftRight2 = b.add(bigInteger4).shiftRight(1);
                                BigInteger bigInteger5 = bigInteger3;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(b).multiply(mod3)).mod(b);
                                    BigInteger mod4 = multiply.add(multiply).mod(b);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod5 = bigInteger5.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(b);
                                        bigInteger4 = bigInteger3.multiply(mod4).add(bigInteger5).mod(b);
                                        bigInteger5 = mod5;
                                    } else {
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger5;
                            } else if (modPow.equals(bigInteger4)) {
                                bigInteger3 = bigInteger3.add(bigInteger4);
                                i++;
                                if (i == 128 && !b.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                } else {
                    bigInteger2 = mod2.modPow(b.add(BigInteger.ONE).shiftRight(2), b);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(b).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z != bigInteger3.testBit(0) ? b.subtract(bigInteger3).mod(b) : bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    /* renamed from: d */
    public static KeyPair m57933d(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzpz.f40329j.mo49715a(KeyPropertiesCompact.KEY_ALGORITHM_EC);
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: e */
    static void m57934e(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger b = m57931b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(b) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(b) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: f */
    public static void m57935f(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        m57936g(eCPublicKey, eCPrivateKey);
        m57934e(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    /* renamed from: g */
    static void m57936g(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: h */
    public static byte[] m57937h(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        m57936g(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        m57934e(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) zzpz.f40330k.mo49715a(KeyPropertiesCompact.KEY_ALGORITHM_EC)).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) zzpz.f40328i.mo49715a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m57931b(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            m57932c(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: i */
    public static ECPrivateKey m57938i(int i, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) zzpz.f40330k.mo49715a(KeyPropertiesCompact.KEY_ALGORITHM_EC)).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m57941l(i)));
    }

    /* renamed from: j */
    public static ECPublicKey m57939j(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec l = m57941l(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m57934e(eCPoint, l.getCurve());
        return (ECPublicKey) ((KeyFactory) zzpz.f40330k.mo49715a(KeyPropertiesCompact.KEY_ALGORITHM_EC)).generatePublic(new ECPublicKeySpec(eCPoint, l));
    }

    /* renamed from: k */
    public static ECPublicKey m57940k(ECParameterSpec eCParameterSpec, int i, byte[] bArr) throws GeneralSecurityException {
        ECPoint eCPoint;
        EllipticCurve curve = eCParameterSpec.getCurve();
        int a = m57930a(curve);
        int i2 = i - 1;
        boolean z = false;
        if (i2 == 0) {
            int length = bArr.length;
            if (length != a + a + 1) {
                throw new GeneralSecurityException("invalid point size");
            } else if (bArr[0] == 4) {
                int i3 = a + 1;
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i3)), new BigInteger(1, Arrays.copyOfRange(bArr, i3, length)));
                m57934e(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point format");
            }
        } else if (i2 != 2) {
            BigInteger b = m57931b(curve);
            int length2 = bArr.length;
            if (length2 == a + 1) {
                byte b2 = bArr[0];
                if (b2 != 2) {
                    if (b2 == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(b) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                eCPoint = new ECPoint(bigInteger, m57932c(bigInteger, z, curve));
            } else {
                throw new GeneralSecurityException("compressed point has wrong length");
            }
        } else {
            int length3 = bArr.length;
            if (length3 == a + a) {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, a)), new BigInteger(1, Arrays.copyOfRange(bArr, a, length3)));
                m57934e(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        }
        return (ECPublicKey) ((KeyFactory) zzpz.f40330k.mo49715a(KeyPropertiesCompact.KEY_ALGORITHM_EC)).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    /* renamed from: l */
    public static ECParameterSpec m57941l(int i) throws NoSuchAlgorithmException {
        int i2 = i - 1;
        if (i2 == 0) {
            return m57943n("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 != 1) {
            return m57943n("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return m57943n("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    /* renamed from: m */
    public static byte[] m57942m(int i, int i2, ECPoint eCPoint) throws GeneralSecurityException {
        EllipticCurve curve = m57941l(i).getCurve();
        m57934e(eCPoint, curve);
        int a = m57930a(curve);
        int i3 = a + a + 1;
        byte[] bArr = new byte[i3];
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        int length = byteArray2.length;
        System.arraycopy(byteArray2, 0, bArr, i3 - length, length);
        int length2 = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, (a + 1) - length2, length2);
        bArr[0] = 4;
        return bArr;
    }

    /* renamed from: n */
    private static ECParameterSpec m57943n(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger(ExifInterface.GPS_MEASUREMENT_3D)), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
