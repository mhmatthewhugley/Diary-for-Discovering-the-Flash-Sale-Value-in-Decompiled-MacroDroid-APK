package com.github.javiersantos.piracychecker.callbacks;

import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;", "", "Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "error", "Lja/u;", "b", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyCheckerCallbacks.kt */
public interface OnErrorCallback {

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 16})
    /* compiled from: PiracyCheckerCallbacks.kt */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static void m26241a(OnErrorCallback onErrorCallback, PiracyCheckerError piracyCheckerError) {
            C13706o.m87930g(piracyCheckerError, "error");
        }
    }

    /* renamed from: b */
    void mo34340b(PiracyCheckerError piracyCheckerError);
}
