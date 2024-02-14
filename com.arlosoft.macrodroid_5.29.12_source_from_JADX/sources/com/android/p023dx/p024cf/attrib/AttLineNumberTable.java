package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.p024cf.code.LineNumberList;
import com.android.p023dx.util.MutabilityException;

/* renamed from: com.android.dx.cf.attrib.AttLineNumberTable */
public final class AttLineNumberTable extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "LineNumberTable";
    private final LineNumberList lineNumbers;

    public AttLineNumberTable(LineNumberList lineNumberList) {
        super(ATTRIBUTE_NAME);
        try {
            if (!lineNumberList.isMutable()) {
                this.lineNumbers = lineNumberList;
                return;
            }
            throw new MutabilityException("lineNumbers.isMutable()");
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    public int byteLength() {
        return (this.lineNumbers.size() * 4) + 8;
    }

    public LineNumberList getLineNumbers() {
        return this.lineNumbers;
    }
}
