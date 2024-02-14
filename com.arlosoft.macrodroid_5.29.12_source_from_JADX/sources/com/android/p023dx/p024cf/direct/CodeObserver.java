package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.code.ByteOps;
import com.android.p023dx.p024cf.code.BytecodeArray;
import com.android.p023dx.p024cf.code.SwitchList;
import com.android.p023dx.p024cf.iface.ParseObserver;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstDouble;
import com.android.p023dx.rop.cst.CstFloat;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstKnownNull;
import com.android.p023dx.rop.cst.CstLong;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.direct.CodeObserver */
public class CodeObserver implements BytecodeArray.Visitor {
    private final ByteArray bytes;
    private final ParseObserver observer;

    public CodeObserver(ByteArray byteArray, ParseObserver parseObserver) {
        Objects.requireNonNull(byteArray, "bytes == null");
        Objects.requireNonNull(parseObserver, "observer == null");
        this.bytes = byteArray;
        this.observer = parseObserver;
    }

    private String header(int i) {
        int unsignedByte = this.bytes.getUnsignedByte(i);
        String opName = ByteOps.opName(unsignedByte);
        if (unsignedByte == 196) {
            int unsignedByte2 = this.bytes.getUnsignedByte(i + 1);
            opName = opName + " " + ByteOps.opName(unsignedByte2);
        }
        return Hex.m907u2(i) + ": " + opName;
    }

    private void visitLiteralDouble(int i, int i2, int i3, long j) {
        String str;
        if (i3 != 1) {
            str = " #" + Hex.m910u8(j);
        } else {
            str = "";
        }
        this.observer.parsed(this.bytes, i2, i3, header(i2) + str + " // " + Double.longBitsToDouble(j));
    }

    private void visitLiteralFloat(int i, int i2, int i3, int i4) {
        String str;
        if (i3 != 1) {
            str = " #" + Hex.m909u4(i4);
        } else {
            str = "";
        }
        this.observer.parsed(this.bytes, i2, i3, header(i2) + str + " // " + Float.intBitsToFloat(i4));
    }

    private void visitLiteralInt(int i, int i2, int i3, int i4) {
        String str;
        String str2 = i3 == 1 ? " // " : " ";
        int unsignedByte = this.bytes.getUnsignedByte(i2);
        if (i3 == 1 || unsignedByte == 16) {
            str = "#" + Hex.m902s1(i4);
        } else if (unsignedByte == 17) {
            str = "#" + Hex.m903s2(i4);
        } else {
            str = "#" + Hex.m904s4(i4);
        }
        this.observer.parsed(this.bytes, i2, i3, header(i2) + str2 + str);
    }

    private void visitLiteralLong(int i, int i2, int i3, long j) {
        String str;
        String str2 = i3 == 1 ? " // " : " #";
        if (i3 == 1) {
            str = Hex.m902s1((int) j);
        } else {
            str = Hex.m905s8(j);
        }
        ParseObserver parseObserver = this.observer;
        ByteArray byteArray = this.bytes;
        parseObserver.parsed(byteArray, i2, i3, header(i2) + str2 + str);
    }

    public int getPreviousOffset() {
        return -1;
    }

    public void setPreviousOffset(int i) {
    }

    public void visitBranch(int i, int i2, int i3, int i4) {
        String u2 = i3 <= 3 ? Hex.m907u2(i4) : Hex.m909u4(i4);
        ParseObserver parseObserver = this.observer;
        ByteArray byteArray = this.bytes;
        parseObserver.parsed(byteArray, i2, i3, header(i2) + " " + u2);
    }

    public void visitConstant(int i, int i2, int i3, Constant constant, int i4) {
        String str;
        if (constant instanceof CstKnownNull) {
            visitNoArgs(i, i2, i3, (Type) null);
        } else if (constant instanceof CstInteger) {
            visitLiteralInt(i, i2, i3, i4);
        } else if (constant instanceof CstLong) {
            visitLiteralLong(i, i2, i3, ((CstLong) constant).getValue());
        } else if (constant instanceof CstFloat) {
            visitLiteralFloat(i, i2, i3, ((CstFloat) constant).getIntBits());
        } else if (constant instanceof CstDouble) {
            visitLiteralDouble(i, i2, i3, ((CstDouble) constant).getLongBits());
        } else {
            if (i4 == 0) {
                str = "";
            } else if (i == 197) {
                str = ", " + Hex.m906u1(i4);
            } else {
                str = ", " + Hex.m907u2(i4);
            }
            this.observer.parsed(this.bytes, i2, i3, header(i2) + " " + constant + str);
        }
    }

    public void visitInvalid(int i, int i2, int i3) {
        this.observer.parsed(this.bytes, i2, i3, header(i2));
    }

    public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
        String str;
        String u1 = i3 <= 3 ? Hex.m906u1(i4) : Hex.m907u2(i4);
        boolean z = true;
        if (i3 != 1) {
            z = false;
        }
        String str2 = "";
        if (i == 132) {
            StringBuilder sb = new StringBuilder();
            sb.append(", #");
            sb.append(i3 <= 3 ? Hex.m902s1(i5) : Hex.m903s2(i5));
            str = sb.toString();
        } else {
            str = str2;
        }
        if (type.isCategory2()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "," : " //");
            sb2.append(" category-2");
            str2 = sb2.toString();
        }
        ParseObserver parseObserver = this.observer;
        ByteArray byteArray = this.bytes;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(header(i2));
        sb3.append(z ? " // " : " ");
        sb3.append(u1);
        sb3.append(str);
        sb3.append(str2);
        parseObserver.parsed(byteArray, i2, i3, sb3.toString());
    }

    public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
        String str = i2 == 1 ? " // " : " ";
        String human = cstType.getClassType().getComponentType().toHuman();
        ParseObserver parseObserver = this.observer;
        ByteArray byteArray = this.bytes;
        parseObserver.parsed(byteArray, i, i2, header(i) + str + human);
    }

    public void visitNoArgs(int i, int i2, int i3, Type type) {
        this.observer.parsed(this.bytes, i2, i3, header(i2));
    }

    public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
        int size = switchList.size();
        StringBuffer stringBuffer = new StringBuffer((size * 20) + 100);
        stringBuffer.append(header(i2));
        if (i4 != 0) {
            stringBuffer.append(" // padding: " + Hex.m909u4(i4));
        }
        stringBuffer.append(10);
        for (int i5 = 0; i5 < size; i5++) {
            stringBuffer.append("  ");
            stringBuffer.append(Hex.m904s4(switchList.getValue(i5)));
            stringBuffer.append(": ");
            stringBuffer.append(Hex.m907u2(switchList.getTarget(i5)));
            stringBuffer.append(10);
        }
        stringBuffer.append("  default: ");
        stringBuffer.append(Hex.m907u2(switchList.getDefaultTarget()));
        this.observer.parsed(this.bytes, i2, i3, stringBuffer.toString());
    }
}
