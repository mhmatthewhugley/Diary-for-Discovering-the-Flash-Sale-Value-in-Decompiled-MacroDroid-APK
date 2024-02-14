package com.arlosoft.macrodroid.quicksettings;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.events.QuickSettingsTilesUpdatedEvent;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService1;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService2;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService3;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService4;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService5;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService6;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService7;
import com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService8;
import java.util.ArrayList;
import java.util.List;
import p081e1.C7264a;
import p144p2.C16094a;
import p144p2.C16095b;
import p144p2.C16096c;
import p161s1.C10180a;

public class QuickSettingsActivity extends MacroDroidBaseActivity {

    /* renamed from: A */
    private final Class[] f12683A = {MacroDroidTileService1.class, MacroDroidTileService2.class, MacroDroidTileService3.class, MacroDroidTileService4.class, MacroDroidTileService5.class, MacroDroidTileService6.class, MacroDroidTileService7.class, MacroDroidTileService8.class};

    /* renamed from: B */
    final C7264a f12684B = MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE);
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;

    /* renamed from: o */
    private ImageView f12685o;

    /* renamed from: p */
    private List<QuickSettingsViewHolder> f12686p = new ArrayList();

    /* renamed from: s */
    private QuickSettingsData f12687s;

    /* renamed from: z */
    private final boolean[] f12688z = new boolean[8];

    public static class QuickSettingsViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final Context f12689a;

        /* renamed from: b */
        private final QuickSettingsActivity f12690b;
        @BindView(2131362141)
        TextView buttonLabel;
        @BindView(2131362146)
        RadioButton buttonOption;
        @BindView(2131362257)
        CheckBox collapseOnPress;
        @BindView(2131362381)
        CardView container;
        @BindView(2131362676)
        TextView enabledState;
        @BindView(2131362929)
        ImageView image;
        @BindView(2131364014)
        EditText label;
        @BindView(2131364015)
        SwitchCompat tileSwitch;
        @BindView(2131364056)
        RadioButton toggleOption;

        /* renamed from: com.arlosoft.macrodroid.quicksettings.QuickSettingsActivity$QuickSettingsViewHolder$a */
        class C5067a implements TextWatcher {
            C5067a() {
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        public QuickSettingsViewHolder(@NonNull QuickSettingsActivity quickSettingsActivity, @NonNull View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f12689a = view.getContext();
            this.f12690b = quickSettingsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m19524w(CompoundButton compoundButton, boolean z) {
            this.enabledState.setText(this.f12689a.getString(z ? C17541R$string.enabled : C17541R$string.disabled));
            this.enabledState.setAlpha(z ? 1.0f : 0.5f);
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m19525x(View view) {
            this.f12690b.mo29960T1(this.image);
        }

        /* renamed from: v */
        public void mo29961v(@NonNull QuickSettingButton quickSettingButton, @NonNull String str, int i) {
            Context context;
            int i2;
            this.buttonLabel.setText(str);
            this.label.setText(quickSettingButton.getLabel());
            this.buttonOption.setChecked(!quickSettingButton.isToggle());
            this.toggleOption.setChecked(quickSettingButton.isToggle());
            this.tileSwitch.setChecked(quickSettingButton.getEnabled());
            try {
                this.image.setImageResource(MacroDroidTileService.m24246b(this.f12689a, quickSettingButton));
            } catch (Resources.NotFoundException unused) {
                this.image.setImageResource(C17530R$drawable.active_icon_new);
            }
            this.image.setTag(quickSettingButton.getImageName());
            TextView textView = this.enabledState;
            if (quickSettingButton.getEnabled()) {
                context = this.f12689a;
                i2 = C17541R$string.enabled;
            } else {
                context = this.f12689a;
                i2 = C17541R$string.disabled;
            }
            textView.setText(context.getString(i2));
            this.enabledState.setAlpha(quickSettingButton.getEnabled() ? 1.0f : 0.5f);
            this.collapseOnPress.setChecked(quickSettingButton.getCollapseOnPress());
            this.tileSwitch.setOnCheckedChangeListener(new C16096c(this));
            this.image.setOnClickListener(new C16095b(this));
            this.label.addTextChangedListener(new C5067a());
        }
    }

    public class QuickSettingsViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private QuickSettingsViewHolder f12692a;

        @UiThread
        public QuickSettingsViewHolder_ViewBinding(QuickSettingsViewHolder quickSettingsViewHolder, View view) {
            this.f12692a = quickSettingsViewHolder;
            quickSettingsViewHolder.container = (CardView) Utils.findRequiredViewAsType(view, 2131362381, "field 'container'", CardView.class);
            quickSettingsViewHolder.image = (ImageView) Utils.findRequiredViewAsType(view, 2131362929, "field 'image'", ImageView.class);
            quickSettingsViewHolder.label = (EditText) Utils.findRequiredViewAsType(view, C17532R$id.tile_label, "field 'label'", EditText.class);
            quickSettingsViewHolder.tileSwitch = (SwitchCompat) Utils.findRequiredViewAsType(view, C17532R$id.tile_switch, "field 'tileSwitch'", SwitchCompat.class);
            quickSettingsViewHolder.buttonLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.button_label, "field 'buttonLabel'", TextView.class);
            quickSettingsViewHolder.buttonOption = (RadioButton) Utils.findRequiredViewAsType(view, C17532R$id.button_option, "field 'buttonOption'", RadioButton.class);
            quickSettingsViewHolder.toggleOption = (RadioButton) Utils.findRequiredViewAsType(view, C17532R$id.toggle_option, "field 'toggleOption'", RadioButton.class);
            quickSettingsViewHolder.enabledState = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.enabled_state, "field 'enabledState'", TextView.class);
            quickSettingsViewHolder.collapseOnPress = (CheckBox) Utils.findRequiredViewAsType(view, C17532R$id.collapse_on_press, "field 'collapseOnPress'", CheckBox.class);
        }

        @CallSuper
        public void unbind() {
            QuickSettingsViewHolder quickSettingsViewHolder = this.f12692a;
            if (quickSettingsViewHolder != null) {
                this.f12692a = null;
                quickSettingsViewHolder.container = null;
                quickSettingsViewHolder.image = null;
                quickSettingsViewHolder.label = null;
                quickSettingsViewHolder.tileSwitch = null;
                quickSettingsViewHolder.buttonLabel = null;
                quickSettingsViewHolder.buttonOption = null;
                quickSettingsViewHolder.toggleOption = null;
                quickSettingsViewHolder.enabledState = null;
                quickSettingsViewHolder.collapseOnPress = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: R1 */
    private void m19519R1() {
        if (C5163j2.m20317z6(this)) {
            this.infoCardView.setVisibility(8);
            return;
        }
        this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.quick_settings_config_primary));
        this.infoCardTitle.setText(C17541R$string.quick_settings_tiles);
        this.infoCardDetail.setText(C17541R$string.quick_settings_tiles_info);
        this.infoCardGotIt.setOnClickListener(new C16094a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m19520S1(View view) {
        C5163j2.m20043Q2(getApplicationContext());
        this.infoCardView.setVisibility(8);
    }

    /* renamed from: T1 */
    public void mo29960T1(ImageView imageView) {
        this.f12685o = imageView;
        Intent intent = new Intent(this, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", false);
        startActivityForResult(intent, 0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            int intExtra = intent.getIntExtra("drawableId", 0);
            String stringExtra = intent.getStringExtra("drawableName");
            ImageView imageView = this.f12685o;
            if (imageView != null) {
                imageView.setImageResource(intExtra);
                this.f12685o.setTag(stringExtra);
            }
        }
    }

    public void onBackPressed() {
        List<QuickSettingButton> quickSettingsButtonList = this.f12687s.getQuickSettingsButtonList();
        quickSettingsButtonList.clear();
        for (int i = 0; i < 8; i++) {
            QuickSettingsViewHolder quickSettingsViewHolder = this.f12686p.get(i);
            QuickSettingButton create = QuickSettingButton.create(quickSettingsViewHolder.label.getText().toString(), 0, quickSettingsViewHolder.tileSwitch.isChecked(), quickSettingsViewHolder.toggleOption.isChecked(), this.f12688z[i], quickSettingsViewHolder.collapseOnPress.isChecked(), (String) quickSettingsViewHolder.image.getTag());
            quickSettingsButtonList.add(create);
            PackageManager packageManager = getPackageManager();
            ComponentName componentName = new ComponentName("com.arlosoft.macrodroid", this.f12683A[i].getName());
            if (create.getEnabled()) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            } else {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        }
        this.f12684B.mo37132b(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, this.f12687s);
        C10180a.m40075a().mo80018i(new QuickSettingsTilesUpdatedEvent(this.f12687s));
        setResult(-1);
        finish();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_quick_settings);
        ButterKnife.bind((Activity) this);
        setTitle(C17541R$string.quick_settings_tiles);
        LinearLayout linearLayout = (LinearLayout) findViewById(C17532R$id.buttons_container);
        QuickSettingsData quickSettingsData = (QuickSettingsData) this.f12684B.mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        if (quickSettingsData == null) {
            this.f12687s = QuickSettingsData.createDefault();
        } else if (quickSettingsData.getQuickSettingsButtonList() == null || quickSettingsData.getQuickSettingsButtonList().size() == 0) {
            this.f12687s = QuickSettingsData.createDefault();
        } else {
            quickSettingsData.upddateFrom4To8IfRequired();
            this.f12687s = quickSettingsData;
        }
        String[] strArr = {getString(C17541R$string.macrodroid_tile_1), getString(C17541R$string.macrodroid_tile_2), getString(C17541R$string.macrodroid_tile_3), getString(C17541R$string.macrodroid_tile_4), getString(C17541R$string.macrodroid_tile_5), getString(C17541R$string.macrodroid_tile_6), getString(C17541R$string.macrodroid_tile_7), getString(C17541R$string.macrodroid_tile_8)};
        for (int i = 0; i < 8; i++) {
            QuickSettingsViewHolder quickSettingsViewHolder = new QuickSettingsViewHolder(this, LayoutInflater.from(this).inflate(C17535R$layout.list_item_quick_settings, linearLayout, false));
            linearLayout.addView(quickSettingsViewHolder.container);
            QuickSettingButton quickSettingButton = this.f12687s.getQuickSettingsButtonList().get(i);
            quickSettingsViewHolder.mo29961v(quickSettingButton, strArr[i], i);
            this.f12688z[i] = quickSettingButton.getToggleOn();
            this.f12686p.add(quickSettingsViewHolder);
        }
        m19519R1();
        this.infoCardGotIt.requestFocus();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}
