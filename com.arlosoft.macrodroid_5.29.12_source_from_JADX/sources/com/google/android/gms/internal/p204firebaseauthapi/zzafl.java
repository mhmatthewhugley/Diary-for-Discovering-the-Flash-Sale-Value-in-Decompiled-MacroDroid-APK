package com.google.android.gms.internal.p204firebaseauthapi;

import org.apache.commons.p353io.IOUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafl {
    /* renamed from: a */
    static String m56744a(zzacc zzacc) {
        StringBuilder sb = new StringBuilder(zzacc.mo48893f());
        for (int i = 0; i < zzacc.mo48893f(); i++) {
            byte c = zzacc.mo48891c(i);
            if (c == 34) {
                sb.append("\\\"");
            } else if (c == 39) {
                sb.append("\\'");
            } else if (c != 92) {
                switch (c) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c >= 32 && c <= 126) {
                            sb.append((char) c);
                            break;
                        } else {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((c >>> 6) & 3) + 48));
                            sb.append((char) (((c >>> 3) & 7) + 48));
                            sb.append((char) ((c & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
