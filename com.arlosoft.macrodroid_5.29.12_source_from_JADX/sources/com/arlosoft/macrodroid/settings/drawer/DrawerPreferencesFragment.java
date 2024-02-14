package com.arlosoft.macrodroid.settings.drawer;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17543R$xml;
import com.arlosoft.macrodroid.drawer.DrawerOverlayHandleService;
import com.arlosoft.macrodroid.events.DrawerHandleUpdateEvent;
import com.arlosoft.macrodroid.events.DrawerRefreshEvent;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.settings.InfoCardPreference;
import com.thebluealliance.spectrum.C11766a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p112j2.C7439d0;
import p149q1.C8152a;
import p161s1.C10180a;
import p319lc.C15626c;
import p476u2.C17470a;
import p476u2.C17471b;
import p476u2.C17472c;
import p476u2.C17473d;
import p476u2.C17474e;
import p476u2.C17475f;
import p476u2.C17476g;
import p476u2.C17477h;
import p476u2.C17478i;
import p476u2.C17479j;
import p476u2.C17480k;

/* compiled from: DrawerPreferencesFragment.kt */
public final class DrawerPreferencesFragment extends PreferenceFragmentCompat {

    /* renamed from: a */
    public Map<Integer, View> f12888a = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.settings.drawer.DrawerPreferencesFragment$a */
    /* compiled from: DrawerPreferencesFragment.kt */
    public static final class C5132a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ SeekBar f12889a;

        /* renamed from: b */
        final /* synthetic */ C8152a f12890b;

        /* renamed from: c */
        final /* synthetic */ SeekBar f12891c;

        /* renamed from: d */
        final /* synthetic */ DrawerPreferencesFragment f12892d;

        C5132a(SeekBar seekBar, C8152a aVar, SeekBar seekBar2, DrawerPreferencesFragment drawerPreferencesFragment) {
            this.f12889a = seekBar;
            this.f12890b = aVar;
            this.f12891c = seekBar2;
            this.f12892d = drawerPreferencesFragment;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (this.f12889a.getProgress() < i) {
                this.f12889a.setProgress(i);
                this.f12890b.swipeAreaWidth = this.f12889a.getProgress() + 2;
            }
            this.f12890b.visibleSwipeAreaWidth = this.f12891c.getProgress() + 2;
            C5163j2.m19974G3(this.f12892d.getActivity(), this.f12890b);
            C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(this.f12890b));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.settings.drawer.DrawerPreferencesFragment$b */
    /* compiled from: DrawerPreferencesFragment.kt */
    public static final class C5133b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ SeekBar f12893a;

        /* renamed from: b */
        final /* synthetic */ SeekBar f12894b;

        /* renamed from: c */
        final /* synthetic */ C8152a f12895c;

        /* renamed from: d */
        final /* synthetic */ SeekBar f12896d;

        /* renamed from: e */
        final /* synthetic */ SeekBar f12897e;

        /* renamed from: f */
        final /* synthetic */ SeekBar f12898f;

        /* renamed from: g */
        final /* synthetic */ DrawerPreferencesFragment f12899g;

