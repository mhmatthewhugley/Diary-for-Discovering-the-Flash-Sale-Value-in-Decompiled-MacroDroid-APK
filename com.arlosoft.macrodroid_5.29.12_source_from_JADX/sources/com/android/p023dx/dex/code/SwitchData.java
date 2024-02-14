package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.IntList;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.SwitchData */
public final class SwitchData extends VariableSizeInsn {
    private final IntList cases;
    private final boolean packed;
    private final CodeAddress[] targets;
    private final CodeAddress user;

    public SwitchData(SourcePosition sourcePosition, CodeAddress codeAddress, IntList intList, CodeAddress[] codeAddressArr) {
        super(sourcePosition, RegisterSpecList.EMPTY);
        Objects.requireNonNull(codeAddress, "user == null");
        Objects.requireNonNull(intList, "cases == null");
        Objects.requireNonNull(codeAddressArr, "targets == null");
        int size = intList.size();
        if (size != codeAddressArr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        } else if (size <= 65535) {
            this.user = codeAddress;
            this.cases = intList;
            this.targets = codeAddressArr;
            this.packed = shouldPack(intList);
        } else {
            throw new IllegalArgumentException("too many cases");
        }
    }

    private static long packedCodeSize(IntList intList) {
        long j = (((((long) intList.get(intList.size() - 1)) - ((long) intList.get(0))) + 1) * 2) + 4;
        if (j <= 2147483647L) {
            return j;
        }
        return -1;
    }

    private static boolean shouldPack(IntList intList) {
        if (intList.size() < 2) {
            return true;
        }
        long packedCodeSize = packedCodeSize(intList);
        long sparseCodeSize = sparseCodeSize(intList);
        if (packedCodeSize < 0 || packedCodeSize > (sparseCodeSize * 5) / 4) {
            return false;
        }
        return true;
    }

    private static long sparseCodeSize(IntList intList) {
        return (((long) intList.size()) * 4) + 2;
    }

    /* access modifiers changed from: protected */
    public String argString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        int length = this.targets.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append("\n    ");
            stringBuffer.append(this.cases.get(i));
            stringBuffer.append(": ");
            stringBuffer.append(this.targets[i]);
        }
        return stringBuffer.toString();
    }

    public int codeSize() {
        long j;
        if (this.packed) {
            j = packedCodeSize(this.cases);
        } else {
            j = sparseCodeSize(this.cases);
        }
        return (int) j;
    }

    public boolean isPacked() {
        return this.packed;
    }

    /* access modifiers changed from: protected */
    public String listingString0(boolean z) {
        int address = this.user.getAddress();
        StringBuffer stringBuffer = new StringBuffer(100);
        int length = this.targets.length;
        stringBuffer.append(this.packed ? "packed" : "sparse");
        stringBuffer.append("-switch-payload // for switch @ ");
        stringBuffer.append(Hex.m907u2(address));
        for (int i = 0; i < length; i++) {
            int address2 = this.targets[i].getAddress();
            stringBuffer.append("\n  ");
            stringBuffer.append(this.cases.get(i));
            stringBuffer.append(": ");
            stringBuffer.append(Hex.m909u4(address2));
            stringBuffer.append(" // ");
            stringBuffer.append(Hex.m904s4(address2 - address));
        }
        return stringBuffer.toString();
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SwitchData(getPosition(), this.user, this.cases, this.targets);
    }

    public void writeTo(AnnotatedOutput annotatedOutput) {
        int i;
        int i2;
        int i3;
        int address = this.user.getAddress();
        int codeSize = Dops.PACKED_SWITCH.getFormat().codeSize();
        int length = this.targets.length;
        int i4 = 0;
        if (this.packed) {
            if (length == 0) {
                i = 0;
            } else {
                i = this.cases.get(0);
            }
            if (length == 0) {
                i2 = 0;
            } else {
                i2 = this.cases.get(length - 1);
            }
            int i5 = (i2 - i) + 1;
            annotatedOutput.writeShort(256);
            annotatedOutput.writeShort(i5);
            annotatedOutput.writeInt(i);
            int i6 = 0;
            while (i4 < i5) {
                if (this.cases.get(i6) > i + i4) {
                    i3 = codeSize;
                } else {
                    i3 = this.targets[i6].getAddress() - address;
                    i6++;
                }
                annotatedOutput.writeInt(i3);
                i4++;
            }
            return;
        }
        annotatedOutput.writeShort(512);
        annotatedOutput.writeShort(length);
        for (int i7 = 0; i7 < length; i7++) {
            annotatedOutput.writeInt(this.cases.get(i7));
        }
        while (i4 < length) {
            annotatedOutput.writeInt(this.targets[i4].getAddress() - address);
            i4++;
        }
    }
}
