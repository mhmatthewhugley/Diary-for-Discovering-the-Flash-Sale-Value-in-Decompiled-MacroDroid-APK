package com.android.p023dx.dex.file;

import com.android.dex.DexIndexOverflowException;
import com.android.p023dx.command.dexer.Main;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.TypeIdsSection */
public final class TypeIdsSection extends UniformItemSection {
    private final TreeMap<Type, TypeIdItem> typeIds = new TreeMap<>();

    public TypeIdsSection(DexFile dexFile) {
        super("type_ids", dexFile, 4);
    }

    public IndexedItem get(Constant constant) {
        Objects.requireNonNull(constant, "cst == null");
        throwIfNotPrepared();
        IndexedItem indexedItem = this.typeIds.get(((CstType) constant).getClassType());
        if (indexedItem != null) {
            return indexedItem;
        }
        throw new IllegalArgumentException("not found: " + constant);
    }

    public int indexOf(Type type) {
        Objects.requireNonNull(type, "type == null");
        throwIfNotPrepared();
        TypeIdItem typeIdItem = this.typeIds.get(type);
        if (typeIdItem != null) {
            return typeIdItem.getIndex();
        }
        throw new IllegalArgumentException("not found: " + type);
    }

    public synchronized TypeIdItem intern(Type type) {
        TypeIdItem typeIdItem;
        if (type != null) {
            throwIfPrepared();
            typeIdItem = this.typeIds.get(type);
            if (typeIdItem == null) {
                typeIdItem = new TypeIdItem(new CstType(type));
                this.typeIds.put(type, typeIdItem);
            }
        } else {
            throw new NullPointerException("type == null");
        }
        return typeIdItem;
    }

    public Collection<? extends Item> items() {
        return this.typeIds.values();
    }

    /* access modifiers changed from: protected */
    public void orderItems() {
        Iterator<? extends Item> it = items().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((TypeIdItem) it.next()).setIndex(i);
            i++;
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int size = this.typeIds.size();
        if (size == 0) {
            i = 0;
        } else {
            i = getFileOffset();
        }
        if (size <= 65536) {
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(4, "type_ids_size:   " + Hex.m909u4(size));
                annotatedOutput.annotate(4, "type_ids_off:    " + Hex.m909u4(i));
            }
            annotatedOutput.writeInt(size);
            annotatedOutput.writeInt(i);
            return;
        }
        throw new DexIndexOverflowException("Too many type references: " + size + "; max is " + 65536 + ".\n" + Main.getTooManyIdsErrorMessage());
    }

    public int indexOf(CstType cstType) {
        Objects.requireNonNull(cstType, "type == null");
        return indexOf(cstType.getClassType());
    }

    public synchronized TypeIdItem intern(CstType cstType) {
        TypeIdItem typeIdItem;
        if (cstType != null) {
            throwIfPrepared();
            Type classType = cstType.getClassType();
            typeIdItem = this.typeIds.get(classType);
            if (typeIdItem == null) {
                typeIdItem = new TypeIdItem(cstType);
                this.typeIds.put(classType, typeIdItem);
            }
        } else {
            throw new NullPointerException("type == null");
        }
        return typeIdItem;
    }
}
