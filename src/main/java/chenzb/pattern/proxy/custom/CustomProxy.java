package chenzb.pattern.proxy.custom;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chenzibin on 2018/11/5.
 */
public class CustomProxy {

    CustomInvocationHandler h;

    protected CustomProxy(CustomInvocationHandler h) {
        this.h = h;
    }

    /**
     * 创建代理对象， 目的是通过生成代理类，让被代理类所实现的所有方法均调用handler进行处理
     * @param loader 被代理类类加载器？作用待了解，可能设计类加载委托机制
     * @param interfaces 被代理的接口类
     * @param handler 代理方法的实现（前置通知、后置通知等）
     * @return 代理对象
     */
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, CustomInvocationHandler handler) {
        // JDK实现：解析interfaces，生成class字节码，字节码defineClass为代理对象

        // 1、解析interfaces，需考虑的情况过于繁杂，仅考虑例子中的简单情况
        // 2、生成class字节码，需熟悉class字节码的生成，暂未涉猎该方面知识；暂时通过生成java文件，再编译为class字节码的方式实现
        // 3、返回代理对象，defineClass 待了解

        String content = "//\n" +
                "package chenzb.pattern.proxy.custom;\n" +
                "\n" +
                "import chenzb.pattern.proxy.Person;\n" +
                "import java.lang.reflect.InvocationHandler;\n" +
                "import java.lang.reflect.Method;\n" +
                "import java.lang.reflect.Proxy;\n" +
                "import java.lang.reflect.UndeclaredThrowableException;\n" +
                "\n" +
                "public final class $Proxy0 extends CustomProxy implements Person {\n" +
                "    private static Method m1;\n" +
                "    private static Method m2;\n" +
                "    private static Method m4;\n" +
                "    private static Method m3;\n" +
                "    private static Method m0;\n" +
                "\n" +
                "    public $Proxy0(InvocationHandler var1) throws  {\n" +
                "        super(var1);\n" +
                "    }\n" +
                "\n" +
                "    public final boolean equals(Object var1) throws  {\n" +
                "        try {\n" +
                "            return ((Boolean)super.h.invoke(this, m1, new Object[]{var1})).booleanValue();\n" +
                "        } catch (RuntimeException | Error var3) {\n" +
                "            throw var3;\n" +
                "        } catch (Throwable var4) {\n" +
                "            throw new UndeclaredThrowableException(var4);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public final String toString() throws  {\n" +
                "        try {\n" +
                "            return (String)super.h.invoke(this, m2, (Object[])null);\n" +
                "        } catch (RuntimeException | Error var2) {\n" +
                "            throw var2;\n" +
                "        } catch (Throwable var3) {\n" +
                "            throw new UndeclaredThrowableException(var3);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public final void eat(String var1) throws  {\n" +
                "        try {\n" +
                "            super.h.invoke(this, m4, new Object[]{var1});\n" +
                "        } catch (RuntimeException | Error var3) {\n" +
                "            throw var3;\n" +
                "        } catch (Throwable var4) {\n" +
                "            throw new UndeclaredThrowableException(var4);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public final void sleep() throws  {\n" +
                "        try {\n" +
                "            super.h.invoke(this, m3, (Object[])null);\n" +
                "        } catch (RuntimeException | Error var2) {\n" +
                "            throw var2;\n" +
                "        } catch (Throwable var3) {\n" +
                "            throw new UndeclaredThrowableException(var3);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public final int hashCode() throws  {\n" +
                "        try {\n" +
                "            return ((Integer)super.h.invoke(this, m0, (Object[])null)).intValue();\n" +
                "        } catch (RuntimeException | Error var2) {\n" +
                "            throw var2;\n" +
                "        } catch (Throwable var3) {\n" +
                "            throw new UndeclaredThrowableException(var3);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    static {\n" +
                "        try {\n" +
                "            m1 = Class.forName(\"java.lang.Object\").getMethod(\"equals\", new Class[]{Class.forName(\"java.lang.Object\")});\n" +
                "            m2 = Class.forName(\"java.lang.Object\").getMethod(\"toString\", new Class[0]);\n" +
                "            m4 = Class.forName(\"chenzb.pattern.proxy.Person\").getMethod(\"eat\", new Class[]{Class.forName(\"java.lang.String\")});\n" +
                "            m3 = Class.forName(\"chenzb.pattern.proxy.Person\").getMethod(\"sleep\", new Class[0]);\n" +
                "            m0 = Class.forName(\"java.lang.Object\").getMethod(\"hashCode\", new Class[0]);\n" +
                "        } catch (NoSuchMethodException var2) {\n" +
                "            throw new NoSuchMethodError(var2.getMessage());\n" +
                "        } catch (ClassNotFoundException var3) {\n" +
                "            throw new NoClassDefFoundError(var3.getMessage());\n" +
                "        }\n" +
                "    }\n" +
                "}\n";

        try (FileWriter javaWrite = new FileWriter("$Proxy0.java")) {
            javaWrite.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
