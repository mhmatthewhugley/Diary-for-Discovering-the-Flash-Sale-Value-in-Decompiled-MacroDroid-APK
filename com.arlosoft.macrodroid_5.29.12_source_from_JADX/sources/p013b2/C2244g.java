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
import com.arlosoft.macrodroid.C17541R$string;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p000a.C0002c;

/* renamed from: b2.g */
/* compiled from: WarningOnboardFragment.kt */
public final class C2244g extends C0002c {

    /* renamed from: F */
    public static final C2245a f6881F = new C2245a((C13695i) null);

    /* renamed from: E */
    public Map<Integer, View> f6882E = new LinkedHashMap();

    /* renamed from: b2.g$a */
    /* compiled from: WarningOnboardFragment.kt */
    public static final class C2245a {
        private C2245a() {
        }

        public /* synthetic */ C2245a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C2244g mo24469a(String str, String str2) {
            C13706o.m87929f(str, "deviceType");
            C13706o.m87929f(str2, "webLink");
            Bundle bundle = new Bundle();
            bundle.putString("device_type", str);
            bundle.putString("web_link", str2);
            C2244g gVar = new C2244g();
            gVar.setArguments(bundle);
            return gVar;
        }
    }

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
    public void mo24468o0() {
        this.f6882E.clear();
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        String string;
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_warning_onboard, viewGroup, false);
        C13706o.m87928e(inflate, "inflater.inflate(R.layou…nboard, container, false)");
        TextView textView = (TextView) inflate.findViewById(C17532R$id.badDeviceText);
        C13696i0 i0Var = C13696i0.f61931a;
        String string2 = getString(C17541R$string.bad_device_brand_device_detected);
        C13706o.m87928e(string2, "getString(R.string.bad_d…ce_brand_device_detected)");
        Object[] objArr = new Object[1];
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("device_type")) == null) {
            str = str2;
        }
        objArr[0] = str;
        String format = String.format(string2, Arrays.copyOf(objArr, 1));
        C13706o.m87928e(format, "format(format, *args)");
        textView.setText(format);
        TextView textView2 = (TextView) inflate.findViewById(C17532R$id.warningText);
        String string3 = getString(C17541R$string.bad_device_brand_short_warning);
        C13706o.m87928e(string3, "getString(R.string.bad_device_brand_short_warning)");
        Object[] objArr2 = new Object[1];
        Bundle arguments2 = getArguments();
        if (!(arguments2 == null || (string = arguments2.getString("web_link")) == null)) {
            str2 = string;
        }
        objArr2[0] = str2;
        String format2 = String.format(string3, Arrays.copyOf(objArr2, 1));
        C13706o.m87928e(format2, "format(format, *args)");
        textView2.setText(format2);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo24468o0();
    }
}
