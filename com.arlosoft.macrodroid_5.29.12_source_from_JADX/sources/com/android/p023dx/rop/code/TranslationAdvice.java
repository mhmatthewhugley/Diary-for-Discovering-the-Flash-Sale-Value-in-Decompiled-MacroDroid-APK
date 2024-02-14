package com.android.p023dx.rop.code;

/* renamed from: com.android.dx.rop.code.TranslationAdvice */
public interface TranslationAdvice {
    int getMaxOptimalRegisterCount();

    boolean hasConstantOperation(Rop rop, RegisterSpec registerSpec, RegisterSpec registerSpec2);

    boolean requiresSourcesInOrder(Rop rop, RegisterSpecList registerSpecList);
}
