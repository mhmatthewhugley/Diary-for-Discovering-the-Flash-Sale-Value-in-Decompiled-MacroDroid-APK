package com.android.p023dx.command.annotool;

import java.lang.annotation.ElementType;
import java.util.EnumSet;
import java.util.Locale;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: com.android.dx.command.annotool.Main */
public class Main {

    /* renamed from: com.android.dx.command.annotool.Main$Arguments */
    static class Arguments {
        String aclass;
        EnumSet<ElementType> eTypes = EnumSet.noneOf(ElementType.class);
        String[] files;
        EnumSet<PrintType> printTypes = EnumSet.noneOf(PrintType.class);

        Arguments() {
        }

        /* access modifiers changed from: package-private */
        public void parse(String[] strArr) throws InvalidArgumentException {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                if (!str.startsWith("--annotation=")) {
                    if (!str.startsWith("--element=")) {
                        if (!str.startsWith("--print=")) {
                            String[] strArr2 = new String[(strArr.length - i)];
                            this.files = strArr2;
                            System.arraycopy(strArr, i, strArr2, 0, strArr2.length);
                            break;
                        }
                        try {
                            for (String upperCase : str.substring(str.indexOf(61) + 1).split(",")) {
                                this.printTypes.add(PrintType.valueOf(upperCase.toUpperCase(Locale.ROOT)));
                            }
                        } catch (IllegalArgumentException unused) {
                            throw new InvalidArgumentException("invalid --print");
                        }
                    } else {
                        try {
                            for (String upperCase2 : str.substring(str.indexOf(61) + 1).split(",")) {
                                this.eTypes.add(ElementType.valueOf(upperCase2.toUpperCase(Locale.ROOT)));
                            }
                        } catch (IllegalArgumentException unused2) {
                            throw new InvalidArgumentException("invalid --element");
                        }
                    }
                } else {
                    String substring = str.substring(str.indexOf(61) + 1);
                    if (this.aclass == null) {
                        this.aclass = substring.replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
                    } else {
                        throw new InvalidArgumentException("--annotation can only be specified once.");
                    }
                }
                i++;
            }
            if (this.aclass != null) {
                if (this.printTypes.isEmpty()) {
                    this.printTypes.add(PrintType.CLASS);
                }
                if (this.eTypes.isEmpty()) {
                    this.eTypes.add(ElementType.TYPE);
                }
                EnumSet<ElementType> clone = this.eTypes.clone();
                clone.remove(ElementType.TYPE);
                clone.remove(ElementType.PACKAGE);
                if (!clone.isEmpty()) {
                    throw new InvalidArgumentException("only --element parameters 'type' and 'package' supported");
                }
                return;
            }
            throw new InvalidArgumentException("--annotation must be specified");
        }
    }

    /* renamed from: com.android.dx.command.annotool.Main$InvalidArgumentException */
    private static class InvalidArgumentException extends Exception {
        InvalidArgumentException() {
        }

        InvalidArgumentException(String str) {
            super(str);
        }
    }

    /* renamed from: com.android.dx.command.annotool.Main$PrintType */
    enum PrintType {
        CLASS,
        INNERCLASS,
        METHOD,
        PACKAGE
    }

    private Main() {
    }

    public static void main(String[] strArr) {
        Arguments arguments = new Arguments();
        try {
            arguments.parse(strArr);
            new AnnotationLister(arguments).process();
        } catch (InvalidArgumentException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException("usage");
        }
    }
}
