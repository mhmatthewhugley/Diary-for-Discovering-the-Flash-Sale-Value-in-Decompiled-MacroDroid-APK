package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstBaseMethodRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Collection;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.MethodIdsSection */
public final class MethodIdsSection extends MemberIdsSection {
    private final TreeMap<CstBaseMethodRef, MethodIdItem> methodIds = new TreeMap<>();

    public MethodIdsSection(DexFile dexFile) {
        super("method_ids", dexFile);
    }

    public IndexedItem get(Constant constant) {
        Objects.requireNonNull(constant, "cst == null");
        throwIfNotPrepared();
        IndexedItem indexedItem = this.methodIds.get((CstBaseMethodRef) constant);
        if (indexedItem != null) {
            return indexedItem;
        }
        throw new IllegalArgumentException("not found");
    }

    public int indexOf(CstBaseMethodRef cstBaseMethodRef) {
        Objects.requireNonNull(cstBaseMethodRef, "ref == null");
        throwIfNotPrepared();
        MethodIdItem methodIdItem = this.methodIds.get(cstBaseMethodRef);
        if (methodIdItem != null) {
            return methodIdItem.getIndex();
        }
        throw new IllegalArgumentException("not found");
    }

    public synchronized MethodIdItem intern(CstBaseMethodRef cstBaseMethodRef) {
        MethodIdItem methodIdItem;
        if (cstBaseMethodRef != null) {
            throwIfPrepared();
            methodIdItem = this.methodIds.get(cstBaseMethodRef);
            if (methodIdItem == null) {
                methodIdItem = new MethodIdItem(cstBaseMethodRef);
                this.methodIds.put(cstBaseMethodRef, methodIdItem);
            }
        } else {
            throw new NullPointerException("method == null");
        }
        return methodIdItem;
    }

    public Collection<? extends Item> items() {
        return this.methodIds.values();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int size = this.methodIds.size();
        if (size == 0) {
            i = 0;
        } else {
            i = getFileOffset();
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "method_ids_size: " + Hex.m909u4(size));
            annotatedOutput.annotate(4, "method_ids_off:  " + Hex.m909u4(i));
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(i);
    }
}
