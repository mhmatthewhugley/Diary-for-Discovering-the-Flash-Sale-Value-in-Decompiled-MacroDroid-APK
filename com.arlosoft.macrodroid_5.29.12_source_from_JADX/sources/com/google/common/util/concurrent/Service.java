package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Service {

    public static abstract class Listener {
        /* renamed from: a */
        public void mo61608a(State state, Throwable th) {
        }

        /* renamed from: b */
        public void mo61891b() {
        }

        /* renamed from: c */
        public void mo61892c() {
        }

        /* renamed from: d */
        public void mo61893d(State state) {
        }

        /* renamed from: e */
        public void mo61609e(State state) {
        }
    }

    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    /* renamed from: a */
    State mo61550a();
}
