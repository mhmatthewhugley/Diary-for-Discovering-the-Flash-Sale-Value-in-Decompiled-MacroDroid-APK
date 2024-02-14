package com.android.p023dx.p024cf.code;

import com.android.p023dx.p024cf.attrib.AttCode;
import com.android.p023dx.p024cf.attrib.AttLineNumberTable;
import com.android.p023dx.p024cf.attrib.AttLocalVariableTable;
import com.android.p023dx.p024cf.attrib.AttLocalVariableTypeTable;
import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.p024cf.iface.ClassFile;
import com.android.p023dx.p024cf.iface.Method;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Prototype;

/* renamed from: com.android.dx.cf.code.ConcreteMethod */
public final class ConcreteMethod implements Method {
    private final boolean accSuper;
    private final AttCode attCode;
    private final LineNumberList lineNumbers;
    private final LocalVariableList localVariables;
    private final Method method;
    private final CstString sourceFile;

    public ConcreteMethod(Method method2, ClassFile classFile, boolean z, boolean z2) {
        this(method2, classFile.getAccessFlags(), classFile.getSourceFile(), z, z2);
    }

    public boolean getAccSuper() {
        return this.accSuper;
    }

    public int getAccessFlags() {
        return this.method.getAccessFlags();
    }

    public AttributeList getAttributes() {
        return this.method.getAttributes();
    }

    public ByteCatchList getCatches() {
        return this.attCode.getCatches();
    }

    public BytecodeArray getCode() {
        return this.attCode.getCode();
    }

    public CstType getDefiningClass() {
        return this.method.getDefiningClass();
    }

    public CstString getDescriptor() {
        return this.method.getDescriptor();
    }

    public Prototype getEffectiveDescriptor() {
        return this.method.getEffectiveDescriptor();
    }

    public LineNumberList getLineNumbers() {
        return this.lineNumbers;
    }

    public LocalVariableList getLocalVariables() {
        return this.localVariables;
    }

    public int getMaxLocals() {
        return this.attCode.getMaxLocals();
    }

    public int getMaxStack() {
        return this.attCode.getMaxStack();
    }

    public CstString getName() {
        return this.method.getName();
    }

    public CstNat getNat() {
        return this.method.getNat();
    }

    public SourcePosition makeSourcePosistion(int i) {
        return new SourcePosition(this.sourceFile, i, this.lineNumbers.pcToLine(i));
    }

    public ConcreteMethod(Method method2, int i, CstString cstString, boolean z, boolean z2) {
        this.method = method2;
        this.accSuper = (i & 32) != 0;
        this.sourceFile = cstString;
        AttCode attCode2 = (AttCode) method2.getAttributes().findFirst(AttCode.ATTRIBUTE_NAME);
        this.attCode = attCode2;
        AttributeList attributes = attCode2.getAttributes();
        LineNumberList lineNumberList = LineNumberList.EMPTY;
        if (z) {
            for (AttLineNumberTable attLineNumberTable = (AttLineNumberTable) attributes.findFirst(AttLineNumberTable.ATTRIBUTE_NAME); attLineNumberTable != null; attLineNumberTable = (AttLineNumberTable) attributes.findNext(attLineNumberTable)) {
                lineNumberList = LineNumberList.concat(lineNumberList, attLineNumberTable.getLineNumbers());
            }
        }
        this.lineNumbers = lineNumberList;
        LocalVariableList localVariableList = LocalVariableList.EMPTY;
        if (z2) {
            for (AttLocalVariableTable attLocalVariableTable = (AttLocalVariableTable) attributes.findFirst(AttLocalVariableTable.ATTRIBUTE_NAME); attLocalVariableTable != null; attLocalVariableTable = (AttLocalVariableTable) attributes.findNext(attLocalVariableTable)) {
                localVariableList = LocalVariableList.concat(localVariableList, attLocalVariableTable.getLocalVariables());
            }
            LocalVariableList localVariableList2 = LocalVariableList.EMPTY;
            for (AttLocalVariableTypeTable attLocalVariableTypeTable = (AttLocalVariableTypeTable) attributes.findFirst(AttLocalVariableTypeTable.ATTRIBUTE_NAME); attLocalVariableTypeTable != null; attLocalVariableTypeTable = (AttLocalVariableTypeTable) attributes.findNext(attLocalVariableTypeTable)) {
                localVariableList2 = LocalVariableList.concat(localVariableList2, attLocalVariableTypeTable.getLocalVariables());
            }
            if (localVariableList2.size() != 0) {
                localVariableList = LocalVariableList.mergeDescriptorsAndSignatures(localVariableList, localVariableList2);
            }
        }
        this.localVariables = localVariableList;
    }
}
