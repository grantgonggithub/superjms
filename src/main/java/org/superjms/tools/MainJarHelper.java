package org.superjms.tools;

import java.security.CodeSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.tools
 * @ClassName MainJarHelper
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022/11/23 下午3:35
 * @Description TODO
 */
public class MainJarHelper {
    /*Main方法所在的jar名称*/
    private static String _main_class_jar=null;

    public static String get_main_class_jar() {
        return _main_class_jar;
    }

    /**
     * 获取main方法所在的Class
     *
     * @return
     */
    private static Class<?> getMainApplicationClass() {
        try {
            //通过异常的StackTrace来找
            StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("main".equals(stackTraceElement.getMethodName())) {
                    return Class.forName(stackTraceElement.getClassName());
                }
            }
        } catch (ClassNotFoundException ex) {

        }
        return null;
    }

    static {
        Class<?> mainClass = getMainApplicationClass();
        if (mainClass == null) {
            throw new RuntimeException("fail to find main class");
        }

        CodeSource codeSource = mainClass.getProtectionDomain().getCodeSource();
        String fileName = codeSource.getLocation().getFile();
        _main_class_jar = getJarFileName(fileName);

    }

    private static final String JAR_FILE_PATTERN = "([^/]+\\\\.jar)[!/]*$";
    private static final String WAR_FILE_PATTERN = "([^/]+\\\\.war)[!/]*$";

    private static String getJarFileName(String fullPath) {
        int lastIndex = 0;
        Pattern filePattern = null;
        if (fullPath.endsWith(".jar")) {
            lastIndex = fullPath.lastIndexOf(".jar");
            filePattern = Pattern.compile(JAR_FILE_PATTERN);
        } else if (fullPath.endsWith(".war")) {
            lastIndex = fullPath.lastIndexOf(".war");
            filePattern = Pattern.compile(WAR_FILE_PATTERN);
        } else {
            throw new IllegalArgumentException("this is not a jar file:" + fullPath);
        }

        Matcher matcher = filePattern.matcher(fullPath.substring(0, lastIndex + 4));
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("this is not a jar file:" + fullPath);
    }

}

