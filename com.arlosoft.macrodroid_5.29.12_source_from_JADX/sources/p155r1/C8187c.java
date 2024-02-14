package p155r1;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* renamed from: r1.c */
/* compiled from: SendGrid */
public class C8187c {

    /* renamed from: a */
    private String f19848a;

    /* renamed from: b */
    private C8188e f19849b = new C8188e();

    private C8187c(String str) {
        this.f19848a = m33949b(str);
    }

    /* renamed from: a */
    public static C8187c m33948a(@NonNull String str) {
        return new C8187c(str);
    }

    /* renamed from: b */
    private String m33949b(String str) {
        return String.format("Bearer %s", new Object[]{str});
    }

    /* renamed from: c */
    public Callable<C8192h> mo38235c(@NonNull C8189f fVar) {
        return this.f19849b.mo38236b("mail/send", this.f19848a, C8191g.m33979a(fVar));
    }
}
