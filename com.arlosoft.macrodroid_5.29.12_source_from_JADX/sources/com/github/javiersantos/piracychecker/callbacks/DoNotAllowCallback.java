package com.github.javiersantos.piracychecker.callbacks;

import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import com.github.javiersantos.piracychecker.enums.PirateApp;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;", "", "Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "error", "Lcom/github/javiersantos/piracychecker/enums/PirateApp;", "app", "Lja/u;", "c", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyCheckerCallbacks.kt */
public interface DoNotAllowCallback {

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 16})
    /* compiled from: PiracyCheckerCallbacks.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: c */
    void mo34339c(PiracyCheckerError piracyCheckerError, PirateApp pirateApp);
}
