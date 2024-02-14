package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.annotation.AnnotationsList;
import com.android.p023dx.util.MutabilityException;

/* renamed from: com.android.dx.cf.attrib.BaseParameterAnnotations */
public abstract class BaseParameterAnnotations extends BaseAttribute {
    private final int byteLength;
    private final AnnotationsList parameterAnnotations;

    public BaseParameterAnnotations(String str, AnnotationsList annotationsList, int i) {
        super(str);
        try {
            if (!annotationsList.isMutable()) {
                this.parameterAnnotations = annotationsList;
                this.byteLength = i;
                return;
            }
            throw new MutabilityException("parameterAnnotations.isMutable()");
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    public final int byteLength() {
        return this.byteLength + 6;
    }

    public final AnnotationsList getParameterAnnotations() {
        return this.parameterAnnotations;
    }
}
