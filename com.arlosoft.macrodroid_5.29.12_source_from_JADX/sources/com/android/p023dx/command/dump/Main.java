package com.android.p023dx.command.dump;

import com.android.dex.util.FileUtils;
import com.android.p023dx.p024cf.iface.ParseException;
import com.android.p023dx.util.HexParser;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.android.dx.command.dump.Main */
public class Main {
    static Args parsedArgs = new Args();

    private Main() {
    }

    public static void main(String[] strArr) {
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            if (str.equals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX) || !str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                break;
            }
            if (str.equals("--bytes")) {
                parsedArgs.rawBytes = true;
            } else if (str.equals("--basic-blocks")) {
                parsedArgs.basicBlocks = true;
            } else if (str.equals("--rop-blocks")) {
                parsedArgs.ropBlocks = true;
            } else if (str.equals("--optimize")) {
                parsedArgs.optimize = true;
            } else if (str.equals("--ssa-blocks")) {
                parsedArgs.ssaBlocks = true;
            } else if (str.startsWith("--ssa-step=")) {
                parsedArgs.ssaStep = str.substring(str.indexOf(61) + 1);
            } else if (str.equals("--debug")) {
                parsedArgs.debug = true;
            } else if (str.equals("--dot")) {
                parsedArgs.dotDump = true;
            } else if (str.equals("--strict")) {
                parsedArgs.strictParse = true;
            } else if (str.startsWith("--width=")) {
                String substring = str.substring(str.indexOf(61) + 1);
                parsedArgs.width = Integer.parseInt(substring);
            } else if (str.startsWith("--method=")) {
                parsedArgs.method = str.substring(str.indexOf(61) + 1);
            } else {
                PrintStream printStream = System.err;
                printStream.println("unknown option: " + str);
                throw new RuntimeException("usage");
            }
            i++;
        }
        if (i != strArr.length) {
            while (i < strArr.length) {
                try {
                    String str2 = strArr[i];
                    PrintStream printStream2 = System.out;
                    printStream2.println("reading " + str2 + "...");
                    byte[] readFile = FileUtils.readFile(str2);
                    if (!str2.endsWith(".class")) {
                        readFile = HexParser.parse(new String(readFile, "utf-8"));
                    }
                    processOne(str2, readFile);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("shouldn't happen", e);
                } catch (ParseException e2) {
                    System.err.println("\ntrouble parsing:");
                    if (parsedArgs.debug) {
                        e2.printStackTrace();
                    } else {
                        e2.printContext(System.err);
                    }
                }
                i++;
            }
            return;
        }
        System.err.println("no input files specified");
        throw new RuntimeException("usage");
    }

    private static void processOne(String str, byte[] bArr) {
        Args args = parsedArgs;
        if (args.dotDump) {
            DotDumper.dump(bArr, str, args);
        } else if (args.basicBlocks) {
            BlockDumper.dump(bArr, System.out, str, false, args);
        } else if (args.ropBlocks) {
            BlockDumper.dump(bArr, System.out, str, true, args);
        } else if (args.ssaBlocks) {
            args.optimize = false;
            SsaDumper.dump(bArr, System.out, str, args);
        } else {
            ClassDumper.dump(bArr, System.out, str, args);
        }
    }
}
