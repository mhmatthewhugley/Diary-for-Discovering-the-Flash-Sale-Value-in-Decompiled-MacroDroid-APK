package twitter4j.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class TimeSpanConverter implements Serializable {
    private static final int AN_HOUR_AGO = 4;
    private static final int A_MINUTE_AGO = 2;
    private static final int NOW = 0;
    private static final int N_HOURS_AGO = 5;
    private static final int N_MINUTES_AGO = 3;
    private static final int N_SECONDS_AGO = 1;
    private static final int ONE_DAY_IN_SECONDS = 86400;
    private static final int ONE_HOUR_IN_SECONDS = 3600;
    private static final int ONE_MONTH_IN_SECONDS = 2592000;
    private static final long serialVersionUID = 8665013607650804076L;
    private final SimpleDateFormat dateMonth;
    private final SimpleDateFormat dateMonthYear;
    private final MessageFormat[] formats;

    public TimeSpanConverter() {
        this(Locale.getDefault());
    }

    public String toTimeSpanString(Date date) {
        return toTimeSpanString(date.getTime());
    }

    public TimeSpanConverter(Locale locale) {
        MessageFormat[] messageFormatArr = new MessageFormat[6];
        this.formats = messageFormatArr;
        String language = locale.getLanguage();
        if ("it".equals(language)) {
            messageFormatArr[0] = new MessageFormat("Ora");
            messageFormatArr[1] = new MessageFormat("{0} secondi fa");
            messageFormatArr[2] = new MessageFormat("1 minuto fa");
            messageFormatArr[3] = new MessageFormat("{0} minuti fa");
            messageFormatArr[4] = new MessageFormat("1 ora fa");
            messageFormatArr[5] = new MessageFormat("{0} ore fa");
            this.dateMonth = new SimpleDateFormat("d MMM", locale);
            this.dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
        } else if ("kr".equals(language)) {
            messageFormatArr[0] = new MessageFormat("지금");
            messageFormatArr[1] = new MessageFormat("{0}초 전");
            messageFormatArr[2] = new MessageFormat("1분 전");
            messageFormatArr[3] = new MessageFormat("{0}분 전");
            messageFormatArr[4] = new MessageFormat("1시간 전");
            messageFormatArr[5] = new MessageFormat("{0} ore fa");
            this.dateMonth = new SimpleDateFormat("M월 d일", locale);
            this.dateMonthYear = new SimpleDateFormat("yy년 M월 d일", locale);
        } else if ("es".equals(language)) {
            messageFormatArr[0] = new MessageFormat("Ahora");
            messageFormatArr[1] = new MessageFormat("hace {0} segundos");
            messageFormatArr[2] = new MessageFormat("hace 1 minuto");
            messageFormatArr[3] = new MessageFormat("hace {0} minutos");
            messageFormatArr[4] = new MessageFormat("hace 1 hora");
            messageFormatArr[5] = new MessageFormat("hace {0} horas");
            this.dateMonth = new SimpleDateFormat("d MMM", locale);
            this.dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
        } else if ("fr".equals(language)) {
            messageFormatArr[0] = new MessageFormat("Maintenant");
            messageFormatArr[1] = new MessageFormat("Il y a {0} secondes");
            messageFormatArr[2] = new MessageFormat("Il y a 1 minute");
            messageFormatArr[3] = new MessageFormat("Il y a {0} minutes");
            messageFormatArr[4] = new MessageFormat("Il y a 1 heure");
            messageFormatArr[5] = new MessageFormat("Il y a {0} heures");
            this.dateMonth = new SimpleDateFormat("d MMM", locale);
            this.dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
        } else if ("de".equals(language)) {
            messageFormatArr[0] = new MessageFormat("Jetzt");
            messageFormatArr[1] = new MessageFormat("vor {0} Sekunden");
            messageFormatArr[2] = new MessageFormat("vor 1 Minute");
            messageFormatArr[3] = new MessageFormat("vor {0} Minuten");
            messageFormatArr[4] = new MessageFormat("vor 1 Stunde");
            messageFormatArr[5] = new MessageFormat("vor {0} Stunden");
            this.dateMonth = new SimpleDateFormat("d MMM", locale);
            this.dateMonthYear = new SimpleDateFormat("d MMM yy", locale);
        } else if ("ja".equals(language)) {
            messageFormatArr[0] = new MessageFormat("今");
            messageFormatArr[1] = new MessageFormat("{0}秒前");
            messageFormatArr[2] = new MessageFormat("1分前");
            messageFormatArr[3] = new MessageFormat("{0}分前");
            messageFormatArr[4] = new MessageFormat("1時間前");
            messageFormatArr[5] = new MessageFormat("{0}時間前");
            this.dateMonth = new SimpleDateFormat("M月d日", locale);
            this.dateMonthYear = new SimpleDateFormat("yy年M月d日", locale);
        } else {
            messageFormatArr[0] = new MessageFormat("now");
            messageFormatArr[1] = new MessageFormat("{0} seconds ago");
            messageFormatArr[2] = new MessageFormat("1 minute ago");
            messageFormatArr[3] = new MessageFormat("{0} minutes ago");
            messageFormatArr[4] = new MessageFormat("1 hour ago");
            messageFormatArr[5] = new MessageFormat("{0} hours ago");
            Locale locale2 = Locale.ENGLISH;
            this.dateMonth = new SimpleDateFormat("d MMM", locale2);
            this.dateMonthYear = new SimpleDateFormat("d MMM yy", locale2);
        }
    }

    public String toTimeSpanString(long j) {
        int currentTimeMillis = (int) ((System.currentTimeMillis() - j) / 1000);
        if (currentTimeMillis < ONE_DAY_IN_SECONDS) {
            return toTimeSpanString(currentTimeMillis);
        }
        if (currentTimeMillis >= ONE_MONTH_IN_SECONDS) {
            return this.dateMonthYear.format(new Date(j));
        }
        return this.dateMonth.format(new Date(j));
    }

    private String toTimeSpanString(int i) {
        if (i <= 1) {
            return this.formats[0].format((Object) null);
        }
        if (i < 60) {
            return this.formats[1].format(new Object[]{Integer.valueOf(i)});
        } else if (i < 2700) {
            int i2 = i / 60;
            if (i2 == 1) {
                return this.formats[2].format((Object) null);
            }
            return this.formats[3].format(new Object[]{Integer.valueOf(i2)});
        } else if (i < 6300) {
            return this.formats[4].format((Object) null);
        } else {
            int i3 = (i + TypedValues.Custom.TYPE_INT) / ONE_HOUR_IN_SECONDS;
            return this.formats[5].format(new Object[]{Integer.valueOf(i3)});
        }
    }
}
