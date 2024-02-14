package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a,\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\b\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\f"}, mo71668d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Lja/u;", "setFragmentResult", "clearFragmentResult", "Lkotlin/Function2;", "listener", "setFragmentResultListener", "clearFragmentResultListener", "fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Fragment.kt */
public final class FragmentKt {
    public static final void clearFragmentResult(Fragment fragment, String str) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(str, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(str);
    }

    public static final void clearFragmentResultListener(Fragment fragment, String str) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(str, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
    }

    public static final void setFragmentResult(Fragment fragment, String str, Bundle bundle) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(str, "requestKey");
        C13706o.m87929f(bundle, "result");
        fragment.getParentFragmentManager().setFragmentResult(str, bundle);
    }

    public static final void setFragmentResultListener(Fragment fragment, String str, C16269p<? super String, ? super Bundle, C13339u> pVar) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(str, "requestKey");
        C13706o.m87929f(pVar, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new C0683c(pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: setFragmentResultListener$lambda-0  reason: not valid java name */
    public static final void m101274setFragmentResultListener$lambda0(C16269p pVar, String str, Bundle bundle) {
        C13706o.m87929f(pVar, "$tmp0");
        C13706o.m87929f(str, "p0");
        C13706o.m87929f(bundle, "p1");
        pVar.invoke(str, bundle);
    }
}
