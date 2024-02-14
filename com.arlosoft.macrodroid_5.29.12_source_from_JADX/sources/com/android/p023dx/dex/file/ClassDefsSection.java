package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.ClassDefsSection */
public final class ClassDefsSection extends UniformItemSection {
    private final TreeMap<Type, ClassDefItem> classDefs = new TreeMap<>();
    private ArrayList<ClassDefItem> orderedDefs = null;

    public ClassDefsSection(DexFile dexFile) {
        super("class_defs", dexFile, 4);
    }

    private int orderItems0(Type type, int i, int i2) {
        ClassDefItem classDefItem = this.classDefs.get(type);
        if (classDefItem == null || classDefItem.hasIndex()) {
            return i;
        }
        if (i2 >= 0) {
            int i3 = i2 - 1;
            CstType superclass = classDefItem.getSuperclass();
            if (superclass != null) {
                i = orderItems0(superclass.getClassType(), i, i3);
            }
            TypeList interfaces = classDefItem.getInterfaces();
            int size = interfaces.size();
            for (int i4 = 0; i4 < size; i4++) {
                i = orderItems0(interfaces.getType(i4), i, i3);
            }
            classDefItem.setIndex(i);
            this.orderedDefs.add(classDefItem);
            return i + 1;
        }
        throw new RuntimeException("class circularity with " + type);
    }

    public void add(ClassDefItem classDefItem) {
        try {
            Type classType = classDefItem.getThisClass().getClassType();
            throwIfPrepared();
            if (this.classDefs.get(classType) == null) {
                this.classDefs.put(classType, classDefItem);
                return;
            }
            throw new IllegalArgumentException("already added: " + classType);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    public IndexedItem get(Constant constant) {
        Objects.requireNonNull(constant, "cst == null");
        throwIfNotPrepared();
        IndexedItem indexedItem = this.classDefs.get(((CstType) constant).getClassType());
        if (indexedItem != null) {
            return indexedItem;
        }
        throw new IllegalArgumentException("not found");
    }

    public Collection<? extends Item> items() {
        ArrayList<ClassDefItem> arrayList = this.orderedDefs;
        if (arrayList != null) {
            return arrayList;
        }
        return this.classDefs.values();
    }

    /* access modifiers changed from: protected */
    public void orderItems() {
        int size = this.classDefs.size();
        this.orderedDefs = new ArrayList<>(size);
        int i = 0;
        for (Type orderItems0 : this.classDefs.keySet()) {
            i = orderItems0(orderItems0, i, size - i);
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int size = this.classDefs.size();
        if (size == 0) {
            i = 0;
        } else {
            i = getFileOffset();
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "class_defs_size: " + Hex.m909u4(size));
            annotatedOutput.annotate(4, "class_defs_off:  " + Hex.m909u4(i));
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(i);
    }
}
