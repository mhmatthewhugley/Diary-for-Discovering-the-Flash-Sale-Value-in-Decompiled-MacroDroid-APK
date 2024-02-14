package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        private HeartBeat(int i) {
            this.code = i;
        }

        /* renamed from: b */
        public int mo63204b() {
            return this.code;
        }
    }

    @NonNull
    /* renamed from: b */
    HeartBeat mo63202b(@NonNull String str);
}
