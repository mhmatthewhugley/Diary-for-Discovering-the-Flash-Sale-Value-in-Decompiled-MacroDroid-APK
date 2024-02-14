package com.android.p023dx.rop.annotation;

import com.android.p023dx.util.ToHuman;

/* renamed from: com.android.dx.rop.annotation.AnnotationVisibility */
public enum AnnotationVisibility implements ToHuman {
    RUNTIME("runtime"),
    BUILD("build"),
    SYSTEM("system"),
    EMBEDDED("embedded");
    
    private final String human;

    private AnnotationVisibility(String str) {
        this.human = str;
    }

    public String toHuman() {
        return this.human;
    }
}
