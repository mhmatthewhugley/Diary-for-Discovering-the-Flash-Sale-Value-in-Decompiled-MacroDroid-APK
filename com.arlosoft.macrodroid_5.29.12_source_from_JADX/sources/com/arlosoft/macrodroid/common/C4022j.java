package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.common.j */
/* compiled from: AppListAdapter */
public class C4022j extends ArrayAdapter<ResolveInfo> {

    /* renamed from: a */
    private RadioButton f10419a = null;

    /* renamed from: c */
    private int f10420c = -1;

    /* renamed from: d */
    private final DialogInterface.OnClickListener f10421d;

    public C4022j(Context context, int i, List<ResolveInfo> list, DialogInterface.OnClickListener onClickListener) {
        super(context, i, list);
        this.f10421d = onClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m15692d(int i, RadioButton radioButton, CompoundButton compoundButton, boolean z) {
        if (z) {
            RadioButton radioButton2 = this.f10419a;
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            this.f10420c = i;
            this.f10419a = radioButton;
            DialogInterface.OnClickListener onClickListener = this.f10421d;
            if (onClickListener != null) {
                onClickListener.onClick((DialogInterface) null, i);
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        PackageManager packageManager = getContext().getPackageManager();
        ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
        if (view == null) {
            view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C17535R$layout.application_item, (ViewGroup) null);
        }
        ((ImageView) view.findViewById(C17532R$id.application_item_icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
        TextView textView = (TextView) view.findViewById(C17532R$id.application_item_name);
        Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        textView.setText(resolveInfo.loadLabel(packageManager).toString());
        RadioButton radioButton = (RadioButton) view.findViewById(C17532R$id.application_item_radio_button);
        if (this.f10420c == i) {
            radioButton.setChecked(true);
        } else {
            radioButton.setChecked(false);
        }
        textView.setOnClickListener(new C4016h(radioButton));
        radioButton.setOnCheckedChangeListener(new C4019i(this, i, radioButton));
        return view;
    }
}
