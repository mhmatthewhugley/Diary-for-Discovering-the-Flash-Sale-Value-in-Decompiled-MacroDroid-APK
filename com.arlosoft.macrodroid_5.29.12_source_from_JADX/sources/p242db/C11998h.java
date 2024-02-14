package p242db;

import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p362pb.C16151b;

/* renamed from: db.h */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C11998h {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m82417b(C16151b bVar) {
        String b = bVar.mo78551i().mo78556b();
        C13706o.m87928e(b, "relativeClassName.asString()");
        String D = C15176v.m93629D(b, FilenameUtils.EXTENSION_SEPARATOR, '$', false, 4, (Object) null);
        if (bVar.mo78549h().mo78558d()) {
            return D;
        }
        return bVar.mo78549h() + FilenameUtils.EXTENSION_SEPARATOR + D;
    }
}
