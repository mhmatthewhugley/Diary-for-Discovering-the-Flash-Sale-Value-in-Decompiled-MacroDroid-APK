package com.arlosoft.macrodroid.action;

import android.content.Context;
import com.arlosoft.macrodroid.common.C4001c1;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.action.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3015e implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Collator f8219a;

    /* renamed from: c */
    public final /* synthetic */ Context f8220c;

    public /* synthetic */ C3015e(Collator collator, Context context) {
        this.f8219a = collator;
        this.f8220c = context;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f8219a.compare(this.f8220c.getString(((C4001c1) obj).mo27893k()), this.f8220c.getString(((C4001c1) obj2).mo27893k()));
    }
}
