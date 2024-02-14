package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;
import com.android.p023dx.rop.code.RegisterSpec;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import p097gd.C7354d;

public class BeaconParser implements Serializable {

    /* renamed from: a */
    private static final Pattern f19606a = Pattern.compile("i\\:(\\d+)\\-(\\d+)([blv]*)?");

    /* renamed from: c */
    private static final Pattern f19607c = Pattern.compile("m\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");

    /* renamed from: d */
    private static final Pattern f19608d = Pattern.compile("s\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f\\-]+)");

    /* renamed from: f */
    private static final Pattern f19609f = Pattern.compile("d\\:(\\d+)\\-(\\d+)([bl]*)?");

    /* renamed from: g */
    private static final Pattern f19610g = Pattern.compile("p\\:(\\d+)?\\-(\\d+)?\\:?([\\-\\d]+)?");

    /* renamed from: o */
    private static final Pattern f19611o = Pattern.compile("x");

    /* renamed from: p */
    private static final char[] f19612p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected List<BeaconParser> extraParsers = new ArrayList();
    protected Boolean mAllowPduOverflow = Boolean.TRUE;
    protected String mBeaconLayout;
    protected Integer mDBmCorrection;
    protected final List<Integer> mDataEndOffsets = new ArrayList();
    protected final List<Boolean> mDataLittleEndianFlags = new ArrayList();
    protected final List<Integer> mDataStartOffsets = new ArrayList();
    protected Boolean mExtraFrame;
    protected int[] mHardwareAssistManufacturers = {76};
    protected String mIdentifier;
    protected final List<Integer> mIdentifierEndOffsets = new ArrayList();
    protected final List<Boolean> mIdentifierLittleEndianFlags = new ArrayList();
    protected final List<Integer> mIdentifierStartOffsets = new ArrayList();
    protected final List<Boolean> mIdentifierVariableLengthFlags = new ArrayList();
    protected Integer mLayoutSize;
    private Long mMatchingBeaconTypeCode;
    protected Integer mMatchingBeaconTypeCodeEndOffset;
    protected Integer mMatchingBeaconTypeCodeStartOffset;
    protected Integer mPowerEndOffset;
    protected Integer mPowerStartOffset;
    protected Long mServiceUuid;
    protected byte[] mServiceUuid128Bit = new byte[0];
    protected Integer mServiceUuidEndOffset;
    protected Integer mServiceUuidStartOffset;

    public static class BeaconLayoutException extends RuntimeException {
        public BeaconLayoutException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private String m33543a(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - i;
        int i4 = i3 + 1;
        byte[] bArr2 = new byte[i4];
        if (z) {
            for (int i5 = 0; i5 <= i3; i5++) {
                bArr2[i5] = bArr[((i + i4) - 1) - i5];
            }
        } else {
            for (int i6 = 0; i6 <= i3; i6++) {
                bArr2[i6] = bArr[i + i6];
            }
        }
        if (i4 < 5) {
            long j = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                j += ((long) (bArr2[(i4 - i7) - 1] & 255)) * ((long) Math.pow(256.0d, ((double) i7) * 1.0d));
            }
            return Long.toString(j);
        }
        String d = m33546d(bArr2);
        if (i4 == 16) {
            return d.substring(0, 8) + HelpFormatter.DEFAULT_OPT_PREFIX + d.substring(8, 12) + HelpFormatter.DEFAULT_OPT_PREFIX + d.substring(12, 16) + HelpFormatter.DEFAULT_OPT_PREFIX + d.substring(16, 20) + HelpFormatter.DEFAULT_OPT_PREFIX + d.substring(20, 32);
        }
        return "0x" + d;
    }

