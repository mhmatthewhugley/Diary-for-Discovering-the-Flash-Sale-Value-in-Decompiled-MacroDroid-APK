package com.android.p023dx.p024cf.cst;

import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstDouble;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstFloat;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstInterfaceMethodRef;
import com.android.p023dx.rop.cst.CstLong;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.StdConstantPool;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.util.BitSet;

/* renamed from: com.android.dx.cf.cst.ConstantPoolParser */
public final class ConstantPoolParser {
    private final ByteArray bytes;
    private int endOffset = -1;
    private ParseObserver observer;
    private final int[] offsets;
    private final StdConstantPool pool;

    public ConstantPoolParser(ByteArray byteArray) {
        int unsignedShort = byteArray.getUnsignedShort(8);
        this.bytes = byteArray;
        this.pool = new StdConstantPool(unsignedShort);
        this.offsets = new int[unsignedShort];
    }

    private void determineOffsets() {
        int i;
        int i2 = 10;
        int i3 = 1;
        while (true) {
            int[] iArr = this.offsets;
            if (i3 < iArr.length) {
                iArr[i3] = i2;
                int unsignedByte = this.bytes.getUnsignedByte(i2);
                switch (unsignedByte) {
                    case 1:
                        i2 += this.bytes.getUnsignedShort(i2 + 1) + 3;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        i2 += 5;
                        break;
                    case 5:
                    case 6:
                        i = 2;
                        i2 += 9;
                        continue;
                    case 7:
                    case 8:
                        i2 += 3;
                        break;
                    case 15:
                        throw new ParseException("MethodHandle not supported");
                    case 16:
                        throw new ParseException("MethodType not supported");
                    case 18:
                        throw new ParseException("InvokeDynamic not supported");
                    default:
                        try {
                            throw new ParseException("unknown tag byte: " + Hex.m906u1(unsignedByte));
                        } catch (ParseException e) {
                            e.addContext("...while preparsing cst " + Hex.m907u2(i3) + " at offset " + Hex.m909u4(i2));
                            throw e;
                        }
                }
                i = 1;
                i3 += i;
            } else {
                this.endOffset = i2;
                return;
            }
        }
    }

    private void parse() {
        String str;
        determineOffsets();
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            parseObserver.parsed(this.bytes, 8, 2, "constant_pool_count: " + Hex.m907u2(this.offsets.length));
            this.observer.parsed(this.bytes, 10, 0, "\nconstant_pool:");
            this.observer.changeIndent(1);
        }
        BitSet bitSet = new BitSet(this.offsets.length);
        int i = 1;
        while (true) {
            int[] iArr = this.offsets;
            if (i >= iArr.length) {
                break;
            }
            if (iArr[i] != 0 && this.pool.getOrNull(i) == null) {
                parse0(i, bitSet);
            }
            i++;
        }
        if (this.observer != null) {
            for (int i2 = 1; i2 < this.offsets.length; i2++) {
                Constant orNull = this.pool.getOrNull(i2);
                if (orNull != null) {
                    int i3 = this.offsets[i2];
                    int i4 = this.endOffset;
                    int i5 = i2 + 1;
                    while (true) {
                        int[] iArr2 = this.offsets;
                        if (i5 >= iArr2.length) {
                            break;
                        }
                        int i6 = iArr2[i5];
                        if (i6 != 0) {
                            i4 = i6;
                            break;
                        }
                        i5++;
                    }
                    if (bitSet.get(i2)) {
                        str = Hex.m907u2(i2) + ": utf8{\"" + orNull.toHuman() + "\"}";
                    } else {
                        str = Hex.m907u2(i2) + ": " + orNull.toString();
                    }
                    this.observer.parsed(this.bytes, i3, i4 - i3, str);
                }
            }
            this.observer.changeIndent(-1);
            this.observer.parsed(this.bytes, this.endOffset, 0, "end constant_pool");
        }
    }

    private Constant parse0(int i, BitSet bitSet) {
        Constant constant;
        Constant orNull = this.pool.getOrNull(i);
        if (orNull != null) {
            return orNull;
        }
        int i2 = this.offsets[i];
        try {
            int unsignedByte = this.bytes.getUnsignedByte(i2);
            switch (unsignedByte) {
                case 1:
                    constant = parseUtf8(i2);
                    bitSet.set(i);
                    break;
                case 3:
                    constant = CstInteger.make(this.bytes.getInt(i2 + 1));
                    break;
                case 4:
                    constant = CstFloat.make(this.bytes.getInt(i2 + 1));
                    break;
                case 5:
                    constant = CstLong.make(this.bytes.getLong(i2 + 1));
                    break;
                case 6:
                    constant = CstDouble.make(this.bytes.getLong(i2 + 1));
                    break;
                case 7:
                    constant = new CstType(Type.internClassName(((CstString) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet)).getString()));
                    break;
                case 8:
                    constant = parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet);
                    break;
                case 9:
                    constant = new CstFieldRef((CstType) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                    break;
                case 10:
                    constant = new CstMethodRef((CstType) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                    break;
                case 11:
                    constant = new CstInterfaceMethodRef((CstType) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                    break;
                case 12:
                    constant = new CstNat((CstString) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstString) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                    break;
                case 15:
                    throw new ParseException("MethodHandle not supported");
                case 16:
                    throw new ParseException("MethodType not supported");
                case 18:
                    throw new ParseException("InvokeDynamic not supported");
                default:
                    throw new ParseException("unknown tag byte: " + Hex.m906u1(unsignedByte));
            }
            this.pool.set(i, constant);
            return constant;
        } catch (ParseException e) {
            e.addContext("...while parsing cst " + Hex.m907u2(i) + " at offset " + Hex.m909u4(i2));
            throw e;
        } catch (RuntimeException e2) {
            ParseException parseException = new ParseException((Throwable) e2);
            parseException.addContext("...while parsing cst " + Hex.m907u2(i) + " at offset " + Hex.m909u4(i2));
            throw parseException;
        }
    }

    private void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    private CstString parseUtf8(int i) {
        int unsignedShort = this.bytes.getUnsignedShort(i + 1);
        int i2 = i + 3;
        try {
            return new CstString(this.bytes.slice(i2, unsignedShort + i2));
        } catch (IllegalArgumentException e) {
            throw new ParseException((Throwable) e);
        }
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public StdConstantPool getPool() {
        parseIfNecessary();
        return this.pool;
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }
}
