package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.widget.IconTextView;

/* renamed from: com.arlosoft.macrodroid.common.f */
/* compiled from: AndroidWearIconAdapter */
public class C4008f extends BaseAdapter {

    /* renamed from: a */
    private final Context f10382a;

    /* renamed from: c */
    private final String[] f10383c;

    /* renamed from: d */
    private final C4009a f10384d;

    /* renamed from: com.arlosoft.macrodroid.common.f$a */
    /* compiled from: AndroidWearIconAdapter */
    public interface C4009a {
        /* renamed from: a */
        void mo27911a(String str);

        /* renamed from: b */
        void mo27912b(String str);
    }

    /* renamed from: com.arlosoft.macrodroid.common.f$b */
    /* compiled from: AndroidWearIconAdapter */
    class C4010b {

        /* renamed from: a */
        IconTextView f10385a;

        /* renamed from: b */
        IconTextView f10386b;

        /* renamed from: c */
        IconTextView f10387c;

        /* renamed from: d */
        IconTextView f10388d;

        C4010b() {
        }
    }

    public C4008f(Context context, String[] strArr, C4009a aVar) {
        this.f10383c = strArr;
        this.f10384d = aVar;
        this.f10382a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m15684b(String str, int i, View view) {
        this.f10384d.mo27911a(str);
        this.f10384d.mo27912b(this.f10382a.getString(i));
    }

    public int getCount() {
        return this.f10383c.length / 4;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C4010b bVar;
        if (view == null) {
            view = ((LayoutInflater) this.f10382a.getSystemService("layout_inflater")).inflate(C17535R$layout.select_android_wear_icon_list_row, (ViewGroup) null);
            bVar = new C4010b();
            bVar.f10385a = (IconTextView) view.findViewById(C17532R$id.select_android_wear_icon_1);
            bVar.f10386b = (IconTextView) view.findViewById(C17532R$id.select_android_wear_icon_2);
            bVar.f10387c = (IconTextView) view.findViewById(C17532R$id.select_android_wear_icon_3);
            bVar.f10388d = (IconTextView) view.findViewById(C17532R$id.select_android_wear_icon_4);
            view.setTag(bVar);
        } else {
            bVar = (C4010b) view.getTag();
        }
        IconTextView[] iconTextViewArr = {bVar.f10385a, bVar.f10386b, bVar.f10387c, bVar.f10388d};
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = (i * 4) + i2;
            if (i3 < getCount() * 4) {
                String str = this.f10383c[i3];
                if (str == null) {
                    iconTextViewArr[i2].setVisibility(8);
                } else {
                    iconTextViewArr[i2].setVisibility(0);
                    int identifier = this.f10382a.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, this.f10382a.getPackageName());
                    iconTextViewArr[i2].setText(identifier);
                    iconTextViewArr[i2].setOnClickListener(new C4005e(this, str, identifier));
                }
            }
        }
        return view;
    }
}
