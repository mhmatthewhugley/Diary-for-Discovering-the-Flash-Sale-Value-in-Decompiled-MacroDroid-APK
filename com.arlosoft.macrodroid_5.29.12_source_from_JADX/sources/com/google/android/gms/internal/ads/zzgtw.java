package com.google.android.gms.internal.ads;

import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgtw {
    /* renamed from: a */
    static String m53335a(zzgpw zzgpw) {
        StringBuilder sb = new StringBuilder(zzgpw.mo47083m());
        for (int i = 0; i < zzgpw.mo47083m(); i++) {
            byte j = zzgpw.mo47081j(i);
            if (j == 34) {
                sb.append("\\\"");
            } else if (j == 39) {
                sb.append("\\'");
            } else if (j != 92) {
                switch (j) {
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
                        if (j >= 32 && j <= 126) {
                            sb.append((char) j);
                            break;
                        } else {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((j >>> 6) & 3) + 48));
                            sb.append((char) (((j >>> 3) & 7) + 48));
                            sb.append((char) ((j & 7) + 48));
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
