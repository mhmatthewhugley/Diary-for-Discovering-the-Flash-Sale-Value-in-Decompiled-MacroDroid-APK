package com.android.p023dx.dex.file;

import com.android.p023dx.util.AnnotatedOutput;

/* renamed from: com.android.dx.dex.file.Item */
public abstract class Item {
    public abstract void addContents(DexFile dexFile);

    public abstract ItemType itemType();

    public final String typeName() {
        return itemType().toHuman();
    }

    public abstract int writeSize();

    public abstract void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput);
}
