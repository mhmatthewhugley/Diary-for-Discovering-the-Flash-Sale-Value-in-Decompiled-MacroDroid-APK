package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.os.Build;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.common.c1 */
/* compiled from: SelectableItemInfo.kt */
public abstract class C4001c1 {

    /* renamed from: a */
    private final int f10366a = 9999;

    /* renamed from: b */
    private final boolean f10367b;

    /* renamed from: c */
    private final boolean f10368c;

    /* renamed from: d */
    private final boolean f10369d;

    /* renamed from: e */
    private final List<String> f10370e;

    /* renamed from: a */
    public boolean mo27887a() {
        int i = Build.VERSION.SDK_INT;
        return i >= mo27901s() && i <= mo27900r() && (!mo27899q() || mo27902t() || C5163j2.m20304y1(MacroDroidApplication.f9883I.mo27303b())) && (C5163j2.m20118b(MacroDroidApplication.f9883I.mo27303b()) || !mo27897o());
    }

    /* renamed from: b */
    public abstract SelectableItem mo27888b(Activity activity, Macro macro);

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f10370e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Integer> mo27890d() {
        return new ArrayList();
    }

    @ColorRes
    /* renamed from: e */
    public abstract int mo26463e();

    @StringRes
    /* renamed from: f */
    public abstract int mo27891f();

    @DrawableRes
    /* renamed from: g */
    public abstract int mo27892g();

    @DrawableRes
    /* renamed from: h */
    public abstract int mo26464h(boolean z);

    @ColorRes
    /* renamed from: i */
    public abstract int mo26465i(boolean z);

    /* renamed from: j */
    public abstract int mo26466j();

    @StringRes
    /* renamed from: k */
    public abstract int mo27893k();

    /* renamed from: l */
    public int mo27894l() {
        return this.f10366a;
    }

    /* renamed from: m */
    public final List<Integer> mo27895m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(mo27893k()));
        arrayList.addAll(mo27890d());
        return arrayList;
    }

    /* renamed from: n */
    public boolean mo27896n() {
        return this.f10369d;
    }

    /* renamed from: o */
    public boolean mo27897o() {
        return this.f10367b;
    }

    /* renamed from: p */
    public boolean mo27898p() {
        return this.f10368c;
    }

    /* renamed from: q */
    public boolean mo27899q() {
        return Build.VERSION.SDK_INT >= mo27894l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo27900r() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 1;
    }

    /* renamed from: t */
    public final boolean mo27902t() {
        return mo27889c() != null;
    }
}
