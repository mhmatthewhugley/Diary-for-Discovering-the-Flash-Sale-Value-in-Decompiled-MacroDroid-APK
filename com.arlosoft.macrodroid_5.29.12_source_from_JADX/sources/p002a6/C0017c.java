package p002a6;

import java.io.File;
import java.util.Comparator;

/* renamed from: a6.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0017c implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C0017c f38a = new C0017c();

    private /* synthetic */ C0017c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
