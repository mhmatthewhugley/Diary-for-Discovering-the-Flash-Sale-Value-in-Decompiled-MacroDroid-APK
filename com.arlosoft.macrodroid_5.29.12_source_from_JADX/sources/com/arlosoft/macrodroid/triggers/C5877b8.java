package com.arlosoft.macrodroid.triggers;

import android.content.Context;
import com.arlosoft.macrodroid.common.C4001c1;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.triggers.b8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5877b8 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Collator f13952a;

    /* renamed from: c */
    public final /* synthetic */ Context f13953c;

    public /* synthetic */ C5877b8(Collator collator, Context context) {
        this.f13952a = collator;
        this.f13953c = context;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f13952a.compare(this.f13953c.getString(((C4001c1) obj).mo27893k()), this.f13953c.getString(((C4001c1) obj2).mo27893k()));
    }
}
