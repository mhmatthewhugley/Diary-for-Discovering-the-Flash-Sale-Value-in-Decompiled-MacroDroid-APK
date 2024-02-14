package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.StdField;
import com.android.p023dx.p024cf.iface.StdFieldList;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstType;

/* renamed from: com.android.dx.cf.direct.FieldListParser */
final class FieldListParser extends MemberListParser {
    private final StdFieldList fields = new StdFieldList(getCount());

    public FieldListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i, attributeFactory);
    }

    /* access modifiers changed from: protected */
    public int getAttributeContext() {
        return 1;
    }

    public StdFieldList getList() {
        parseIfNecessary();
        return this.fields;
    }

    /* access modifiers changed from: protected */
    public String humanAccessFlags(int i) {
        return AccessFlags.fieldString(i);
    }

    /* access modifiers changed from: protected */
    public String humanName() {
        return "field";
    }

    /* access modifiers changed from: protected */
    public Member set(int i, int i2, CstNat cstNat, AttributeList attributeList) {
        StdField stdField = new StdField(getDefiner(), i2, cstNat, attributeList);
        this.fields.set(i, stdField);
        return stdField;
    }
}
