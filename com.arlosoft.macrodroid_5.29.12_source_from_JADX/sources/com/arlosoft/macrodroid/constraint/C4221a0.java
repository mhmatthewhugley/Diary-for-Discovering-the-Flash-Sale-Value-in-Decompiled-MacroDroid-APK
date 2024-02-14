package com.arlosoft.macrodroid.constraint;

import android.content.Context;
import com.arlosoft.macrodroid.common.C4001c1;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.constraint.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4221a0 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Collator f10785a;

    /* renamed from: c */
    public final /* synthetic */ Context f10786c;

    public /* synthetic */ C4221a0(Collator collator, Context context) {
        this.f10785a = collator;
        this.f10786c = context;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f10785a.compare(this.f10786c.getString(((C4001c1) obj).mo27893k()), this.f10786c.getString(((C4001c1) obj2).mo27893k()));
    }
}
