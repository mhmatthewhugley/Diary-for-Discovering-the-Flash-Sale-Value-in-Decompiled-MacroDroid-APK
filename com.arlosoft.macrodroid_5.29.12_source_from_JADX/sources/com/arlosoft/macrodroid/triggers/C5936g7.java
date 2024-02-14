package com.arlosoft.macrodroid.triggers;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.innovattic.rangeseekbar.RangeSeekBar;

/* renamed from: com.arlosoft.macrodroid.triggers.g7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5936g7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f14062a;

    /* renamed from: c */
    public final /* synthetic */ SleepTrigger f14063c;

    /* renamed from: d */
    public final /* synthetic */ RangeSeekBar f14064d;

    public /* synthetic */ C5936g7(AppCompatDialog appCompatDialog, SleepTrigger sleepTrigger, RangeSeekBar rangeSeekBar) {
        this.f14062a = appCompatDialog;
        this.f14063c = sleepTrigger;
        this.f14064d = rangeSeekBar;
    }

    public final void onClick(View view) {
        SleepTrigger.m23197o3(this.f14062a, this.f14063c, this.f14064d, view);
    }
}
