package com.android.p023dx.p024cf.code;

import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.rop.cst.CstDouble;
import com.android.p023dx.rop.cst.CstFloat;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstKnownNull;
import com.android.p023dx.rop.cst.CstLong;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Bits;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.BytecodeArray */
public final class BytecodeArray {
    public static final Visitor EMPTY_VISITOR = new BaseVisitor();
    private final ByteArray bytes;
    private final ConstantPool pool;

    /* renamed from: com.android.dx.cf.code.BytecodeArray$BaseVisitor */
    public static class BaseVisitor implements Visitor {
        private int previousOffset = -1;

        BaseVisitor() {
        }

        public int getPreviousOffset() {
            return this.previousOffset;
        }

        public void setPreviousOffset(int i) {
            this.previousOffset = i;
        }

        public void visitBranch(int i, int i2, int i3, int i4) {
        }

        public void visitConstant(int i, int i2, int i3, Constant constant, int i4) {
        }

        public void visitInvalid(int i, int i2, int i3) {
        }

        public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
        }

        public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
        }

        public void visitNoArgs(int i, int i2, int i3, Type type) {
        }

        public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
        }
    }

    /* renamed from: com.android.dx.cf.code.BytecodeArray$ConstantParserVisitor */
    class ConstantParserVisitor extends BaseVisitor {
        Constant cst;
        int length;
        int value;

        ConstantParserVisitor() {
        }

        private void clear() {
            this.length = 0;
        }

        public int getPreviousOffset() {
            return -1;
        }

        public void setPreviousOffset(int i) {
        }

        public void visitBranch(int i, int i2, int i3, int i4) {
            clear();
        }

        public void visitConstant(int i, int i2, int i3, Constant constant, int i4) {
            this.cst = constant;
            this.length = i3;
            this.value = i4;
        }

        public void visitInvalid(int i, int i2, int i3) {
            clear();
        }

        public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
            clear();
        }

        public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
            clear();
        }

        public void visitNoArgs(int i, int i2, int i3, Type type) {
            clear();
        }

        public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
            clear();
        }
    }

    /* renamed from: com.android.dx.cf.code.BytecodeArray$Visitor */
    public interface Visitor {
        int getPreviousOffset();

        void setPreviousOffset(int i);

        void visitBranch(int i, int i2, int i3, int i4);

        void visitConstant(int i, int i2, int i3, Constant constant, int i4);

        void visitInvalid(int i, int i2, int i3);

        void visitLocal(int i, int i2, int i3, int i4, Type type, int i5);

        void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList);

        void visitNoArgs(int i, int i2, int i3, Type type);

        void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4);
    }

    public BytecodeArray(ByteArray byteArray, ConstantPool constantPool) {
        Objects.requireNonNull(byteArray, "bytes == null");
        Objects.requireNonNull(constantPool, "pool == null");
        this.bytes = byteArray;
        this.pool = constantPool;
    }

    private int parseLookupswitch(int i, Visitor visitor) {
        int i2 = (i + 4) & -4;
        int i3 = 0;
        for (int i4 = i + 1; i4 < i2; i4++) {
            i3 = (i3 << 8) | this.bytes.getUnsignedByte(i4);
        }
        int i5 = this.bytes.getInt(i2) + i;
        int i6 = this.bytes.getInt(i2 + 4);
        int i7 = i2 + 8;
        SwitchList switchList = new SwitchList(i6);
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += 8;
            switchList.add(this.bytes.getInt(i7), this.bytes.getInt(i7 + 4) + i);
        }
        switchList.setDefaultTarget(i5);
        switchList.removeSuperfluousDefaults();
        switchList.setImmutable();
        int i9 = i7 - i;
        visitor.visitSwitch(171, i, i9, switchList, i3);
        return i9;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if (r8 != 80) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        if (r8 != 79) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r8 != 86) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r8 != 82) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        if (r8 != 81) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r8 != 85) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r8 != 84) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int parseNewarray(int r13, com.android.p023dx.p024cf.code.BytecodeArray.Visitor r14) {
        /*
            r12 = this;
            com.android.dx.util.ByteArray r0 = r12.bytes
            int r1 = r13 + 1
            int r0 = r0.getUnsignedByte(r1)
            switch(r0) {
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x0032;
                case 8: goto L_0x002f;
                case 9: goto L_0x002c;
                case 10: goto L_0x0029;
                case 11: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            com.android.dx.cf.code.SimException r13 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "bad newarray code "
            r14.append(r1)
            java.lang.String r0 = com.android.p023dx.util.Hex.m906u1(r0)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>((java.lang.String) r14)
            throw r13
        L_0x0026:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.LONG_ARRAY
            goto L_0x003d
        L_0x0029:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.INT_ARRAY
            goto L_0x003d
        L_0x002c:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.SHORT_ARRAY
            goto L_0x003d
        L_0x002f:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.BYTE_ARRAY
            goto L_0x003d
        L_0x0032:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.DOUBLE_ARRAY
            goto L_0x003d
        L_0x0035:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.FLOAT_ARRAY
            goto L_0x003d
        L_0x0038:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.CHAR_ARRAY
            goto L_0x003d
        L_0x003b:
            com.android.dx.rop.cst.CstType r1 = com.android.p023dx.rop.cst.CstType.BOOLEAN_ARRAY
        L_0x003d:
            int r2 = r14.getPreviousOffset()
            com.android.dx.cf.code.BytecodeArray$ConstantParserVisitor r3 = new com.android.dx.cf.code.BytecodeArray$ConstantParserVisitor
            r3.<init>()
            r4 = 0
            if (r2 < 0) goto L_0x005a
            r12.parseInstruction(r2, r3)
            com.android.dx.rop.cst.Constant r5 = r3.cst
            boolean r5 = r5 instanceof com.android.p023dx.rop.cst.CstInteger
            if (r5 == 0) goto L_0x005a
            int r5 = r3.length
            int r5 = r5 + r2
            if (r5 != r13) goto L_0x005a
            int r2 = r3.value
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            int r5 = r13 + 2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r2 == 0) goto L_0x00d1
            r7 = 0
        L_0x0065:
            com.android.dx.util.ByteArray r8 = r12.bytes
            int r9 = r5 + 1
            int r8 = r8.getUnsignedByte(r5)
            r10 = 89
            if (r8 == r10) goto L_0x0073
            goto L_0x00d0
        L_0x0073:
            r12.parseInstruction(r9, r3)
            int r8 = r3.length
            if (r8 == 0) goto L_0x00d0
            com.android.dx.rop.cst.Constant r10 = r3.cst
            boolean r10 = r10 instanceof com.android.p023dx.rop.cst.CstInteger
            if (r10 == 0) goto L_0x00d0
            int r10 = r3.value
            if (r10 == r7) goto L_0x0085
            goto L_0x00d0
        L_0x0085:
            int r9 = r9 + r8
            r12.parseInstruction(r9, r3)
            int r8 = r3.length
            if (r8 == 0) goto L_0x00d0
            com.android.dx.rop.cst.Constant r10 = r3.cst
            boolean r11 = r10 instanceof com.android.p023dx.rop.cst.CstLiteralBits
            if (r11 != 0) goto L_0x0094
            goto L_0x00d0
        L_0x0094:
            int r9 = r9 + r8
            r6.add(r10)
            com.android.dx.util.ByteArray r8 = r12.bytes
            int r10 = r9 + 1
            int r8 = r8.getUnsignedByte(r9)
            r9 = 1
            switch(r0) {
                case 4: goto L_0x00c3;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00af;
                case 10: goto L_0x00aa;
                case 11: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x00c9
        L_0x00a5:
            r11 = 80
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00aa:
            r11 = 79
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00af:
            r11 = 86
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00b4:
            r11 = 82
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00b9:
            r11 = 81
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00be:
            r11 = 85
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00c3:
            r11 = 84
            if (r8 == r11) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r9 = 0
        L_0x00c9:
            if (r9 == 0) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            int r7 = r7 + 1
            r5 = r10
            goto L_0x0065
        L_0x00d0:
            r4 = r7
        L_0x00d1:
            r0 = 2
            if (r4 < r0) goto L_0x00dc
            if (r4 == r2) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            int r5 = r5 - r13
            r14.visitNewarray(r13, r5, r1, r6)
            return r5
        L_0x00dc:
            r2 = 0
            r14.visitNewarray(r13, r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.code.BytecodeArray.parseNewarray(int, com.android.dx.cf.code.BytecodeArray$Visitor):int");
    }

    private int parseTableswitch(int i, Visitor visitor) {
        int i2 = (i + 4) & -4;
        int i3 = 0;
        for (int i4 = i + 1; i4 < i2; i4++) {
            i3 = (i3 << 8) | this.bytes.getUnsignedByte(i4);
        }
        int i5 = this.bytes.getInt(i2) + i;
        int i6 = this.bytes.getInt(i2 + 4);
        int i7 = this.bytes.getInt(i2 + 8);
        int i8 = (i7 - i6) + 1;
        int i9 = i2 + 12;
        if (i6 <= i7) {
            SwitchList switchList = new SwitchList(i8);
            for (int i10 = 0; i10 < i8; i10++) {
                i9 += 4;
                switchList.add(i6 + i10, this.bytes.getInt(i9) + i);
            }
            switchList.setDefaultTarget(i5);
            switchList.removeSuperfluousDefaults();
            switchList.setImmutable();
            int i11 = i9 - i;
            visitor.visitSwitch(171, i, i11, switchList, i3);
            return i11;
        }
        throw new SimException("low / high inversion");
    }

    private int parseWide(int i, Visitor visitor) {
        int unsignedByte = this.bytes.getUnsignedByte(i + 1);
        int unsignedShort = this.bytes.getUnsignedShort(i + 2);
        if (unsignedByte == 132) {
            Visitor visitor2 = visitor;
            int i2 = i;
            int i3 = unsignedShort;
            visitor2.visitLocal(unsignedByte, i2, 6, i3, Type.INT, this.bytes.getShort(i + 4));
            return 6;
        } else if (unsignedByte != 169) {
            switch (unsignedByte) {
                case 21:
                    visitor.visitLocal(21, i, 4, unsignedShort, Type.INT, 0);
                    return 4;
                case 22:
                    visitor.visitLocal(21, i, 4, unsignedShort, Type.LONG, 0);
                    return 4;
                case 23:
                    visitor.visitLocal(21, i, 4, unsignedShort, Type.FLOAT, 0);
                    return 4;
                case 24:
                    visitor.visitLocal(21, i, 4, unsignedShort, Type.DOUBLE, 0);
                    return 4;
                case 25:
                    visitor.visitLocal(21, i, 4, unsignedShort, Type.OBJECT, 0);
                    return 4;
                default:
                    switch (unsignedByte) {
                        case 54:
                            visitor.visitLocal(54, i, 4, unsignedShort, Type.INT, 0);
                            return 4;
                        case 55:
                            visitor.visitLocal(54, i, 4, unsignedShort, Type.LONG, 0);
                            return 4;
                        case 56:
                            visitor.visitLocal(54, i, 4, unsignedShort, Type.FLOAT, 0);
                            return 4;
                        case 57:
                            visitor.visitLocal(54, i, 4, unsignedShort, Type.DOUBLE, 0);
                            return 4;
                        case 58:
                            visitor.visitLocal(54, i, 4, unsignedShort, Type.OBJECT, 0);
                            return 4;
                        default:
                            visitor.visitInvalid(196, i, 1);
                            return 1;
                    }
            }
        } else {
            visitor.visitLocal(unsignedByte, i, 4, unsignedShort, Type.RETURN_ADDRESS, 0);
            return 4;
        }
    }

    public int byteLength() {
        return this.bytes.size() + 4;
    }

    public void forEach(Visitor visitor) {
        int size = this.bytes.size();
        int i = 0;
        while (i < size) {
            i += parseInstruction(i, visitor);
        }
    }

    public ByteArray getBytes() {
        return this.bytes;
    }

    public int[] getInstructionOffsets() {
        int size = this.bytes.size();
        int[] makeBitSet = Bits.makeBitSet(size);
        int i = 0;
        while (i < size) {
            Bits.set(makeBitSet, i, true);
            i += parseInstruction(i, (Visitor) null);
        }
        return makeBitSet;
    }

    public int parseInstruction(int i, Visitor visitor) {
        if (visitor == null) {
            visitor = EMPTY_VISITOR;
        }
        Visitor visitor2 = visitor;
        try {
            int unsignedByte = this.bytes.getUnsignedByte(i);
            ByteOps.opInfo(unsignedByte);
            switch (unsignedByte) {
                case 0:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.VOID);
                    break;
                case 1:
                    visitor2.visitConstant(18, i, 1, CstKnownNull.THE_ONE, 0);
                    return 1;
                case 2:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_M1, -1);
                    return 1;
                case 3:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_0, 0);
                    return 1;
                case 4:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_1, 1);
                    return 1;
                case 5:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_2, 2);
                    return 1;
                case 6:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_3, 3);
                    return 1;
                case 7:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_4, 4);
                    return 1;
                case 8:
                    visitor2.visitConstant(18, i, 1, CstInteger.VALUE_5, 5);
                    return 1;
                case 9:
                    visitor2.visitConstant(18, i, 1, CstLong.VALUE_0, 0);
                    return 1;
                case 10:
                    visitor2.visitConstant(18, i, 1, CstLong.VALUE_1, 0);
                    return 1;
                case 11:
                    visitor2.visitConstant(18, i, 1, CstFloat.VALUE_0, 0);
                    return 1;
                case 12:
                    visitor2.visitConstant(18, i, 1, CstFloat.VALUE_1, 0);
                    return 1;
                case 13:
                    visitor2.visitConstant(18, i, 1, CstFloat.VALUE_2, 0);
                    return 1;
                case 14:
                    visitor2.visitConstant(18, i, 1, CstDouble.VALUE_0, 0);
                    return 1;
                case 15:
                    visitor2.visitConstant(18, i, 1, CstDouble.VALUE_1, 0);
                    return 1;
                case 16:
                    int i2 = this.bytes.getByte(i + 1);
                    visitor2.visitConstant(18, i, 2, CstInteger.make(i2), i2);
                    return 2;
                case 17:
                    int i3 = this.bytes.getShort(i + 1);
                    visitor2.visitConstant(18, i, 3, CstInteger.make(i3), i3);
                    return 3;
                case 18:
                    Constant constant = this.pool.get(this.bytes.getUnsignedByte(i + 1));
                    visitor2.visitConstant(18, i, 2, constant, constant instanceof CstInteger ? ((CstInteger) constant).getValue() : 0);
                    return 2;
                case 19:
                    Constant constant2 = this.pool.get(this.bytes.getUnsignedShort(i + 1));
                    visitor2.visitConstant(18, i, 3, constant2, constant2 instanceof CstInteger ? ((CstInteger) constant2).getValue() : 0);
                    return 3;
                case 20:
                    visitor2.visitConstant(20, i, 3, this.pool.get(this.bytes.getUnsignedShort(i + 1)), 0);
                    return 3;
                case 21:
                    visitor2.visitLocal(21, i, 2, this.bytes.getUnsignedByte(i + 1), Type.INT, 0);
                    return 2;
                case 22:
                    visitor2.visitLocal(21, i, 2, this.bytes.getUnsignedByte(i + 1), Type.LONG, 0);
                    return 2;
                case 23:
                    visitor2.visitLocal(21, i, 2, this.bytes.getUnsignedByte(i + 1), Type.FLOAT, 0);
                    return 2;
                case 24:
                    visitor2.visitLocal(21, i, 2, this.bytes.getUnsignedByte(i + 1), Type.DOUBLE, 0);
                    return 2;
                case 25:
                    visitor2.visitLocal(21, i, 2, this.bytes.getUnsignedByte(i + 1), Type.OBJECT, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    visitor2.visitLocal(21, i, 1, unsignedByte - 26, Type.INT, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    visitor2.visitLocal(21, i, 1, unsignedByte - 30, Type.LONG, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    visitor2.visitLocal(21, i, 1, unsignedByte - 34, Type.FLOAT, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    visitor2.visitLocal(21, i, 1, unsignedByte - 38, Type.DOUBLE, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case 45:
                    visitor2.visitLocal(21, i, 1, unsignedByte - 42, Type.OBJECT, 0);
                    return 1;
                case 46:
                    visitor2.visitNoArgs(46, i, 1, Type.INT);
                    return 1;
                case 47:
                    visitor2.visitNoArgs(46, i, 1, Type.LONG);
                    return 1;
                case 48:
                    visitor2.visitNoArgs(46, i, 1, Type.FLOAT);
                    return 1;
                case 49:
                    visitor2.visitNoArgs(46, i, 1, Type.DOUBLE);
                    return 1;
                case 50:
                    visitor2.visitNoArgs(46, i, 1, Type.OBJECT);
                    return 1;
                case 51:
                    visitor2.visitNoArgs(46, i, 1, Type.BYTE);
                    return 1;
                case 52:
                    visitor2.visitNoArgs(46, i, 1, Type.CHAR);
                    return 1;
                case 53:
                    visitor2.visitNoArgs(46, i, 1, Type.SHORT);
                    return 1;
                case 54:
                    visitor2.visitLocal(54, i, 2, this.bytes.getUnsignedByte(i + 1), Type.INT, 0);
                    return 2;
                case 55:
                    visitor2.visitLocal(54, i, 2, this.bytes.getUnsignedByte(i + 1), Type.LONG, 0);
                    return 2;
                case 56:
                    visitor2.visitLocal(54, i, 2, this.bytes.getUnsignedByte(i + 1), Type.FLOAT, 0);
                    return 2;
                case 57:
                    visitor2.visitLocal(54, i, 2, this.bytes.getUnsignedByte(i + 1), Type.DOUBLE, 0);
                    return 2;
                case 58:
                    visitor2.visitLocal(54, i, 2, this.bytes.getUnsignedByte(i + 1), Type.OBJECT, 0);
                    return 2;
                case 59:
                case 60:
                case 61:
                case 62:
                    visitor2.visitLocal(54, i, 1, unsignedByte - 59, Type.INT, 0);
                    return 1;
                case 63:
                case 64:
                case 65:
                case 66:
                    visitor2.visitLocal(54, i, 1, unsignedByte - 63, Type.LONG, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    visitor2.visitLocal(54, i, 1, unsignedByte - 67, Type.FLOAT, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    visitor2.visitLocal(54, i, 1, unsignedByte - 71, Type.DOUBLE, 0);
                    return 1;
                case 75:
                case 76:
                case 77:
                case 78:
                    visitor2.visitLocal(54, i, 1, unsignedByte - 75, Type.OBJECT, 0);
                    return 1;
                case 79:
                    visitor2.visitNoArgs(79, i, 1, Type.INT);
                    return 1;
                case 80:
                    visitor2.visitNoArgs(79, i, 1, Type.LONG);
                    return 1;
                case 81:
                    visitor2.visitNoArgs(79, i, 1, Type.FLOAT);
                    return 1;
                case 82:
                    visitor2.visitNoArgs(79, i, 1, Type.DOUBLE);
                    return 1;
                case 83:
                    visitor2.visitNoArgs(79, i, 1, Type.OBJECT);
                    return 1;
                case 84:
                    visitor2.visitNoArgs(79, i, 1, Type.BYTE);
                    return 1;
                case 85:
                    visitor2.visitNoArgs(79, i, 1, Type.CHAR);
                    return 1;
                case 86:
                    visitor2.visitNoArgs(79, i, 1, Type.SHORT);
                    return 1;
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.VOID);
                    return 1;
                case 96:
                case 100:
                case 104:
                case 108:
                case 112:
                case 116:
                case 120:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.INT);
                    return 1;
                case 97:
                case 101:
                case 105:
                case 109:
                case 113:
                case 117:
                case 121:
                case 123:
                case 125:
                case 127:
                case 129:
                case 131:
                    visitor2.visitNoArgs(unsignedByte - 1, i, 1, Type.LONG);
                    return 1;
                case 98:
                case 102:
                case 106:
                case 110:
                case 114:
                case 118:
                    visitor2.visitNoArgs(unsignedByte - 2, i, 1, Type.FLOAT);
                    return 1;
                case 99:
                case 103:
                case 107:
                case 111:
                case 115:
                case 119:
                    visitor2.visitNoArgs(unsignedByte - 3, i, 1, Type.DOUBLE);
                    return 1;
                case 132:
                    visitor2.visitLocal(unsignedByte, i, 3, this.bytes.getUnsignedByte(i + 1), Type.INT, this.bytes.getByte(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.LONG);
                    return 1;
                case 134:
                case 137:
                case 144:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.FLOAT);
                    return 1;
                case 135:
                case 138:
                case 141:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.DOUBLE);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.INT);
                    return 1;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    visitor2.visitBranch(unsignedByte, i, 3, this.bytes.getShort(i + 1) + i);
                    return 3;
                case 169:
                    visitor2.visitLocal(unsignedByte, i, 2, this.bytes.getUnsignedByte(i + 1), Type.RETURN_ADDRESS, 0);
                    return 2;
                case 170:
                    return parseTableswitch(i, visitor2);
                case 171:
                    return parseLookupswitch(i, visitor2);
                case 172:
                    visitor2.visitNoArgs(172, i, 1, Type.INT);
                    return 1;
                case 173:
                    visitor2.visitNoArgs(172, i, 1, Type.LONG);
                    return 1;
                case 174:
                    visitor2.visitNoArgs(172, i, 1, Type.FLOAT);
                    return 1;
                case 175:
                    visitor2.visitNoArgs(172, i, 1, Type.DOUBLE);
                    return 1;
                case 176:
                    visitor2.visitNoArgs(172, i, 1, Type.OBJECT);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    visitor2.visitNoArgs(unsignedByte, i, 1, Type.VOID);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    visitor2.visitConstant(unsignedByte, i, 3, this.pool.get(this.bytes.getUnsignedShort(i + 1)), 0);
                    return 3;
                case 185:
                    visitor2.visitConstant(unsignedByte, i, 5, this.pool.get(this.bytes.getUnsignedShort(i + 1)), this.bytes.getUnsignedByte(i + 3) | (this.bytes.getUnsignedByte(i + 4) << 8));
                    return 5;
                case 186:
                    throw new ParseException("invokedynamic not supported");
                case 188:
                    return parseNewarray(i, visitor2);
                case 196:
                    return parseWide(i, visitor2);
                case 197:
                    visitor2.visitConstant(unsignedByte, i, 4, this.pool.get(this.bytes.getUnsignedShort(i + 1)), this.bytes.getUnsignedByte(i + 3));
                    return 4;
                case 200:
                case 201:
                    visitor2.visitBranch(unsignedByte == 200 ? 167 : 168, i, 5, this.bytes.getInt(i + 1) + i);
                    return 5;
                default:
                    visitor2.visitInvalid(unsignedByte, i, 1);
                    break;
            }
            return 1;
        } catch (SimException e) {
            e.addContext("...at bytecode offset " + Hex.m909u4(i));
            throw e;
        } catch (RuntimeException e2) {
            SimException simException = new SimException((Throwable) e2);
            simException.addContext("...at bytecode offset " + Hex.m909u4(i));
            throw simException;
        }
    }

    public void processWorkSet(int[] iArr, Visitor visitor) {
        Objects.requireNonNull(visitor, "visitor == null");
        while (true) {
            int findFirst = Bits.findFirst(iArr, 0);
            if (findFirst >= 0) {
                Bits.clear(iArr, findFirst);
                parseInstruction(findFirst, visitor);
                visitor.setPreviousOffset(findFirst);
            } else {
                return;
            }
        }
    }

    public int size() {
        return this.bytes.size();
    }
}
