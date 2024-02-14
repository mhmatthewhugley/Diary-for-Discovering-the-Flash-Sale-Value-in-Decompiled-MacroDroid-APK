package p154r0;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: r0.b */
/* compiled from: MacroDroidBaseFragment.kt */
public abstract class C8182b extends Fragment {

    /* renamed from: a */
    public Map<Integer, View> f19846a = new LinkedHashMap();

    /* renamed from: U */
    public void mo26239U() {
        this.f19846a.clear();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
