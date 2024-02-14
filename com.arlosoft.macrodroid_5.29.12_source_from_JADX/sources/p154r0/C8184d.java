package p154r0;

import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p413v8.C16725a;

/* renamed from: r0.d */
/* compiled from: MacroDroidDaggerBaseFragment.kt */
public abstract class C8184d extends C8182b {

    /* renamed from: c */
    public Map<Integer, View> f19847c = new LinkedHashMap();

    /* renamed from: U */
    public void mo26239U() {
        this.f19847c.clear();
    }

    public void onAttach(Context context) {
        C13706o.m87929f(context, "context");
        C16725a.m99292b(this);
        super.onAttach(context);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
