package p143p1;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.drawer.MacroDroidDrawer;
import p149q1.C8153b;

/* renamed from: p1.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C16091h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidDrawer f66054a;

    /* renamed from: c */
    public final /* synthetic */ String[] f66055c;

    /* renamed from: d */
    public final /* synthetic */ C8153b f66056d;

    public /* synthetic */ C16091h(MacroDroidDrawer macroDroidDrawer, String[] strArr, C8153b bVar) {
        this.f66054a = macroDroidDrawer;
        this.f66055c = strArr;
        this.f66056d = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f66054a.m17578m(this.f66055c, this.f66056d, dialogInterface, i);
    }
}
