package androidx.core.util;

import android.util.Pair;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0004\u001a1\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\b\u001a1\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\b\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\u0003\u0010\n\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\u0005\u0010\n\u001a1\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\b\u001a1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\b¨\u0006\f"}, mo71668d2 = {"F", "S", "Landroidx/core/util/Pair;", "component1", "(Landroidx/core/util/Pair;)Ljava/lang/Object;", "component2", "Lja/m;", "toKotlinPair", "toAndroidXPair", "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "toAndroidPair", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Pair.kt */
public final class PairKt {
    public static final <F, S> F component1(Pair<F, S> pair) {
        C13706o.m87929f(pair, "<this>");
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        C13706o.m87929f(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> Pair<F, S> toAndroidPair(C13328m<? extends F, ? extends S> mVar) {
        C13706o.m87929f(mVar, "<this>");
        return new Pair<>(mVar.mo70154c(), mVar.mo70155d());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(C13328m<? extends F, ? extends S> mVar) {
        C13706o.m87929f(mVar, "<this>");
        return new Pair<>(mVar.mo70154c(), mVar.mo70155d());
    }

    public static final <F, S> C13328m<F, S> toKotlinPair(Pair<F, S> pair) {
        C13706o.m87929f(pair, "<this>");
        return new C13328m<>(pair.first, pair.second);
    }

    public static final <F, S> F component1(Pair<F, S> pair) {
        C13706o.m87929f(pair, "<this>");
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        C13706o.m87929f(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> C13328m<F, S> toKotlinPair(Pair<F, S> pair) {
        C13706o.m87929f(pair, "<this>");
        return new C13328m<>(pair.first, pair.second);
    }
}