    /* renamed from: b */
    private String m33544b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    /* renamed from: c */
    private boolean m33545c(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2.length;
        if (bArr.length - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    protected static String m33546d(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f19612p;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    private int m33547e() {
        List<Integer> list = this.mIdentifierEndOffsets;
        int i = 0;
        if (list != null) {
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                if (intValue2 > i) {
                    i = intValue2;
                }
            }
        }
        List<Integer> list2 = this.mDataEndOffsets;
        if (list2 != null) {
            for (Integer intValue3 : list2) {
                int intValue4 = intValue3.intValue();
                if (intValue4 > i) {
                    i = intValue4;
                }
            }
        }
        Integer num = this.mPowerEndOffset;
        if (num != null && num.intValue() > i) {
            i = this.mPowerEndOffset.intValue();
        }
        Integer num2 = this.mServiceUuidEndOffset;
        if (num2 != null && num2.intValue() > i) {
            i = this.mServiceUuidEndOffset.intValue();
        }
        return i + 1;
    }

    /* renamed from: f */
    private byte[] m33548f(byte[] bArr, int i) {
        if (bArr.length >= i) {
            return bArr;
        }
        return Arrays.copyOf(bArr, i);
    }

    /* renamed from: r */
    public static byte[] m33549r(long j, int i) {
        return m33550t(j, i, true);
    }

    /* renamed from: t */
    public static byte[] m33550t(long j, int i, boolean z) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ((i - (z ? i2 : (i - i2) - 1)) - 1) * 8;
            bArr[i2] = (byte) ((int) ((j & (255 << i3)) >> ((int) ((long) i3))));
        }
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r3 = r3.mIdentifier;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            org.altbeacon.beacon.BeaconParser r3 = (org.altbeacon.beacon.BeaconParser) r3     // Catch:{ ClassCastException -> 0x001c }
            java.lang.String r0 = r3.mBeaconLayout     // Catch:{ ClassCastException -> 0x001c }
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = r2.mBeaconLayout     // Catch:{ ClassCastException -> 0x001c }
            boolean r0 = r0.equals(r1)     // Catch:{ ClassCastException -> 0x001c }
            if (r0 == 0) goto L_0x001c
            java.lang.String r3 = r3.mIdentifier     // Catch:{ ClassCastException -> 0x001c }
            if (r3 == 0) goto L_0x001c
            java.lang.String r0 = r2.mIdentifier     // Catch:{ ClassCastException -> 0x001c }
            boolean r3 = r3.equals(r0)     // Catch:{ ClassCastException -> 0x001c }
            if (r3 == 0) goto L_0x001c
            r3 = 1
            return r3
        L_0x001c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconParser.equals(java.lang.Object):boolean");
    }

