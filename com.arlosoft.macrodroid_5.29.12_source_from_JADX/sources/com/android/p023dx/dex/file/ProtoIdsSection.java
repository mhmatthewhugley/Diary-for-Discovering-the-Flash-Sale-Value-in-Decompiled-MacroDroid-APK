package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.android.dx.dex.file.ProtoIdsSection */
public final class ProtoIdsSection extends UniformItemSection {
    private final TreeMap<Prototype, ProtoIdItem> protoIds = new TreeMap<>();

    public ProtoIdsSection(DexFile dexFile) {
        super("proto_ids", dexFile, 4);
    }

    public IndexedItem get(Constant constant) {
        throw new UnsupportedOperationException("unsupported");
    }

    public int indexOf(Prototype prototype) {
        Objects.requireNonNull(prototype, "prototype == null");
        throwIfNotPrepared();
        ProtoIdItem protoIdItem = this.protoIds.get(prototype);
        if (protoIdItem != null) {
            return protoIdItem.getIndex();
        }
        throw new IllegalArgumentException("not found");
    }

    public synchronized ProtoIdItem intern(Prototype prototype) {
        ProtoIdItem protoIdItem;
        if (prototype != null) {
            throwIfPrepared();
            protoIdItem = this.protoIds.get(prototype);
            if (protoIdItem == null) {
                protoIdItem = new ProtoIdItem(prototype);
                this.protoIds.put(prototype, protoIdItem);
            }
        } else {
            throw new NullPointerException("prototype == null");
        }
        return protoIdItem;
    }

    public Collection<? extends Item> items() {
        return this.protoIds.values();
    }

    /* access modifiers changed from: protected */
    public void orderItems() {
        Iterator<? extends Item> it = items().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((ProtoIdItem) it.next()).setIndex(i);
            i++;
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int size = this.protoIds.size();
        if (size == 0) {
            i = 0;
        } else {
            i = getFileOffset();
        }
        if (size <= 65536) {
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(4, "proto_ids_size:  " + Hex.m909u4(size));
                annotatedOutput.annotate(4, "proto_ids_off:   " + Hex.m909u4(i));
            }
            annotatedOutput.writeInt(size);
            annotatedOutput.writeInt(i);
            return;
        }
        throw new UnsupportedOperationException("too many proto ids");
    }
}
