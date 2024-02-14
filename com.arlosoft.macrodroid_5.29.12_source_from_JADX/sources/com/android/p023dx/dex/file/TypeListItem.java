package com.android.p023dx.dex.file;

import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.dex.file.TypeListItem */
public final class TypeListItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ELEMENT_SIZE = 2;
    private static final int HEADER_SIZE = 4;
    private final TypeList list;

    public TypeListItem(TypeList typeList) {
        super(4, (typeList.size() * 2) + 4);
        this.list = typeList;
    }

    public void addContents(DexFile dexFile) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            typeIds.intern(this.list.getType(i));
        }
    }

    /* access modifiers changed from: protected */
    public int compareTo0(OffsettedItem offsettedItem) {
        return StdTypeList.compareContents(this.list, ((TypeListItem) offsettedItem).list);
    }

    public TypeList getList() {
        return this.list;
    }

    public int hashCode() {
        return StdTypeList.hashContents(this.list);
    }

    public ItemType itemType() {
        return ItemType.TYPE_TYPE_LIST;
    }

    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int size = this.list.size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, offsetString() + " type_list");
            annotatedOutput.annotate(4, "  size: " + Hex.m909u4(size));
            for (int i = 0; i < size; i++) {
                Type type = this.list.getType(i);
                int indexOf = typeIds.indexOf(type);
                annotatedOutput.annotate(2, "  " + Hex.m907u2(indexOf) + " // " + type.toHuman());
            }
        }
        annotatedOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            annotatedOutput.writeShort(typeIds.indexOf(this.list.getType(i2)));
        }
    }
}
