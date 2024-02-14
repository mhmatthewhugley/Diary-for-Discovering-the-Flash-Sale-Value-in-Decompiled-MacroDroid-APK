package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Collection;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.FieldIdsSection */
public final class FieldIdsSection extends MemberIdsSection {
    private final TreeMap<CstFieldRef, FieldIdItem> fieldIds = new TreeMap<>();

    public FieldIdsSection(DexFile dexFile) {
        super("field_ids", dexFile);
    }

    public IndexedItem get(Constant constant) {
        Objects.requireNonNull(constant, "cst == null");
        throwIfNotPrepared();
        IndexedItem indexedItem = this.fieldIds.get((CstFieldRef) constant);
        if (indexedItem != null) {
            return indexedItem;
        }
        throw new IllegalArgumentException("not found");
    }

    public int indexOf(CstFieldRef cstFieldRef) {
        Objects.requireNonNull(cstFieldRef, "ref == null");
        throwIfNotPrepared();
        FieldIdItem fieldIdItem = this.fieldIds.get(cstFieldRef);
        if (fieldIdItem != null) {
            return fieldIdItem.getIndex();
        }
        throw new IllegalArgumentException("not found");
    }

    public synchronized FieldIdItem intern(CstFieldRef cstFieldRef) {
        FieldIdItem fieldIdItem;
        if (cstFieldRef != null) {
            throwIfPrepared();
            fieldIdItem = this.fieldIds.get(cstFieldRef);
            if (fieldIdItem == null) {
                fieldIdItem = new FieldIdItem(cstFieldRef);
                this.fieldIds.put(cstFieldRef, fieldIdItem);
            }
        } else {
            throw new NullPointerException("field == null");
        }
        return fieldIdItem;
    }

    public Collection<? extends Item> items() {
        return this.fieldIds.values();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int size = this.fieldIds.size();
        if (size == 0) {
            i = 0;
        } else {
            i = getFileOffset();
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "field_ids_size:  " + Hex.m909u4(size));
            annotatedOutput.annotate(4, "field_ids_off:   " + Hex.m909u4(i));
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(i);
    }
}
