package com.google.android.gms.internal.places;

import org.apache.commons.p353io.IOUtils;

final class zzdo {
    /* renamed from: a */
    static String m63619a(zzw zzw) {
        zzdn zzdn = new zzdn(zzw);
        StringBuilder sb = new StringBuilder(zzdn.size());
        for (int i = 0; i < zzdn.size(); i++) {
            byte b0 = zzdn.mo53592b0(i);
            if (b0 == 34) {
                sb.append("\\\"");
            } else if (b0 == 39) {
                sb.append("\\'");
            } else if (b0 != 92) {
                switch (b0) {
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
                        if (b0 >= 32 && b0 <= 126) {
                            sb.append((char) b0);
                            break;
                        } else {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((b0 >>> 6) & 3) + 48));
                            sb.append((char) (((b0 >>> 3) & 7) + 48));
                            sb.append((char) ((b0 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
