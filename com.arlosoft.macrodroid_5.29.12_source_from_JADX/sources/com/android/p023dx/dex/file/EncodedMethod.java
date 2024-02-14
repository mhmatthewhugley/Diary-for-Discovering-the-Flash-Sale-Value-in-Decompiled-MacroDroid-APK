package com.android.p023dx.dex.file;

import com.android.dex.Leb128;
import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.EncodedMethod */
public final class EncodedMethod extends EncodedMember implements Comparable<EncodedMethod> {
    private final CodeItem code;
    private final CstMethodRef method;

    public EncodedMethod(CstMethodRef cstMethodRef, int i, DalvCode dalvCode, TypeList typeList) {
        super(i);
        Objects.requireNonNull(cstMethodRef, "method == null");
        this.method = cstMethodRef;
        if (dalvCode == null) {
            this.code = null;
        } else {
            this.code = new CodeItem(cstMethodRef, dalvCode, (i & 8) != 0, typeList);
        }
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        CodeItem codeItem = this.code;
        if (codeItem != null) {
            wordData.add(codeItem);
        }
    }

    public void debugPrint(PrintWriter printWriter, boolean z) {
        CodeItem codeItem = this.code;
        if (codeItem == null) {
            printWriter.println(getRef().toHuman() + ": abstract or native");
            return;
        }
        codeItem.debugPrint(printWriter, "  ", z);
    }

    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int indexOf = dexFile.getMethodIds().indexOf(this.method);
        int i3 = indexOf - i;
        int accessFlags = getAccessFlags();
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.code);
        if ((absoluteOffsetOr0 != 0) == ((accessFlags & 1280) == 0)) {
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(0, String.format("  [%x] %s", new Object[]{Integer.valueOf(i2), this.method.toHuman()}));
                int unsignedLeb128Size = Leb128.unsignedLeb128Size(i3);
                annotatedOutput.annotate(unsignedLeb128Size, "    method_idx:   " + Hex.m909u4(indexOf));
                int unsignedLeb128Size2 = Leb128.unsignedLeb128Size(accessFlags);
                annotatedOutput.annotate(unsignedLeb128Size2, "    access_flags: " + AccessFlags.methodString(accessFlags));
                int unsignedLeb128Size3 = Leb128.unsignedLeb128Size(absoluteOffsetOr0);
                annotatedOutput.annotate(unsignedLeb128Size3, "    code_off:     " + Hex.m909u4(absoluteOffsetOr0));
            }
            annotatedOutput.writeUleb128(i3);
            annotatedOutput.writeUleb128(accessFlags);
            annotatedOutput.writeUleb128(absoluteOffsetOr0);
            return indexOf;
        }
        throw new UnsupportedOperationException("code vs. access_flags mismatch");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof EncodedMethod) && compareTo((EncodedMethod) obj) == 0) {
            return true;
        }
        return false;
    }

    public final CstString getName() {
        return this.method.getNat().getName();
    }

    public final CstMethodRef getRef() {
        return this.method;
    }

    public final String toHuman() {
        return this.method.toHuman();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(EncodedMethod.class.getName());
        stringBuffer.append('{');
        stringBuffer.append(Hex.m907u2(getAccessFlags()));
        stringBuffer.append(' ');
        stringBuffer.append(this.method);
        if (this.code != null) {
            stringBuffer.append(' ');
            stringBuffer.append(this.code);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public int compareTo(EncodedMethod encodedMethod) {
        return this.method.compareTo((Constant) encodedMethod.method);
    }
}
