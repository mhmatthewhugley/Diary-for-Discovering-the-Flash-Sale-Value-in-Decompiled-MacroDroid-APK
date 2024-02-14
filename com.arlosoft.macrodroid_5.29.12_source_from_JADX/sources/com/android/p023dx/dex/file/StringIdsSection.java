package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Collection;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.StringIdsSection */
public final class StringIdsSection extends UniformItemSection {
    private final TreeMap<CstString, StringIdItem> strings = new TreeMap<>();

    public StringIdsSection(DexFile dexFile) {
        super("string_ids", dexFile, 4);
    }

    public IndexedItem get(Constant constant) {
        Objects.requireNonNull(constant, "cst == null");
        throwIfNotPrepared();
        IndexedItem indexedItem = this.strings.get((CstString) constant);
        if (indexedItem != null) {
            return indexedItem;
        }
        throw new IllegalArgumentException("not found");
    }

    public int indexOf(CstString cstString) {
        Objects.requireNonNull(cstString, "string == null");
        throwIfNotPrepared();
        StringIdItem stringIdItem = this.strings.get(cstString);
        if (stringIdItem != null) {
            return stringIdItem.getIndex();
        }
        throw new IllegalArgumentException("not found");
    }

    public StringIdItem intern(String str) {
        return intern(new StringIdItem(new CstString(str)));
    }

    public Collection<? extends Item> items() {
        return this.strings.values();
    }

    /* access modifiers changed from: protected */
    public void orderItems() {
        int i = 0;
        for (StringIdItem index : this.strings.values()) {
            index.setIndex(i);
            i++;
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int size = this.strings.size();
        if (size == 0) {
            i = 0;
        } else {
            i = getFileOffset();
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "string_ids_size: " + Hex.m909u4(size));
            annotatedOutput.annotate(4, "string_ids_off:  " + Hex.m909u4(i));
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(i);
    }

    public StringIdItem intern(CstString cstString) {
        return intern(new StringIdItem(cstString));
    }

    public synchronized StringIdItem intern(StringIdItem stringIdItem) {
        if (stringIdItem != null) {
            throwIfPrepared();
            CstString value = stringIdItem.getValue();
            StringIdItem stringIdItem2 = this.strings.get(value);
            if (stringIdItem2 != null) {
                return stringIdItem2;
            }
            this.strings.put(value, stringIdItem);
            return stringIdItem;
        }
        throw new NullPointerException("string == null");
    }

    public synchronized void intern(CstNat cstNat) {
        intern(cstNat.getName());
        intern(cstNat.getDescriptor());
    }
}
