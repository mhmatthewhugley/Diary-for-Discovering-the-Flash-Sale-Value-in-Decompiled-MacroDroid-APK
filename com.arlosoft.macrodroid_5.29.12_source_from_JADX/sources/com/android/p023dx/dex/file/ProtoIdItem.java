package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.ProtoIdItem */
public final class ProtoIdItem extends IndexedItem {
    private TypeListItem parameterTypes;
    private final Prototype prototype;
    private final CstString shortForm;

    public ProtoIdItem(Prototype prototype2) {
        Objects.requireNonNull(prototype2, "prototype == null");
        this.prototype = prototype2;
        this.shortForm = makeShortForm(prototype2);
        StdTypeList parameterTypes2 = prototype2.getParameterTypes();
        this.parameterTypes = parameterTypes2.size() == 0 ? null : new TypeListItem(parameterTypes2);
    }

    private static CstString makeShortForm(Prototype prototype2) {
        StdTypeList parameterTypes2 = prototype2.getParameterTypes();
        int size = parameterTypes2.size();
        StringBuilder sb = new StringBuilder(size + 1);
        sb.append(shortFormCharFor(prototype2.getReturnType()));
        for (int i = 0; i < size; i++) {
            sb.append(shortFormCharFor(parameterTypes2.getType(i)));
        }
        return new CstString(sb.toString());
    }

    private static char shortFormCharFor(Type type) {
        char charAt = type.getDescriptor().charAt(0);
        if (charAt == '[') {
            return 'L';
        }
        return charAt;
    }

    public void addContents(DexFile dexFile) {
        StringIdsSection stringIds = dexFile.getStringIds();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        MixedItemSection typeLists = dexFile.getTypeLists();
        typeIds.intern(this.prototype.getReturnType());
        stringIds.intern(this.shortForm);
        TypeListItem typeListItem = this.parameterTypes;
        if (typeListItem != null) {
            this.parameterTypes = (TypeListItem) typeLists.intern(typeListItem);
        }
    }

    public ItemType itemType() {
        return ItemType.TYPE_PROTO_ID_ITEM;
    }

    public int writeSize() {
        return 12;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int indexOf = dexFile.getStringIds().indexOf(this.shortForm);
        int indexOf2 = dexFile.getTypeIds().indexOf(this.prototype.getReturnType());
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.parameterTypes);
        if (annotatedOutput.annotates()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.prototype.getReturnType().toHuman());
            sb.append(" proto(");
            StdTypeList parameterTypes2 = this.prototype.getParameterTypes();
            int size = parameterTypes2.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(parameterTypes2.getType(i).toHuman());
            }
            sb.append(")");
            annotatedOutput.annotate(0, indexString() + ' ' + sb.toString());
            annotatedOutput.annotate(4, "  shorty_idx:      " + Hex.m909u4(indexOf) + " // " + this.shortForm.toQuoted());
            annotatedOutput.annotate(4, "  return_type_idx: " + Hex.m909u4(indexOf2) + " // " + this.prototype.getReturnType().toHuman());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  parameters_off:  ");
            sb2.append(Hex.m909u4(absoluteOffsetOr0));
            annotatedOutput.annotate(4, sb2.toString());
        }
        annotatedOutput.writeInt(indexOf);
        annotatedOutput.writeInt(indexOf2);
        annotatedOutput.writeInt(absoluteOffsetOr0);
    }
}
