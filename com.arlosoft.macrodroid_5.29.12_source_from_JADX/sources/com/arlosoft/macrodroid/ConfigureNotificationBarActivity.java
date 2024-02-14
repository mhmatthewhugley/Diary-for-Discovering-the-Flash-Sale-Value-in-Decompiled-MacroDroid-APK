package com.arlosoft.macrodroid;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NotificationButton;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.jaredrummler.android.colorpicker.C11680c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p331n6.C15755a;

public class ConfigureNotificationBarActivity extends MacroDroidDialogBaseActivity implements C15755a {

    /* renamed from: A */
    private int f6995A;

    /* renamed from: B */
    private SwitchCompat f6996B;

    /* renamed from: C */
    private ImageView f6997C;

    /* renamed from: f */
    private List<ImageView> f6998f;

    /* renamed from: g */
    private List<ViewGroup> f6999g;

    /* renamed from: o */
    private int f7000o;

    /* renamed from: p */
    private List<NotificationButton> f7001p;

    /* renamed from: s */
    private int f7002s;

    /* renamed from: z */
    private List<NotificationButton> f7003z;

    /* renamed from: T1 */
    private boolean m9403T1() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m9404U1(View view) {
        m9413d2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m9405V1(View view, ViewGroup viewGroup, CompoundButton compoundButton, boolean z) {
        view.setVisibility(z ? 8 : 0);
        C5163j2.m19936B5(this, z);
        viewGroup.setAlpha(z ? 1.0f : 0.4f);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m9406W1(View view) {
        MacroDroidService.m9502g(this, true);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m9407X1(View view) {
        C5163j2.m20045Q4(this, this.f7003z);
        C5163j2.m20243q4(this, this.f6995A);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m9408Y1(CheckBox checkBox, CompoundButton compoundButton, boolean z) {
        C5163j2.m19928A5(this, z);
        checkBox.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m9409Z1(CompoundButton compoundButton, boolean z) {
        C5163j2.m19944C5(this, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m9410a2(ViewGroup viewGroup, boolean z, CompoundButton compoundButton, boolean z2) {
        int i;
        boolean z3 = !C5163j2.m20230p(this);
        C5163j2.m20226o3(this, z3);
        if (z3) {
            i = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i = ContextCompat.getColor(this, z ? C17528R$color.default_background : C17528R$color.notification_bar_background);
        }
        viewGroup.setBackgroundColor(i);
        this.f6997C.setImageTintList(ColorStateList.valueOf(C5163j2.m20238q(this)));
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m9412c2(View view) {
        Intent intent = new Intent(this, IconSelectActivity.class);
        intent.putExtra("black_background", true);
        startActivityForResult(intent, 0);
    }

    /* renamed from: d2 */
    private void m9413d2() {
        C11680c.C11691k d = C11680c.m81798g0().mo65734d(C5163j2.m20238q(this));
        d.mo65737g(C17541R$string.select_color);
        d.mo65736f(C17541R$string.icon_tint_custom_color);
        d.mo65740j(C17541R$string.icon_tint_color_presets);
        d.mo65742l(true);
        d.mo65741k(17039370);
        d.mo65744n(this);
    }

    private void refresh() {
        int q = C5163j2.m20238q(this);
        for (ImageView next : this.f6998f) {
            next.setImageResource(C17530R$drawable.drawable_transparent);
            next.setVisibility(8);
            registerForContextMenu(next);
            next.setOnClickListener(new C3875b(next));
        }
        for (ViewGroup visibility : this.f6999g) {
            visibility.setVisibility(8);
        }
        this.f7001p = C5163j2.m20120b1(this);
        boolean z = m9403T1() || this.f6996B.isChecked();
        int i = 0;
        while (i < this.f7001p.size() && i < this.f6999g.size()) {
            NotificationButton notificationButton = this.f7001p.get(i);
            if (notificationButton.mo27796e() != null) {
                this.f6999g.get(i).setVisibility(0);
                this.f6998f.get(i).setVisibility(0);
                this.f6998f.get(i).setImageURI(notificationButton.mo27796e());
            } else {
                Drawable I = C4061t1.m15960I(this, notificationButton.mo27794d(), notificationButton.mo27793c());
                if (I == null) {
                    I = C4061t1.m15958H(this, notificationButton.mo27794d(), notificationButton.mo27792b());
                }
                if (I != null) {
                    this.f6999g.get(i).setVisibility(0);
                    this.f6998f.get(i).setVisibility(0);
                    this.f6998f.get(i).setImageDrawable(I);
                    if (notificationButton.mo27794d() == null || (notificationButton.mo27794d().equals("com.arlosoft.macrodroid") && !notificationButton.mo27793c().equals("com.arlosoft.macrodroid"))) {
                        this.f6998f.get(i).setImageTintList(ColorStateList.valueOf(q));
                    }
                } else if (notificationButton.mo27794d() == null || !notificationButton.mo27794d().equals("UserIcon")) {
                    int V = notificationButton.mo27793c() != null ? C4061t1.m15976V(this, notificationButton.mo27793c()) : -1;
                    if (V == -1) {
                        V = C17530R$drawable.ic_settings_white_24dp;
                    }
                    this.f6999g.get(i).setVisibility(0);
                    this.f6998f.get(i).setVisibility(0);
                    try {
                        I = ResourcesCompat.getDrawable(getResources(), V, (Resources.Theme) null);
                    } catch (Exception e) {
                        C4878b.m18868g("Could not get icon for notificaiton bar: " + e);
                    }
                    if (I != null) {
                        if (notificationButton.mo27794d() == null || (notificationButton.mo27794d().equals("com.arlosoft.macrodroid") && !notificationButton.mo27793c().equals("com.arlosoft.macrodroid"))) {
                            this.f6998f.get(i).setImageTintList(ColorStateList.valueOf(q));
                        }
                        this.f6998f.get(i).setImageDrawable(I);
                    }
                } else {
                    Bitmap f = C6362a0.m24600f(notificationButton.mo27793c());
                    this.f6999g.get(i).setVisibility(0);
                    this.f6998f.get(i).setVisibility(0);
                    if (f != null) {
                        this.f6998f.get(i).setImageBitmap(f);
                    } else {
                        this.f6998f.get(i).setImageResource(C17530R$drawable.launcher_no_border);
                    }
                }
            }
            i++;
        }
        if (this.f7001p.size() < 7) {
            ImageView imageView = this.f6998f.get(this.f7001p.size());
            imageView.setImageResource(z ? C17530R$drawable.ic_add_circle_white_48dp : C17530R$drawable.ic_add_circle_black_48dp);
            this.f6999g.get(this.f7001p.size()).setVisibility(0);
            unregisterForContextMenu(imageView);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new C4542e(this));
        }
    }

    /* renamed from: U */
    public void mo24603U(int i, int i2) {
        this.f6997C.setImageTintList(ColorStateList.valueOf(i2));
        C5163j2.m20234p3(this, i2);
        refresh();
    }

    /* renamed from: V0 */
    public void mo24604V0(int i) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            String stringExtra = intent.getStringExtra("drawableName");
            String stringExtra2 = intent.getStringExtra("drawablePackageName");
            Uri data = intent.getData();
            int intExtra = intent.getIntExtra("drawableId", 0);
            List<NotificationButton> b1 = C5163j2.m20120b1(this);
            if (i == 0) {
                b1.add(new NotificationButton(this.f7000o, stringExtra, stringExtra2, intExtra, data));
                int i3 = this.f7000o + 1;
                this.f7000o = i3;
                C5163j2.m20243q4(this, i3);
                C5163j2.m20045Q4(this, b1);
                refresh();
            } else if (i == 1) {
                NotificationButton notificationButton = b1.get(this.f7002s);
                notificationButton.mo27798g(stringExtra);
                notificationButton.mo27799h(stringExtra2);
                notificationButton.mo27797f(intExtra);
                notificationButton.mo27800i(data);
                C5163j2.m20045Q4(this, b1);
                refresh();
            }
        }
    }

    public void onBackPressed() {
        C5163j2.m20045Q4(this, this.f7003z);
        C5163j2.m20243q4(this, this.f6995A);
        super.onBackPressed();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int i;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                Intent intent = new Intent(this, IconSelectActivity.class);
                intent.putExtra("black_background", true);
                startActivityForResult(intent, 1);
            } else if (itemId == 2) {
                int i2 = this.f7002s;
                if (i2 > -1) {
                    this.f7001p.add(this.f7002s - 1, this.f7001p.remove(i2));
                    C5163j2.m20045Q4(this, this.f7001p);
                    refresh();
                }
            } else if (itemId == 3 && (i = this.f7002s) > -1) {
                this.f7001p.add(this.f7002s + 1, this.f7001p.remove(i));
                C5163j2.m20045Q4(this, this.f7001p);
                refresh();
            }
        } else if (this.f7002s > -1 && this.f7001p.size() > 0 && this.f7002s < this.f7001p.size()) {
            this.f7001p.remove(this.f7002s);
            C5163j2.m20045Q4(this, this.f7001p);
            refresh();
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.configure_notification_buttons_activity);
        setTitle(C17541R$string.configure_button_bar);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        Button button = (Button) findViewById(C17532R$id.okButton);
        Button button2 = (Button) findViewById(C17532R$id.cancelButton);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(C17532R$id.configure_notification_Switch);
        this.f6996B = (SwitchCompat) findViewById(C17532R$id.configure_black_bar);
        ViewGroup viewGroup = (ViewGroup) findViewById(C17532R$id.configure_notification_button_controls);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C17532R$id.button_layout);
        CheckBox checkBox = (CheckBox) findViewById(C17532R$id.configure_notification_show_mode);
        CheckBox checkBox2 = (CheckBox) findViewById(C17532R$id.configure_notification_show_macrodroid_icon);
        View findViewById = findViewById(C17532R$id.view_blocker);
        TextView textView = (TextView) findViewById(C17532R$id.android12Warning);
        this.f6997C = (ImageView) findViewById(C17532R$id.icon_tint_button);
        int i2 = 8;
        textView.setVisibility(Build.VERSION.SDK_INT >= 31 ? 0 : 8);
        boolean P1 = C5163j2.m20035P1(this);
        this.f6997C.setOnClickListener(new C3897c(this));
        viewGroup.setAlpha(P1 ? 1.0f : 0.4f);
        checkBox2.setChecked(C5163j2.m20028O1(this));
        checkBox.setVisibility(checkBox2.isChecked() ? 0 : 8);
        checkBox.setChecked(C5163j2.m20042Q1(this));
        switchCompat.setChecked(P1);
        viewGroup.setEnabled(P1);
        if (!P1) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        boolean T1 = m9403T1();
        switchCompat.setOnCheckedChangeListener(new C4731h(this, findViewById, viewGroup));
        button.setOnClickListener(new C4673f(this));
        button2.setOnClickListener(new C4356d(this));
        checkBox2.setOnCheckedChangeListener(new C4828j(this, checkBox));
        checkBox.setOnCheckedChangeListener(new C4698g(this));
        this.f6996B.setVisibility(0);
        boolean p = C5163j2.m20230p(this);
        this.f6996B.setChecked(p);
        if (p) {
            i = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i = ContextCompat.getColor(this, T1 ? C17528R$color.default_background : C17528R$color.notification_bar_background);
        }
        viewGroup2.setBackgroundColor(i);
        this.f6996B.setOnCheckedChangeListener(new C4826i(this, viewGroup2, T1));
        this.f6995A = C5163j2.m20311z0(this);
        this.f7003z = C5163j2.m20120b1(this);
        ArrayList arrayList = new ArrayList();
        this.f6998f = arrayList;
        arrayList.add((ImageView) findViewById(C17532R$id.button1));
        this.f6998f.add((ImageView) findViewById(C17532R$id.button2));
        this.f6998f.add((ImageView) findViewById(C17532R$id.button3));
        this.f6998f.add((ImageView) findViewById(C17532R$id.button4));
        this.f6998f.add((ImageView) findViewById(C17532R$id.button5));
        this.f6998f.add((ImageView) findViewById(C17532R$id.button6));
        this.f6998f.add((ImageView) findViewById(C17532R$id.button7));
        ArrayList arrayList2 = new ArrayList();
        this.f6999g = arrayList2;
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_1));
        this.f6999g.add((ViewGroup) findViewById(C17532R$id.button_frame_2));
        this.f6999g.add((ViewGroup) findViewById(C17532R$id.button_frame_3));
        this.f6999g.add((ViewGroup) findViewById(C17532R$id.button_frame_4));
        this.f6999g.add((ViewGroup) findViewById(C17532R$id.button_frame_5));
        this.f6999g.add((ViewGroup) findViewById(C17532R$id.button_frame_6));
        this.f6999g.add((ViewGroup) findViewById(C17532R$id.button_frame_7));
        this.f7000o = C5163j2.m20311z0(this);
        this.f6997C.setImageTintList(ColorStateList.valueOf(C5163j2.m20238q(this)));
        refresh();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.f7002s = -1;
        Iterator<ImageView> it = this.f6998f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() == view) {
                this.f7002s = i;
                break;
            } else {
                i++;
            }
        }
        contextMenu.add(0, 0, 0, getString(C17541R$string.delete));
        contextMenu.add(0, 1, 0, getString(C17541R$string.select_icon));
        if (this.f7002s > 0) {
            contextMenu.add(0, 2, 0, getString(C17541R$string.move_left));
        }
        if (this.f7002s < this.f7001p.size() - 1) {
            contextMenu.add(0, 3, 0, getString(C17541R$string.move_right));
        }
    }
}
