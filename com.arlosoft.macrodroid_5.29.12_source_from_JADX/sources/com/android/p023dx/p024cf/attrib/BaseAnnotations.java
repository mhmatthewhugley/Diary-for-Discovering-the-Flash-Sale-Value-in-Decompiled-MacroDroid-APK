package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.util.MutabilityException;

/* renamed from: com.android.dx.cf.attrib.BaseAnnotations */
public abstract class BaseAnnotations extends BaseAttribute {
    private final Annotations annotations;
    private final int byteLength;

    public BaseAnnotations(String str, Annotations annotations2, int i) {
        super(str);
        try {
            if (!annotations2.isMutable()) {
                this.annotations = annotations2;
                this.byteLength = i;
                return;
            }
            throw new MutabilityException("annotations.isMutable()");
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    public final int byteLength() {
        return this.byteLength + 6;
    }

    public final Annotations getAnnotations() {
        return this.annotations;
    }
}
