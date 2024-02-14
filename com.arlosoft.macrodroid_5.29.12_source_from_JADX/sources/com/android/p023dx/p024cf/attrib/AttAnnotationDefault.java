package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.Constant;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.AttAnnotationDefault */
public final class AttAnnotationDefault extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "AnnotationDefault";
    private final int byteLength;
    private final Constant value;

    public AttAnnotationDefault(Constant constant, int i) {
        super(ATTRIBUTE_NAME);
        Objects.requireNonNull(constant, "value == null");
        this.value = constant;
        this.byteLength = i;
    }

    public int byteLength() {
        return this.byteLength + 6;
    }

    public Constant getValue() {
        return this.value;
    }
}
