package com.google.protobuf;

import org.apache.commons.p353io.IOUtils;

final class TextFormatEscaper {

    /* renamed from: com.google.protobuf.TextFormatEscaper$2 */
    final class C116142 implements ByteSequence {

        /* renamed from: a */
        final /* synthetic */ byte[] f57113a;

        /* renamed from: a */
        public byte mo65435a(int i) {
            return this.f57113a[i];
        }

        public int size() {
            return this.f57113a.length;
        }
    }

    private interface ByteSequence {
        /* renamed from: a */
        byte mo65435a(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    /* renamed from: a */
    static String m81248a(final ByteString byteString) {
        return m81249b(new ByteSequence() {
            /* renamed from: a */
            public byte mo65435a(int i) {
                return byteString.mo64922h(i);
            }

            public int size() {
                return byteString.size();
            }
        });
    }

    /* renamed from: b */
    static String m81249b(ByteSequence byteSequence) {
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte a = byteSequence.mo65435a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
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
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
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

    /* renamed from: c */
    static String m81250c(String str) {
        return m81248a(ByteString.m79775t(str));
    }
}
