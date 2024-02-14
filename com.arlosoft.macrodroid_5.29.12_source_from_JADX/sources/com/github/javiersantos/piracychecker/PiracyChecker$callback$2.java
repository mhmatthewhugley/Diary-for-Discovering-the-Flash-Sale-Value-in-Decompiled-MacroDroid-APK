package com.github.javiersantos.piracychecker;

import com.github.javiersantos.piracychecker.callbacks.DoNotAllowCallback;
import com.github.javiersantos.piracychecker.callbacks.PiracyCheckerCallback;
import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import com.github.javiersantos.piracychecker.enums.PirateApp;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"com/github/javiersantos/piracychecker/PiracyChecker$callback$2", "Lcom/github/javiersantos/piracychecker/callbacks/DoNotAllowCallback;", "Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "error", "Lcom/github/javiersantos/piracychecker/enums/PirateApp;", "app", "Lja/u;", "c", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyChecker.kt */
public final class PiracyChecker$callback$2 implements DoNotAllowCallback {

    /* renamed from: a */
    final /* synthetic */ PiracyCheckerCallback f16295a;

    /* renamed from: c */
    public void mo34339c(PiracyCheckerError piracyCheckerError, PirateApp pirateApp) {
        C13706o.m87930g(piracyCheckerError, "error");
        this.f16295a.mo34339c(piracyCheckerError, pirateApp);
    }
}
