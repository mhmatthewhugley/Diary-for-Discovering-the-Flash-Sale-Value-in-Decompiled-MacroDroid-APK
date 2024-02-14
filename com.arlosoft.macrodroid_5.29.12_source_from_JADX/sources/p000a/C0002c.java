package p000a;

import agency.tango.materialintroscreen.R$id;
import agency.tango.materialintroscreen.R$layout;
import agency.tango.materialintroscreen.R$string;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collections;
import p034i.C1989a;

/* renamed from: a.c */
/* compiled from: SlideFragment */
public class C0002c extends C1989a {

    /* renamed from: A */
    private TextView f2A;

    /* renamed from: B */
    private TextView f3B;

    /* renamed from: C */
    private TextView f4C;

    /* renamed from: D */
    private ImageView f5D;

    /* renamed from: c */
    private int f6c;

    /* renamed from: d */
    private int f7d;

    /* renamed from: f */
    private int f8f;

    /* renamed from: g */
    private String f9g;

    /* renamed from: o */
    private String f10o;

    /* renamed from: p */
    private String f11p;

    /* renamed from: s */
    private String[] f12s;

    /* renamed from: z */
    private String[] f13z;

    /* renamed from: h0 */
    private boolean m4h0(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (m5j0(str) && ContextCompat.checkSelfPermission(getContext(), str) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j0 */
    public static boolean m5j0(String str) {
        return str != null && !str.isEmpty();
    }

    /* renamed from: m0 */
    private String[] m6m0(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.removeAll(Collections.singleton((Object) null));
        return (String[]) arrayList2.toArray(new String[0]);
    }

    /* renamed from: n0 */
    private void m7n0() {
        this.f4C.setText(this.f9g);
        this.f2A.setText(this.f10o);
        this.f3B.setText(this.f11p);
        if (this.f8f != 0) {
            this.f5D.setImageDrawable(ContextCompat.getDrawable(getActivity(), this.f8f));
            this.f5D.setVisibility(0);
        }
    }

    /* renamed from: V */
    public void mo6V() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = this.f12s;
        if (strArr != null) {
            for (String str : strArr) {
                if (m5j0(str) && ContextCompat.checkSelfPermission(getContext(), str) != 0) {
                    arrayList.add(str);
                }
            }
        }
        String[] strArr2 = this.f13z;
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (m5j0(str2) && ContextCompat.checkSelfPermission(getContext(), str2) != 0) {
                    arrayList.add(str2);
                }
            }
        }
        ActivityCompat.requestPermissions(getActivity(), m6m0(arrayList), 15621);
    }

    /* renamed from: W */
    public int mo1W() {
        return this.f6c;
    }

    /* renamed from: X */
    public int mo2X() {
        return this.f7d;
    }

    /* renamed from: Z */
    public boolean mo7Z() {
        return true;
    }

    /* renamed from: a0 */
    public String mo8a0() {
        return getString(R$string.impassable_slide);
    }

    /* renamed from: e0 */
    public int mo9e0() {
        return mo2X();
    }

    /* renamed from: f0 */
    public boolean mo10f0() {
        boolean h0 = m4h0(this.f12s);
        return !h0 ? m4h0(this.f13z) : h0;
    }

    /* renamed from: g0 */
    public boolean mo11g0() {
        return m4h0(this.f12s);
    }

    /* renamed from: i0 */
    public void mo12i0() {
        Bundle arguments = getArguments();
        this.f6c = arguments.getInt("background_color");
        this.f7d = arguments.getInt("buttons_color");
        this.f8f = arguments.getInt("image", 0);
        this.f9g = arguments.getString("caption");
        this.f10o = arguments.getString("title");
        this.f11p = arguments.getString("description");
        this.f12s = arguments.getStringArray("needed_permission");
        this.f13z = arguments.getStringArray("possible_permission");
        m7n0();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        View inflate = layoutInflater.inflate(R$layout.fragment_slide, viewGroup, false);
        this.f2A = (TextView) inflate.findViewById(R$id.txt_title_slide);
        this.f3B = (TextView) inflate.findViewById(R$id.txt_description_slide);
        this.f5D = (ImageView) inflate.findViewById(R$id.image_slide);
        this.f4C = (TextView) inflate.findViewById(R$id.txt_image_caption);
        mo12i0();
        return inflate;
    }
}
