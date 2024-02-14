package p167t1;

import android.content.DialogInterface;
import android.widget.EditText;
import com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity;

/* renamed from: t1.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17447e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ConfigureZoneActivity f69229a;

    /* renamed from: c */
    public final /* synthetic */ EditText f69230c;

    public /* synthetic */ C17447e(ConfigureZoneActivity configureZoneActivity, EditText editText) {
        this.f69229a = configureZoneActivity;
        this.f69230c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f69229a.m18314q2(this.f69230c, dialogInterface, i);
    }
}
