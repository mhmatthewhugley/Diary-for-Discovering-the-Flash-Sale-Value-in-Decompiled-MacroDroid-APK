package com.arlosoft.macrodroid.triggers.activities;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidDialogBaseActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NotificationButton;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6362a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelectNotificationButtonActivity extends MacroDroidDialogBaseActivity {
    /* renamed from: O1 */
    private void m23900O1(MotionEvent motionEvent, View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setLayoutParams(layoutParams);
        } else if (action == 1) {
            layoutParams.topMargin = ((int) motionEvent.getRawY()) - view.getHeight();
            layoutParams.leftMargin = ((int) motionEvent.getRawX()) - (view.getWidth() / 2);
            view.setLayoutParams(layoutParams);
        } else if (action == 2) {
            layoutParams.topMargin = ((int) motionEvent.getRawY()) - view.getHeight();
            layoutParams.leftMargin = ((int) motionEvent.getRawX()) - (view.getWidth() / 2);
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: P1 */
    private boolean m23901P1() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ boolean m23902Q1(View view, MotionEvent motionEvent) {
        m23900O1(motionEvent, view);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m23905T1(NotificationButton notificationButton, RadioButton radioButton, View view) {
        Intent intent = new Intent();
        intent.putExtra("notificationButton", notificationButton.mo27791a());
        intent.putExtra("collapse_on_press", radioButton.isChecked());
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.select_notificaton_button);
        setTitle(C17541R$string.select_button);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        LinearLayout linearLayout = (LinearLayout) findViewById(C17532R$id.button_layout);
        linearLayout.setOnTouchListener(new C5865x(this));
        boolean booleanExtra = getIntent().getBooleanExtra("collapse_on_press", true);
        RadioButton radioButton = (RadioButton) findViewById(C17532R$id.select_notification_button_collapse);
        radioButton.setChecked(booleanExtra);
        ((RadioButton) findViewById(C17532R$id.select_notification_button_dont_collapse)).setChecked(!booleanExtra);
        ArrayList arrayList = new ArrayList();
        arrayList.add((ImageView) findViewById(C17532R$id.button1));
        arrayList.add((ImageView) findViewById(C17532R$id.button2));
        arrayList.add((ImageView) findViewById(C17532R$id.button3));
        arrayList.add((ImageView) findViewById(C17532R$id.button4));
        arrayList.add((ImageView) findViewById(C17532R$id.button5));
        arrayList.add((ImageView) findViewById(C17532R$id.button6));
        arrayList.add((ImageView) findViewById(C17532R$id.button7));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_1));
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_2));
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_3));
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_4));
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_5));
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_6));
        arrayList2.add((ViewGroup) findViewById(C17532R$id.button_frame_7));
        List<NotificationButton> b1 = C5163j2.m20120b1(this);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            imageView.setImageResource(0);
            imageView.setVisibility(8);
            registerForContextMenu(imageView);
            imageView.setOnClickListener(new C5863v(imageView));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((ViewGroup) it2.next()).setVisibility(8);
        }
        int q = C5163j2.m20238q(this);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ImageView imageView2 = (ImageView) it3.next();
            imageView2.setImageResource(C17530R$drawable.drawable_transparent);
            imageView2.setVisibility(8);
            registerForContextMenu(imageView2);
            imageView2.setOnClickListener(new C5862u(imageView2));
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((ViewGroup) it4.next()).setVisibility(8);
        }
        if (C5163j2.m20230p(this)) {
            i = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i = ContextCompat.getColor(this, m23901P1() ? C17528R$color.default_background : C17528R$color.notification_bar_background);
        }
        linearLayout.setBackgroundColor(i);
        int i2 = 0;
        while (i2 < b1.size() && i2 < arrayList2.size()) {
            NotificationButton notificationButton = b1.get(i2);
            if (notificationButton.mo27796e() != null) {
                ((ViewGroup) arrayList2.get(i2)).setVisibility(0);
                ((ImageView) arrayList.get(i2)).setVisibility(0);
                ((ImageView) arrayList.get(i2)).setImageURI(notificationButton.mo27796e());
            } else {
                ((ImageView) arrayList.get(i2)).setOnClickListener(new C5864w(this, notificationButton, radioButton));
                Drawable I = C4061t1.m15960I(this, notificationButton.mo27794d(), notificationButton.mo27793c());
                if (I == null) {
                    I = C4061t1.m15958H(this, notificationButton.mo27794d(), notificationButton.mo27792b());
                }
                if (I != null) {
                    ((ViewGroup) arrayList2.get(i2)).setVisibility(0);
                    ((ImageView) arrayList.get(i2)).setVisibility(0);
                    ((ImageView) arrayList.get(i2)).setImageDrawable(I);
                    if (notificationButton.mo27794d() == null || (notificationButton.mo27794d().equals("com.arlosoft.macrodroid") && !notificationButton.mo27793c().equals("com.arlosoft.macrodroid"))) {
                        ((ImageView) arrayList.get(i2)).setImageTintList(ColorStateList.valueOf(q));
                    }
                } else if (notificationButton.mo27794d() == null || !notificationButton.mo27794d().equals("UserIcon")) {
                    int V = notificationButton.mo27793c() != null ? C4061t1.m15976V(this, notificationButton.mo27793c()) : -1;
                    if (V == -1) {
                        V = C17530R$drawable.ic_settings_white_24dp;
                    }
                    ((ViewGroup) arrayList2.get(i2)).setVisibility(0);
                    ((ImageView) arrayList.get(i2)).setVisibility(0);
                    Drawable drawable = getResources().getDrawable(V);
                    if (drawable != null) {
                        if (notificationButton.mo27794d() == null || (notificationButton.mo27794d().equals("com.arlosoft.macrodroid") && !notificationButton.mo27793c().equals("com.arlosoft.macrodroid"))) {
                            ((ImageView) arrayList.get(i2)).setImageTintList(ColorStateList.valueOf(q));
                        }
                        ((ImageView) arrayList.get(i2)).setImageDrawable(drawable);
                    }
                } else {
                    Bitmap f = C6362a0.m24600f(notificationButton.mo27793c());
                    ((ViewGroup) arrayList2.get(i2)).setVisibility(0);
                    ((ImageView) arrayList.get(i2)).setVisibility(0);
                    if (f != null) {
                        ((ImageView) arrayList.get(i2)).setImageBitmap(f);
                    } else {
                        ((ImageView) arrayList.get(i2)).setImageResource(C17530R$drawable.launcher_no_border);
                    }
                }
            }
            i2++;
        }
    }
}
