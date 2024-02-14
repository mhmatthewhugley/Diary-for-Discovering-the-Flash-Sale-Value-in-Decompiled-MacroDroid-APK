package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;

public final class FieldId implements Comparable<FieldId> {
    private final int declaringClassIndex;
    private final Dex dex;
    private final int nameIndex;
    private final int typeIndex;

    public FieldId(Dex dex2, int i, int i2, int i3) {
        this.dex = dex2;
        this.declaringClassIndex = i;
        this.typeIndex = i2;
        this.nameIndex = i3;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int getTypeIndex() {
        return this.typeIndex;
    }

    public String toString() {
        if (this.dex == null) {
            return this.declaringClassIndex + " " + this.typeIndex + " " + this.nameIndex;
        }
        return this.dex.typeNames().get(this.typeIndex) + "." + this.dex.strings().get(this.nameIndex);
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.typeIndex);
        section.writeInt(this.nameIndex);
    }

    public int compareTo(FieldId fieldId) {
        int i = this.declaringClassIndex;
        int i2 = fieldId.declaringClassIndex;
        if (i != i2) {
            return Unsigned.compare(i, i2);
        }
        int i3 = this.nameIndex;
        int i4 = fieldId.nameIndex;
        if (i3 != i4) {
            return Unsigned.compare(i3, i4);
        }
        return Unsigned.compare(this.typeIndex, fieldId.typeIndex);
    }
}
