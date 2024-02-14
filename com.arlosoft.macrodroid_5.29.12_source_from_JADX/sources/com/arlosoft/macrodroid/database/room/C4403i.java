package com.arlosoft.macrodroid.database.room;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C13695i;

/* renamed from: com.arlosoft.macrodroid.database.room.i */
/* compiled from: SystemLogEntry.kt */
public enum C4403i {
    DEBUG(0),
    VERBOSE(10),
    INFO(20),
    WARNING(30),
    ERROR(40);
    

    /* renamed from: a */
    public static final C4404a f11214a = null;
    private final int levelInt;

    /* renamed from: com.arlosoft.macrodroid.database.room.i$a */
    /* compiled from: SystemLogEntry.kt */
    public static final class C4404a {
        private C4404a() {
        }

        public /* synthetic */ C4404a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4403i mo28735a(int i) {
            for (C4403i iVar : C4403i.values()) {
                if (iVar.mo28734d() == i) {
                    return iVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        f11214a = new C4404a((C13695i) null);
    }

    private C4403i(int i) {
        this.levelInt = i;
    }

    /* renamed from: d */
    public final int mo28734d() {
        return this.levelInt;
    }
}
