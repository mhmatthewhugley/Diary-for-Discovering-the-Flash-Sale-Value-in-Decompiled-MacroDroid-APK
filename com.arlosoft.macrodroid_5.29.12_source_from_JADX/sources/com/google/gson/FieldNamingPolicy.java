package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

public enum FieldNamingPolicy implements FieldNamingStrategy {
    IDENTITY {
        /* renamed from: b */
        public String mo63972b(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: b */
        public String mo63972b(Field field) {
            return FieldNamingPolicy.m78288e(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: b */
        public String mo63972b(Field field) {
            return FieldNamingPolicy.m78288e(FieldNamingPolicy.m78287d(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: b */
        public String mo63972b(Field field) {
            return FieldNamingPolicy.m78287d(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: b */
        public String mo63972b(Field field) {
            return FieldNamingPolicy.m78287d(field.getName(), HelpFormatter.DEFAULT_OPT_PREFIX).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: b */
        public String mo63972b(Field field) {
            return FieldNamingPolicy.m78287d(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: d */
    static String m78287d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: e */
    static String m78288e(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
