package com.android.p023dx.rop.code;

import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.rop.code.SourcePosition */
public final class SourcePosition {
    public static final SourcePosition NO_INFO = new SourcePosition((CstString) null, -1, -1);
    private final int address;
    private final int line;
    private final CstString sourceFile;

    public SourcePosition(CstString cstString, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        } else if (i2 >= -1) {
            this.sourceFile = cstString;
            this.address = i;
            this.line = i2;
        } else {
            throw new IllegalArgumentException("line < -1");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourcePosition)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourcePosition sourcePosition = (SourcePosition) obj;
        if (this.address != sourcePosition.address || !sameLineAndFile(sourcePosition)) {
            return false;
        }
        return true;
    }

    public int getAddress() {
        return this.address;
    }

    public int getLine() {
        return this.line;
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }

    public int hashCode() {
        return this.sourceFile.hashCode() + this.address + this.line;
    }

    public boolean sameLine(SourcePosition sourcePosition) {
        return this.line == sourcePosition.line;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.sourceFile;
        r3 = r3.sourceFile;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sameLineAndFile(com.android.p023dx.rop.code.SourcePosition r3) {
        /*
            r2 = this;
            int r0 = r2.line
            int r1 = r3.line
            if (r0 != r1) goto L_0x0016
            com.android.dx.rop.cst.CstString r0 = r2.sourceFile
            com.android.dx.rop.cst.CstString r3 = r3.sourceFile
            if (r0 == r3) goto L_0x0014
            if (r0 == 0) goto L_0x0016
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0016
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.rop.code.SourcePosition.sameLineAndFile(com.android.dx.rop.code.SourcePosition):boolean");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        CstString cstString = this.sourceFile;
        if (cstString != null) {
            stringBuffer.append(cstString.toHuman());
            stringBuffer.append(":");
        }
        int i = this.line;
        if (i >= 0) {
            stringBuffer.append(i);
        }
        stringBuffer.append('@');
        int i2 = this.address;
        if (i2 < 0) {
            stringBuffer.append("????");
        } else {
            stringBuffer.append(Hex.m907u2(i2));
        }
        return stringBuffer.toString();
    }
}
