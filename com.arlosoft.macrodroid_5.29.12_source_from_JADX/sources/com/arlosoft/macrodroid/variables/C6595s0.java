package com.arlosoft.macrodroid.variables;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.variables.C6585q0;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.variables.s0 */
/* compiled from: VariableWithTypeSpinnerAdapter.kt */
public final class C6595s0 extends ArrayAdapter<C6585q0> {

    /* renamed from: a */
    private final Activity f15305a;

    /* renamed from: c */
    private final List<C6585q0> f15306c;

    /* renamed from: d */
    private String f15307d;

    /* renamed from: f */
    private final int f15308f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6595s0(Activity activity, List<? extends C6585q0> list) {
        super(activity, C17535R$layout.spinner_item_macro_action_block, list);
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(list, "items");
        this.f15305a = activity;
        this.f15306c = list;
        this.f15308f = activity.getResources().getDimensionPixelOffset(C17529R$dimen.runnable_item_selection_name_only_height);
    }

    /* renamed from: a */
    public final void mo32811a(String str) {
        this.f15307d = str;
    }

    /* renamed from: b */
    public C6585q0 getItem(int i) {
        return this.f15306c.get(i);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "parent");
        if (view == null) {
            LayoutInflater layoutInflater = this.f15305a.getLayoutInflater();
            C13706o.m87928e(layoutInflater, "activity.layoutInflater");
            view = layoutInflater.inflate(C17535R$layout.spinner_item_macro_action_block, viewGroup, false);
        }
        C13706o.m87926c(view);
        TextView textView = (TextView) view.findViewById(C17532R$id.nameText);
        TextView textView2 = (TextView) view.findViewById(C17532R$id.typeText);
        C6585q0 b = getItem(i);
        if (b == null) {
            textView.setText(this.f15305a.getString(C17541R$string.none));
            C13706o.m87928e(textView2, "typeText");
            textView2.setVisibility(8);
        } else {
            textView.setText(b.mo32789a());
            if (b instanceof C6585q0.C6587b) {
                textView2.setText(((C6585q0.C6587b) b).mo32794b().mo27744T(this.f15305a));
                C13706o.m87928e(textView2, "typeText");
                textView2.setVisibility(0);
            } else {
                C13706o.m87928e(textView2, "typeText");
                textView2.setVisibility(8);
            }
        }
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "parent");
        boolean z = false;
        if (view == null) {
            LayoutInflater layoutInflater = this.f15305a.getLayoutInflater();
            C13706o.m87928e(layoutInflater, "activity.layoutInflater");
            view = layoutInflater.inflate(C17535R$layout.spinner_item_macro_action_block, viewGroup, false);
        }
        C13706o.m87926c(view);
        TextView textView = (TextView) view.findViewById(C17532R$id.nameText);
        TextView textView2 = (TextView) view.findViewById(C17532R$id.typeText);
        C6585q0 b = getItem(i);
        C13706o.m87928e(textView2, "typeText");
        textView2.setVisibility(8);
        if (b == null) {
            textView.setText(this.f15305a.getString(C17541R$string.none));
        } else {
            String str = this.f15307d;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                textView.setText(this.f15307d);
            } else {
                textView.setText(b.mo32789a());
            }
        }
        return view;
    }
}
