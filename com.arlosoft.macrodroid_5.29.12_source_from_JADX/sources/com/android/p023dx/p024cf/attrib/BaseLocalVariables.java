package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.p024cf.code.LocalVariableList;
import com.android.p023dx.util.MutabilityException;

/* renamed from: com.android.dx.cf.attrib.BaseLocalVariables */
public abstract class BaseLocalVariables extends BaseAttribute {
    private final LocalVariableList localVariables;

    public BaseLocalVariables(String str, LocalVariableList localVariableList) {
        super(str);
        try {
            if (!localVariableList.isMutable()) {
                this.localVariables = localVariableList;
                return;
            }
            throw new MutabilityException("localVariables.isMutable()");
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    public final int byteLength() {
        return (this.localVariables.size() * 10) + 8;
    }

    public final LocalVariableList getLocalVariables() {
        return this.localVariables;
    }
}
