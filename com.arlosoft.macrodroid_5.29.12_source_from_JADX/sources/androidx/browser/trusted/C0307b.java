package androidx.browser.trusted;

import java.util.Comparator;

/* renamed from: androidx.browser.trusted.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0307b implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C0307b f337a = new C0307b();

    private /* synthetic */ C0307b() {
    }

    public final int compare(Object obj, Object obj2) {
        return TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
    }
}
