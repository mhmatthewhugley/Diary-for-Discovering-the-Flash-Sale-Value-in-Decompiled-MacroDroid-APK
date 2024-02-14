package com.github.javiersantos.piracychecker.callbacks;

import com.github.javiersantos.piracychecker.callbacks.OnErrorCallback;
import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/callbacks/PiracyCheckerCallback;", "Lcom/github/javiersantos/piracychecker/callbacks/AllowCallback;", "Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;", "Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;", "()V", "library_release"}, mo71669k = 1, mo71670mv = {1, 1, 16})
/* compiled from: PiracyCheckerCallbacks.kt */
public abstract class PiracyCheckerCallback implements AllowCallback, DoNotAllowCallback, OnErrorCallback {
    /* renamed from: b */
    public void mo34340b(PiracyCheckerError piracyCheckerError) {
        C13706o.m87930g(piracyCheckerError, "error");
        OnErrorCallback.DefaultImpls.m26241a(this, piracyCheckerError);
    }
}
