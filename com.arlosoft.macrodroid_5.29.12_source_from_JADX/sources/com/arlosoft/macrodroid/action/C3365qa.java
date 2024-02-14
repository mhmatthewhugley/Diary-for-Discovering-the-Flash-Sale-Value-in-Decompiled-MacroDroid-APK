package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.arlosoft.macrodroid.action.data.NotificationActionButton;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.qa */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3365qa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f8963a;

    /* renamed from: c */
    public final /* synthetic */ View f8964c;

    /* renamed from: d */
    public final /* synthetic */ Button f8965d;

    /* renamed from: f */
    public final /* synthetic */ List f8966f;

    /* renamed from: g */
    public final /* synthetic */ NotificationActionButton f8967g;

    public /* synthetic */ C3365qa(LinearLayout linearLayout, View view, Button button, List list, NotificationActionButton notificationActionButton) {
        this.f8963a = linearLayout;
        this.f8964c = view;
        this.f8965d = button;
        this.f8966f = list;
        this.f8967g = notificationActionButton;
    }

    public final void onClick(View view) {
        NotificationAction.m11535S3(this.f8963a, this.f8964c, this.f8965d, this.f8966f, this.f8967g, view);
    }
}
