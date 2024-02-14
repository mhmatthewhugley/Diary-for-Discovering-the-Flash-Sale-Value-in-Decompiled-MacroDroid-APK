package com.arlosoft.macrodroid.triggers.activities;

import android.view.View;
import android.widget.RadioButton;
import com.arlosoft.macrodroid.common.NotificationButton;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5864w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectNotificationButtonActivity f13916a;

    /* renamed from: c */
    public final /* synthetic */ NotificationButton f13917c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f13918d;

    public /* synthetic */ C5864w(SelectNotificationButtonActivity selectNotificationButtonActivity, NotificationButton notificationButton, RadioButton radioButton) {
        this.f13916a = selectNotificationButtonActivity;
        this.f13917c = notificationButton;
        this.f13918d = radioButton;
    }

    public final void onClick(View view) {
        this.f13916a.m23905T1(this.f13917c, this.f13918d, view);
    }
}
