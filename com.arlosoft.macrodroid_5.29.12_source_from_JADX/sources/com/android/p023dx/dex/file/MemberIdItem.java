package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstMemberRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.dex.file.MemberIdItem */
public abstract class MemberIdItem extends IdItem {
    private final CstMemberRef cst;

    public MemberIdItem(CstMemberRef cstMemberRef) {
        super(cstMemberRef.getDefiningClass());
        this.cst = cstMemberRef;
    }

    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getStringIds().intern(getRef().getNat().getName());
    }

    public final CstMemberRef getRef() {
        return this.cst;
    }

    /* access modifiers changed from: protected */
    public abstract int getTypoidIdx(DexFile dexFile);

    /* access modifiers changed from: protected */
    public abstract String getTypoidName();

    public int writeSize() {
        return 8;
    }

    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        StringIdsSection stringIds = dexFile.getStringIds();
        CstNat nat = this.cst.getNat();
        int indexOf = typeIds.indexOf(getDefiningClass());
        int indexOf2 = stringIds.indexOf(nat.getName());
        int typoidIdx = getTypoidIdx(dexFile);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + this.cst.toHuman());
            StringBuilder sb = new StringBuilder();
            sb.append("  class_idx: ");
            sb.append(Hex.m907u2(indexOf));
            annotatedOutput.annotate(2, sb.toString());
            annotatedOutput.annotate(2, String.format("  %-10s %s", new Object[]{getTypoidName() + ':', Hex.m907u2(typoidIdx)}));
            annotatedOutput.annotate(4, "  name_idx:  " + Hex.m909u4(indexOf2));
        }
        annotatedOutput.writeShort(indexOf);
        annotatedOutput.writeShort(typoidIdx);
        annotatedOutput.writeInt(indexOf2);
    }
}
