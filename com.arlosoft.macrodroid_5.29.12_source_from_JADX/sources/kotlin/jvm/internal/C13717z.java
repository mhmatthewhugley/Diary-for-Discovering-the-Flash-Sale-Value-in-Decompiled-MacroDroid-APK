package kotlin.jvm.internal;

import p433xa.C16874c;
import p433xa.C16887m;

/* renamed from: kotlin.jvm.internal.z */
/* compiled from: PropertyReference */
public abstract class C13717z extends C13685e implements C16887m {
    public C13717z() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13717z) {
            C13717z zVar = (C13717z) obj;
            if (!getOwner().equals(zVar.getOwner()) || !getName().equals(zVar.getName()) || !getSignature().equals(zVar.getSignature()) || !C13706o.m87924a(getBoundReceiver(), zVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C16887m) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C16887m getReflected() {
        return (C16887m) super.getReflected();
    }

    public String toString() {
        C16874c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13717z(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
