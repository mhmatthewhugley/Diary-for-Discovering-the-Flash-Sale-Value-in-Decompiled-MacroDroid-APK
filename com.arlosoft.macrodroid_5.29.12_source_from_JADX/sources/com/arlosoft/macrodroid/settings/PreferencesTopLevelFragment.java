package com.arlosoft.macrodroid.settings;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import java.util.List;
import p148q0.C8151a;
import p154r0.C8182b;

public class PreferencesTopLevelFragment extends C8182b implements PreferenceFragmentCompat.OnPreferenceStartScreenCallback {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Toolbar f12850c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f12851d;

    /* renamed from: com.arlosoft.macrodroid.settings.PreferencesTopLevelFragment$a */
    class C5115a implements FragmentManager.OnBackStackChangedListener {
        C5115a() {
        }

        public void onBackStackChanged() {
            if (PreferencesTopLevelFragment.this.getChildFragmentManager().getBackStackEntryCount() == 0) {
                PreferencesTopLevelFragment.this.f12850c.setNavigationIcon((Drawable) null);
                PreferencesTopLevelFragment.this.f12851d.setText(C17541R$string.settings);
                PreferencesTopLevelFragment.this.f12851d.setGravity(1);
                return;
            }
            List<Fragment> fragments = PreferencesTopLevelFragment.this.getChildFragmentManager().getFragments();
            PreferencesTopLevelFragment.this.f12851d.setText(fragments.get(fragments.size() - 1).getTag());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m19767Z(View view) {
        getChildFragmentManager().popBackStack();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C8151a.m33856E(requireActivity(), "TemplateTopLevelFragment");
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("my_preference_fragment");
        if (findFragmentByTag == null) {
            findFragmentByTag = new C5141f2();
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(2131362383, findFragmentByTag, "my_preference_fragment");
        beginTransaction.commit();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            double doubleExtra = intent.getDoubleExtra("Latitude", 0.0d);
            double doubleExtra2 = intent.getDoubleExtra("Longitude", 0.0d);
            FragmentActivity requireActivity = requireActivity();
            C5163j2.m20205l6(requireActivity, "lat=" + doubleExtra + "&lon=" + doubleExtra2);
        } else if (i == 3 && i2 == -1) {
            double doubleExtra3 = intent.getDoubleExtra("Latitude", 0.0d);
            double doubleExtra4 = intent.getDoubleExtra("Longitude", 0.0d);
            FragmentActivity requireActivity2 = requireActivity();
            C5163j2.m20067T5(requireActivity2, doubleExtra3 + "," + doubleExtra4);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_top_level_preferences, viewGroup, false);
        getContext().getTheme().applyStyle(C17542R$style.Theme_App_Settings, true);
        this.f12851d = (TextView) inflate.findViewById(2131364038);
        getChildFragmentManager().addOnBackStackChangedListener(new C5115a());
        Toolbar toolbar = (Toolbar) inflate.findViewById(2131364057);
        this.f12850c = toolbar;
        toolbar.setNavigationOnClickListener(new C5155h2(this));
        return inflate;
    }

    public boolean onPreferenceStartScreen(PreferenceFragmentCompat preferenceFragmentCompat, PreferenceScreen preferenceScreen) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        C5141f2 f2Var = new C5141f2();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT", preferenceScreen.getKey());
        f2Var.setArguments(bundle);
        beginTransaction.replace(2131362383, (Fragment) f2Var, preferenceScreen.getTitle().toString());
        beginTransaction.addToBackStack(preferenceScreen.getTitle().toString());
        beginTransaction.commit();
        this.f12850c.setNavigationIcon((int) C17530R$drawable.material_ic_arrow_back_24px_svg);
        this.f12851d.setText(preferenceScreen.getTitle());
        this.f12851d.setGravity(GravityCompat.START);
        return true;
    }
}