    /* renamed from: g */
    public Beacon mo38018g(byte[] bArr, int i, BluetoothDevice bluetoothDevice, long j) {
        return mo38019h(bArr, i, bluetoothDevice, j, new Beacon());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0188, code lost:
        if (m33545c(r5, r0.mMatchingBeaconTypeCodeStartOffset.intValue() + r12, r9) != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0199, code lost:
        if (r6.mo71662d() == 33) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0495 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0242  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.altbeacon.beacon.Beacon mo38019h(byte[] r25, int r26, android.bluetooth.BluetoothDevice r27, long r28, org.altbeacon.beacon.Beacon r30) {
        /*
            r24 = this;
            r0 = r24
            r1 = r28
            r3 = r30
            kd.a r4 = new kd.a
            r5 = r25
            r4.<init>(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r4 = r4.mo71646a()
            java.util.Iterator r4 = r4.iterator()
        L_0x0024:
            boolean r9 = r4.hasNext()
            r11 = 4
            r12 = -1
            r13 = 33
            r14 = 22
            java.lang.String r10 = "BeaconParser"
            if (r9 == 0) goto L_0x00a7
            java.lang.Object r9 = r4.next()
            kd.d r9 = (p310kd.C13557d) r9
            byte r15 = r9.mo71662d()
            if (r15 != r14) goto L_0x0042
            java.lang.Long r14 = r0.mServiceUuid
            if (r14 != 0) goto L_0x0053
        L_0x0042:
            byte r14 = r9.mo71662d()
            if (r14 != r13) goto L_0x004d
            byte[] r13 = r0.mServiceUuid128Bit
            int r13 = r13.length
            if (r13 != 0) goto L_0x0053
        L_0x004d:
            byte r13 = r9.mo71662d()
            if (r13 != r12) goto L_0x008c
        L_0x0053:
            r6.add(r9)
            boolean r12 = p097gd.C7354d.m30380e()
            if (r12 == 0) goto L_0x0024
            java.lang.Object[] r11 = new java.lang.Object[r11]
            byte r12 = r9.mo71662d()
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
            r13 = 0
            r11[r13] = r12
            java.lang.String r12 = m33546d(r25)
            r13 = 1
            r11[r13] = r12
            int r12 = r9.mo71661c()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r11[r13] = r12
            int r9 = r9.mo71660b()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 3
            r11[r12] = r9
            java.lang.String r9 = "Processing pdu type %02X: %s with startIndex: %d, endIndex: %d"
            p097gd.C7354d.m30376a(r10, r9, r11)
            goto L_0x0024
        L_0x008c:
            boolean r11 = p097gd.C7354d.m30380e()
            if (r11 == 0) goto L_0x0024
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]
            byte r9 = r9.mo71662d()
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r15 = 0
            r11[r15] = r9
            java.lang.String r9 = "Ignoring pdu type %02X"
            p097gd.C7354d.m30376a(r10, r9, r11)
            goto L_0x0024
        L_0x00a7:
            r15 = 0
            int r4 = r6.size()
            if (r4 != 0) goto L_0x00c0
            boolean r4 = p097gd.C7354d.m30380e()
            if (r4 == 0) goto L_0x00bb
            java.lang.Object[] r4 = new java.lang.Object[r15]
            java.lang.String r6 = "No PDUs to process in this packet."
            p097gd.C7354d.m30376a(r10, r6, r4)
        L_0x00bb:
            r1 = 0
            r12 = 0
        L_0x00bd:
            r13 = 0
            goto L_0x04b0
        L_0x00c0:
            java.util.Iterator r4 = r6.iterator()
            r6 = 0
            r15 = 0
            r19 = 0
        L_0x00c8:
            boolean r20 = r4.hasNext()
            if (r20 == 0) goto L_0x04a9
            java.lang.Object r6 = r4.next()
            kd.d r6 = (p310kd.C13557d) r6
            r12 = 0
            byte[] r9 = new byte[r12]
            java.lang.Integer r12 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r12 == 0) goto L_0x00fe
            java.lang.Integer r12 = r0.mMatchingBeaconTypeCodeStartOffset
            int r12 = r12.intValue()
            if (r12 < 0) goto L_0x00fe
            java.lang.Long r9 = r24.mo38024l()
            long r11 = r9.longValue()
            java.lang.Integer r9 = r0.mMatchingBeaconTypeCodeEndOffset
            int r9 = r9.intValue()
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeStartOffset
            int r14 = r14.intValue()
            int r9 = r9 - r14
            r14 = 1
            int r9 = r9 + r14
            byte[] r9 = m33549r(r11, r9)
        L_0x00fe:
            byte[] r11 = r24.mo38028q()
            java.lang.Long r12 = r24.mo38027p()
            if (r12 == 0) goto L_0x0124
            java.lang.Long r11 = r24.mo38027p()
            long r11 = r11.longValue()
            java.lang.Integer r14 = r0.mServiceUuidEndOffset
            int r14 = r14.intValue()
            java.lang.Integer r13 = r0.mServiceUuidStartOffset
            int r13 = r13.intValue()
            int r14 = r14 - r13
            r13 = 1
            int r14 = r14 + r13
            r13 = 0
            byte[] r11 = m33550t(r11, r14, r13)
        L_0x0124:
            int r12 = r6.mo71661c()
            int r13 = r11.length
            if (r13 != 0) goto L_0x014b
            java.lang.Integer r13 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r13 == 0) goto L_0x0144
            java.lang.Integer r13 = r0.mMatchingBeaconTypeCodeStartOffset
            int r13 = r13.intValue()
            int r13 = r13 + r12
            boolean r13 = r0.m33545c(r5, r13, r9)
            if (r13 == 0) goto L_0x0144
            r23 = r4
        L_0x013e:
            r4 = 1
            r13 = 22
            r14 = 33
            goto L_0x01a1
        L_0x0144:
            r23 = r4
        L_0x0146:
            r13 = 22
            r14 = 33
            goto L_0x01a0
        L_0x014b:
            byte r13 = r6.mo71662d()
            r14 = 33
            if (r13 != r14) goto L_0x015a
            int r13 = r11.length
            r14 = 16
            if (r13 != r14) goto L_0x015a
            r13 = 1
            goto L_0x015b
        L_0x015a:
            r13 = 0
        L_0x015b:
            byte r14 = r6.mo71662d()
            r23 = r4
            r4 = 22
            if (r14 != r4) goto L_0x016a
            int r4 = r11.length
            r14 = 2
            if (r4 != r14) goto L_0x016a
            r13 = 1
        L_0x016a:
            if (r13 == 0) goto L_0x0146
            java.lang.Integer r4 = r0.mServiceUuidStartOffset
            int r4 = r4.intValue()
            int r4 = r4 + r12
            boolean r4 = r0.m33545c(r5, r4, r11)
            if (r4 == 0) goto L_0x0146
            java.lang.Integer r4 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r4 == 0) goto L_0x018b
            java.lang.Integer r4 = r0.mMatchingBeaconTypeCodeStartOffset
            int r4 = r4.intValue()
            int r4 = r4 + r12
            boolean r4 = r0.m33545c(r5, r4, r9)
            if (r4 == 0) goto L_0x0146
            goto L_0x013e
        L_0x018b:
            byte r4 = r6.mo71662d()
            r13 = 22
            if (r4 == r13) goto L_0x019c
            byte r4 = r6.mo71662d()
            r14 = 33
            if (r4 != r14) goto L_0x01a0
            goto L_0x019e
        L_0x019c:
            r14 = 33
        L_0x019e:
            r4 = 1
            goto L_0x01a1
        L_0x01a0:
            r4 = 0
        L_0x01a1:
            if (r4 != 0) goto L_0x0219
            java.lang.Long r22 = r24.mo38027p()
            if (r22 != 0) goto L_0x01ce
            byte[] r13 = r24.mo38028q()
            int r13 = r13.length
            if (r13 == 0) goto L_0x01b1
            goto L_0x01ce
        L_0x01b1:
            boolean r11 = p097gd.C7354d.m30380e()
            if (r11 == 0) goto L_0x0215
            r11 = 2
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r9 = r0.m33544b(r9)
            r11 = 0
            r13[r11] = r9
            java.lang.String r9 = m33546d(r5)
            r11 = 1
            r13[r11] = r9
            java.lang.String r9 = "This is not a matching Beacon advertisement. (Was expecting %s.  The bytes I see are: %s"
            p097gd.C7354d.m30376a(r10, r9, r13)
            goto L_0x0215
        L_0x01ce:
            boolean r13 = p097gd.C7354d.m30380e()
            if (r13 == 0) goto L_0x0215
            java.lang.Integer r13 = r0.mMatchingBeaconTypeCodeStartOffset
            if (r13 == 0) goto L_0x01dd
            int r13 = r13.intValue()
            goto L_0x01de
        L_0x01dd:
            r13 = 0
        L_0x01de:
            r14 = 5
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r11 = r0.m33544b(r11)
            r18 = 0
            r14[r18] = r11
            java.lang.Integer r11 = r0.mServiceUuidStartOffset
            int r11 = r11.intValue()
            int r11 = r11 + r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r17 = 1
            r14[r17] = r11
            java.lang.String r9 = r0.m33544b(r9)
            r11 = 2
            r14[r11] = r9
            int r13 = r13 + r12
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r13 = 3
            r14[r13] = r9
            java.lang.String r9 = m33546d(r5)
            r16 = 4
            r14[r16] = r9
            java.lang.String r9 = "This is not a matching Beacon advertisement. Was expecting %s at offset %d and %s at offset %d.  The bytes I see are: %s"
            p097gd.C7354d.m30376a(r10, r9, r14)
            goto L_0x0240
        L_0x0215:
            r13 = 3
            r16 = 4
            goto L_0x0240
        L_0x0219:
            r11 = 2
            r13 = 3
            r16 = 4
            boolean r14 = p097gd.C7354d.m30380e()
            if (r14 == 0) goto L_0x0240
            r14 = 1
            java.lang.Object[] r11 = new java.lang.Object[r14]
            java.lang.String r9 = r0.m33544b(r9)
            r18 = 0
            r11[r18] = r9
            java.lang.String r9 = "This is a recognized beacon advertisement -- %s seen"
            p097gd.C7354d.m30376a(r10, r9, r11)
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.String r11 = m33546d(r5)
            r9[r18] = r11
            java.lang.String r11 = "Bytes are: %s"
            p097gd.C7354d.m30376a(r10, r11, r9)
        L_0x0240:
            if (r4 == 0) goto L_0x049a
            int r4 = r5.length
            java.lang.Integer r9 = r0.mLayoutSize
            int r9 = r9.intValue()
            int r9 = r9 + r12
            if (r4 > r9) goto L_0x028d
            java.lang.Boolean r4 = r0.mAllowPduOverflow
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x028d
            boolean r4 = p097gd.C7354d.m30380e()
            if (r4 == 0) goto L_0x0281
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "Expanding buffer because it is too short to parse: "
            r4.append(r9)
            int r9 = r5.length
            r4.append(r9)
            java.lang.String r9 = ", needed: "
            r4.append(r9)
            java.lang.Integer r9 = r0.mLayoutSize
            int r9 = r9.intValue()
            int r9 = r9 + r12
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            p097gd.C7354d.m30376a(r10, r4, r11)
        L_0x0281:
            java.lang.Integer r4 = r0.mLayoutSize
            int r4 = r4.intValue()
            int r4 = r4 + r12
            byte[] r4 = r0.m33548f(r5, r4)
            goto L_0x028e
        L_0x028d:
            r4 = r5
        L_0x028e:
            r5 = 0
        L_0x028f:
            java.util.List<java.lang.Integer> r9 = r0.mIdentifierEndOffsets
            int r9 = r9.size()
            java.lang.String r11 = " because PDU is too short.  endIndex: "
            java.lang.String r14 = " PDU endIndex: "
            if (r5 >= r9) goto L_0x0381
            java.util.List<java.lang.Integer> r9 = r0.mIdentifierEndOffsets
            java.lang.Object r9 = r9.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r12
            int r13 = r6.mo71660b()
            if (r9 <= r13) goto L_0x0313
            java.util.List<java.lang.Boolean> r13 = r0.mIdentifierVariableLengthFlags
            java.lang.Object r13 = r13.get(r5)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0313
            boolean r11 = p097gd.C7354d.m30380e()
            if (r11 == 0) goto L_0x02de
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Need to truncate identifier by "
            r11.append(r13)
            int r13 = r6.mo71660b()
            int r9 = r9 - r13
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]
            p097gd.C7354d.m30376a(r10, r9, r13)
        L_0x02de:
            java.util.List<java.lang.Integer> r9 = r0.mIdentifierStartOffsets
            java.lang.Object r9 = r9.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r12
            int r11 = r6.mo71660b()
            r13 = 1
            int r11 = r11 + r13
            if (r11 > r9) goto L_0x02fd
            r13 = 0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = "PDU is too short for identifer.  Packet is malformed"
            p097gd.C7354d.m30376a(r10, r2, r1)
            r1 = 0
            return r1
        L_0x02fd:
            java.util.List<java.lang.Boolean> r13 = r0.mIdentifierLittleEndianFlags
            java.lang.Object r13 = r13.get(r5)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            org.altbeacon.beacon.e r9 = org.altbeacon.beacon.C8048e.m33576d(r4, r9, r11, r13)
            r7.add(r9)
            r21 = r15
            goto L_0x037a
        L_0x0313:
            int r13 = r6.mo71660b()
            if (r9 <= r13) goto L_0x0356
            java.lang.Boolean r13 = r0.mAllowPduOverflow
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0356
            boolean r13 = p097gd.C7354d.m30380e()
            if (r13 == 0) goto L_0x0351
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r21 = r15
            java.lang.String r15 = "Cannot parse identifier "
            r13.append(r15)
            r13.append(r5)
            r13.append(r11)
            r13.append(r9)
            r13.append(r14)
            int r9 = r6.mo71660b()
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]
            p097gd.C7354d.m30376a(r10, r9, r13)
            goto L_0x0353
        L_0x0351:
            r21 = r15
        L_0x0353:
            r19 = 1
            goto L_0x037a
        L_0x0356:
            r21 = r15
            java.util.List<java.lang.Integer> r11 = r0.mIdentifierStartOffsets
            java.lang.Object r11 = r11.get(r5)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r11 = r11 + r12
            int r9 = r9 + 1
            java.util.List<java.lang.Boolean> r13 = r0.mIdentifierLittleEndianFlags
            java.lang.Object r13 = r13.get(r5)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            org.altbeacon.beacon.e r9 = org.altbeacon.beacon.C8048e.m33576d(r4, r11, r9, r13)
            r7.add(r9)
        L_0x037a:
            int r5 = r5 + 1
            r15 = r21
            r13 = 3
            goto L_0x028f
        L_0x0381:
            r21 = r15
            r5 = 0
        L_0x0384:
            java.util.List<java.lang.Integer> r9 = r0.mDataEndOffsets
            int r9 = r9.size()
            if (r5 >= r9) goto L_0x040e
            java.util.List<java.lang.Integer> r9 = r0.mDataEndOffsets
            java.lang.Object r9 = r9.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r12
            int r13 = r6.mo71660b()
            if (r9 <= r13) goto L_0x03e4
            java.lang.Boolean r13 = r0.mAllowPduOverflow
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x03e4
            boolean r13 = p097gd.C7354d.m30380e()
            if (r13 == 0) goto L_0x03d9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Cannot parse data field "
            r13.append(r15)
            r13.append(r5)
            r13.append(r11)
            r13.append(r9)
            r13.append(r14)
            int r9 = r6.mo71660b()
            r13.append(r9)
            java.lang.String r9 = ".  Setting value to 0"
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r13 = 0
            java.lang.Object[] r15 = new java.lang.Object[r13]
            p097gd.C7354d.m30376a(r10, r9, r15)
        L_0x03d9:
            java.lang.Long r9 = new java.lang.Long
            r1 = 0
            r9.<init>(r1)
            r8.add(r9)
            goto L_0x0408
        L_0x03e4:
            java.util.List<java.lang.Integer> r1 = r0.mDataStartOffsets
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 + r12
            java.util.List<java.lang.Boolean> r2 = r0.mDataLittleEndianFlags
            java.lang.Object r2 = r2.get(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r1 = r0.m33543a(r4, r1, r9, r2)
            java.lang.Long r1 = java.lang.Long.decode(r1)
            r8.add(r1)
        L_0x0408:
            int r5 = r5 + 1
            r1 = r28
            goto L_0x0384
        L_0x040e:
            java.lang.Integer r1 = r0.mPowerStartOffset
            if (r1 == 0) goto L_0x0486
            java.lang.Integer r1 = r0.mPowerEndOffset
            int r1 = r1.intValue()
            int r1 = r1 + r12
            int r2 = r6.mo71660b()     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            if (r1 <= r2) goto L_0x0454
            java.lang.Boolean r2 = r0.mAllowPduOverflow     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            boolean r2 = r2.booleanValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            if (r2 != 0) goto L_0x0454
            boolean r2 = p097gd.C7354d.m30380e()     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            if (r2 == 0) goto L_0x044e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            r2.<init>()     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            java.lang.String r5 = "Cannot parse power field because PDU is too short.  endIndex: "
            r2.append(r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            r2.append(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            r2.append(r14)     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            int r1 = r6.mo71660b()     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            r2.append(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            java.lang.String r1 = r2.toString()     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
            p097gd.C7354d.m30376a(r10, r1, r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x0452 }
        L_0x044e:
            r15 = r21
            r13 = 1
            goto L_0x047b
        L_0x0452:
            r13 = 1
            goto L_0x0480
        L_0x0454:
            java.lang.Integer r1 = r0.mPowerStartOffset     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r1 = r1.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r1 = r1 + r12
            java.lang.Integer r2 = r0.mPowerEndOffset     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r2 = r2.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r2 = r2 + r12
            r5 = 0
            java.lang.String r1 = r0.m33543a(r4, r1, r2, r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            java.lang.Integer r2 = r0.mDBmCorrection     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r2 = r2.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x047e }
            int r1 = r1 + r2
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 <= r2) goto L_0x0478
            int r1 = r1 + -256
        L_0x0478:
            r15 = r1
            r13 = r19
        L_0x047b:
            r19 = r13
            goto L_0x0484
        L_0x047e:
            r13 = r19
        L_0x0480:
            r19 = r13
            r15 = r21
        L_0x0484:
            r13 = r15
            goto L_0x0492
        L_0x0486:
            java.lang.Integer r1 = r0.mDBmCorrection
            if (r1 == 0) goto L_0x0490
            int r1 = r1.intValue()
            r13 = r1
            goto L_0x0492
        L_0x0490:
            r13 = r21
        L_0x0492:
            r5 = r4
            if (r19 != 0) goto L_0x0498
            r1 = r13
            r13 = 1
            goto L_0x04b0
        L_0x0498:
            r15 = r13
            goto L_0x049c
        L_0x049a:
            r21 = r15
        L_0x049c:
            r1 = r28
            r6 = r12
            r4 = r23
            r11 = 4
            r12 = -1
            r13 = 33
            r14 = 22
            goto L_0x00c8
        L_0x04a9:
            r21 = r15
            r12 = r6
            r1 = r21
            goto L_0x00bd
        L_0x04b0:
            if (r13 == 0) goto L_0x052a
            java.lang.Integer r2 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r2 == 0) goto L_0x04ce
            java.lang.Integer r2 = r0.mMatchingBeaconTypeCodeStartOffset
            int r2 = r2.intValue()
            int r2 = r2 + r12
            java.lang.Integer r4 = r0.mMatchingBeaconTypeCodeEndOffset
            int r4 = r4.intValue()
            int r4 = r4 + r12
            r6 = 0
            java.lang.String r2 = r0.m33543a(r5, r2, r4, r6)
            int r2 = java.lang.Integer.parseInt(r2)
            goto L_0x04d0
        L_0x04ce:
            r6 = 0
            r2 = -1
        L_0x04d0:
            int r4 = r12 + 1
            r9 = 1
            java.lang.String r4 = r0.m33543a(r5, r12, r4, r9)
            int r4 = java.lang.Integer.parseInt(r4)
            if (r27 == 0) goto L_0x04e6
            java.lang.String r5 = r27.getAddress()
            java.lang.String r10 = r27.getName()     // Catch:{ SecurityException -> 0x04e7 }
            goto L_0x04e8
        L_0x04e6:
            r5 = 0
        L_0x04e7:
            r10 = 0
        L_0x04e8:
            r3.mIdentifiers = r7
            r3.mDataFields = r8
            r7 = r26
            r3.mRssi = r7
            r3.mBeaconTypeCode = r2
            java.lang.Long r2 = r0.mServiceUuid
            if (r2 == 0) goto L_0x04fe
            long r7 = r2.longValue()
            int r2 = (int) r7
            r3.mServiceUuid = r2
            goto L_0x0501
        L_0x04fe:
            r2 = -1
            r3.mServiceUuid = r2
        L_0x0501:
            r3.mBluetoothAddress = r5
            r3.mBluetoothName = r10
            r3.mManufacturer = r4
            java.lang.String r2 = r0.mIdentifier
            r3.mParserIdentifier = r2
            java.util.List<org.altbeacon.beacon.BeaconParser> r2 = r0.extraParsers
            int r2 = r2.size()
            if (r2 > 0) goto L_0x051e
            java.lang.Boolean r2 = r0.mExtraFrame
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x051c
            goto L_0x051e
        L_0x051c:
            r15 = 0
            goto L_0x051f
        L_0x051e:
            r15 = 1
        L_0x051f:
            r3.mMultiFrameBeacon = r15
            r4 = r28
            r3.mFirstCycleDetectionTimestamp = r4
            r3.mLastCycleDetectionTimestamp = r4
            r3.mTxPower = r1
            return r3
        L_0x052a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconParser.mo38019h(byte[], int, android.bluetooth.BluetoothDevice, long, org.altbeacon.beacon.Beacon):org.altbeacon.beacon.Beacon");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mMatchingBeaconTypeCode, this.mIdentifierStartOffsets, this.mIdentifierEndOffsets, this.mIdentifierLittleEndianFlags, this.mDataStartOffsets, this.mDataEndOffsets, this.mDataLittleEndianFlags, this.mIdentifierVariableLengthFlags, this.mMatchingBeaconTypeCodeStartOffset, this.mMatchingBeaconTypeCodeEndOffset, this.mServiceUuidStartOffset, this.mServiceUuidEndOffset, this.mServiceUuid, this.mServiceUuid128Bit, this.mExtraFrame, this.mPowerStartOffset, this.mPowerEndOffset, this.mDBmCorrection, this.mLayoutSize, this.mAllowPduOverflow, this.mIdentifier, this.mHardwareAssistManufacturers, this.extraParsers});
    }

    /* renamed from: i */
    public List<BeaconParser> mo38021i() {
        return new ArrayList(this.extraParsers);
    }

    /* renamed from: j */
    public int[] mo38022j() {
        return this.mHardwareAssistManufacturers;
    }

    /* renamed from: k */
    public String mo38023k() {
        return this.mBeaconLayout;
    }

    /* renamed from: l */
    public Long mo38024l() {
        Long l = this.mMatchingBeaconTypeCode;
        if (l == null) {
            return -1L;
        }
        return l;
    }

    /* renamed from: m */
    public int mo38025m() {
        Integer num = this.mMatchingBeaconTypeCodeEndOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: n */
    public int mo38026n() {
        Integer num = this.mMatchingBeaconTypeCodeStartOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: p */
    public Long mo38027p() {
        return this.mServiceUuid;
    }

    /* renamed from: q */
    public byte[] mo38028q() {
        return this.mServiceUuid128Bit;
    }

    /* renamed from: u */
    public BeaconParser mo38029u(String str) {
        int i;
        int i2;
        String str2 = str;
        this.mBeaconLayout = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Parsing beacon layout: ");
        sb.append(str2);
        String[] split = str2.split(",");
        this.mExtraFrame = Boolean.FALSE;
        int length = split.length;
        int i3 = 0;
        while (i3 < length) {
            String str3 = split[i3];
            Matcher matcher = f19606a.matcher(str3);
            boolean z = false;
            while (true) {
                i = 3;
                i2 = 2;
                if (!matcher.find()) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    this.mIdentifierLittleEndianFlags.add(Boolean.valueOf(matcher.group(3).contains("l")));
                    this.mIdentifierVariableLengthFlags.add(Boolean.valueOf(matcher.group(3).contains(RegisterSpec.PREFIX)));
                    this.mIdentifierStartOffsets.add(Integer.valueOf(parseInt));
                    this.mIdentifierEndOffsets.add(Integer.valueOf(parseInt2));
                    z = true;
                } catch (NumberFormatException unused) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher2 = f19609f.matcher(str3);
            while (matcher2.find()) {
                try {
                    int parseInt3 = Integer.parseInt(matcher2.group(1));
                    int parseInt4 = Integer.parseInt(matcher2.group(2));
                    this.mDataLittleEndianFlags.add(Boolean.valueOf(matcher2.group(3).contains("l")));
                    this.mDataStartOffsets.add(Integer.valueOf(parseInt3));
                    this.mDataEndOffsets.add(Integer.valueOf(parseInt4));
                    z = true;
                } catch (NumberFormatException unused2) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher3 = f19610g.matcher(str3);
            while (matcher3.find()) {
                try {
                    if (!(matcher3.group(1) == null || matcher3.group(2) == null)) {
                        int parseInt5 = Integer.parseInt(matcher3.group(1));
                        int parseInt6 = Integer.parseInt(matcher3.group(2));
                        this.mPowerStartOffset = Integer.valueOf(parseInt5);
                        this.mPowerEndOffset = Integer.valueOf(parseInt6);
                    }
                    this.mDBmCorrection = Integer.valueOf(matcher3.group(3) != null ? Integer.parseInt(matcher3.group(3)) : 0);
                    z = true;
                } catch (NumberFormatException unused3) {
                    throw new BeaconLayoutException("Cannot parse integer power byte offset (" + "none" + ") in term: " + str3);
                }
            }
            Matcher matcher4 = f19607c.matcher(str3);
            while (matcher4.find()) {
                try {
                    int parseInt7 = Integer.parseInt(matcher4.group(1));
                    int parseInt8 = Integer.parseInt(matcher4.group(2));
                    this.mMatchingBeaconTypeCodeStartOffset = Integer.valueOf(parseInt7);
                    this.mMatchingBeaconTypeCodeEndOffset = Integer.valueOf(parseInt8);
                    String group = matcher4.group(3);
                    try {
                        this.mMatchingBeaconTypeCode = Long.decode("0x" + group);
                        z = true;
                    } catch (NumberFormatException unused4) {
                        throw new BeaconLayoutException("Cannot parse beacon type code: " + group + " in term: " + str3);
                    }
                } catch (NumberFormatException unused5) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher5 = f19608d.matcher(str3);
            while (matcher5.find()) {
                try {
                    int parseInt9 = Integer.parseInt(matcher5.group(1));
                    int parseInt10 = Integer.parseInt(matcher5.group(i2));
                    this.mServiceUuidStartOffset = Integer.valueOf(parseInt9);
                    this.mServiceUuidEndOffset = Integer.valueOf(parseInt10);
                    String group2 = matcher5.group(i);
                    if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + 1 == i2) {
                        try {
                            this.mServiceUuid = Long.decode("0x" + group2);
                        } catch (NumberFormatException unused6) {
                            throw new BeaconLayoutException("Cannot parse serviceUuid: " + group2 + " in term: " + str3);
                        }
                    } else if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + 1 == 16) {
                        String replace = group2.replace(HelpFormatter.DEFAULT_OPT_PREFIX, "");
                        if (replace.length() == 32) {
                            this.mServiceUuid128Bit = new byte[16];
                            int i4 = 0;
                            while (i4 < 16) {
                                int i5 = i4 * 2;
                                String substring = replace.substring(i5, i5 + 2);
                                try {
                                    this.mServiceUuid128Bit[15 - i4] = (byte) Integer.parseInt(substring, 16);
                                    i4++;
                                } catch (NumberFormatException unused7) {
                                    throw new BeaconLayoutException("Cannot parse serviceUuid byte " + substring + " in term: " + str3);
                                }
                            }
                        } else {
                            throw new BeaconLayoutException("128-bit ServiceUuid must be 16 bytes long: " + group2 + " in term: " + str3);
                        }
                    } else {
                        throw new BeaconLayoutException("Cannot parse serviceUuid -- it must be 2 bytes or 16 bytes long: " + group2 + " in term: " + str3);
                    }
                    z = true;
                    i = 3;
                    i2 = 2;
                } catch (NumberFormatException unused8) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher6 = f19611o.matcher(str3);
            while (matcher6.find()) {
                this.mExtraFrame = Boolean.TRUE;
                z = true;
            }
            if (z) {
                i3++;
            } else {
                C7354d.m30376a("BeaconParser", "cannot parse term %s", str3);
                throw new BeaconLayoutException("Cannot parse beacon layout term: " + str3);
            }
        }
        this.mLayoutSize = Integer.valueOf(m33547e());
        return this;
    }
}
