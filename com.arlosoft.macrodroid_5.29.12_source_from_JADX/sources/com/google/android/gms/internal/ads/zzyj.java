package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;
import com.tencent.soter.core.biometric.FaceManager;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyj {

    /* renamed from: a */
    private static final int[] f38969a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f38970b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f38971c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f38972d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f38973e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, Opcodes.SHL_INT_LIT8, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f38974f = {69, 87, 104, 121, 139, 174, Opcodes.ADD_INT_LIT16, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, FaceManager.FACE_ACQUIRED_RIGHT, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f38975g = 0;

    /* renamed from: a */
    public static int m55427a(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f38969a[i] * 256;
    }

    /* renamed from: b */
    public static int m55428b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m55432f((b & 192) >> 6, b & 63);
    }

    /* renamed from: c */
    public static zzaf m55429c(zzef zzef, String str, String str2, @Nullable zzx zzx) {
        int i = f38970b[(zzef.mo45243s() & 192) >> 6];
        int s = zzef.mo45243s();
        int i2 = f38972d[(s & 56) >> 3];
        if ((s & 4) != 0) {
            i2++;
        }
        zzad zzad = new zzad();
        zzad.mo41331h(str);
        zzad.mo41343s("audio/ac3");
        zzad.mo41326e0(i2);
        zzad.mo41344t(i);
        zzad.mo41320b(zzx);
        zzad.mo41335k(str2);
        return zzad.mo41349y();
    }

    /* renamed from: d */
    public static zzaf m55430d(zzef zzef, String str, String str2, @Nullable zzx zzx) {
        zzef.mo45231g(2);
        int i = f38970b[(zzef.mo45243s() & 192) >> 6];
        int s = zzef.mo45243s();
        int i2 = f38972d[(s & 14) >> 1];
        if ((s & 1) != 0) {
            i2++;
        }
        if (((zzef.mo45243s() & 30) >> 1) > 0 && (2 & zzef.mo45243s()) != 0) {
            i2 += 2;
        }
        String str3 = (zzef.mo45233i() <= 0 || (zzef.mo45243s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzad zzad = new zzad();
        zzad.mo41331h(str);
        zzad.mo41343s(str3);
        zzad.mo41326e0(i2);
        zzad.mo41344t(i);
        zzad.mo41320b(zzx);
        zzad.mo41335k(str2);
        return zzad.mo41349y();
    }

    /* renamed from: e */
    public static zzyi m55431e(zzee zzee) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzee zzee2 = zzee;
        int b = zzee.mo45197b();
        zzee2.mo45205j(40);
        int c = zzee2.mo45198c(5);
        zzee2.mo45203h(b);
        int i12 = -1;
        if (c > 10) {
            zzee2.mo45205j(16);
            int c2 = zzee2.mo45198c(2);
            if (c2 == 0) {
                i12 = 0;
            } else if (c2 == 1) {
                i12 = 1;
            } else if (c2 == 2) {
                i12 = 2;
            }
            zzee2.mo45205j(3);
            int c3 = zzee2.mo45198c(11) + 1;
            int i13 = c3 + c3;
            int c4 = zzee2.mo45198c(2);
            if (c4 == 3) {
                i6 = f38971c[zzee2.mo45198c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = zzee2.mo45198c(2);
                i7 = f38969a[i8];
                i6 = f38970b[c4];
            }
            int i14 = i7 * 256;
            int c5 = zzee2.mo45198c(3);
            boolean l = zzee.mo45207l();
            int i15 = f38972d[c5] + (l ? 1 : 0);
            zzee2.mo45205j(10);
            if (zzee.mo45207l()) {
                zzee2.mo45205j(8);
            }
            if (c5 == 0) {
                zzee2.mo45205j(5);
                if (zzee.mo45207l()) {
                    zzee2.mo45205j(8);
                }
                i9 = 0;
                c5 = 0;
            } else {
                i9 = c5;
            }
            if (i12 == 1) {
                if (zzee.mo45207l()) {
                    zzee2.mo45205j(16);
                }
                i10 = 1;
            } else {
                i10 = i12;
            }
            if (zzee.mo45207l()) {
                if (i9 > 2) {
                    zzee2.mo45205j(2);
                }
                if ((i9 & 1) != 0 && i9 > 2) {
                    zzee2.mo45205j(6);
                }
                if ((i9 & 4) != 0) {
                    zzee2.mo45205j(6);
                }
                if (l && zzee.mo45207l()) {
                    zzee2.mo45205j(5);
                }
                if (i10 == 0) {
                    if (zzee.mo45207l()) {
                        zzee2.mo45205j(6);
                    }
                    if (i9 == 0 && zzee.mo45207l()) {
                        zzee2.mo45205j(6);
                    }
                    if (zzee.mo45207l()) {
                        zzee2.mo45205j(6);
                    }
                    int c6 = zzee2.mo45198c(2);
                    if (c6 == 1) {
                        zzee2.mo45205j(5);
                    } else if (c6 == 2) {
                        zzee2.mo45205j(12);
                    } else if (c6 == 3) {
                        int c7 = zzee2.mo45198c(5);
                        if (zzee.mo45207l()) {
                            zzee2.mo45205j(5);
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(4);
                            }
                            if (zzee.mo45207l()) {
                                if (zzee.mo45207l()) {
                                    zzee2.mo45205j(4);
                                }
                                if (zzee.mo45207l()) {
                                    zzee2.mo45205j(4);
                                }
                            }
                        }
                        if (zzee.mo45207l()) {
                            zzee2.mo45205j(5);
                            if (zzee.mo45207l()) {
                                zzee2.mo45205j(7);
                                if (zzee.mo45207l()) {
                                    zzee2.mo45205j(8);
                                    zzee2.mo45205j((c7 + 2) * 8);
                                    zzee.mo45199d();
                                }
                            }
                        }
                        zzee2.mo45205j((c7 + 2) * 8);
                        zzee.mo45199d();
                    }
                    if (i9 < 2) {
                        if (zzee.mo45207l()) {
                            zzee2.mo45205j(14);
                        }
                        if (c5 == 0 && zzee.mo45207l()) {
                            zzee2.mo45205j(14);
                        }
                    }
                    if (zzee.mo45207l()) {
                        if (i8 == 0) {
                            zzee2.mo45205j(5);
                            i10 = 0;
                            i8 = 0;
                        } else {
                            for (int i16 = 0; i16 < i7; i16++) {
                                if (zzee.mo45207l()) {
                                    zzee2.mo45205j(5);
                                }
                            }
                        }
                    }
                    i10 = 0;
                }
            }
            if (zzee.mo45207l()) {
                zzee2.mo45205j(5);
                if (i9 == 2) {
                    zzee2.mo45205j(4);
                    i9 = 2;
                }
                if (i9 >= 6) {
                    zzee2.mo45205j(2);
                }
                if (zzee.mo45207l()) {
                    i11 = 8;
                    zzee2.mo45205j(8);
                } else {
                    i11 = 8;
                }
                if (i9 == 0 && zzee.mo45207l()) {
                    zzee2.mo45205j(i11);
                }
                if (c4 < 3) {
                    zzee.mo45204i();
                }
            }
            if (i10 == 0 && i8 != 3) {
                zzee.mo45204i();
            }
            if (i10 == 2 && (i8 == 3 || zzee.mo45207l())) {
                zzee2.mo45205j(6);
            }
            str = (zzee.mo45207l() && zzee2.mo45198c(6) == 1 && zzee2.mo45198c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i13;
            i = i14;
            i3 = i6;
            i4 = i15;
        } else {
            zzee2.mo45205j(32);
            int c8 = zzee2.mo45198c(2);
            String str2 = c8 == 3 ? null : "audio/ac3";
            int f = m55432f(c8, zzee2.mo45198c(6));
            zzee2.mo45205j(8);
            int c9 = zzee2.mo45198c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                zzee2.mo45205j(2);
            }
            if ((c9 & 4) != 0) {
                zzee2.mo45205j(2);
            }
            if (c9 == 2) {
                zzee2.mo45205j(2);
            }
            str = str2;
            i2 = f;
            i3 = c8 < 3 ? f38970b[c8] : -1;
            i4 = f38972d[c9] + (zzee.mo45207l() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new zzyi(str, i5, i4, i3, i2, i, (zzyh) null);
    }

    /* renamed from: f */
    private static int m55432f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f38970b[i];
        if (i4 == 44100) {
            int i5 = f38974f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f38973e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
