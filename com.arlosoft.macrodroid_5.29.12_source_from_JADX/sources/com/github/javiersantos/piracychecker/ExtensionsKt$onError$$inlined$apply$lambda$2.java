package com.github.javiersantos.piracychecker;

import com.github.javiersantos.piracychecker.callbacks.OnErrorCallback;
import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo71668d2 = {"com/github/javiersantos/piracychecker/ExtensionsKt$onError$2$1", "Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;", "Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "error", "Lja/u;", "b", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$onError$$inlined$apply$lambda$2 implements OnErrorCallback {

    /* renamed from: a */
    final /* synthetic */ C16265l f16263a;

    /* renamed from: b */
    public void mo34340b(PiracyCheckerError piracyCheckerError) {
        C13706o.m87930g(piracyCheckerError, "error");
        OnErrorCallback.DefaultImpls.m26241a(this, piracyCheckerError);
        this.f16263a.invoke(piracyCheckerError);
    }
}
