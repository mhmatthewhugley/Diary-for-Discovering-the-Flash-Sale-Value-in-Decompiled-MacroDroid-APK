package com.github.javiersantos.piracychecker;

import com.github.javiersantos.licensing.LibraryCheckerCallback;
import com.github.javiersantos.piracychecker.callbacks.OnErrorCallback;
import com.github.javiersantos.piracychecker.enums.PiracyCheckerError;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo71668d2 = {"com/github/javiersantos/piracychecker/PiracyChecker$verify$1", "Lcom/github/javiersantos/licensing/LibraryCheckerCallback;", "", "reason", "Lja/u;", "a", "c", "errorCode", "b", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyChecker.kt */
public final class PiracyChecker$verify$1 implements LibraryCheckerCallback {

    /* renamed from: a */
    final /* synthetic */ PiracyChecker f16299a;

    /* renamed from: a */
    public void mo34328a(int i) {
        this.f16299a.m26214o(true);
    }

    /* renamed from: b */
    public void mo34329b(int i) {
        OnErrorCallback i2 = this.f16299a.f16288u;
        if (i2 != null) {
            i2.mo34340b(PiracyCheckerError.f16348H.mo34351a(i));
        }
    }

    /* renamed from: c */
    public void mo34330c(int i) {
        this.f16299a.m26214o(false);
    }
}
