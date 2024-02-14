package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzajj {
    /* renamed from: a */
    public static X509Certificate[][] m41586a(String str) throws zzajg, SecurityException, IOException {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair c = zzajk.m41600c(randomAccessFile);
            if (c != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) c.first;
                long longValue = ((Long) c.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzajg("ZIP64 APK not supported");
                    }
                }
                long a = zzajk.m41598a(byteBuffer2);
                if (a >= longValue) {
                    throw new zzajg("ZIP Central Directory offset out of range: " + a + ". ZIP End of Central Directory offset: " + longValue);
                } else if (zzajk.m41599b(byteBuffer2) + a != longValue) {
                    throw new zzajg("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (a >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(a - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            throw new zzajg("APK Signing Block size out of range: " + j2);
                        }
                        int i2 = (int) (8 + j2);
                        long j3 = a - ((long) i2);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                            allocate2.order(byteOrder);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == byteOrder) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i++;
                                                if (slice.remaining() >= 8) {
                                                    long j5 = slice.getLong();
                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                        throw new zzajg("APK Signing Block entry #" + i + " size out of range: " + j5);
                                                    }
                                                    int i3 = (int) j5;
                                                    int position2 = slice.position() + i3;
                                                    if (i3 > slice.remaining()) {
                                                        throw new zzajg("APK Signing Block entry #" + i + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] l = m41597l(randomAccessFile.getChannel(), new zzajf(m41590e(slice, i3 - 4), longValue2, a, longValue, byteBuffer2, (zzajb) null));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return l;
                                                    } else {
                                                        slice.position(position2);
                                                    }
                                                } else {
                                                    throw new zzajg("Insufficient data to read size of APK Signing Block entry #" + i);
                                                }
                                            }
                                            throw new zzajg("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                    }
                                    throw new IllegalArgumentException("end < start: " + capacity + " < " + 8);
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            throw new zzajg("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                        }
                        throw new zzajg("APK Signing Block offset out of range: " + j3);
                    }
                    throw new zzajg("No APK Signing Block before ZIP Central Directory");
                } else {
                    throw new zzajg("APK too small for APK Signing Block. ZIP Central Directory offset: " + a);
                }
            } else {
                throw new zzajg("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static int m41587b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    /* renamed from: c */
    private static int m41588c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i))));
        }
    }

    /* renamed from: d */
    private static String m41589d(int i) {
        if (i == 1) {
            return KeyPropertiesCompact.DIGEST_SHA256;
        }
        if (i == 2) {
            return KeyPropertiesCompact.DIGEST_SHA512;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
    }

    /* renamed from: e */
    private static ByteBuffer m41590e(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: f */
    private static ByteBuffer m41591f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m41590e(byteBuffer, i);
            } else {
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
        } else {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
    }

    /* renamed from: g */
    private static void m41592g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: h */
    private static void m41593h(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaje zzaje = new zzaje(fileChannel, 0, j);
            zzaje zzaje2 = new zzaje(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j4 = j;
            zzajk.m41601d(duplicate, j);
            zzajc zzajc = new zzajc(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] k = m41596k(iArr, new zzajd[]{zzaje, zzaje2, zzajc});
                while (i < size) {
                    int i3 = iArr[i];
                    Map map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), k[i])) {
                        i++;
                    } else {
                        throw new SecurityException(m41589d(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: i */
    private static byte[] m41594i(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
    }

    /* renamed from: j */
    private static X509Certificate[] m41595j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair pair;
        ByteBuffer f = m41591f(byteBuffer);
        ByteBuffer f2 = m41591f(byteBuffer);
        byte[] i = m41594i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i2 = -1;
        int i3 = 0;
        while (f2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer f3 = m41591f(f2);
                if (f3.remaining() >= 8) {
                    int i4 = f3.getInt();
                    arrayList.add(Integer.valueOf(i4));
                    if (!(i4 == 513 || i4 == 514 || i4 == 769)) {
                        switch (i4) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i2 != -1) {
                        int c = m41588c(i4);
                        int c2 = m41588c(i2);
                        if (c != 1) {
                            if (c2 != 1) {
                            }
                        }
                    }
                    bArr2 = m41594i(f3);
                    i2 = i4;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException("Failed to parse signature record #" + i3, e);
            }
        }
        if (i2 != -1) {
            if (i2 == 513 || i2 == 514) {
                str = KeyPropertiesCompact.KEY_ALGORITHM_EC;
            } else if (i2 != 769) {
                switch (i2) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = KeyPropertiesCompact.KEY_ALGORITHM_RSA;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i2))));
                }
            } else {
                str = "DSA";
            }
            if (i2 == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i2 == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i2 != 769) {
                switch (i2) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(KeyPropertiesCompact.DIGEST_SHA256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec(KeyPropertiesCompact.DIGEST_SHA512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString((long) i2))));
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str2 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i));
                Signature instance = Signature.getInstance(str2);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(f);
                if (instance.verify(bArr2)) {
                    f.clear();
                    ByteBuffer f4 = m41591f(f);
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (f4.hasRemaining()) {
                        i5++;
                        try {
                            ByteBuffer f5 = m41591f(f4);
                            if (f5.remaining() >= 8) {
                                int i6 = f5.getInt();
                                arrayList2.add(Integer.valueOf(i6));
                                if (i6 == i2) {
                                    bArr = m41594i(f5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            throw new IOException("Failed to parse digest record #" + i5, e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int c3 = m41588c(i2);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(c3), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer f6 = m41591f(f);
                            ArrayList arrayList3 = new ArrayList();
                            int i7 = 0;
                            while (f6.hasRemaining()) {
                                i7++;
                                byte[] i8 = m41594i(f6);
                                try {
                                    arrayList3.add(new zzajh((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(i8)), i8));
                                } catch (CertificateException e3) {
                                    throw new SecurityException("Failed to decode certificate #" + i7, e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(m41589d(c3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                throw new SecurityException("Failed to verify " + str2 + " signature", e4);
            }
        } else if (i3 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    /* renamed from: k */
    private static byte[][] m41596k(int[] iArr, zzajd[] zzajdArr) throws DigestException {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = FileUtils.ONE_MB;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzajdArr[i3].zza() + 1048575) / FileUtils.ONE_MB;
            i3++;
        }
        if (j3 < 2097151) {
            int i4 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i5 = 0;
            while (true) {
                length = iArr2.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m41587b(iArr2[i5]) * i4) + 5)];
                bArr2[0] = 90;
                m41592g(i4, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (i6 < iArr2.length) {
                String d = m41589d(iArr2[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(d);
                    i6++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i7 < i; i = 3) {
                zzajd zzajd = zzajdArr[i7];
                long j4 = j2;
                long zza = zzajd.zza();
                while (zza > j2) {
                    int min = (int) Math.min(zza, j);
                    m41592g(min, bArr3, 1);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        zzajd.mo41526a(messageDigestArr, j5, min);
                        byte[] bArr4 = bArr3;
                        int i10 = 0;
                        while (i10 < iArr2.length) {
                            int i11 = iArr2[i10];
                            zzajd zzajd2 = zzajd;
                            byte[] bArr5 = bArr[i10];
                            int b = m41587b(i11);
                            int i12 = length;
                            MessageDigest messageDigest = messageDigestArr[i10];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * b) + 5, b);
                            if (digest == b) {
                                i10++;
                                zzajd = zzajd2;
                                length = i12;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        zzajd zzajd3 = zzajd;
                        int i13 = length;
                        long j6 = (long) min;
                        long j7 = j5 + j6;
                        zza -= j6;
                        i8++;
                        bArr3 = bArr4;
                        j2 = 0;
                        j4 = j7;
                        messageDigestArr = messageDigestArr3;
                        j = FileUtils.ONE_MB;
                    } catch (IOException e2) {
                        throw new DigestException("Failed to digest chunk #" + i8 + " of section #" + i2, e2);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                int i14 = length;
                i2++;
                i7++;
                j2 = 0;
                j = FileUtils.ONE_MB;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i15 = 0;
            while (i15 < iArr2.length) {
                int i16 = iArr2[i15];
                byte[] bArr8 = bArr[i15];
                String d2 = m41589d(i16);
                try {
                    bArr7[i15] = MessageDigest.getInstance(d2).digest(bArr8);
                    i15++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        throw new DigestException("Too many chunks: " + j3);
    }

    /* renamed from: l */
    private static X509Certificate[][] m41597l(FileChannel fileChannel, zzajf zzajf) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f = m41591f(zzajf.f24830a);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m41595j(m41591f(f), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m41593h(hashMap, fileChannel, zzajf.f24831b, zzajf.f24832c, zzajf.f24833d, zzajf.f24834e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
