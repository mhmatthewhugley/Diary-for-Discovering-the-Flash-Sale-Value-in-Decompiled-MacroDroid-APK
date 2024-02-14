package com.android.p023dx.p024cf.direct;

import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.p024cf.iface.Member;
import com.android.p023dx.p024cf.iface.StdMethod;
import com.android.p023dx.p024cf.iface.StdMethodList;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstType;

/* renamed from: com.android.dx.cf.direct.MethodListParser */
final class MethodListParser extends MemberListParser {
    private final StdMethodList methods = new StdMethodList(getCount());

    public MethodListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i, attributeFactory);
    }

    /* access modifiers changed from: protected */
    public int getAttributeContext() {
        return 2;
    }

    public StdMethodList getList() {
        parseIfNecessary();
        return this.methods;
    }

    /* access modifiers changed from: protected */
    public String humanAccessFlags(int i) {
        return AccessFlags.methodString(i);
    }

    /* access modifiers changed from: protected */
    public String humanName() {
        return "method";
    }

    /* access modifiers changed from: protected */
    public Member set(int i, int i2, CstNat cstNat, AttributeList attributeList) {
        StdMethod stdMethod = new StdMethod(getDefiner(), i2, cstNat, attributeList);
        this.methods.set(i, stdMethod);
        return stdMethod;
    }
}
