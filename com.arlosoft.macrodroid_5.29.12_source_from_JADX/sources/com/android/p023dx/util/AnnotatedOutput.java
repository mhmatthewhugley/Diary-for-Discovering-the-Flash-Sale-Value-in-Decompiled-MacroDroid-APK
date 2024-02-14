package com.android.p023dx.util;

/* renamed from: com.android.dx.util.AnnotatedOutput */
public interface AnnotatedOutput extends Output {
    void annotate(int i, String str);

    void annotate(String str);

    boolean annotates();

    void endAnnotation();

    int getAnnotationWidth();

    boolean isVerbose();
}
