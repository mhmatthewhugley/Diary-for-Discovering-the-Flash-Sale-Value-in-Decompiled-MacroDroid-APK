package p013b2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p000a.C0002c;

/* renamed from: b2.h */
/* compiled from: WelcomeOnboardFragment.kt */
public final class C2246h extends C0002c {

    /* renamed from: E */
    public Map<Integer, View> f6883E = new LinkedHashMap();

    /* renamed from: W */
    public int mo1W() {
        return 2131099900;
    }

    /* renamed from: X */
    public int mo2X() {
        return C17528R$color.white_very_transparent;
    }

    /* renamed from: e0 */
    public int mo9e0() {
        return C17528R$color.white_very_transparent;
    }

    /* renamed from: o0 */
    public void mo24470o0() {
        this.f6883E.clear();
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_welcome_onboard, viewGroup, false);
        C13706o.m87928e(inflate, "inflater.inflate(R.layou…nboard, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo24470o0();
    }
}
