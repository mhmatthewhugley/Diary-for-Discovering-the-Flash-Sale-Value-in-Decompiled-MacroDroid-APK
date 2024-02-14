package com.android.p023dx.rop.cst;

/* renamed from: com.android.dx.rop.cst.ConstantPool */
public interface ConstantPool {
    Constant get(int i);

    Constant get0Ok(int i);

    Constant[] getEntries();

    Constant getOrNull(int i);

    int size();
}
