package com.android.p023dx.dex.file;

import com.android.dex.Leb128;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.EncodedField */
public final class EncodedField extends EncodedMember implements Comparable<EncodedField> {
    private final CstFieldRef field;

    public EncodedField(CstFieldRef cstFieldRef, int i) {
        super(i);
        Objects.requireNonNull(cstFieldRef, "field == null");
        this.field = cstFieldRef;
    }

    public void addContents(DexFile dexFile) {
        dexFile.getFieldIds().intern(this.field);
    }

    public void debugPrint(PrintWriter printWriter, boolean z) {
        printWriter.println(toString());
    }

    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int indexOf = dexFile.getFieldIds().indexOf(this.field);
        int i3 = indexOf - i;
        int accessFlags = getAccessFlags();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", new Object[]{Integer.valueOf(i2), this.field.toHuman()}));
            int unsignedLeb128Size = Leb128.unsignedLeb128Size(i3);
            annotatedOutput.annotate(unsignedLeb128Size, "    field_idx:    " + Hex.m909u4(indexOf));
            int unsignedLeb128Size2 = Leb128.unsignedLeb128Size(accessFlags);
            annotatedOutput.annotate(unsignedLeb128Size2, "    access_flags: " + AccessFlags.fieldString(accessFlags));
        }
        annotatedOutput.writeUleb128(i3);
        annotatedOutput.writeUleb128(accessFlags);
        return indexOf;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof EncodedField) && compareTo((EncodedField) obj) == 0) {
            return true;
        }
        return false;
    }

    public CstString getName() {
        return this.field.getNat().getName();
    }

    public CstFieldRef getRef() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public String toHuman() {
        return this.field.toHuman();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(EncodedField.class.getName());
        stringBuffer.append('{');
        stringBuffer.append(Hex.m907u2(getAccessFlags()));
        stringBuffer.append(' ');
        stringBuffer.append(this.field);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public int compareTo(EncodedField encodedField) {
        return this.field.compareTo((Constant) encodedField.field);
    }
}
