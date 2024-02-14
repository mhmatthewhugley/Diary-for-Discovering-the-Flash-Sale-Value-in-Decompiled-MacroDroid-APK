package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.attrib.RawAttribute;
import com.android.p023dx.p024cf.iface.Attribute;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.util.ByteArray;

/* renamed from: com.android.dx.cf.direct.AttributeFactory */
public class AttributeFactory {
    public static final int CTX_CLASS = 0;
    public static final int CTX_CODE = 3;
    public static final int CTX_COUNT = 4;
    public static final int CTX_FIELD = 1;
    public static final int CTX_METHOD = 2;

    /* JADX WARNING: type inference failed for: r5v1, types: [com.android.dx.rop.cst.Constant] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.p023dx.p024cf.iface.Attribute parse(com.android.p023dx.p024cf.direct.DirectClassFile r13, int r14, int r15, com.android.p023dx.p024cf.iface.ParseObserver r16) {
        /*
            r12 = this;
            r0 = r14
            r8 = r15
            r7 = r16
            java.lang.String r1 = "cf == null"
            r2 = r13
            java.util.Objects.requireNonNull(r13, r1)
            if (r0 < 0) goto L_0x00ac
            r1 = 4
            if (r0 >= r1) goto L_0x00ac
            r3 = 0
            com.android.dx.util.ByteArray r4 = r13.getBytes()     // Catch:{ ParseException -> 0x0070 }
            com.android.dx.rop.cst.ConstantPool r5 = r13.getConstantPool()     // Catch:{ ParseException -> 0x0070 }
            int r6 = r4.getUnsignedShort(r15)     // Catch:{ ParseException -> 0x0070 }
            int r9 = r8 + 2
            int r10 = r4.getInt(r9)     // Catch:{ ParseException -> 0x0070 }
            com.android.dx.rop.cst.Constant r5 = r5.get(r6)     // Catch:{ ParseException -> 0x0070 }
            r11 = r5
            com.android.dx.rop.cst.CstString r11 = (com.android.p023dx.rop.cst.CstString) r11     // Catch:{ ParseException -> 0x0070 }
            if (r7 == 0) goto L_0x005c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ParseException -> 0x006d }
            r3.<init>()     // Catch:{ ParseException -> 0x006d }
            java.lang.String r5 = "name: "
            r3.append(r5)     // Catch:{ ParseException -> 0x006d }
            java.lang.String r5 = r11.toHuman()     // Catch:{ ParseException -> 0x006d }
            r3.append(r5)     // Catch:{ ParseException -> 0x006d }
            java.lang.String r3 = r3.toString()     // Catch:{ ParseException -> 0x006d }
            r5 = 2
            r7.parsed(r4, r15, r5, r3)     // Catch:{ ParseException -> 0x006d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ParseException -> 0x006d }
            r3.<init>()     // Catch:{ ParseException -> 0x006d }
            java.lang.String r5 = "length: "
            r3.append(r5)     // Catch:{ ParseException -> 0x006d }
            java.lang.String r5 = com.android.p023dx.util.Hex.m909u4(r10)     // Catch:{ ParseException -> 0x006d }
            r3.append(r5)     // Catch:{ ParseException -> 0x006d }
            java.lang.String r3 = r3.toString()     // Catch:{ ParseException -> 0x006d }
            r7.parsed(r4, r9, r1, r3)     // Catch:{ ParseException -> 0x006d }
        L_0x005c:
            java.lang.String r4 = r11.getString()     // Catch:{ ParseException -> 0x006d }
            int r5 = r8 + 6
            r1 = r12
            r2 = r13
            r3 = r14
            r6 = r10
            r7 = r16
            com.android.dx.cf.iface.Attribute r0 = r1.parse0(r2, r3, r4, r5, r6, r7)     // Catch:{ ParseException -> 0x006d }
            return r0
        L_0x006d:
            r0 = move-exception
            r3 = r11
            goto L_0x0071
        L_0x0070:
            r0 = move-exception
        L_0x0071:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "...while parsing "
            r1.append(r2)
            if (r3 == 0) goto L_0x0093
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r3.toHuman()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0095
        L_0x0093:
            java.lang.String r2 = ""
        L_0x0095:
            r1.append(r2)
            java.lang.String r2 = "attribute at offset "
            r1.append(r2)
            java.lang.String r2 = com.android.p023dx.util.Hex.m909u4(r15)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addContext(r1)
            throw r0
        L_0x00ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bad context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.direct.AttributeFactory.parse(com.android.dx.cf.direct.DirectClassFile, int, int, com.android.dx.cf.iface.ParseObserver):com.android.dx.cf.iface.Attribute");
    }

    /* access modifiers changed from: protected */
    public Attribute parse0(DirectClassFile directClassFile, int i, String str, int i2, int i3, ParseObserver parseObserver) {
        ByteArray bytes = directClassFile.getBytes();
        RawAttribute rawAttribute = new RawAttribute(str, bytes, i2, i3, directClassFile.getConstantPool());
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i2, i3, "attribute data");
        }
        return rawAttribute;
    }
}
