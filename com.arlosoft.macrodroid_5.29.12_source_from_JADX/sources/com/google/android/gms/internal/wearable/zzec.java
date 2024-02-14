package com.google.android.gms.internal.wearable;

import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzec {
    /* renamed from: a */
    static String m64426a(zzaw zzaw) {
        StringBuilder sb = new StringBuilder(zzaw.mo53831f());
        for (int i = 0; i < zzaw.mo53831f(); i++) {
            byte c = zzaw.mo53829c(i);
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
