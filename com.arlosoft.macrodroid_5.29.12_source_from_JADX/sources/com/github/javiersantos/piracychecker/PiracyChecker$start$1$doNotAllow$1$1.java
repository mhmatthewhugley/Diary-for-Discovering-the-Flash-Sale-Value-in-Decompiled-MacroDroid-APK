package com.github.javiersantos.piracychecker;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"", "a", "()I"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: PiracyChecker.kt */
final class PiracyChecker$start$1$doNotAllow$1$1 extends C13708q implements C16254a<Integer> {

    /* renamed from: a */
    public static final PiracyChecker$start$1$doNotAllow$1$1 f16298a = new PiracyChecker$start$1$doNotAllow$1$1();

    PiracyChecker$start$1$doNotAllow$1$1() {
        super(0);
    }

    /* renamed from: a */
    public final int mo34346a() {
        return Log.e("PiracyChecker", "Unlicensed dialog was not built properly. Make sure your context is an instance of Activity");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(mo34346a());
    }
}
