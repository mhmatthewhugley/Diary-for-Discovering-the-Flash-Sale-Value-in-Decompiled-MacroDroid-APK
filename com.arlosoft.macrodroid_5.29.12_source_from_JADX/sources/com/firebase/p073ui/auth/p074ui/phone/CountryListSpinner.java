package com.firebase.p073ui.auth.p074ui.phone;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import com.firebase.p073ui.auth.data.model.CountryInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p159r5.C8204e;

/* renamed from: com.firebase.ui.auth.ui.phone.CountryListSpinner */
public final class CountryListSpinner extends AppCompatEditText implements View.OnClickListener {

    /* renamed from: a */
    private final String f16105a;

    /* renamed from: c */
    private final C6889a f16106c;

    /* renamed from: d */
    private final C6894a f16107d;

    /* renamed from: f */
    private View.OnClickListener f16108f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f16109g;

    /* renamed from: o */
    private CountryInfo f16110o;

    /* renamed from: p */
    private Set<String> f16111p;

    /* renamed from: s */
    private Set<String> f16112s;

    /* renamed from: com.firebase.ui.auth.ui.phone.CountryListSpinner$a */
    public class C6889a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        private final C6894a f16113a;

        /* renamed from: c */
        private AlertDialog f16114c;

        /* renamed from: com.firebase.ui.auth.ui.phone.CountryListSpinner$a$a */
        class C6890a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ListView f16116a;

            /* renamed from: c */
            final /* synthetic */ int f16117c;

            C6890a(ListView listView, int i) {
                this.f16116a = listView;
                this.f16117c = i;
            }

            public void run() {
                this.f16116a.setSelection(this.f16117c);
            }
        }

        C6889a(C6894a aVar) {
            this.f16113a = aVar;
        }

        /* renamed from: a */
        public void mo34239a() {
            AlertDialog alertDialog = this.f16114c;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f16114c = null;
            }
        }

        /* renamed from: b */
        public boolean mo34240b() {
            AlertDialog alertDialog = this.f16114c;
            return alertDialog != null && alertDialog.isShowing();
        }

        /* renamed from: c */
        public void mo34241c(int i) {
            if (this.f16113a != null) {
                AlertDialog create = new AlertDialog.Builder(CountryListSpinner.this.getContext()).setSingleChoiceItems(this.f16113a, 0, this).create();
                this.f16114c = create;
                create.setCanceledOnTouchOutside(true);
                ListView listView = this.f16114c.getListView();
                listView.setFastScrollEnabled(true);
                listView.setScrollbarFadingEnabled(false);
                listView.postDelayed(new C6890a(listView, i), 10);
                this.f16114c.show();
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            CountryInfo countryInfo = (CountryInfo) this.f16113a.getItem(i);
            String unused = CountryListSpinner.this.f16109g = countryInfo.mo34130e().getDisplayCountry();
            CountryListSpinner.this.mo34235s(countryInfo.mo34128d(), countryInfo.mo34130e());
            mo34239a();
        }
    }

    public CountryListSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842881);
    }

    /* renamed from: b */
    private Set<String> m26011b(@NonNull List<String> list) {
        HashSet hashSet = new HashSet();
        for (String next : list) {
            if (C8204e.m34063p(next)) {
                hashSet.addAll(C8204e.m34055h(next));
            } else {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    private void m26012d(View view) {
        View.OnClickListener onClickListener = this.f16108f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: f */
    private List<CountryInfo> m26013f(Bundle bundle) {
        m26015q(bundle);
        Map<String, Integer> j = C8204e.m34057j();
        if (this.f16111p.isEmpty() && this.f16112s.isEmpty()) {
            this.f16111p = new HashSet(j.keySet());
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (!this.f16112s.isEmpty()) {
            hashSet.addAll(this.f16112s);
        } else {
            hashSet.addAll(j.keySet());
            hashSet.removeAll(this.f16111p);
        }
        for (String next : j.keySet()) {
            if (!hashSet.contains(next)) {
                arrayList.add(new CountryInfo(new Locale("", next), j.get(next).intValue()));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: o */
    private static void m26014o(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: q */
    private void m26015q(@NonNull Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowlisted_countries");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("blocklisted_countries");
        if (stringArrayList != null) {
            this.f16111p = m26011b(stringArrayList);
        }
        if (stringArrayList2 != null) {
            this.f16112s = m26011b(stringArrayList2);
        }
    }

    private void setDefaultCountryForSpinner(List<CountryInfo> list) {
        CountryInfo i = C8204e.m34056i(getContext());
        if (mo34234r(i.mo34130e().getCountry())) {
            mo34235s(i.mo34128d(), i.mo34130e());
        } else if (list.iterator().hasNext()) {
            CountryInfo next = list.iterator().next();
            mo34235s(next.mo34128d(), next.mo34130e());
        }
    }

    public CountryInfo getSelectedCountryInfo() {
        return this.f16110o;
    }

    public void onClick(View view) {
        this.f16106c.mo34241c(this.f16107d.mo34250a(this.f16109g));
        m26014o(getContext(), this);
        m26012d(view);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16106c.mo34240b()) {
            this.f16106c.mo34239a();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("KEY_SUPER_STATE");
        this.f16110o = (CountryInfo) bundle.getParcelable("KEY_COUNTRY_INFO");
        super.onRestoreInstanceState(parcelable2);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_SUPER_STATE", onSaveInstanceState);
        bundle.putParcelable("KEY_COUNTRY_INFO", this.f16110o);
        return bundle;
    }

    /* renamed from: p */
    public void mo34233p(Bundle bundle) {
        if (bundle != null) {
            List<CountryInfo> f = m26013f(bundle);
            setCountriesToDisplay(f);
            setDefaultCountryForSpinner(f);
        }
    }

    /* renamed from: r */
    public boolean mo34234r(String str) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        boolean z = false;
        boolean z2 = this.f16111p.isEmpty() || this.f16111p.contains(upperCase);
        if (this.f16112s.isEmpty()) {
            return z2;
        }
        if (z2 && !this.f16112s.contains(upperCase)) {
            z = true;
        }
        return z;
    }

    /* renamed from: s */
    public void mo34235s(int i, Locale locale) {
        setText(String.format(this.f16105a, new Object[]{CountryInfo.m25794f(locale), Integer.valueOf(i)}));
        this.f16110o = new CountryInfo(locale, i);
    }

    public void setCountriesToDisplay(List<CountryInfo> list) {
        this.f16107d.mo34251b(list);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16108f = onClickListener;
    }

    /* renamed from: t */
    public void mo34238t(Locale locale, String str) {
        if (mo34234r(locale.getCountry())) {
            String displayName = locale.getDisplayName();
            if (!TextUtils.isEmpty(displayName) && !TextUtils.isEmpty(str)) {
                this.f16109g = displayName;
                mo34235s(Integer.parseInt(str), locale);
            }
        }
    }

    public CountryListSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16111p = new HashSet();
        this.f16112s = new HashSet();
        super.setOnClickListener(this);
        C6894a aVar = new C6894a(getContext());
        this.f16107d = aVar;
        this.f16106c = new C6889a(aVar);
        this.f16105a = "%1$s  +%2$d";
        this.f16109g = "";
    }
}
