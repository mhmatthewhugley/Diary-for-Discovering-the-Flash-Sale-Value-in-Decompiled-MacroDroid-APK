package com.arlosoft.macrodroid.actionblock.common;

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
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.actionblock.common.c */
/* compiled from: ActionBlockMacroAdapter.kt */
public final class C3670c extends ArrayAdapter<C3671d> {

    /* renamed from: a */
    private final Activity f9716a;

    /* renamed from: c */
    private final List<C3671d> f9717c;

    /* renamed from: d */
    private final int f9718d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3670c(Activity activity, List<C3671d> list) {
        super(activity, C17535R$layout.spinner_item_macro_action_block, list);
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(list, "items");
        this.f9716a = activity;
        this.f9717c = list;
        this.f9718d = activity.getResources().getDimensionPixelOffset(C17529R$dimen.runnable_item_selection_name_only_height);
    }

    /* renamed from: a */
    public C3671d getItem(int i) {
        return this.f9717c.get(i);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "parent");
        return getView(i, view, viewGroup);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Activity activity;
        int i2;
        C13706o.m87929f(viewGroup, "parent");
        int i3 = 0;
        if (view == null) {
            LayoutInflater layoutInflater = this.f9716a.getLayoutInflater();
            C13706o.m87928e(layoutInflater, "activity.layoutInflater");
            view = layoutInflater.inflate(C17535R$layout.spinner_item_macro_action_block, viewGroup, false);
        }
        C13706o.m87926c(view);
        TextView textView = (TextView) view.findViewById(C17532R$id.nameText);
        TextView textView2 = (TextView) view.findViewById(C17532R$id.typeText);
        C3671d a = getItem(i);
        String a2 = a.mo27102a();
        long b = a.mo27103b();
        boolean c = a.mo27104c();
        textView.setText(a2);
        if (c) {
            activity = this.f9716a;
            i2 = C17541R$string.action_block;
        } else {
            activity = this.f9716a;
            i2 = C17541R$string.action_disable_macro_macro;
        }
        textView2.setText(activity.getString(i2));
        int i4 = (b > 0 ? 1 : (b == 0 ? 0 : -1));
        if (i4 == 0 || b == 1 || b == 2) {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        textView.getLayoutParams().height = (i4 == 0 || b == 1 || b == 2) ? this.f9718d : -2;
        return view;
    }
}
