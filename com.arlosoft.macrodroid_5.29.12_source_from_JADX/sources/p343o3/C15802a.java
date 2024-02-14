package p343o3;

import android.net.Uri;
import android.view.View;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.triggers.receivers.widget.MacroDroidWidgetConfigureActivity;

/* renamed from: o3.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15802a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidWidgetConfigureActivity.C6080a f65204a;

    /* renamed from: c */
    public final /* synthetic */ WidgetPressedTrigger f65205c;

    /* renamed from: d */
    public final /* synthetic */ Macro f65206d;

    /* renamed from: f */
    public final /* synthetic */ String f65207f;

    /* renamed from: g */
    public final /* synthetic */ String f65208g;

    /* renamed from: o */
    public final /* synthetic */ Uri f65209o;

    public /* synthetic */ C15802a(MacroDroidWidgetConfigureActivity.C6080a aVar, WidgetPressedTrigger widgetPressedTrigger, Macro macro, String str, String str2, Uri uri) {
        this.f65204a = aVar;
        this.f65205c = widgetPressedTrigger;
        this.f65206d = macro;
        this.f65207f = str;
        this.f65208g = str2;
        this.f65209o = uri;
    }

    public final void onClick(View view) {
        this.f65204a.m24069b(this.f65205c, this.f65206d, this.f65207f, this.f65208g, this.f65209o, view);
    }
}