        C5133b(SeekBar seekBar, SeekBar seekBar2, C8152a aVar, SeekBar seekBar3, SeekBar seekBar4, SeekBar seekBar5, DrawerPreferencesFragment drawerPreferencesFragment) {
            this.f12893a = seekBar;
            this.f12894b = seekBar2;
            this.f12895c = aVar;
            this.f12896d = seekBar3;
            this.f12897e = seekBar4;
            this.f12898f = seekBar5;
            this.f12899g = drawerPreferencesFragment;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C13706o.m87929f(seekBar, "seekBar");
            if (seekBar == this.f12893a && this.f12894b.getProgress() > i) {
                this.f12894b.setProgress(i);
                this.f12895c.visibleSwipeAreaWidth = this.f12894b.getProgress() + 2;
            }
            this.f12895c.swipeAreaWidth = this.f12893a.getProgress() + 2;
            this.f12895c.swipeAreaOpacity = this.f12896d.getProgress();
            this.f12895c.swipeAreaHeight = this.f12897e.getProgress();
            this.f12895c.swipeAreaOffset = this.f12898f.getProgress();
            C5163j2.m19974G3(this.f12899g.getActivity(), this.f12895c);
            C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(this.f12895c));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C13706o.m87929f(seekBar, "seekBar");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m19770A0(DrawerPreferencesFragment drawerPreferencesFragment, C8152a aVar, ImageView imageView, View view) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C11766a a = new C11766a.C11769c(drawerPreferencesFragment.getContext()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.notification_colors).mo66986f(aVar.swipeAreaColor).mo66983c(true).mo66985e(1).mo66984d(new C17471b(aVar, drawerPreferencesFragment, imageView)).mo66981a();
        FragmentActivity activity = drawerPreferencesFragment.getActivity();
        C13706o.m87926c(activity);
        a.show(activity.getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m19771B0(C8152a aVar, DrawerPreferencesFragment drawerPreferencesFragment, ImageView imageView, boolean z, int i) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        if (z) {
            aVar.swipeAreaColor = i;
            C5163j2.m19974G3(drawerPreferencesFragment.getActivity(), aVar);
            C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(aVar));
            Drawable background = imageView.getBackground();
            C13706o.m87927d(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m19772C0(C8152a aVar, DrawerPreferencesFragment drawerPreferencesFragment, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        aVar.leftSide = z;
        C5163j2.m19974G3(drawerPreferencesFragment.getActivity(), aVar);
        C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(aVar));
    }

    /* renamed from: m0 */
    private final void m19784m0() {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("preferences:draw_enabled");
        if (checkBoxPreference != null) {
            checkBoxPreference.setOnPreferenceChangeListener(new C17475f(this, checkBoxPreference));
        }
        InfoCardPreference infoCardPreference = (InfoCardPreference) findPreference("preferences:drawer_info_card");
        if (infoCardPreference != null) {
            if (C5163j2.m20293w6(getActivity())) {
                infoCardPreference.setVisible(false);
            } else {
                String string = getString(C17541R$string.action_macrodroid_drawer);
                C13706o.m87928e(string, "getString(R.string.action_macrodroid_drawer)");
                String string2 = getString(C17541R$string.drawer_info_card);
                C13706o.m87928e(string2, "getString(R.string.drawer_info_card)");
                infoCardPreference.mo30099b(string, string2, new C17470a(this, infoCardPreference));
            }
        }
        Preference findPreference = findPreference("preferences:drawer_swipe_area");
        if (findPreference != null) {
            findPreference.setOnPreferenceClickListener(new C17476g(this));
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("preferences:drawer_show_on_lock_screen");
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.setOnPreferenceChangeListener(new C17474e(this));
            if (Build.VERSION.SDK_INT >= 26) {
                checkBoxPreference2.setVisible(false);
            }
        }
        Preference findPreference2 = findPreference("preferences:drawer_background_color");
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new C17477h(this, C5163j2.m20012M(getActivity())));
        }
        Preference findPreference3 = findPreference("preferences:drawer_header_color");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new C17478i(this, C5163j2.m20012M(getActivity())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final boolean m19785n0(DrawerPreferencesFragment drawerPreferencesFragment, CheckBoxPreference checkBoxPreference, Preference preference, Object obj) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C13706o.m87929f(obj, "newValue");
        if (!C13706o.m87924a(obj.toString(), "true")) {
            drawerPreferencesFragment.requireContext().stopService(new Intent(drawerPreferencesFragment.getContext(), DrawerOverlayHandleService.class));
            return true;
        } else if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(drawerPreferencesFragment.getActivity())) {
            C7439d0.m30887d0(drawerPreferencesFragment.getActivity(), false, false);
            checkBoxPreference.setChecked(false);
            return false;
        } else if (C5163j2.m20013M0(drawerPreferencesFragment.getContext())) {
            drawerPreferencesFragment.requireContext().stopService(new Intent(drawerPreferencesFragment.getContext(), DrawerOverlayHandleService.class));
            drawerPreferencesFragment.requireContext().startService(new Intent(drawerPreferencesFragment.getContext(), DrawerOverlayHandleService.class));
            return true;
        } else {
            C15626c.makeText(drawerPreferencesFragment.requireContext().getApplicationContext(), C17541R$string.macrodroid_disabled, 0).show();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m19786o0(DrawerPreferencesFragment drawerPreferencesFragment, InfoCardPreference infoCardPreference, View view) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C5163j2.m20015M2(drawerPreferencesFragment.getActivity());
        infoCardPreference.setVisible(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final boolean m19787p0(DrawerPreferencesFragment drawerPreferencesFragment, Preference preference) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        drawerPreferencesFragment.m19793y0();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final boolean m19788q0(DrawerPreferencesFragment drawerPreferencesFragment, Preference preference, Object obj) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        if (!C5163j2.m20085W2(drawerPreferencesFragment.getActivity())) {
            return true;
        }
        drawerPreferencesFragment.requireContext().stopService(new Intent(drawerPreferencesFragment.getContext(), DrawerOverlayHandleService.class));
        drawerPreferencesFragment.requireContext().startService(new Intent(drawerPreferencesFragment.getContext(), DrawerOverlayHandleService.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static final boolean m19789r0(DrawerPreferencesFragment drawerPreferencesFragment, C8152a aVar, Preference preference) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C11766a a = new C11766a.C11769c(drawerPreferencesFragment.getContext()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.drawer_bg_colors).mo66986f(aVar.backgroundColor).mo66983c(true).mo66985e(1).mo66984d(new C17479j(drawerPreferencesFragment)).mo66981a();
        FragmentActivity activity = drawerPreferencesFragment.getActivity();
        C13706o.m87926c(activity);
        a.show(activity.getSupportFragmentManager(), "");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m19790s0(DrawerPreferencesFragment drawerPreferencesFragment, boolean z, int i) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C8152a M = C5163j2.m20012M(drawerPreferencesFragment.getActivity());
        if (z) {
            M.backgroundColor = i;
            C5163j2.m19974G3(drawerPreferencesFragment.getActivity(), M);
            C10180a.m40075a().mo80018i(new DrawerRefreshEvent(0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final boolean m19791u0(DrawerPreferencesFragment drawerPreferencesFragment, C8152a aVar, Preference preference) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C11766a a = new C11766a.C11769c(drawerPreferencesFragment.getContext()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.drawer_bg_colors).mo66986f(aVar.headerColor).mo66983c(true).mo66985e(1).mo66984d(new C17480k(drawerPreferencesFragment)).mo66981a();
        FragmentActivity activity = drawerPreferencesFragment.getActivity();
        C13706o.m87926c(activity);
        a.show(activity.getSupportFragmentManager(), "");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m19792v0(DrawerPreferencesFragment drawerPreferencesFragment, boolean z, int i) {
        C13706o.m87929f(drawerPreferencesFragment, "this$0");
        C8152a M = C5163j2.m20012M(drawerPreferencesFragment.getActivity());
        if (z) {
            M.headerColor = i;
            C5163j2.m19974G3(drawerPreferencesFragment.getActivity(), M);
            C10180a.m40075a().mo80018i(new DrawerRefreshEvent(0));
        }
    }

    /* renamed from: y0 */
    private final void m19793y0() {
        FragmentActivity activity = getActivity();
        C13706o.m87926c(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle((int) C17541R$string.drawer_swipe_area);
        View inflate = LayoutInflater.from(getActivity()).inflate(C17535R$layout.dialog_drawer_swipe_area, (ViewGroup) null);
        C13706o.m87927d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        C8152a M = C5163j2.m20012M(getActivity());
        RadioButton radioButton = (RadioButton) viewGroup.findViewById(2131363036);
        ImageView imageView = (ImageView) viewGroup.findViewById(C17532R$id.color_image);
        SeekBar seekBar = (SeekBar) viewGroup.findViewById(C17532R$id.seek_bar_width);
        SeekBar seekBar2 = (SeekBar) viewGroup.findViewById(C17532R$id.seek_bar_visible_width);
        SeekBar seekBar3 = (SeekBar) viewGroup.findViewById(C17532R$id.seek_bar_opacity);
        SeekBar seekBar4 = (SeekBar) viewGroup.findViewById(C17532R$id.seek_bar_height);
        SeekBar seekBar5 = (SeekBar) viewGroup.findViewById(C17532R$id.seek_bar_offset);
        seekBar.setProgress(M.swipeAreaWidth - 2);
        seekBar2.setProgress(M.getVisibleWidth() - 2);
        seekBar3.setProgress(M.swipeAreaOpacity);
        seekBar4.setProgress(M.swipeAreaHeight);
        seekBar5.setProgress(M.swipeAreaOffset);
        Drawable background = imageView.getBackground();
        C13706o.m87927d(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(M.swipeAreaColor);
        radioButton.setChecked(M.leftSide);
        ((RadioButton) viewGroup.findViewById(2131363634)).setChecked(!M.leftSide);
        radioButton.setOnCheckedChangeListener(new C17473d(M, this));
        imageView.setOnClickListener(new C17472c(this, M, imageView));
        C5133b bVar = r0;
        AlertDialog.Builder builder2 = builder;
        C5133b bVar2 = new C5133b(seekBar, seekBar2, M, seekBar3, seekBar4, seekBar5, this);
        seekBar.setOnSeekBarChangeListener(bVar);
        seekBar3.setOnSeekBarChangeListener(bVar);
        seekBar4.setOnSeekBarChangeListener(bVar);
        seekBar5.setOnSeekBarChangeListener(bVar);
        seekBar2.setOnSeekBarChangeListener(new C5132a(seekBar, M, seekBar2, this));
        AlertDialog.Builder builder3 = builder2;
        builder3.setView((View) viewGroup);
        builder3.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder3.show();
    }

    /* renamed from: j0 */
    public void mo30108j0() {
        this.f12888a.clear();
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(C17543R$xml.preference_drawer, str);
        m19784m0();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo30108j0();
    }
}
