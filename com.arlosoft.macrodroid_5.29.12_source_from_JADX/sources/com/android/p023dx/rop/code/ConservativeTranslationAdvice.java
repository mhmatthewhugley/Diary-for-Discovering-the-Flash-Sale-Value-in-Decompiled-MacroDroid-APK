package com.android.p023dx.rop.code;

/* renamed from: com.android.dx.rop.code.ConservativeTranslationAdvice */
public final class ConservativeTranslationAdvice implements TranslationAdvice {
    public static final ConservativeTranslationAdvice THE_ONE = new ConservativeTranslationAdvice();

    private ConservativeTranslationAdvice() {
    }

    public int getMaxOptimalRegisterCount() {
        return Integer.MAX_VALUE;
    }

    public boolean hasConstantOperation(Rop rop, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        return false;
    }

    public boolean requiresSourcesInOrder(Rop rop, RegisterSpecList registerSpecList) {
        return false;
    }
}
