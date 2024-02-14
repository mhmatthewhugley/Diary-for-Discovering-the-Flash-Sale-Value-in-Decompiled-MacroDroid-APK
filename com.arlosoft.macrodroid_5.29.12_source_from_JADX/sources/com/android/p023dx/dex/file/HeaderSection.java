package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.dx.dex.file.HeaderSection */
public final class HeaderSection extends UniformItemSection {
    private final List<HeaderItem> list;

    public HeaderSection(DexFile dexFile) {
        super((String) null, dexFile, 4);
        HeaderItem headerItem = new HeaderItem();
        headerItem.setIndex(0);
        this.list = Collections.singletonList(headerItem);
    }

    public IndexedItem get(Constant constant) {
        return null;
    }

    public Collection<? extends Item> items() {
        return this.list;
    }

    /* access modifiers changed from: protected */
    public void orderItems() {
    }
}
