package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstType;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.IdItem */
public abstract class IdItem extends IndexedItem {
    private final CstType type;

    public IdItem(CstType cstType) {
        Objects.requireNonNull(cstType, "type == null");
        this.type = cstType;
    }

    public void addContents(DexFile dexFile) {
        dexFile.getTypeIds().intern(this.type);
    }

    public final CstType getDefiningClass() {
        return this.type;
    }
}
