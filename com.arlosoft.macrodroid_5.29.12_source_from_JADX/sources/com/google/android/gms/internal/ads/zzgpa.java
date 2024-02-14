package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgpa {
    /* renamed from: a */
    public static byte[] m52496a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = zzgnx.f36940b;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    byte[][] bArr5 = zzgnx.f36939a;
                    if (!zzgnv.m52432b(bArr5[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgoq.m52480a(bArr5[i2])));
                    }
                }
                long[] k = zzgop.m52479k(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(k, 0, jArr2, 0, 10);
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    byte b2 = copyOf[(32 - i3) - 1] & 255;
                    int i5 = 0;
                    while (i5 < 8) {
                        int i6 = (b2 >> (7 - i5)) & 1;
                        zzgnx.m52438a(jArr4, jArr2, i6);
                        zzgnx.m52438a(jArr5, jArr3, i6);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i7 = i3;
                        long[] jArr12 = new long[19];
                        int i8 = i5;
                        long[] jArr13 = new long[19];
                        int i9 = i6;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzgop.m52477i(jArr4, jArr4, jArr5);
                        zzgop.m52476h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzgop.m52477i(jArr2, jArr2, jArr3);
                        zzgop.m52476h(jArr3, copyOf4, jArr3);
                        zzgop.m52470b(jArr13, jArr2, jArr5);
                        zzgop.m52470b(jArr14, jArr4, jArr3);
                        zzgop.m52473e(jArr13);
                        zzgop.m52472d(jArr13);
                        zzgop.m52473e(jArr14);
                        zzgop.m52472d(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzgop.m52477i(jArr13, jArr13, jArr14);
                        zzgop.m52476h(jArr14, copyOf4, jArr14);
                        zzgop.m52475g(jArr17, jArr13);
                        zzgop.m52475g(jArr16, jArr14);
                        zzgop.m52470b(jArr14, jArr16, k);
                        zzgop.m52473e(jArr14);
                        zzgop.m52472d(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzgop.m52475g(jArr11, jArr4);
                        zzgop.m52475g(jArr12, jArr5);
                        zzgop.m52470b(jArr8, jArr11, jArr12);
                        zzgop.m52473e(jArr8);
                        zzgop.m52472d(jArr8);
                        zzgop.m52476h(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzgop.m52474f(jArr19, jArr12, 121665);
                        zzgop.m52472d(jArr19);
                        zzgop.m52477i(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzgop.m52470b(jArr20, jArr12, jArr19);
                        zzgop.m52473e(jArr20);
                        zzgop.m52472d(jArr20);
                        int i10 = i9;
                        zzgnx.m52438a(jArr8, jArr6, i10);
                        zzgnx.m52438a(jArr20, jArr7, i10);
                        i5 = i8 + 1;
                        byte[] bArr7 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i3 = i7;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr6;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr8 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i3++;
                    byte[] bArr9 = bArr2;
                    copyOf = bArr8;
                }
                long[] jArr26 = jArr;
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[10];
                zzgop.m52475g(jArr28, jArr5);
                zzgop.m52475g(jArr38, jArr28);
                zzgop.m52475g(jArr36, jArr38);
                zzgop.m52469a(jArr29, jArr36, jArr5);
                zzgop.m52469a(jArr30, jArr29, jArr28);
                zzgop.m52475g(jArr36, jArr30);
                zzgop.m52469a(jArr31, jArr36, jArr29);
                zzgop.m52475g(jArr36, jArr31);
                zzgop.m52475g(jArr38, jArr36);
                zzgop.m52475g(jArr36, jArr38);
                zzgop.m52475g(jArr38, jArr36);
                zzgop.m52475g(jArr36, jArr38);
                zzgop.m52469a(jArr32, jArr36, jArr31);
                zzgop.m52475g(jArr36, jArr32);
                zzgop.m52475g(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    zzgop.m52475g(jArr36, jArr38);
                    zzgop.m52475g(jArr38, jArr36);
                }
                zzgop.m52469a(jArr33, jArr38, jArr32);
                zzgop.m52475g(jArr36, jArr33);
                zzgop.m52475g(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    zzgop.m52475g(jArr36, jArr38);
                    zzgop.m52475g(jArr38, jArr36);
                }
                zzgop.m52469a(jArr36, jArr38, jArr33);
                zzgop.m52475g(jArr38, jArr36);
                zzgop.m52475g(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzgop.m52475g(jArr38, jArr36);
                    zzgop.m52475g(jArr36, jArr38);
                }
                zzgop.m52469a(jArr34, jArr36, jArr32);
                zzgop.m52475g(jArr36, jArr34);
                zzgop.m52475g(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    zzgop.m52475g(jArr36, jArr38);
                    zzgop.m52475g(jArr38, jArr36);
                }
                zzgop.m52469a(jArr35, jArr38, jArr34);
                zzgop.m52475g(jArr38, jArr35);
                zzgop.m52475g(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    zzgop.m52475g(jArr38, jArr36);
                    zzgop.m52475g(jArr36, jArr38);
                }
                zzgop.m52469a(jArr38, jArr36, jArr35);
                zzgop.m52475g(jArr36, jArr38);
                zzgop.m52475g(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzgop.m52475g(jArr36, jArr38);
                    zzgop.m52475g(jArr38, jArr36);
                }
                zzgop.m52469a(jArr36, jArr38, jArr34);
                zzgop.m52475g(jArr38, jArr36);
                zzgop.m52475g(jArr36, jArr38);
                zzgop.m52475g(jArr38, jArr36);
                zzgop.m52475g(jArr36, jArr38);
                zzgop.m52475g(jArr38, jArr36);
                zzgop.m52469a(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzgop.m52469a(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzgop.m52469a(jArr40, k, jArr39);
                zzgop.m52477i(jArr41, k, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzgop.m52477i(jArr43, jArr41, jArr45);
                zzgop.m52469a(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzgop.m52477i(jArr43, jArr43, jArr46);
                zzgop.m52469a(jArr43, jArr43, jArr40);
                zzgop.m52469a(jArr43, jArr43, jArr46);
                zzgop.m52474f(jArr42, jArr43, 4);
                zzgop.m52472d(jArr42);
                zzgop.m52469a(jArr43, jArr40, jArr3);
                zzgop.m52476h(jArr43, jArr43, jArr3);
                zzgop.m52469a(jArr44, jArr41, jArr46);
                zzgop.m52477i(jArr43, jArr43, jArr44);
                zzgop.m52475g(jArr43, jArr43);
                if (zzgnv.m52432b(zzgop.m52478j(jArr42), zzgop.m52478j(jArr43))) {
                    return zzgop.m52478j(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgoq.m52480a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m52497b() {
        byte[] a = zzgox.m52491a(32);
        a[0] = (byte) (a[0] | 7);
        byte b = a[31] & 63;
        a[31] = (byte) b;
        a[31] = (byte) (b | 128);
        return a;
    }

    /* renamed from: c */
    public static byte[] m52498c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m52496a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
