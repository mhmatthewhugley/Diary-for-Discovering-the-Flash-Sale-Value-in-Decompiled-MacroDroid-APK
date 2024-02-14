package com.google.android.gms.internal.ads;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapk {

    /* renamed from: a */
    private static Cipher f25255a;

    /* renamed from: b */
    private static final Object f25256b = new Object();

    /* renamed from: c */
    private static final Object f25257c = new Object();

    public zzapk(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    private static final Cipher m42081c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f25257c) {
            if (f25255a == null) {
                f25255a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f25255a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo41784a(byte[] bArr, byte[] bArr2) throws zzapj {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
            synchronized (f25256b) {
                m42081c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m42081c().doFinal(bArr2);
                iv = m42081c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return zzanp.m41981a(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new zzapj(this, e);
        } catch (InvalidKeyException e2) {
            throw new zzapj(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new zzapj(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new zzapj(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzapj(this, e5);
        }
    }

    /* renamed from: b */
    public final byte[] mo41785b(byte[] bArr, String str) throws zzapj {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b = zzanp.m41982b(str, false);
            int length2 = b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[(length2 - 16)];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
                synchronized (f25256b) {
                    m42081c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m42081c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new zzapj(this);
        } catch (NoSuchAlgorithmException e) {
            throw new zzapj(this, e);
        } catch (InvalidKeyException e2) {
            throw new zzapj(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new zzapj(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new zzapj(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzapj(this, e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new zzapj(this, e6);
        } catch (IllegalArgumentException e7) {
            throw new zzapj(this, e7);
        }
    }
}
