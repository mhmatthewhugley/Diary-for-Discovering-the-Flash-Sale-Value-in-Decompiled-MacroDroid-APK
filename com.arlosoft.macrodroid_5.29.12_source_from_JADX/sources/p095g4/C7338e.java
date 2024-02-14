package p095g4;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p095g4.C7333a;

/* renamed from: g4.e */
/* compiled from: StandardGifDecoder */
public class C7338e implements C7333a {

    /* renamed from: u */
    private static final String f17972u = "e";
    @ColorInt

    /* renamed from: a */
    private int[] f17973a;
    @ColorInt

    /* renamed from: b */
    private final int[] f17974b;

    /* renamed from: c */
    private final C7333a.C7334a f17975c;

    /* renamed from: d */
    private ByteBuffer f17976d;

    /* renamed from: e */
    private byte[] f17977e;

    /* renamed from: f */
    private short[] f17978f;

    /* renamed from: g */
    private byte[] f17979g;

    /* renamed from: h */
    private byte[] f17980h;

    /* renamed from: i */
    private byte[] f17981i;
    @ColorInt

    /* renamed from: j */
    private int[] f17982j;

    /* renamed from: k */
    private int f17983k;

    /* renamed from: l */
    private C7336c f17984l;

    /* renamed from: m */
    private Bitmap f17985m;

    /* renamed from: n */
    private boolean f17986n;

    /* renamed from: o */
    private int f17987o;

    /* renamed from: p */
    private int f17988p;

    /* renamed from: q */
    private int f17989q;

    /* renamed from: r */
    private int f17990r;
    @Nullable

    /* renamed from: s */
    private Boolean f17991s;
    @NonNull

    /* renamed from: t */
    private Bitmap.Config f17992t;

    public C7338e(@NonNull C7333a.C7334a aVar, C7336c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo37321q(cVar, byteBuffer, i);
    }

