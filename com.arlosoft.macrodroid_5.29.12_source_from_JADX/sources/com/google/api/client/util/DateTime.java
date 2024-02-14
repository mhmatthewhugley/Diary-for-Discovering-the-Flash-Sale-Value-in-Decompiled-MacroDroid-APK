package com.google.api.client.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p353io.FilenameUtils;

public final class DateTime implements Serializable {

    /* renamed from: a */
    private static final TimeZone f52782a = TimeZone.getTimeZone("GMT");

    /* renamed from: c */
    private static final Pattern f52783c = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;
    private final boolean dateOnly;
    private final int tzShift;
    private final long value;

    public DateTime(long j) {
        this(false, j, (Integer) null);
    }

    /* renamed from: a */
    private static void m72666a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    /* renamed from: b */
    public static DateTime m72667b(String str) throws NumberFormatException {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Matcher matcher = f52783c.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "));
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        boolean z2 = matcher.group(4) != null;
        String group = matcher.group(9);
        boolean z3 = group != null;
        Integer num = null;
        if (!z3 || z2) {
            if (z2) {
                int parseInt4 = Integer.parseInt(matcher.group(5));
                int parseInt5 = Integer.parseInt(matcher.group(6));
                int parseInt6 = Integer.parseInt(matcher.group(7));
                if (matcher.group(8) != null) {
                    z = z2;
                    i4 = (int) (((double) ((float) Integer.parseInt(matcher.group(8).substring(1)))) / Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3)));
                    i2 = parseInt5;
                    i = parseInt6;
                } else {
                    z = z2;
                    i2 = parseInt5;
                    i = parseInt6;
                    i4 = 0;
                }
                i3 = parseInt4;
            } else {
                z = z2;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(f52782a);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i3, i2, i);
            gregorianCalendar.set(14, i4);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (z && z3) {
                if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                    i5 = 0;
                } else {
                    int parseInt7 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                    i5 = matcher.group(10).charAt(0) == '-' ? -parseInt7 : parseInt7;
                    timeInMillis -= ((long) i5) * 60000;
                }
                num = Integer.valueOf(i5);
            }
            return new DateTime(!z, timeInMillis, num);
        }
        String valueOf2 = String.valueOf(str);
        throw new NumberFormatException(valueOf2.length() != 0 ? "Invalid date/time format, cannot specify time zone shift without specifying time: ".concat(valueOf2) : new String("Invalid date/time format, cannot specify time zone shift without specifying time: "));
    }

    /* renamed from: c */
    public String mo60736c() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f52782a);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.tzShift) * 60000));
        m72666a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m72666a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m72666a(sb, gregorianCalendar.get(5), 2);
        if (!this.dateOnly) {
            sb.append('T');
            m72666a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            m72666a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            m72666a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                m72666a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.tzShift;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                m72666a(sb, i / 60, 2);
                sb.append(':');
                m72666a(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        if (this.dateOnly == dateTime.dateOnly && this.value == dateTime.value && this.tzShift == dateTime.tzShift) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.value;
        jArr[1] = this.dateOnly ? 1 : 0;
        jArr[2] = (long) this.tzShift;
        return Arrays.hashCode(jArr);
    }

    public String toString() {
        return mo60736c();
    }

    public DateTime(boolean z, long j, Integer num) {
        int i;
        this.dateOnly = z;
        this.value = j;
        if (z) {
            i = 0;
        } else {
            i = num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        }
        this.tzShift = i;
    }
}
