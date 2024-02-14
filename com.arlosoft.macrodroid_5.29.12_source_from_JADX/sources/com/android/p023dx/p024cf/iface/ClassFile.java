package com.android.p023dx.p024cf.iface;

import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.TypeList;

/* renamed from: com.android.dx.cf.iface.ClassFile */
public interface ClassFile extends HasAttribute {
    int getAccessFlags();

    AttributeList getAttributes();

    ConstantPool getConstantPool();

    FieldList getFields();

    TypeList getInterfaces();

    int getMagic();

    int getMajorVersion();

    MethodList getMethods();

    int getMinorVersion();

    CstString getSourceFile();

    CstType getSuperclass();

    CstType getThisClass();
}
