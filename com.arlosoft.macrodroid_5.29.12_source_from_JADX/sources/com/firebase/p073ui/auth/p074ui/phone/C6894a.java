package com.firebase.p073ui.auth.p074ui.phone;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.data.model.CountryInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.firebase.ui.auth.ui.phone.a */
/* compiled from: CountryListAdapter */
final class C6894a extends ArrayAdapter<CountryInfo> implements SectionIndexer {

    /* renamed from: a */
    private final HashMap<String, Integer> f16127a = new LinkedHashMap();

    /* renamed from: c */
    private final HashMap<String, Integer> f16128c = new LinkedHashMap();

    /* renamed from: d */
    private String[] f16129d;

    public C6894a(Context context) {
        super(context, R$layout.fui_dgts_country_row, 16908308);
    }

    /* renamed from: a */
    public int mo34250a(String str) {
        Integer num = this.f16128c.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public void mo34251b(List<CountryInfo> list) {
        int i = 0;
        for (CountryInfo next : list) {
            String upperCase = next.mo34130e().getDisplayCountry().substring(0, 1).toUpperCase(Locale.getDefault());
            if (!this.f16127a.containsKey(upperCase)) {
                this.f16127a.put(upperCase, Integer.valueOf(i));
            }
            this.f16128c.put(next.mo34130e().getDisplayCountry(), Integer.valueOf(i));
            i++;
            add(next);
        }
        this.f16129d = new String[this.f16127a.size()];
        this.f16127a.keySet().toArray(this.f16129d);
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f16128c.size();
    }

    public int getPositionForSection(int i) {
        String[] strArr = this.f16129d;
        if (strArr == null || i <= 0) {
            return 0;
        }
        if (i >= strArr.length) {
            i = strArr.length - 1;
        }
        return this.f16127a.get(strArr[i]).intValue();
    }

    public int getSectionForPosition(int i) {
        if (this.f16129d == null) {
            return 0;
        }
        for (int i2 = 0; i2 < this.f16129d.length; i2++) {
            if (getPositionForSection(i2) > i) {
                return i2 - 1;
            }
        }
        return 0;
    }

    public Object[] getSections() {
        return this.f16129d;
    }
}
