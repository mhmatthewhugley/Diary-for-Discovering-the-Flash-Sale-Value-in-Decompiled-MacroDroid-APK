package com.arlosoft.macrodroid.settings;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C4699g0;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;

public class PreferencesActivity extends MacroDroidBaseActivity implements PreferenceFragmentCompat.OnPreferenceStartScreenCallback {

    /* renamed from: o */
    private Toolbar f12848o;

    /* renamed from: p */
    private TextView f12849p;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.fragment_top_level_preferences);
        this.f12849p = (TextView) findViewById(2131364038);
        Toolbar toolbar = (Toolbar) findViewById(2131364057);
        this.f12848o = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.f12849p.setText(C17541R$string.settings);
        this.f12849p.setGravity(3);
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            try {
                setRequestedOrientation(1);
            } catch (IllegalStateException unused) {
            }
        }
        if (bundle == null) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("my_preference_fragment");
            if (findFragmentByTag == null) {
                findFragmentByTag = new C5141f2();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("shortcut", getIntent().getIntExtra("shortcut", 0));
            findFragmentByTag.setArguments(bundle2);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(2131362383, findFragmentByTag, "my_preference_fragment");
            beginTransaction.commit();
            int i = bundle2.getInt("shortcut", 0);
            if (i <= 0) {
                return;
            }
            if (i == 2) {
                setTitle(C17541R$string.smtp_server);
            } else if (i == 3) {
                setTitle(C17541R$string.trigger_media_button_v2);
            } else if (i == 4) {
                setTitle(C17541R$string.action_speak_text);
            } else if (i == 5) {
                setTitle(C17541R$string.read_screen_update_rate);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean onPreferenceStartScreen(PreferenceFragmentCompat preferenceFragmentCompat, PreferenceScreen preferenceScreen) {
        if (mo27315N1()) {
            return true;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        C5141f2 f2Var = new C5141f2();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT", preferenceScreen.getKey());
        f2Var.setArguments(bundle);
        beginTransaction.replace(2131362383, (Fragment) f2Var, preferenceScreen.getKey());
        beginTransaction.addToBackStack(preferenceScreen.getKey());
        beginTransaction.commit();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4699g0.m18221k(this);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12849p.setText(charSequence);
    }
}
