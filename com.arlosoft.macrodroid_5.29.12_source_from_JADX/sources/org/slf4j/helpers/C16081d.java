package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.LoggerFactory;
import p339ne.C15790b;

/* renamed from: org.slf4j.helpers.d */
/* compiled from: NamedLoggerBase */
abstract class C16081d implements C15790b, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    C16081d() {
    }

    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() throws ObjectStreamException {
        return LoggerFactory.m96693h(getName());
    }
}
