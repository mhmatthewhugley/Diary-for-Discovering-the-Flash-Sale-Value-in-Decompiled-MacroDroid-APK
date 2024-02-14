package p013b2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p000a.C0002c;

/* renamed from: b2.f */
/* compiled from: TriggerOnboardFragment.kt */
public final class C2243f extends C0002c {

    /* renamed from: E */
    public Map<Integer, View> f6880E = new LinkedHashMap();

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
    public void mo24467o0() {
        this.f6880E.clear();
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_trigger_onboard, viewGroup, false);
        C13706o.m87928e(inflate, "inflater.inflate(R.layou…nboard, container, false)");
        int i = C17532R$id.captionText;
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(((TextView) inflate.findViewById(i)).getText());
        sb.append('\"');
        ((TextView) inflate.findViewById(i)).setText(sb.toString());
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo24467o0();
    }
}