    @ColorInt
    /* renamed from: i */
    private int m30324i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f17988p + i; i9++) {
            byte[] bArr = this.f17981i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f17973a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f17988p + i11; i12++) {
            byte[] bArr2 = this.f17981i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f17973a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    private void m30325j(C7335b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C7335b bVar2 = bVar;
        int[] iArr = this.f17982j;
        int i6 = bVar2.f17947d;
        int i7 = this.f17988p;
        int i8 = i6 / i7;
        int i9 = bVar2.f17945b / i7;
        int i10 = bVar2.f17946c / i7;
        int i11 = bVar2.f17944a / i7;
        boolean z2 = this.f17983k == 0;
        int i12 = this.f17990r;
        int i13 = this.f17989q;
        byte[] bArr = this.f17981i;
        int[] iArr2 = this.f17973a;
        Boolean bool = this.f17991s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f17948e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z3 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * bVar2.f17946c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int i30 = m30324i(i24, i28, bVar2.f17946c);
                        if (i30 != 0) {
                            iArr[i29] = i30;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        Boolean bool3 = bool;
        if (this.f17991s == null) {
            if (bool3 == null) {
                z = false;
            } else {
                z = bool3.booleanValue();
            }
            this.f17991s = Boolean.valueOf(z);
        }
    }

    /* renamed from: k */
    private void m30326k(C7335b bVar) {
        C7335b bVar2 = bVar;
        int[] iArr = this.f17982j;
        int i = bVar2.f17947d;
        int i2 = bVar2.f17945b;
        int i3 = bVar2.f17946c;
        int i4 = bVar2.f17944a;
        boolean z = this.f17983k == 0;
        int i5 = this.f17990r;
        byte[] bArr = this.f17981i;
        int[] iArr2 = this.f17973a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f17946c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C7335b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        this.f17991s = Boolean.valueOf(this.f17991s == null && z && b != -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30327l(p095g4.C7335b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f17976d
            int r3 = r1.f17953j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            g4.c r1 = r0.f17984l
            int r2 = r1.f17960f
            int r1 = r1.f17961g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f17946c
            int r1 = r1.f17947d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f17981i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            g4.a$a r1 = r0.f17975c
            byte[] r1 = r1.mo37308b(r2)
            r0.f17981i = r1
        L_0x002b:
            byte[] r1 = r0.f17981i
            short[] r3 = r0.f17978f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f17978f = r3
        L_0x0037:
            short[] r3 = r0.f17978f
            byte[] r5 = r0.f17979g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f17979g = r5
        L_0x0041:
            byte[] r5 = r0.f17979g
            byte[] r6 = r0.f17980h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f17980h = r6
        L_0x004d:
            byte[] r6 = r0.f17980h
            int r7 = r28.m30330p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f17977e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m30329o()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f17987o = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g4.C7338e.m30327l(g4.b):void");
    }

    /* renamed from: n */
    private Bitmap m30328n() {
        Boolean bool = this.f17991s;
        Bitmap c = this.f17975c.mo37309c(this.f17990r, this.f17989q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f17992t);
        c.setHasAlpha(true);
        return c;
    }

    /* renamed from: o */
    private int m30329o() {
        int p = m30330p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.f17976d;
        byteBuffer.get(this.f17977e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    /* renamed from: p */
    private int m30330p() {
        return this.f17976d.get() & 255;
    }

    /* renamed from: r */
    private Bitmap m30331r(C7335b bVar, C7335b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f17982j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f17985m;
            if (bitmap2 != null) {
                this.f17975c.mo37307a(bitmap2);
            }
            this.f17985m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f17950g == 3 && this.f17985m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f17950g) > 0) {
            if (i2 == 2) {
                if (!bVar.f17949f) {
                    C7336c cVar = this.f17984l;
                    int i4 = cVar.f17966l;
                    if (bVar.f17954k == null || cVar.f17964j != bVar.f17951h) {
                        i3 = i4;
                    }
                } else if (this.f17983k == 0) {
                    this.f17991s = Boolean.TRUE;
                }
                int i5 = bVar2.f17947d;
                int i6 = this.f17988p;
                int i7 = i5 / i6;
                int i8 = bVar2.f17945b / i6;
                int i9 = bVar2.f17946c / i6;
                int i10 = bVar2.f17944a / i6;
                int i11 = this.f17990r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f17990r;
                }
            } else if (i2 == 3 && (bitmap = this.f17985m) != null) {
                int i16 = this.f17990r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f17989q);
            }
        }
        m30327l(bVar);
        if (bVar.f17948e || this.f17988p != 1) {
            m30325j(bVar);
        } else {
            m30326k(bVar);
        }
        if (this.f17986n && ((i = bVar.f17950g) == 0 || i == 1)) {
            if (this.f17985m == null) {
                this.f17985m = m30328n();
            }
            Bitmap bitmap3 = this.f17985m;
            int i17 = this.f17990r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f17989q);
        }
        Bitmap n = m30328n();
        int i18 = this.f17990r;
        n.setPixels(iArr, 0, i18, 0, 0, i18, this.f17989q);
        return n;
    }

    /* renamed from: a */
    public int mo37297a() {
        return this.f17976d.limit() + this.f17981i.length + (this.f17982j.length * 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo37298b() {
        /*
            r7 = this;
            monitor-enter(r7)
            g4.c r0 = r7.f17984l     // Catch:{ all -> 0x00c2 }
            int r0 = r0.f17957c     // Catch:{ all -> 0x00c2 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r7.f17983k     // Catch:{ all -> 0x00c2 }
            if (r0 >= 0) goto L_0x0032
        L_0x000d:
            java.lang.String r0 = f17972u     // Catch:{ all -> 0x00c2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r0.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00c2 }
            g4.c r3 = r7.f17984l     // Catch:{ all -> 0x00c2 }
            int r3 = r3.f17957c     // Catch:{ all -> 0x00c2 }
            r0.append(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00c2 }
            int r3 = r7.f17983k     // Catch:{ all -> 0x00c2 }
            r0.append(r3)     // Catch:{ all -> 0x00c2 }
        L_0x0030:
            r7.f17987o = r2     // Catch:{ all -> 0x00c2 }
        L_0x0032:
            int r0 = r7.f17987o     // Catch:{ all -> 0x00c2 }
            r3 = 0
            if (r0 == r2) goto L_0x00a9
            r4 = 2
            if (r0 != r4) goto L_0x003b
            goto L_0x00a9
        L_0x003b:
            r0 = 0
            r7.f17987o = r0     // Catch:{ all -> 0x00c2 }
            byte[] r4 = r7.f17977e     // Catch:{ all -> 0x00c2 }
            if (r4 != 0) goto L_0x004c
            g4.a$a r4 = r7.f17975c     // Catch:{ all -> 0x00c2 }
            r5 = 255(0xff, float:3.57E-43)
            byte[] r4 = r4.mo37308b(r5)     // Catch:{ all -> 0x00c2 }
            r7.f17977e = r4     // Catch:{ all -> 0x00c2 }
        L_0x004c:
            g4.c r4 = r7.f17984l     // Catch:{ all -> 0x00c2 }
            java.util.List<g4.b> r4 = r4.f17959e     // Catch:{ all -> 0x00c2 }
            int r5 = r7.f17983k     // Catch:{ all -> 0x00c2 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00c2 }
            g4.b r4 = (p095g4.C7335b) r4     // Catch:{ all -> 0x00c2 }
            int r5 = r7.f17983k     // Catch:{ all -> 0x00c2 }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x0068
            g4.c r6 = r7.f17984l     // Catch:{ all -> 0x00c2 }
            java.util.List<g4.b> r6 = r6.f17959e     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x00c2 }
            g4.b r5 = (p095g4.C7335b) r5     // Catch:{ all -> 0x00c2 }
            goto L_0x0069
        L_0x0068:
            r5 = r3
        L_0x0069:
            int[] r6 = r4.f17954k     // Catch:{ all -> 0x00c2 }
            if (r6 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            g4.c r6 = r7.f17984l     // Catch:{ all -> 0x00c2 }
            int[] r6 = r6.f17955a     // Catch:{ all -> 0x00c2 }
        L_0x0072:
            r7.f17973a = r6     // Catch:{ all -> 0x00c2 }
            if (r6 != 0) goto L_0x0091
            java.lang.String r0 = f17972u     // Catch:{ all -> 0x00c2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x008d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r0.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = r7.f17983k     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
        L_0x008d:
            r7.f17987o = r2     // Catch:{ all -> 0x00c2 }
            monitor-exit(r7)
            return r3
        L_0x0091:
            boolean r1 = r4.f17949f     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x00a3
            int[] r1 = r7.f17974b     // Catch:{ all -> 0x00c2 }
            int r2 = r6.length     // Catch:{ all -> 0x00c2 }
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch:{ all -> 0x00c2 }
            int[] r1 = r7.f17974b     // Catch:{ all -> 0x00c2 }
            r7.f17973a = r1     // Catch:{ all -> 0x00c2 }
            int r2 = r4.f17951h     // Catch:{ all -> 0x00c2 }
            r1[r2] = r0     // Catch:{ all -> 0x00c2 }
        L_0x00a3:
            android.graphics.Bitmap r0 = r7.m30331r(r4, r5)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r7)
            return r0
        L_0x00a9:
            java.lang.String r0 = f17972u     // Catch:{ all -> 0x00c2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r0.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = r7.f17987o     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
        L_0x00c0:
            monitor-exit(r7)
            return r3
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g4.C7338e.mo37298b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo37299c() {
        this.f17983k = (this.f17983k + 1) % this.f17984l.f17957c;
    }

    public void clear() {
        this.f17984l = null;
        byte[] bArr = this.f17981i;
        if (bArr != null) {
            this.f17975c.mo37311e(bArr);
        }
        int[] iArr = this.f17982j;
        if (iArr != null) {
            this.f17975c.mo37312f(iArr);
        }
        Bitmap bitmap = this.f17985m;
        if (bitmap != null) {
            this.f17975c.mo37307a(bitmap);
        }
        this.f17985m = null;
        this.f17976d = null;
        this.f17991s = null;
        byte[] bArr2 = this.f17977e;
        if (bArr2 != null) {
            this.f17975c.mo37311e(bArr2);
        }
    }

    /* renamed from: d */
    public int mo37301d() {
        return this.f17984l.f17957c;
    }

    /* renamed from: e */
    public void mo37302e(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f17992t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: f */
    public int mo37303f() {
        int i;
        if (this.f17984l.f17957c <= 0 || (i = this.f17983k) < 0) {
            return 0;
        }
        return mo37320m(i);
    }

    /* renamed from: g */
    public void mo37304g() {
        this.f17983k = -1;
    }

    @NonNull
    public ByteBuffer getData() {
        return this.f17976d;
    }

    /* renamed from: h */
    public int mo37306h() {
        return this.f17983k;
    }

    /* renamed from: m */
    public int mo37320m(int i) {
        if (i >= 0) {
            C7336c cVar = this.f17984l;
            if (i < cVar.f17957c) {
                return cVar.f17959e.get(i).f17952i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public synchronized void mo37321q(@NonNull C7336c cVar, @NonNull ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f17987o = 0;
            this.f17984l = cVar;
            this.f17983k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f17976d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f17976d.order(ByteOrder.LITTLE_ENDIAN);
            this.f17986n = false;
            Iterator<C7335b> it = cVar.f17959e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f17950g == 3) {
                        this.f17986n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f17988p = highestOneBit;
            int i2 = cVar.f17960f;
            this.f17990r = i2 / highestOneBit;
            int i3 = cVar.f17961g;
            this.f17989q = i3 / highestOneBit;
            this.f17981i = this.f17975c.mo37308b(i2 * i3);
            this.f17982j = this.f17975c.mo37310d(this.f17990r * this.f17989q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C7338e(@NonNull C7333a.C7334a aVar) {
        this.f17974b = new int[256];
        this.f17992t = Bitmap.Config.ARGB_8888;
        this.f17975c = aVar;
        this.f17984l = new C7336c();
    }
}
