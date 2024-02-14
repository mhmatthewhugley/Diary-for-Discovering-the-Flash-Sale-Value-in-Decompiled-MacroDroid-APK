package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.CstString;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.AttSourceFile */
public final class AttSourceFile extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "SourceFile";
    private final CstString sourceFile;

    public AttSourceFile(CstString cstString) {
        super(ATTRIBUTE_NAME);
        Objects.requireNonNull(cstString, "sourceFile == null");
        this.sourceFile = cstString;
    }

    public int byteLength() {
        return 8;
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }
}
