package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

abstract class BinaryWriter extends ByteOutput implements Writer {

    /* renamed from: a */
    private final BufferAllocator f56585a;

    /* renamed from: b */
    private final int f56586b;

    /* renamed from: c */
    final ArrayDeque<AllocatedBuffer> f56587c;

    /* renamed from: d */
    int f56588d;

    /* renamed from: com.google.protobuf.BinaryWriter$1 */
    static /* synthetic */ class C115581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56589a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56589a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f56589a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.BinaryWriter.C115581.<clinit>():void");
        }
    }

    private static final class SafeDirectWriter extends BinaryWriter {

        /* renamed from: e */
        private ByteBuffer f56590e;

        /* renamed from: f */
        private int f56591f;

        /* renamed from: g */
        private int f56592g;

        /* renamed from: G0 */
        private int m79525G0() {
            return this.f56591f - this.f56592g;
        }

        /* renamed from: I0 */
        private void m79526I0() {
            m79528K0(mo64828W());
        }

        /* renamed from: J0 */
        private void m79527J0(int i) {
            m79528K0(mo64829X(i));
        }

        /* renamed from: K0 */
        private void m79528K0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.mo64761d()) {
                ByteBuffer f = allocatedBuffer.mo64763f();
                if (f.isDirect()) {
                    mo64857H0();
                    this.f56587c.addFirst(allocatedBuffer);
                    this.f56590e = f;
                    f.limit(f.capacity());
                    this.f56590e.position(0);
                    this.f56590e.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.f56590e.limit() - 1;
                    this.f56591f = limit;
                    this.f56592g = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: L0 */
        private int m79529L0() {
            return this.f56592g + 1;
        }

        /* renamed from: O0 */
        private void m79530O0(int i) {
            ByteBuffer byteBuffer = this.f56590e;
            int i2 = this.f56592g;
            this.f56592g = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.f56592g - 4;
            this.f56592g = i3;
            this.f56590e.putInt(i3 + 1, (i & 127) | 128 | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | ((((i >>> 7) & 127) | 128) << 8));
        }

        /* renamed from: P0 */
        private void m79531P0(int i) {
            int i2 = this.f56592g - 4;
            this.f56592g = i2;
            this.f56590e.putInt(i2 + 1, (i & 127) | 128 | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (((i & 16256) | 16384) << 1));
        }

        /* renamed from: Q0 */
        private void m79532Q0(int i) {
            ByteBuffer byteBuffer = this.f56590e;
            int i2 = this.f56592g;
            this.f56592g = i2 - 1;
            byteBuffer.put(i2, (byte) i);
        }

        /* renamed from: R0 */
        private void m79533R0(int i) {
            int i2 = this.f56592g - 3;
            this.f56592g = i2;
            this.f56590e.putInt(i2, (((i & 127) | 128) << 8) | ((2080768 & i) << 10) | (((i & 16256) | 16384) << 9));
        }

        /* renamed from: S0 */
        private void m79534S0(int i) {
            int i2 = this.f56592g - 2;
            this.f56592g = i2;
            this.f56590e.putShort(i2 + 1, (short) ((i & 127) | 128 | ((i & 16256) << 1)));
        }

        /* renamed from: T0 */
        private void m79535T0(long j) {
            int i = this.f56592g - 8;
            this.f56592g = i;
            this.f56590e.putLong(i + 1, (j & 127) | 128 | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: U0 */
        private void m79536U0(long j) {
            int i = this.f56592g - 8;
            this.f56592g = i;
            this.f56590e.putLong(i + 1, (j & 127) | 128 | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        /* renamed from: V0 */
        private void m79537V0(long j) {
            int i = this.f56592g - 5;
            this.f56592g = i;
            this.f56590e.putLong(i - 2, (((j & 127) | 128) << 24) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((16256 & j) | 16384) << 25));
        }

        /* renamed from: W0 */
        private void m79538W0(long j) {
            m79531P0((int) j);
        }

        /* renamed from: X0 */
        private void m79539X0(long j) {
            ByteBuffer byteBuffer = this.f56590e;
            int i = this.f56592g;
            this.f56592g = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 56)));
            m79536U0(j & 72057594037927935L);
        }

        /* renamed from: Y0 */
        private void m79540Y0(long j) {
            m79532Q0((int) j);
        }

        /* renamed from: Z0 */
        private void m79541Z0(long j) {
            int i = this.f56592g - 7;
            this.f56592g = i;
            this.f56590e.putLong(i, (((j & 127) | 128) << 8) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((16256 & j) | 16384) << 9));
        }

        /* renamed from: a1 */
        private void m79542a1(long j) {
            int i = this.f56592g - 6;
            this.f56592g = i;
            this.f56590e.putLong(i - 1, (((j & 127) | 128) << 16) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((16256 & j) | 16384) << 17));
        }

        /* renamed from: b1 */
        private void m79543b1(long j) {
            ByteBuffer byteBuffer = this.f56590e;
            int i = this.f56592g;
            this.f56592g = i - 1;
            byteBuffer.put(i, (byte) ((int) (j >>> 63)));
            ByteBuffer byteBuffer2 = this.f56590e;
            int i2 = this.f56592g;
            this.f56592g = i2 - 1;
            byteBuffer2.put(i2, (byte) ((int) (((j >>> 56) & 127) | 128)));
            m79536U0(j & 72057594037927935L);
        }

        /* renamed from: c1 */
        private void m79544c1(long j) {
            m79533R0((int) j);
        }

        /* renamed from: d1 */
        private void m79545d1(long j) {
            m79534S0((int) j);
        }

        /* renamed from: B */
        public void mo64855B(int i, boolean z) {
            mo64833a0(6);
            mo64859M0(z ? (byte) 1 : 0);
            mo64854z0(i, 0);
        }

        /* renamed from: D */
        public void mo64856D(int i) {
            mo64854z0(i, 3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E0 */
        public void mo64816E0(int i) {
            if ((i & -128) == 0) {
                m79532Q0(i);
            } else if ((i & -16384) == 0) {
                m79534S0(i);
            } else if ((-2097152 & i) == 0) {
                m79533R0(i);
            } else if ((-268435456 & i) == 0) {
                m79531P0(i);
            } else {
                m79530O0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F0 */
        public void mo64818F0(long j) {
            switch (BinaryWriter.m79464U(j)) {
                case 1:
                    m79540Y0(j);
                    return;
                case 2:
                    m79545d1(j);
                    return;
                case 3:
                    m79544c1(j);
                    return;
                case 4:
                    m79538W0(j);
                    return;
                case 5:
                    m79537V0(j);
                    return;
                case 6:
                    m79542a1(j);
                    return;
                case 7:
                    m79541Z0(j);
                    return;
                case 8:
                    m79535T0(j);
                    return;
                case 9:
                    m79539X0(j);
                    return;
                case 10:
                    m79543b1(j);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H0 */
        public void mo64857H0() {
            if (this.f56590e != null) {
                this.f56588d += m79525G0();
                this.f56590e.position(this.f56592g + 1);
                this.f56590e = null;
                this.f56592g = 0;
                this.f56591f = 0;
            }
        }

        /* renamed from: J */
        public void mo64858J(int i) {
            mo64854z0(i, 4);
        }

        /* renamed from: M0 */
        public void mo64859M0(byte b) {
            ByteBuffer byteBuffer = this.f56590e;
            int i = this.f56592g;
            this.f56592g = i - 1;
            byteBuffer.put(i, b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N0 */
        public void mo64860N0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo64833a0(str.length());
            int length = str.length() - 1;
            this.f56592g -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f56590e.put(this.f56592g + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f56592g--;
                return;
            }
            this.f56592g += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f56592g) >= 0) {
                    ByteBuffer byteBuffer = this.f56590e;
                    this.f56592g = i3 - 1;
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048 && (i2 = this.f56592g) > 0) {
                    ByteBuffer byteBuffer2 = this.f56590e;
                    this.f56592g = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f56590e;
                    int i4 = this.f56592g;
                    this.f56592g = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f56592g) > 1) {
                    ByteBuffer byteBuffer4 = this.f56590e;
                    this.f56592g = i - 1;
                    byteBuffer4.put(i, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f56590e;
                    int i5 = this.f56592g;
                    this.f56592g = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f56590e;
                    int i6 = this.f56592g;
                    this.f56592g = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> 12) | 480));
                } else if (this.f56592g > 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            ByteBuffer byteBuffer7 = this.f56590e;
                            int i7 = this.f56592g;
                            this.f56592g = i7 - 1;
                            byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                            ByteBuffer byteBuffer8 = this.f56590e;
                            int i8 = this.f56592g;
                            this.f56592g = i8 - 1;
                            byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                            ByteBuffer byteBuffer9 = this.f56590e;
                            int i9 = this.f56592g;
                            this.f56592g = i9 - 1;
                            byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                            ByteBuffer byteBuffer10 = this.f56590e;
                            int i10 = this.f56592g;
                            this.f56592g = i10 - 1;
                            byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    mo64833a0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: O */
        public void mo64861O(int i, int i2) {
            mo64833a0(10);
            mo64849t0(i2);
            mo64854z0(i, 0);
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) {
            if (m79529L0() < i2) {
                m79527J0(i2);
            }
            int i3 = this.f56592g - i2;
            this.f56592g = i3;
            this.f56590e.position(i3 + 1);
            this.f56590e.put(bArr, i, i2);
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (m79529L0() < remaining) {
                this.f56588d += remaining;
                this.f56587c.addFirst(AllocatedBuffer.m79318i(byteBuffer));
                m79526I0();
                return;
            }
            int i = this.f56592g - remaining;
            this.f56592g = i;
            this.f56590e.position(i + 1);
            this.f56590e.put(byteBuffer);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) {
            if (m79529L0() < i2) {
                this.f56588d += i2;
                this.f56587c.addFirst(AllocatedBuffer.m79320k(bArr, i, i2));
                m79526I0();
                return;
            }
            int i3 = this.f56592g - i2;
            this.f56592g = i3;
            this.f56590e.position(i3 + 1);
            this.f56590e.put(bArr, i, i2);
        }

        /* renamed from: V */
        public int mo64827V() {
            return this.f56588d + m79525G0();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public void mo64833a0(int i) {
            if (m79529L0() < i) {
                m79527J0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public void mo64835b0(boolean z) {
            mo64859M0(z ? (byte) 1 : 0);
        }

        /* renamed from: d */
        public void mo64865d(int i, int i2) {
            mo64833a0(9);
            mo64838g0(i2);
            mo64854z0(i, 5);
        }

        /* renamed from: f */
        public void mo64866f(int i, String str) {
            int V = mo64827V();
            mo64860N0(str);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* renamed from: g */
        public void mo64867g(int i, long j) {
            mo64833a0(15);
            mo64818F0(j);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public void mo64838g0(int i) {
            int i2 = this.f56592g - 4;
            this.f56592g = i2;
            this.f56590e.putInt(i2 + 1, i);
        }

        /* renamed from: i */
        public void mo64868i(int i, Object obj, Schema schema) throws IOException {
            mo64854z0(i, 4);
            schema.mo65347d(obj, this);
            mo64854z0(i, 3);
        }

        /* renamed from: j */
        public void mo64869j(int i, ByteString byteString) {
            try {
                byteString.mo64925i0(this);
                mo64833a0(10);
                mo64816E0(byteString.size());
                mo64854z0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j0 */
        public void mo64840j0(long j) {
            int i = this.f56592g - 8;
            this.f56592g = i;
            this.f56590e.putLong(i + 1, j);
        }

        /* renamed from: k */
        public void mo64870k(int i, int i2) {
            mo64833a0(15);
            mo64845o0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public void mo64845o0(int i) {
            if (i >= 0) {
                mo64816E0(i);
            } else {
                mo64818F0((long) i);
            }
        }

        /* renamed from: p */
        public void mo64871p(int i, long j) {
            mo64833a0(15);
            mo64852w0(j);
            mo64854z0(i, 0);
        }

        /* renamed from: s */
        public void mo64872s(int i, int i2) {
            mo64833a0(10);
            mo64816E0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t0 */
        public void mo64849t0(int i) {
            mo64816E0(CodedOutputStream.m80098S0(i));
        }

        /* renamed from: w */
        public void mo64873w(int i, Object obj, Schema schema) throws IOException {
            int V = mo64827V();
            schema.mo65347d(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w0 */
        public void mo64852w0(long j) {
            mo64818F0(CodedOutputStream.m80100T0(j));
        }

        /* renamed from: x */
        public void mo64874x(int i, long j) {
            mo64833a0(13);
            mo64840j0(j);
            mo64854z0(i, 1);
        }

        /* renamed from: z */
        public void mo64875z(int i, Object obj) throws IOException {
            int V = mo64827V();
            Protobuf.m81041a().mo65368f(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z0 */
        public void mo64854z0(int i, int i2) {
            mo64816E0(WireFormat.m81549c(i, i2));
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {

        /* renamed from: e */
        private AllocatedBuffer f56593e;

        /* renamed from: f */
        private byte[] f56594f;

        /* renamed from: g */
        private int f56595g;

        /* renamed from: h */
        private int f56596h;

        /* renamed from: i */
        private int f56597i;

        /* renamed from: j */
        private int f56598j;

        /* renamed from: k */
        private int f56599k;

        /* renamed from: I0 */
        private void m79578I0() {
            m79580K0(mo64830Y());
        }

        /* renamed from: J0 */
        private void m79579J0(int i) {
            m79580K0(mo64831Z(i));
        }

        /* renamed from: K0 */
        private void m79580K0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.mo64760c()) {
                mo64877H0();
                this.f56587c.addFirst(allocatedBuffer);
                this.f56593e = allocatedBuffer;
                this.f56594f = allocatedBuffer.mo64758a();
                int b = allocatedBuffer.mo64759b();
                this.f56596h = allocatedBuffer.mo64762e() + b;
                int g = b + allocatedBuffer.mo64764g();
                this.f56595g = g;
                this.f56597i = g - 1;
                int i = this.f56596h - 1;
                this.f56598j = i;
                this.f56599k = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: O0 */
        private void m79581O0(int i) {
            byte[] bArr = this.f56594f;
            int i2 = this.f56599k;
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) (i >>> 28);
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) (((i >>> 21) & 127) | 128);
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) (((i >>> 14) & 127) | 128);
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) (((i >>> 7) & 127) | 128);
            this.f56599k = i6 - 1;
            bArr[i6] = (byte) ((i & 127) | 128);
        }

        /* renamed from: P0 */
        private void m79582P0(int i) {
            byte[] bArr = this.f56594f;
            int i2 = this.f56599k;
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) (i >>> 21);
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) (((i >>> 14) & 127) | 128);
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) (((i >>> 7) & 127) | 128);
            this.f56599k = i5 - 1;
            bArr[i5] = (byte) ((i & 127) | 128);
        }

        /* renamed from: Q0 */
        private void m79583Q0(int i) {
            byte[] bArr = this.f56594f;
            int i2 = this.f56599k;
            this.f56599k = i2 - 1;
            bArr[i2] = (byte) i;
        }

        /* renamed from: R0 */
        private void m79584R0(int i) {
            byte[] bArr = this.f56594f;
            int i2 = this.f56599k;
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) (i >>> 14);
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) (((i >>> 7) & 127) | 128);
            this.f56599k = i4 - 1;
            bArr[i4] = (byte) ((i & 127) | 128);
        }

        /* renamed from: S0 */
        private void m79585S0(int i) {
            byte[] bArr = this.f56594f;
            int i2 = this.f56599k;
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) (i >>> 7);
            this.f56599k = i3 - 1;
            bArr[i3] = (byte) ((i & 127) | 128);
        }

        /* renamed from: T0 */
        private void m79586T0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 49));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i7 = i6 - 1;
            this.f56599k = i7;
            bArr[i6] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i8 = i7 - 1;
            this.f56599k = i8;
            bArr[i7] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i8 - 1;
            bArr[i8] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: U0 */
        private void m79587U0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 28));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i5 - 1;
            bArr[i5] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: V0 */
        private void m79588V0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 21));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i4 - 1;
            bArr[i4] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: W0 */
        private void m79589W0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 56));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 49) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i7 = i6 - 1;
            this.f56599k = i7;
            bArr[i6] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i8 = i7 - 1;
            this.f56599k = i8;
            bArr[i7] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i9 = i8 - 1;
            this.f56599k = i9;
            bArr[i8] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i9 - 1;
            bArr[i9] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: X0 */
        private void m79590X0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            this.f56599k = i - 1;
            bArr[i] = (byte) ((int) j);
        }

        /* renamed from: Y0 */
        private void m79591Y0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 42));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i7 = i6 - 1;
            this.f56599k = i7;
            bArr[i6] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i7 - 1;
            bArr[i7] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: Z0 */
        private void m79592Z0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 35));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i6 - 1;
            bArr[i6] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: a1 */
        private void m79593a1(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 63));
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 56) & 127) | 128));
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((int) (((j >>> 49) & 127) | 128));
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((int) (((j >>> 42) & 127) | 128));
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) ((int) (((j >>> 35) & 127) | 128));
            int i7 = i6 - 1;
            this.f56599k = i7;
            bArr[i6] = (byte) ((int) (((j >>> 28) & 127) | 128));
            int i8 = i7 - 1;
            this.f56599k = i8;
            bArr[i7] = (byte) ((int) (((j >>> 21) & 127) | 128));
            int i9 = i8 - 1;
            this.f56599k = i9;
            bArr[i8] = (byte) ((int) (((j >>> 14) & 127) | 128));
            int i10 = i9 - 1;
            this.f56599k = i10;
            bArr[i9] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i10 - 1;
            bArr[i10] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: b1 */
        private void m79594b1(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) (((int) j) >>> 14);
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((int) (((j >>> 7) & 127) | 128));
            this.f56599k = i3 - 1;
            bArr[i3] = (byte) ((int) ((j & 127) | 128));
        }

        /* renamed from: c1 */
        private void m79595c1(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) ((int) (j >>> 7));
            this.f56599k = i2 - 1;
            bArr[i2] = (byte) ((((int) j) & 127) | 128);
        }

        /* renamed from: B */
        public void mo64855B(int i, boolean z) throws IOException {
            mo64833a0(6);
            mo64879M0(z ? (byte) 1 : 0);
            mo64854z0(i, 0);
        }

        /* renamed from: D */
        public void mo64856D(int i) {
            mo64854z0(i, 3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E0 */
        public void mo64816E0(int i) {
            if ((i & -128) == 0) {
                m79583Q0(i);
            } else if ((i & -16384) == 0) {
                m79585S0(i);
            } else if ((-2097152 & i) == 0) {
                m79584R0(i);
            } else if ((-268435456 & i) == 0) {
                m79582P0(i);
            } else {
                m79581O0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F0 */
        public void mo64818F0(long j) {
            switch (BinaryWriter.m79464U(j)) {
                case 1:
                    m79590X0(j);
                    return;
                case 2:
                    m79595c1(j);
                    return;
                case 3:
                    m79594b1(j);
                    return;
                case 4:
                    m79588V0(j);
                    return;
                case 5:
                    m79587U0(j);
                    return;
                case 6:
                    m79592Z0(j);
                    return;
                case 7:
                    m79591Y0(j);
                    return;
                case 8:
                    m79586T0(j);
                    return;
                case 9:
                    m79589W0(j);
                    return;
                case 10:
                    m79593a1(j);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G0 */
        public int mo64876G0() {
            return this.f56598j - this.f56599k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H0 */
        public void mo64877H0() {
            if (this.f56593e != null) {
                this.f56588d += mo64876G0();
                AllocatedBuffer allocatedBuffer = this.f56593e;
                allocatedBuffer.mo64765h((this.f56599k - allocatedBuffer.mo64759b()) + 1);
                this.f56593e = null;
                this.f56599k = 0;
                this.f56598j = 0;
            }
        }

        /* renamed from: J */
        public void mo64858J(int i) {
            mo64854z0(i, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L0 */
        public int mo64878L0() {
            return this.f56599k - this.f56597i;
        }

        /* renamed from: M0 */
        public void mo64879M0(byte b) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            this.f56599k = i - 1;
            bArr[i] = b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N0 */
        public void mo64880N0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            mo64833a0(str.length());
            int length = str.length() - 1;
            this.f56599k -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f56594f[this.f56599k + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f56599k--;
                return;
            }
            this.f56599k += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.f56599k) > this.f56597i) {
                    byte[] bArr = this.f56594f;
                    this.f56599k = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.f56599k) > this.f56595g) {
                    byte[] bArr2 = this.f56594f;
                    int i4 = i2 - 1;
                    this.f56599k = i4;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.f56599k = i4 - 1;
                    bArr2[i4] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.f56599k) > this.f56595g + 1) {
                    byte[] bArr3 = this.f56594f;
                    int i5 = i - 1;
                    this.f56599k = i5;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    int i6 = i5 - 1;
                    this.f56599k = i6;
                    bArr3[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f56599k = i6 - 1;
                    bArr3[i6] = (byte) ((charAt2 >>> 12) | 480);
                } else if (this.f56599k > this.f56595g + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.f56594f;
                            int i7 = this.f56599k;
                            int i8 = i7 - 1;
                            this.f56599k = i8;
                            bArr4[i7] = (byte) ((codePoint & 63) | 128);
                            int i9 = i8 - 1;
                            this.f56599k = i9;
                            bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i10 = i9 - 1;
                            this.f56599k = i10;
                            bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.f56599k = i10 - 1;
                            bArr4[i10] = (byte) ((codePoint >>> 18) | 240);
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    mo64833a0(length);
                    length++;
                }
                length--;
            }
        }

        /* renamed from: O */
        public void mo64861O(int i, int i2) throws IOException {
            mo64833a0(10);
            mo64849t0(i2);
            mo64854z0(i, 0);
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) {
            if (mo64878L0() < i2) {
                m79579J0(i2);
            }
            int i3 = this.f56599k - i2;
            this.f56599k = i3;
            System.arraycopy(bArr, i, this.f56594f, i3 + 1, i2);
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo64878L0() < remaining) {
                this.f56588d += remaining;
                this.f56587c.addFirst(AllocatedBuffer.m79318i(byteBuffer));
                m79578I0();
            }
            int i = this.f56599k - remaining;
            this.f56599k = i;
            byteBuffer.get(this.f56594f, i + 1, remaining);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) {
            if (mo64878L0() < i2) {
                this.f56588d += i2;
                this.f56587c.addFirst(AllocatedBuffer.m79320k(bArr, i, i2));
                m79578I0();
                return;
            }
            int i3 = this.f56599k - i2;
            this.f56599k = i3;
            System.arraycopy(bArr, i, this.f56594f, i3 + 1, i2);
        }

        /* renamed from: V */
        public int mo64827V() {
            return this.f56588d + mo64876G0();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public void mo64833a0(int i) {
            if (mo64878L0() < i) {
                m79579J0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public void mo64835b0(boolean z) {
            mo64879M0(z ? (byte) 1 : 0);
        }

        /* renamed from: d */
        public void mo64865d(int i, int i2) throws IOException {
            mo64833a0(9);
            mo64838g0(i2);
            mo64854z0(i, 5);
        }

        /* renamed from: f */
        public void mo64866f(int i, String str) throws IOException {
            int V = mo64827V();
            mo64880N0(str);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* renamed from: g */
        public void mo64867g(int i, long j) throws IOException {
            mo64833a0(15);
            mo64818F0(j);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public void mo64838g0(int i) {
            byte[] bArr = this.f56594f;
            int i2 = this.f56599k;
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) ((i >> 24) & 255);
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) ((i >> 16) & 255);
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) ((i >> 8) & 255);
            this.f56599k = i5 - 1;
            bArr[i5] = (byte) (i & 255);
        }

        /* renamed from: i */
        public void mo64868i(int i, Object obj, Schema schema) throws IOException {
            mo64854z0(i, 4);
            schema.mo65347d(obj, this);
            mo64854z0(i, 3);
        }

        /* renamed from: j */
        public void mo64869j(int i, ByteString byteString) throws IOException {
            try {
                byteString.mo64925i0(this);
                mo64833a0(10);
                mo64816E0(byteString.size());
                mo64854z0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j0 */
        public void mo64840j0(long j) {
            byte[] bArr = this.f56594f;
            int i = this.f56599k;
            int i2 = i - 1;
            this.f56599k = i2;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            int i3 = i2 - 1;
            this.f56599k = i3;
            bArr[i2] = (byte) (((int) (j >> 48)) & 255);
            int i4 = i3 - 1;
            this.f56599k = i4;
            bArr[i3] = (byte) (((int) (j >> 40)) & 255);
            int i5 = i4 - 1;
            this.f56599k = i5;
            bArr[i4] = (byte) (((int) (j >> 32)) & 255);
            int i6 = i5 - 1;
            this.f56599k = i6;
            bArr[i5] = (byte) (((int) (j >> 24)) & 255);
            int i7 = i6 - 1;
            this.f56599k = i7;
            bArr[i6] = (byte) (((int) (j >> 16)) & 255);
            int i8 = i7 - 1;
            this.f56599k = i8;
            bArr[i7] = (byte) (((int) (j >> 8)) & 255);
            this.f56599k = i8 - 1;
            bArr[i8] = (byte) (((int) j) & 255);
        }

        /* renamed from: k */
        public void mo64870k(int i, int i2) throws IOException {
            mo64833a0(15);
            mo64845o0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public void mo64845o0(int i) {
            if (i >= 0) {
                mo64816E0(i);
            } else {
                mo64818F0((long) i);
            }
        }

        /* renamed from: p */
        public void mo64871p(int i, long j) throws IOException {
            mo64833a0(15);
            mo64852w0(j);
            mo64854z0(i, 0);
        }

        /* renamed from: s */
        public void mo64872s(int i, int i2) throws IOException {
            mo64833a0(10);
            mo64816E0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t0 */
        public void mo64849t0(int i) {
            mo64816E0(CodedOutputStream.m80098S0(i));
        }

        /* renamed from: w */
        public void mo64873w(int i, Object obj, Schema schema) throws IOException {
            int V = mo64827V();
            schema.mo65347d(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w0 */
        public void mo64852w0(long j) {
            mo64818F0(CodedOutputStream.m80100T0(j));
        }

        /* renamed from: x */
        public void mo64874x(int i, long j) throws IOException {
            mo64833a0(13);
            mo64840j0(j);
            mo64854z0(i, 1);
        }

        /* renamed from: z */
        public void mo64875z(int i, Object obj) throws IOException {
            int V = mo64827V();
            Protobuf.m81041a().mo65368f(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z0 */
        public void mo64854z0(int i, int i2) {
            mo64816E0(WireFormat.m81549c(i, i2));
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {

        /* renamed from: e */
        private ByteBuffer f56600e;

        /* renamed from: f */
        private long f56601f;

        /* renamed from: g */
        private long f56602g;

        /* renamed from: h */
        private long f56603h;

        /* renamed from: G0 */
        private int m79630G0() {
            return (int) (this.f56603h - this.f56601f);
        }

        /* renamed from: H0 */
        private int m79631H0() {
            return (int) (this.f56602g - this.f56603h);
        }

        /* renamed from: J0 */
        private void m79632J0() {
            m79634L0(mo64828W());
        }

        /* renamed from: K0 */
        private void m79633K0(int i) {
            m79634L0(mo64829X(i));
        }

        /* renamed from: L0 */
        private void m79634L0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.mo64761d()) {
                ByteBuffer f = allocatedBuffer.mo64763f();
                if (f.isDirect()) {
                    mo64881I0();
                    this.f56587c.addFirst(allocatedBuffer);
                    this.f56600e = f;
                    f.limit(f.capacity());
                    this.f56600e.position(0);
                    long i = UnsafeUtil.m81387i(this.f56600e);
                    this.f56601f = i;
                    long limit = i + ((long) (this.f56600e.limit() - 1));
                    this.f56602g = limit;
                    this.f56603h = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        /* renamed from: M0 */
        private int m79635M0() {
            return m79630G0() + 1;
        }

        /* renamed from: P0 */
        private void m79636P0(int i) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, (byte) (i >>> 28));
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: Q0 */
        private void m79637Q0(int i) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, (byte) (i >>> 21));
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: R0 */
        private void m79638R0(int i) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, (byte) i);
        }

        /* renamed from: S0 */
        private void m79639S0(int i) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, (byte) (i >>> 14));
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: T0 */
        private void m79640T0(int i) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, (byte) (i >>> 7));
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: U0 */
        private void m79641U0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 49)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j7 = this.f56603h;
            this.f56603h = j7 - 1;
            UnsafeUtil.m81368N(j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j8 = this.f56603h;
            this.f56603h = j8 - 1;
            UnsafeUtil.m81368N(j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j9 = this.f56603h;
            this.f56603h = j9 - 1;
            UnsafeUtil.m81368N(j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: V0 */
        private void m79642V0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 28)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: W0 */
        private void m79643W0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 21)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: X0 */
        private void m79644X0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 56)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j7 = this.f56603h;
            this.f56603h = j7 - 1;
            UnsafeUtil.m81368N(j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j8 = this.f56603h;
            this.f56603h = j8 - 1;
            UnsafeUtil.m81368N(j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j9 = this.f56603h;
            this.f56603h = j9 - 1;
            UnsafeUtil.m81368N(j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j10 = this.f56603h;
            this.f56603h = j10 - 1;
            UnsafeUtil.m81368N(j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: Y0 */
        private void m79645Y0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) j));
        }

        /* renamed from: Z0 */
        private void m79646Z0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 42)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j7 = this.f56603h;
            this.f56603h = j7 - 1;
            UnsafeUtil.m81368N(j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j8 = this.f56603h;
            this.f56603h = j8 - 1;
            UnsafeUtil.m81368N(j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: a1 */
        private void m79647a1(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 35)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j7 = this.f56603h;
            this.f56603h = j7 - 1;
            UnsafeUtil.m81368N(j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: b1 */
        private void m79648b1(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 63)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            long j7 = this.f56603h;
            this.f56603h = j7 - 1;
            UnsafeUtil.m81368N(j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            long j8 = this.f56603h;
            this.f56603h = j8 - 1;
            UnsafeUtil.m81368N(j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            long j9 = this.f56603h;
            this.f56603h = j9 - 1;
            UnsafeUtil.m81368N(j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            long j10 = this.f56603h;
            this.f56603h = j10 - 1;
            UnsafeUtil.m81368N(j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j11 = this.f56603h;
            this.f56603h = j11 - 1;
            UnsafeUtil.m81368N(j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: c1 */
        private void m79649c1(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) (((int) j) >>> 14));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: d1 */
        private void m79650d1(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((int) (j >>> 7)));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: B */
        public void mo64855B(int i, boolean z) {
            mo64833a0(6);
            mo64882N0(z ? (byte) 1 : 0);
            mo64854z0(i, 0);
        }

        /* renamed from: D */
        public void mo64856D(int i) {
            mo64854z0(i, 3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E0 */
        public void mo64816E0(int i) {
            if ((i & -128) == 0) {
                m79638R0(i);
            } else if ((i & -16384) == 0) {
                m79640T0(i);
            } else if ((-2097152 & i) == 0) {
                m79639S0(i);
            } else if ((-268435456 & i) == 0) {
                m79637Q0(i);
            } else {
                m79636P0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F0 */
        public void mo64818F0(long j) {
            switch (BinaryWriter.m79464U(j)) {
                case 1:
                    m79645Y0(j);
                    return;
                case 2:
                    m79650d1(j);
                    return;
                case 3:
                    m79649c1(j);
                    return;
                case 4:
                    m79643W0(j);
                    return;
                case 5:
                    m79642V0(j);
                    return;
                case 6:
                    m79647a1(j);
                    return;
                case 7:
                    m79646Z0(j);
                    return;
                case 8:
                    m79641U0(j);
                    return;
                case 9:
                    m79644X0(j);
                    return;
                case 10:
                    m79648b1(j);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I0 */
        public void mo64881I0() {
            if (this.f56600e != null) {
                this.f56588d += m79631H0();
                this.f56600e.position(m79630G0() + 1);
                this.f56600e = null;
                this.f56603h = 0;
                this.f56602g = 0;
            }
        }

        /* renamed from: J */
        public void mo64858J(int i) {
            mo64854z0(i, 4);
        }

        /* renamed from: N0 */
        public void mo64882N0(byte b) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, b);
        }

        /* renamed from: O */
        public void mo64861O(int i, int i2) {
            mo64833a0(10);
            mo64849t0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void mo64883O0(String str) {
            char charAt;
            mo64833a0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    long j = this.f56603h;
                    this.f56603h = j - 1;
                    UnsafeUtil.m81368N(j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f56603h;
                        if (j2 >= this.f56601f) {
                            this.f56603h = j2 - 1;
                            UnsafeUtil.m81368N(j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f56603h;
                        if (j3 > this.f56601f) {
                            this.f56603h = j3 - 1;
                            UnsafeUtil.m81368N(j3, (byte) ((charAt2 & '?') | 128));
                            long j4 = this.f56603h;
                            this.f56603h = j4 - 1;
                            UnsafeUtil.m81368N(j4, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f56603h;
                        if (j5 > this.f56601f + 1) {
                            this.f56603h = j5 - 1;
                            UnsafeUtil.m81368N(j5, (byte) ((charAt2 & '?') | 128));
                            long j6 = this.f56603h;
                            this.f56603h = j6 - 1;
                            UnsafeUtil.m81368N(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j7 = this.f56603h;
                            this.f56603h = j7 - 1;
                            UnsafeUtil.m81368N(j7, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f56603h > this.f56601f + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j8 = this.f56603h;
                                this.f56603h = j8 - 1;
                                UnsafeUtil.m81368N(j8, (byte) ((codePoint & 63) | 128));
                                long j9 = this.f56603h;
                                this.f56603h = j9 - 1;
                                UnsafeUtil.m81368N(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j10 = this.f56603h;
                                this.f56603h = j10 - 1;
                                UnsafeUtil.m81368N(j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = this.f56603h;
                                this.f56603h = j11 - 1;
                                UnsafeUtil.m81368N(j11, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo64833a0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) {
            if (m79635M0() < i2) {
                m79633K0(i2);
            }
            this.f56603h -= (long) i2;
            this.f56600e.position(m79630G0() + 1);
            this.f56600e.put(bArr, i, i2);
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (m79635M0() < remaining) {
                this.f56588d += remaining;
                this.f56587c.addFirst(AllocatedBuffer.m79318i(byteBuffer));
                m79632J0();
                return;
            }
            this.f56603h -= (long) remaining;
            this.f56600e.position(m79630G0() + 1);
            this.f56600e.put(byteBuffer);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) {
            if (m79635M0() < i2) {
                this.f56588d += i2;
                this.f56587c.addFirst(AllocatedBuffer.m79320k(bArr, i, i2));
                m79632J0();
                return;
            }
            this.f56603h -= (long) i2;
            this.f56600e.position(m79630G0() + 1);
            this.f56600e.put(bArr, i, i2);
        }

        /* renamed from: V */
        public int mo64827V() {
            return this.f56588d + m79631H0();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public void mo64833a0(int i) {
            if (m79635M0() < i) {
                m79633K0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public void mo64835b0(boolean z) {
            mo64882N0(z ? (byte) 1 : 0);
        }

        /* renamed from: d */
        public void mo64865d(int i, int i2) {
            mo64833a0(9);
            mo64838g0(i2);
            mo64854z0(i, 5);
        }

        /* renamed from: f */
        public void mo64866f(int i, String str) {
            int V = mo64827V();
            mo64883O0(str);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* renamed from: g */
        public void mo64867g(int i, long j) {
            mo64833a0(15);
            mo64818F0(j);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public void mo64838g0(int i) {
            long j = this.f56603h;
            this.f56603h = j - 1;
            UnsafeUtil.m81368N(j, (byte) ((i >> 24) & 255));
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) ((i >> 16) & 255));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) ((i >> 8) & 255));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) (i & 255));
        }

        /* renamed from: i */
        public void mo64868i(int i, Object obj, Schema schema) throws IOException {
            mo64854z0(i, 4);
            schema.mo65347d(obj, this);
            mo64854z0(i, 3);
        }

        /* renamed from: j */
        public void mo64869j(int i, ByteString byteString) {
            try {
                byteString.mo64925i0(this);
                mo64833a0(10);
                mo64816E0(byteString.size());
                mo64854z0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j0 */
        public void mo64840j0(long j) {
            long j2 = this.f56603h;
            this.f56603h = j2 - 1;
            UnsafeUtil.m81368N(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.f56603h;
            this.f56603h = j3 - 1;
            UnsafeUtil.m81368N(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.f56603h;
            this.f56603h = j4 - 1;
            UnsafeUtil.m81368N(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.f56603h;
            this.f56603h = j5 - 1;
            UnsafeUtil.m81368N(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.f56603h;
            this.f56603h = j6 - 1;
            UnsafeUtil.m81368N(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.f56603h;
            this.f56603h = j7 - 1;
            UnsafeUtil.m81368N(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.f56603h;
            this.f56603h = j8 - 1;
            UnsafeUtil.m81368N(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.f56603h;
            this.f56603h = j9 - 1;
            UnsafeUtil.m81368N(j9, (byte) (((int) j) & 255));
        }

        /* renamed from: k */
        public void mo64870k(int i, int i2) {
            mo64833a0(15);
            mo64845o0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public void mo64845o0(int i) {
            if (i >= 0) {
                mo64816E0(i);
            } else {
                mo64818F0((long) i);
            }
        }

        /* renamed from: p */
        public void mo64871p(int i, long j) {
            mo64833a0(15);
            mo64852w0(j);
            mo64854z0(i, 0);
        }

        /* renamed from: s */
        public void mo64872s(int i, int i2) {
            mo64833a0(10);
            mo64816E0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t0 */
        public void mo64849t0(int i) {
            mo64816E0(CodedOutputStream.m80098S0(i));
        }

        /* renamed from: w */
        public void mo64873w(int i, Object obj, Schema schema) throws IOException {
            int V = mo64827V();
            schema.mo65347d(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w0 */
        public void mo64852w0(long j) {
            mo64818F0(CodedOutputStream.m80100T0(j));
        }

        /* renamed from: x */
        public void mo64874x(int i, long j) {
            mo64833a0(13);
            mo64840j0(j);
            mo64854z0(i, 1);
        }

        /* renamed from: z */
        public void mo64875z(int i, Object obj) throws IOException {
            int V = mo64827V();
            Protobuf.m81041a().mo65368f(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z0 */
        public void mo64854z0(int i, int i2) {
            mo64816E0(WireFormat.m81549c(i, i2));
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {

        /* renamed from: e */
        private AllocatedBuffer f56604e;

        /* renamed from: f */
        private byte[] f56605f;

        /* renamed from: g */
        private long f56606g;

        /* renamed from: h */
        private long f56607h;

        /* renamed from: i */
        private long f56608i;

        /* renamed from: j */
        private long f56609j;

        /* renamed from: k */
        private long f56610k;

        /* renamed from: G0 */
        private int m79683G0() {
            return (int) this.f56610k;
        }

        /* renamed from: J0 */
        private void m79684J0() {
            m79686L0(mo64830Y());
        }

        /* renamed from: K0 */
        private void m79685K0(int i) {
            m79686L0(mo64831Z(i));
        }

        /* renamed from: L0 */
        private void m79686L0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.mo64760c()) {
                mo64885I0();
                this.f56587c.addFirst(allocatedBuffer);
                this.f56604e = allocatedBuffer;
                this.f56605f = allocatedBuffer.mo64758a();
                int b = allocatedBuffer.mo64759b();
                this.f56607h = (long) (allocatedBuffer.mo64762e() + b);
                long g = (long) (b + allocatedBuffer.mo64764g());
                this.f56606g = g;
                this.f56608i = g - 1;
                long j = this.f56607h - 1;
                this.f56609j = j;
                this.f56610k = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        /* renamed from: P0 */
        private void m79687P0(int i) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr5, j5, (byte) ((i & 127) | 128));
        }

        /* renamed from: Q0 */
        private void m79688Q0(int i) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr4, j4, (byte) ((i & 127) | 128));
        }

        /* renamed from: R0 */
        private void m79689R0(int i) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, (byte) i);
        }

        /* renamed from: S0 */
        private void m79690S0(int i) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr3, j3, (byte) ((i & 127) | 128));
        }

        /* renamed from: T0 */
        private void m79691T0(int i) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr2, j2, (byte) ((i & 127) | 128));
        }

        /* renamed from: U0 */
        private void m79692U0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 49)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr6 = this.f56605f;
            long j7 = this.f56610k;
            this.f56610k = j7 - 1;
            UnsafeUtil.m81369O(bArr6, j7, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr7 = this.f56605f;
            long j8 = this.f56610k;
            this.f56610k = j8 - 1;
            UnsafeUtil.m81369O(bArr7, j8, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr8 = this.f56605f;
            long j9 = this.f56610k;
            this.f56610k = j9 - 1;
            UnsafeUtil.m81369O(bArr8, j9, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: V0 */
        private void m79693V0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 28)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: W0 */
        private void m79694W0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 21)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: X0 */
        private void m79695X0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 56)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr6 = this.f56605f;
            long j7 = this.f56610k;
            this.f56610k = j7 - 1;
            UnsafeUtil.m81369O(bArr6, j7, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr7 = this.f56605f;
            long j8 = this.f56610k;
            this.f56610k = j8 - 1;
            UnsafeUtil.m81369O(bArr7, j8, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr8 = this.f56605f;
            long j9 = this.f56610k;
            this.f56610k = j9 - 1;
            UnsafeUtil.m81369O(bArr8, j9, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr9 = this.f56605f;
            long j10 = this.f56610k;
            this.f56610k = j10 - 1;
            UnsafeUtil.m81369O(bArr9, j10, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: Y0 */
        private void m79696Y0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) j));
        }

        /* renamed from: Z0 */
        private void m79697Z0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 42)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr6 = this.f56605f;
            long j7 = this.f56610k;
            this.f56610k = j7 - 1;
            UnsafeUtil.m81369O(bArr6, j7, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr7 = this.f56605f;
            long j8 = this.f56610k;
            this.f56610k = j8 - 1;
            UnsafeUtil.m81369O(bArr7, j8, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: a1 */
        private void m79698a1(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 35)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr6 = this.f56605f;
            long j7 = this.f56610k;
            this.f56610k = j7 - 1;
            UnsafeUtil.m81369O(bArr6, j7, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: b1 */
        private void m79699b1(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 63)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 56) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) (((j >>> 49) & 127) | 128)));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) ((int) (((j >>> 42) & 127) | 128)));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) ((int) (((j >>> 35) & 127) | 128)));
            byte[] bArr6 = this.f56605f;
            long j7 = this.f56610k;
            this.f56610k = j7 - 1;
            UnsafeUtil.m81369O(bArr6, j7, (byte) ((int) (((j >>> 28) & 127) | 128)));
            byte[] bArr7 = this.f56605f;
            long j8 = this.f56610k;
            this.f56610k = j8 - 1;
            UnsafeUtil.m81369O(bArr7, j8, (byte) ((int) (((j >>> 21) & 127) | 128)));
            byte[] bArr8 = this.f56605f;
            long j9 = this.f56610k;
            this.f56610k = j9 - 1;
            UnsafeUtil.m81369O(bArr8, j9, (byte) ((int) (((j >>> 14) & 127) | 128)));
            byte[] bArr9 = this.f56605f;
            long j10 = this.f56610k;
            this.f56610k = j10 - 1;
            UnsafeUtil.m81369O(bArr9, j10, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr10 = this.f56605f;
            long j11 = this.f56610k;
            this.f56610k = j11 - 1;
            UnsafeUtil.m81369O(bArr10, j11, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: c1 */
        private void m79700c1(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((int) (((j >>> 7) & 127) | 128)));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) ((int) ((j & 127) | 128)));
        }

        /* renamed from: d1 */
        private void m79701d1(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) ((int) (j >>> 7)));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        /* renamed from: B */
        public void mo64855B(int i, boolean z) {
            mo64833a0(6);
            mo64887N0(z ? (byte) 1 : 0);
            mo64854z0(i, 0);
        }

        /* renamed from: D */
        public void mo64856D(int i) {
            mo64854z0(i, 3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E0 */
        public void mo64816E0(int i) {
            if ((i & -128) == 0) {
                m79689R0(i);
            } else if ((i & -16384) == 0) {
                m79691T0(i);
            } else if ((-2097152 & i) == 0) {
                m79690S0(i);
            } else if ((-268435456 & i) == 0) {
                m79688Q0(i);
            } else {
                m79687P0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F0 */
        public void mo64818F0(long j) {
            switch (BinaryWriter.m79464U(j)) {
                case 1:
                    m79696Y0(j);
                    return;
                case 2:
                    m79701d1(j);
                    return;
                case 3:
                    m79700c1(j);
                    return;
                case 4:
                    m79694W0(j);
                    return;
                case 5:
                    m79693V0(j);
                    return;
                case 6:
                    m79698a1(j);
                    return;
                case 7:
                    m79697Z0(j);
                    return;
                case 8:
                    m79692U0(j);
                    return;
                case 9:
                    m79695X0(j);
                    return;
                case 10:
                    m79699b1(j);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H0 */
        public int mo64884H0() {
            return (int) (this.f56609j - this.f56610k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I0 */
        public void mo64885I0() {
            if (this.f56604e != null) {
                this.f56588d += mo64884H0();
                this.f56604e.mo64765h((m79683G0() - this.f56604e.mo64759b()) + 1);
                this.f56604e = null;
                this.f56610k = 0;
                this.f56609j = 0;
            }
        }

        /* renamed from: J */
        public void mo64858J(int i) {
            mo64854z0(i, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M0 */
        public int mo64886M0() {
            return (int) (this.f56610k - this.f56608i);
        }

        /* renamed from: N0 */
        public void mo64887N0(byte b) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, b);
        }

        /* renamed from: O */
        public void mo64861O(int i, int i2) {
            mo64833a0(10);
            mo64849t0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void mo64888O0(String str) {
            char charAt;
            mo64833a0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    byte[] bArr = this.f56605f;
                    long j = this.f56610k;
                    this.f56610k = j - 1;
                    UnsafeUtil.m81369O(bArr, j, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.f56610k;
                        if (j2 > this.f56608i) {
                            byte[] bArr2 = this.f56605f;
                            this.f56610k = j2 - 1;
                            UnsafeUtil.m81369O(bArr2, j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.f56610k;
                        if (j3 > this.f56606g) {
                            byte[] bArr3 = this.f56605f;
                            this.f56610k = j3 - 1;
                            UnsafeUtil.m81369O(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.f56605f;
                            long j4 = this.f56610k;
                            this.f56610k = j4 - 1;
                            UnsafeUtil.m81369O(bArr4, j4, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.f56610k;
                        if (j5 > this.f56606g + 1) {
                            byte[] bArr5 = this.f56605f;
                            this.f56610k = j5 - 1;
                            UnsafeUtil.m81369O(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.f56605f;
                            long j6 = this.f56610k;
                            this.f56610k = j6 - 1;
                            UnsafeUtil.m81369O(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.f56605f;
                            long j7 = this.f56610k;
                            this.f56610k = j7 - 1;
                            UnsafeUtil.m81369O(bArr7, j7, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f56610k > this.f56606g + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.f56605f;
                                long j8 = this.f56610k;
                                this.f56610k = j8 - 1;
                                UnsafeUtil.m81369O(bArr8, j8, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.f56605f;
                                long j9 = this.f56610k;
                                this.f56610k = j9 - 1;
                                UnsafeUtil.m81369O(bArr9, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.f56605f;
                                long j10 = this.f56610k;
                                this.f56610k = j10 - 1;
                                UnsafeUtil.m81369O(bArr10, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.f56605f;
                                long j11 = this.f56610k;
                                this.f56610k = j11 - 1;
                                UnsafeUtil.m81369O(bArr11, j11, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo64833a0(length);
                    length++;
                    length--;
                }
            }
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            mo64833a0(i2);
            this.f56610k -= (long) i2;
            System.arraycopy(bArr, i, this.f56605f, m79683G0() + 1, i2);
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (mo64886M0() < remaining) {
                this.f56588d += remaining;
                this.f56587c.addFirst(AllocatedBuffer.m79318i(byteBuffer));
                m79684J0();
            }
            this.f56610k -= (long) remaining;
            byteBuffer.get(this.f56605f, m79683G0() + 1, remaining);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else if (mo64886M0() < i2) {
                this.f56588d += i2;
                this.f56587c.addFirst(AllocatedBuffer.m79320k(bArr, i, i2));
                m79684J0();
            } else {
                this.f56610k -= (long) i2;
                System.arraycopy(bArr, i, this.f56605f, m79683G0() + 1, i2);
            }
        }

        /* renamed from: V */
        public int mo64827V() {
            return this.f56588d + mo64884H0();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public void mo64833a0(int i) {
            if (mo64886M0() < i) {
                m79685K0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public void mo64835b0(boolean z) {
            mo64887N0(z ? (byte) 1 : 0);
        }

        /* renamed from: d */
        public void mo64865d(int i, int i2) {
            mo64833a0(9);
            mo64838g0(i2);
            mo64854z0(i, 5);
        }

        /* renamed from: f */
        public void mo64866f(int i, String str) {
            int V = mo64827V();
            mo64888O0(str);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* renamed from: g */
        public void mo64867g(int i, long j) {
            mo64833a0(15);
            mo64818F0(j);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public void mo64838g0(int i) {
            byte[] bArr = this.f56605f;
            long j = this.f56610k;
            this.f56610k = j - 1;
            UnsafeUtil.m81369O(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr4, j4, (byte) (i & 255));
        }

        /* renamed from: i */
        public void mo64868i(int i, Object obj, Schema schema) throws IOException {
            mo64854z0(i, 4);
            schema.mo65347d(obj, this);
            mo64854z0(i, 3);
        }

        /* renamed from: j */
        public void mo64869j(int i, ByteString byteString) {
            try {
                byteString.mo64925i0(this);
                mo64833a0(10);
                mo64816E0(byteString.size());
                mo64854z0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j0 */
        public void mo64840j0(long j) {
            byte[] bArr = this.f56605f;
            long j2 = this.f56610k;
            this.f56610k = j2 - 1;
            UnsafeUtil.m81369O(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.f56605f;
            long j3 = this.f56610k;
            this.f56610k = j3 - 1;
            UnsafeUtil.m81369O(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.f56605f;
            long j4 = this.f56610k;
            this.f56610k = j4 - 1;
            UnsafeUtil.m81369O(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.f56605f;
            long j5 = this.f56610k;
            this.f56610k = j5 - 1;
            UnsafeUtil.m81369O(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.f56605f;
            long j6 = this.f56610k;
            this.f56610k = j6 - 1;
            UnsafeUtil.m81369O(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.f56605f;
            long j7 = this.f56610k;
            this.f56610k = j7 - 1;
            UnsafeUtil.m81369O(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.f56605f;
            long j8 = this.f56610k;
            this.f56610k = j8 - 1;
            UnsafeUtil.m81369O(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.f56605f;
            long j9 = this.f56610k;
            this.f56610k = j9 - 1;
            UnsafeUtil.m81369O(bArr8, j9, (byte) (((int) j) & 255));
        }

        /* renamed from: k */
        public void mo64870k(int i, int i2) {
            mo64833a0(15);
            mo64845o0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public void mo64845o0(int i) {
            if (i >= 0) {
                mo64816E0(i);
            } else {
                mo64818F0((long) i);
            }
        }

        /* renamed from: p */
        public void mo64871p(int i, long j) {
            mo64833a0(15);
            mo64852w0(j);
            mo64854z0(i, 0);
        }

        /* renamed from: s */
        public void mo64872s(int i, int i2) {
            mo64833a0(10);
            mo64816E0(i2);
            mo64854z0(i, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t0 */
        public void mo64849t0(int i) {
            mo64816E0(CodedOutputStream.m80098S0(i));
        }

        /* renamed from: w */
        public void mo64873w(int i, Object obj, Schema schema) throws IOException {
            int V = mo64827V();
            schema.mo65347d(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w0 */
        public void mo64852w0(long j) {
            mo64818F0(CodedOutputStream.m80100T0(j));
        }

        /* renamed from: x */
        public void mo64874x(int i, long j) {
            mo64833a0(13);
            mo64840j0(j);
            mo64854z0(i, 1);
        }

        /* renamed from: z */
        public void mo64875z(int i, Object obj) throws IOException {
            int V = mo64827V();
            Protobuf.m81041a().mo65368f(obj, this);
            mo64833a0(10);
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z0 */
        public void mo64854z0(int i, int i2) {
            mo64816E0(WireFormat.m81549c(i, i2));
        }
    }

    /* renamed from: A0 */
    private final void m79459A0(int i, IntArrayList intArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((intArrayList.size() * 5) + 10);
            int V = mo64827V();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                mo64816E0(intArrayList.mo65221m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            mo64872s(i, intArrayList.mo65221m(size2));
        }
    }

    /* renamed from: B0 */
    private final void m79460B0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 5) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64816E0(list.get(size).intValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64872s(i, list.get(size2).intValue());
        }
    }

    /* renamed from: C0 */
    private final void m79461C0(int i, LongArrayList longArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((longArrayList.size() * 10) + 10);
            int V = mo64827V();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                mo64818F0(longArrayList.mo65311m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            mo64867g(i, longArrayList.mo65311m(size2));
        }
    }

    /* renamed from: D0 */
    private final void m79462D0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 10) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64818F0(list.get(size).longValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64867g(i, list.get(size2).longValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static byte m79464U(long j) {
        byte b;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            b = (byte) 6;
            j >>>= 28;
        } else {
            b = 2;
        }
        if ((-2097152 & j) != 0) {
            b = (byte) (b + 2);
            j >>>= 14;
        }
        return (j & -16384) != 0 ? (byte) (b + 1) : b;
    }

    /* renamed from: c0 */
    private final void m79465c0(int i, BooleanArrayList booleanArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0(booleanArrayList.size() + 10);
            int V = mo64827V();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                mo64835b0(booleanArrayList.mo64896l(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            mo64855B(i, booleanArrayList.mo64896l(size2));
        }
    }

    /* renamed from: d0 */
    private final void m79466d0(int i, List<Boolean> list, boolean z) throws IOException {
        if (z) {
            mo64833a0(list.size() + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64835b0(list.get(size).booleanValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64855B(i, list.get(size2).booleanValue());
        }
    }

    /* renamed from: e0 */
    private final void m79467e0(int i, DoubleArrayList doubleArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((doubleArrayList.size() * 8) + 10);
            int V = mo64827V();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                mo64840j0(Double.doubleToRawLongBits(doubleArrayList.mo65090m(size)));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            mo64848t(i, doubleArrayList.mo65090m(size2));
        }
    }

    /* renamed from: f0 */
    private final void m79468f0(int i, List<Double> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 8) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64840j0(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64848t(i, list.get(size2).doubleValue());
        }
    }

    /* renamed from: h0 */
    private final void m79469h0(int i, IntArrayList intArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((intArrayList.size() * 4) + 10);
            int V = mo64827V();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                mo64838g0(intArrayList.mo65221m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            mo64865d(i, intArrayList.mo65221m(size2));
        }
    }

    /* renamed from: i0 */
    private final void m79470i0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 4) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64838g0(list.get(size).intValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64865d(i, list.get(size2).intValue());
        }
    }

    /* renamed from: k0 */
    private final void m79471k0(int i, LongArrayList longArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((longArrayList.size() * 8) + 10);
            int V = mo64827V();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                mo64840j0(longArrayList.mo65311m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            mo64874x(i, longArrayList.mo65311m(size2));
        }
    }

    /* renamed from: l0 */
    private final void m79472l0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 8) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64840j0(list.get(size).longValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64874x(i, list.get(size2).longValue());
        }
    }

    /* renamed from: m0 */
    private final void m79473m0(int i, FloatArrayList floatArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((floatArrayList.size() * 4) + 10);
            int V = mo64827V();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                mo64838g0(Float.floatToRawIntBits(floatArrayList.mo65159l(size)));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            mo64821I(i, floatArrayList.mo65159l(size2));
        }
    }

    /* renamed from: n0 */
    private final void m79474n0(int i, List<Float> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 4) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64838g0(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64821I(i, list.get(size2).floatValue());
        }
    }

    /* renamed from: p0 */
    private final void m79475p0(int i, IntArrayList intArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((intArrayList.size() * 10) + 10);
            int V = mo64827V();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                mo64845o0(intArrayList.mo65221m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            mo64870k(i, intArrayList.mo65221m(size2));
        }
    }

    /* renamed from: q0 */
    private final void m79476q0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 10) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64845o0(list.get(size).intValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64870k(i, list.get(size2).intValue());
        }
    }

    /* renamed from: r0 */
    private void m79477r0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            mo64866f(i, (String) obj);
        } else {
            mo64869j(i, (ByteString) obj);
        }
    }

    /* renamed from: s0 */
    static final void m79478s0(Writer writer, int i, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C115581.f56589a[fieldType.ordinal()]) {
            case 1:
                writer.mo64855B(i, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.mo64865d(i, ((Integer) obj).intValue());
                return;
            case 3:
                writer.mo64874x(i, ((Long) obj).longValue());
                return;
            case 4:
                writer.mo64870k(i, ((Integer) obj).intValue());
                return;
            case 5:
                writer.mo64813A(i, ((Long) obj).longValue());
                return;
            case 6:
                writer.mo64814C(i, ((Integer) obj).intValue());
                return;
            case 7:
                writer.mo64841l(i, ((Long) obj).longValue());
                return;
            case 8:
                writer.mo64861O(i, ((Integer) obj).intValue());
                return;
            case 9:
                writer.mo64871p(i, ((Long) obj).longValue());
                return;
            case 10:
                writer.mo64866f(i, (String) obj);
                return;
            case 11:
                writer.mo64872s(i, ((Integer) obj).intValue());
                return;
            case 12:
                writer.mo64867g(i, ((Long) obj).longValue());
                return;
            case 13:
                writer.mo64821I(i, ((Float) obj).floatValue());
                return;
            case 14:
                writer.mo64848t(i, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.mo64875z(i, obj);
                return;
            case 16:
                writer.mo64869j(i, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.mo64823L(i, ((Internal.EnumLite) obj).mo60052c());
                    return;
                } else if (obj instanceof Integer) {
                    writer.mo64823L(i, ((Integer) obj).intValue());
                    return;
                } else {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    /* renamed from: u0 */
    private final void m79479u0(int i, IntArrayList intArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((intArrayList.size() * 5) + 10);
            int V = mo64827V();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                mo64849t0(intArrayList.mo65221m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            mo64861O(i, intArrayList.mo65221m(size2));
        }
    }

    /* renamed from: v0 */
    private final void m79480v0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 5) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64849t0(list.get(size).intValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64861O(i, list.get(size2).intValue());
        }
    }

    /* renamed from: x0 */
    private final void m79481x0(int i, LongArrayList longArrayList, boolean z) throws IOException {
        if (z) {
            mo64833a0((longArrayList.size() * 10) + 10);
            int V = mo64827V();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                mo64852w0(longArrayList.mo65311m(size));
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            mo64871p(i, longArrayList.mo65311m(size2));
        }
    }

    /* renamed from: y0 */
    private final void m79482y0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            mo64833a0((list.size() * 10) + 10);
            int V = mo64827V();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo64852w0(list.get(size).longValue());
            }
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64871p(i, list.get(size2).longValue());
        }
    }

    /* renamed from: A */
    public final void mo64813A(int i, long j) throws IOException {
        mo64867g(i, j);
    }

    /* renamed from: C */
    public final void mo64814C(int i, int i2) throws IOException {
        mo64865d(i, i2);
    }

    /* renamed from: E */
    public final void mo64815E(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof LongArrayList) {
            m79471k0(i, (LongArrayList) list, z);
        } else {
            m79472l0(i, list, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public abstract void mo64816E0(int i);

    /* renamed from: F */
    public final void mo64817F(int i, List<Integer> list, boolean z) throws IOException {
        mo64842m(i, list, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public abstract void mo64818F0(long j);

    /* renamed from: G */
    public final void mo64819G(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof BooleanArrayList) {
            m79465c0(i, (BooleanArrayList) list, z);
        } else {
            m79466d0(i, list, z);
        }
    }

    /* renamed from: H */
    public <K, V> void mo64820H(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            int V = mo64827V();
            m79478s0(this, 2, metadata.f57001c, next.getValue());
            m79478s0(this, 1, metadata.f56999a, next.getKey());
            mo64816E0(mo64827V() - V);
            mo64854z0(i, 2);
        }
    }

    /* renamed from: I */
    public final void mo64821I(int i, float f) throws IOException {
        mo64865d(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: K */
    public final void mo64822K(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            m79479u0(i, (IntArrayList) list, z);
        } else {
            m79480v0(i, list, z);
        }
    }

    /* renamed from: L */
    public final void mo64823L(int i, int i2) throws IOException {
        mo64870k(i, i2);
    }

    /* renamed from: M */
    public final void mo64824M(int i, List<Long> list, boolean z) throws IOException {
        mo64851v(i, list, z);
    }

    /* renamed from: N */
    public final void mo64825N(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof DoubleArrayList) {
            m79467e0(i, (DoubleArrayList) list, z);
        } else {
            m79468f0(i, list, z);
        }
    }

    /* renamed from: P */
    public final void mo64826P(int i, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo64869j(i, list.get(size));
        }
    }

    /* renamed from: V */
    public abstract int mo64827V();

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final AllocatedBuffer mo64828W() {
        return this.f56585a.mo64904a(this.f56586b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final AllocatedBuffer mo64829X(int i) {
        return this.f56585a.mo64904a(Math.max(i, this.f56586b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final AllocatedBuffer mo64830Y() {
        return this.f56585a.mo64905b(this.f56586b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final AllocatedBuffer mo64831Z(int i) {
        return this.f56585a.mo64905b(Math.max(i, this.f56586b));
    }

    /* renamed from: a */
    public final void mo64832a(int i, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo64873w(i, list.get(size), schema);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public abstract void mo64833a0(int i);

    /* renamed from: b */
    public final void mo64834b(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof FloatArrayList) {
            m79473m0(i, (FloatArrayList) list, z);
        } else {
            m79474n0(i, list, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public abstract void mo64835b0(boolean z);

    /* renamed from: c */
    public final void mo64836c(int i, Object obj) throws IOException {
        mo64854z0(1, 4);
        if (obj instanceof ByteString) {
            mo64869j(3, (ByteString) obj);
        } else {
            mo64875z(3, obj);
        }
        mo64872s(2, i);
        mo64854z0(1, 3);
    }

    /* renamed from: e */
    public final void mo64837e(int i, List<String> list) throws IOException {
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                m79477r0(i, lazyStringList.mo65273d2(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo64866f(i, list.get(size2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public abstract void mo64838g0(int i);

    /* renamed from: h */
    public final void mo64839h(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            m79475p0(i, (IntArrayList) list, z);
        } else {
            m79476q0(i, list, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public abstract void mo64840j0(long j);

    /* renamed from: l */
    public final void mo64841l(int i, long j) throws IOException {
        mo64874x(i, j);
    }

    /* renamed from: m */
    public final void mo64842m(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            m79469h0(i, (IntArrayList) list, z);
        } else {
            m79470i0(i, list, z);
        }
    }

    /* renamed from: n */
    public final void mo64843n(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            m79459A0(i, (IntArrayList) list, z);
        } else {
            m79460B0(i, list, z);
        }
    }

    /* renamed from: o */
    public final void mo64844o(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof LongArrayList) {
            m79481x0(i, (LongArrayList) list, z);
        } else {
            m79482y0(i, list, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public abstract void mo64845o0(int i);

    /* renamed from: q */
    public final void mo64846q(int i, List<Integer> list, boolean z) throws IOException {
        mo64839h(i, list, z);
    }

    /* renamed from: r */
    public final void mo64847r(int i, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            mo64868i(i, list.get(size), schema);
        }
    }

    /* renamed from: t */
    public final void mo64848t(int i, double d) throws IOException {
        mo64874x(i, Double.doubleToRawLongBits(d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public abstract void mo64849t0(int i);

    /* renamed from: u */
    public final void mo64850u(int i, List<Long> list, boolean z) throws IOException {
        mo64815E(i, list, z);
    }

    /* renamed from: v */
    public final void mo64851v(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof LongArrayList) {
            m79461C0(i, (LongArrayList) list, z);
        } else {
            m79462D0(i, list, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public abstract void mo64852w0(long j);

    /* renamed from: y */
    public final Writer.FieldOrder mo64853y() {
        return Writer.FieldOrder.DESCENDING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public abstract void mo64854z0(int i, int i2);
}
