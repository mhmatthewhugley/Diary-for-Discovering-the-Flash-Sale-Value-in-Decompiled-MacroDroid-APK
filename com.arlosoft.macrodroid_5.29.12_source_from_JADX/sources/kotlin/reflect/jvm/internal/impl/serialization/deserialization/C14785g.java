package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import p308kb.C13455c;
import p327mb.C15712a;
import p327mb.C15719c;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.g */
/* compiled from: ClassData.kt */
public final class C14785g {

    /* renamed from: a */
    private final C15719c f63879a;

    /* renamed from: b */
    private final C13455c f63880b;

    /* renamed from: c */
    private final C15712a f63881c;

    /* renamed from: d */
    private final C14158z0 f63882d;

    public C14785g(C15719c cVar, C13455c cVar2, C15712a aVar, C14158z0 z0Var) {
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(cVar2, "classProto");
        C13706o.m87929f(aVar, "metadataVersion");
        C13706o.m87929f(z0Var, "sourceElement");
        this.f63879a = cVar;
        this.f63880b = cVar2;
        this.f63881c = aVar;
        this.f63882d = z0Var;
    }

    /* renamed from: a */
    public final C15719c mo73943a() {
        return this.f63879a;
    }

    /* renamed from: b */
    public final C13455c mo73944b() {
        return this.f63880b;
    }

    /* renamed from: c */
    public final C15712a mo73945c() {
        return this.f63881c;
    }

    /* renamed from: d */
    public final C14158z0 mo73946d() {
        return this.f63882d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14785g)) {
            return false;
        }
        C14785g gVar = (C14785g) obj;
        return C13706o.m87924a(this.f63879a, gVar.f63879a) && C13706o.m87924a(this.f63880b, gVar.f63880b) && C13706o.m87924a(this.f63881c, gVar.f63881c) && C13706o.m87924a(this.f63882d, gVar.f63882d);
    }

    public int hashCode() {
        return (((((this.f63879a.hashCode() * 31) + this.f63880b.hashCode()) * 31) + this.f63881c.hashCode()) * 31) + this.f63882d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f63879a + ", classProto=" + this.f63880b + ", metadataVersion=" + this.f63881c + ", sourceElement=" + this.f63882d + ')';
    }
}
