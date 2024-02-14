package com.android.p023dx.command;

/* renamed from: com.android.dx.command.Main */
public class Main {
    private static String USAGE_MESSAGE = "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is \n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes defined by\n    those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put in\n    the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a directory.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    declaring type: a class name in internal form, like Ljava/lang/Object;\n    member: a field or method name, like hashCode\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.12).\n  dx --help\n    Print this message.";

    private Main() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void main(java.lang.String[] r6) {
        /*
            java.lang.String r0 = "--"
            r1 = 0
            r2 = 0
        L_0x0004:
            r3 = 1
            int r4 = r6.length     // Catch:{ UsageException -> 0x00ae, RuntimeException -> 0x009b, all -> 0x007b }
            if (r2 >= r4) goto L_0x00ac
            r4 = r6[r2]     // Catch:{ UsageException -> 0x00ae, RuntimeException -> 0x009b, all -> 0x007b }
            boolean r5 = r4.equals(r0)     // Catch:{ UsageException -> 0x00ae, RuntimeException -> 0x009b, all -> 0x007b }
            if (r5 != 0) goto L_0x00ae
            boolean r5 = r4.startsWith(r0)     // Catch:{ UsageException -> 0x00ae, RuntimeException -> 0x009b, all -> 0x007b }
            if (r5 != 0) goto L_0x0018
            goto L_0x00ae
        L_0x0018:
            java.lang.String r5 = "--dex"
            boolean r5 = r4.equals(r5)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            if (r5 == 0) goto L_0x0028
            java.lang.String[] r6 = without(r6, r2)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            com.android.p023dx.command.dexer.Main.main(r6)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            goto L_0x0063
        L_0x0028:
            java.lang.String r5 = "--dump"
            boolean r5 = r4.equals(r5)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            if (r5 == 0) goto L_0x0038
            java.lang.String[] r6 = without(r6, r2)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            com.android.p023dx.command.dump.Main.main(r6)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            goto L_0x0063
        L_0x0038:
            java.lang.String r5 = "--annotool"
            boolean r5 = r4.equals(r5)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            if (r5 == 0) goto L_0x0048
            java.lang.String[] r6 = without(r6, r2)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            com.android.p023dx.command.annotool.Main.main(r6)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            goto L_0x0063
        L_0x0048:
            java.lang.String r5 = "--find-usages"
            boolean r5 = r4.equals(r5)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            if (r5 == 0) goto L_0x0058
            java.lang.String[] r6 = without(r6, r2)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            com.android.p023dx.command.findusages.Main.main(r6)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            goto L_0x0063
        L_0x0058:
            java.lang.String r5 = "--version"
            boolean r5 = r4.equals(r5)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            if (r5 == 0) goto L_0x0066
            version()     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
        L_0x0063:
            r6 = 0
        L_0x0064:
            r1 = 1
            goto L_0x00af
        L_0x0066:
            java.lang.String r5 = "--help"
            boolean r4 = r4.equals(r5)     // Catch:{ UsageException -> 0x0079, RuntimeException -> 0x0076, all -> 0x0073 }
            if (r4 == 0) goto L_0x0070
            r6 = 1
            goto L_0x0064
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0073:
            r6 = move-exception
            r0 = 1
            goto L_0x007d
        L_0x0076:
            r6 = move-exception
            r0 = 1
            goto L_0x009d
        L_0x0079:
            r1 = 1
            goto L_0x00ae
        L_0x007b:
            r6 = move-exception
            r0 = 0
        L_0x007d:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r4 = "\nUNEXPECTED TOP-LEVEL ERROR:"
            r2.println(r4)
            r6.printStackTrace()
            boolean r2 = r6 instanceof java.lang.NoClassDefFoundError
            if (r2 != 0) goto L_0x008f
            boolean r6 = r6 instanceof java.lang.NoSuchMethodError
            if (r6 == 0) goto L_0x0096
        L_0x008f:
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r2 = "Note: You may be using an incompatible virtual machine or class library.\n(This program is known to be incompatible with recent releases of GCJ.)"
            r6.println(r2)
        L_0x0096:
            r6 = 3
            java.lang.System.exit(r6)
            goto L_0x00ab
        L_0x009b:
            r6 = move-exception
            r0 = 0
        L_0x009d:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r4 = "\nUNEXPECTED TOP-LEVEL EXCEPTION:"
            r2.println(r4)
            r6.printStackTrace()
            r6 = 2
            java.lang.System.exit(r6)
        L_0x00ab:
            r1 = r0
        L_0x00ac:
            r6 = 0
            goto L_0x00af
        L_0x00ae:
            r6 = 1
        L_0x00af:
            if (r1 != 0) goto L_0x00b9
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r0 = "error: no command specified"
            r6.println(r0)
            r6 = 1
        L_0x00b9:
            if (r6 == 0) goto L_0x00c1
            usage()
            java.lang.System.exit(r3)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.command.Main.main(java.lang.String[]):void");
    }

    private static void usage() {
        System.err.println(USAGE_MESSAGE);
    }

    private static void version() {
        System.err.println("dx version 1.12");
        System.exit(0);
    }

    private static String[] without(String[] strArr, int i) {
        int length = strArr.length - 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        System.arraycopy(strArr, i + 1, strArr2, i, length - i);
        return strArr2;
    }
}