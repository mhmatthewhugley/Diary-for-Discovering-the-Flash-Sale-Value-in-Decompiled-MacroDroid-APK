package com.android.dex.util;

import javax.mail.UIDFolder;

public final class Unsigned {
    private Unsigned() {
    }

    public static int compare(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return (((long) i) & UIDFolder.MAXUID) < (((long) i2) & UIDFolder.MAXUID) ? -1 : 1;
    }

    public static int compare(short s, short s2) {
        if (s == s2) {
            return 0;
        }
        return (s & 65535) < (s2 & 65535) ? -1 : 1;
    }
}
