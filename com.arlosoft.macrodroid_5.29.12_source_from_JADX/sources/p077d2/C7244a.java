package p077d2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import kotlin.jvm.internal.C13706o;
import p058a3.C2227a;

/* renamed from: d2.a */
/* compiled from: LanguageAdapter.kt */
public final class C7244a extends ArrayAdapter<String> {

    /* renamed from: a */
    private final String[] f17671a;

    /* renamed from: c */
    private final String[] f17672c;

    /* renamed from: d */
    private final C2227a f17673d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7244a(Context context, String[] strArr, String[] strArr2, C2227a aVar) {
        super(context, C17535R$layout.simple_spinner_item_with_left_image, C17532R$id.languageText, strArr);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(strArr, "languages");
        C13706o.m87929f(strArr2, "languageCode");
        C13706o.m87929f(aVar, "flagProvider");
        this.f17671a = strArr;
        this.f17672c = strArr2;
        this.f17673d = aVar;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "parent");
        return getView(i, view, viewGroup);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "parent");
        View view2 = super.getView(i, view, viewGroup);
        C13706o.m87928e(view2, "super.getView(position, convertView, parent)");
        ((TextView) view2.findViewById(C17532R$id.languageText)).setText(this.f17671a[i]);
        ((ImageView) view2.findViewById(C17532R$id.flagIcon)).setImageResource(this.f17673d.mo24444a(this.f17672c[i]));
        return view2;
    }
}
