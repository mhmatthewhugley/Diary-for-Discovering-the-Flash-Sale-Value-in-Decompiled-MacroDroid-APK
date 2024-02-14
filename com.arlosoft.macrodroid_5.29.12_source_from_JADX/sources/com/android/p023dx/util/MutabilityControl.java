package com.android.p023dx.util;

/* renamed from: com.android.dx.util.MutabilityControl */
public class MutabilityControl {
    private boolean mutable;

    public MutabilityControl() {
        this.mutable = true;
    }

    public final boolean isImmutable() {
        return !this.mutable;
    }

    public final boolean isMutable() {
        return this.mutable;
    }

    public void setImmutable() {
        this.mutable = false;
    }

    public final void throwIfImmutable() {
        if (!this.mutable) {
            throw new MutabilityException("immutable instance");
        }
    }

    public final void throwIfMutable() {
        if (this.mutable) {
            throw new MutabilityException("mutable instance");
        }
    }

    public MutabilityControl(boolean z) {
        this.mutable = z;
    }
}
