---
title: Java中try..catch..finally的笔记
date: 2020-05-01 23:16:08
tags:
---

## 异常的捕获与抛出
```
public class Test2 {
    static void procedure() {
        try {
            int a = 0;
            int b = 42/a;
        } catch(java.lang.ArithmeticException e) {
            System.out.println("in procedure, catch ArithmeticException: " + e);
            throw e;//若不抛出,主函数无法捕获此错误
        }
    }

    public static void main(String args[]) {
        try {
            procedure();
        } catch(java.lang. Exception e) {
            System.out.println("in main, catch Exception: " + e);
        }
    }
}
```
结果:
>in procedure, catch ArithmeticException: java.lang.ArithmeticException: / by zero  
>in main, catch Exception: java.lang.ArithmeticException: / by zero

```
public class Trycatch {
    public static class TestException {
        public TestException() {
        }
        boolean testEx() throws Exception{
            boolean ret = true;
            try{
                ret = testEx1();
            }catch (Exception e){
                System.out.println("testEx, catch exception");
                ret = false;
                throw e;
            }finally{
                System.out.println("testEx, finally; return value="+ret);
                return ret;
            }
        }
        boolean testEx1() throws Exception{
            boolean ret = true;
            try{
                ret = testEx2();
                if (!ret){
                    return false;
                }
                System.out.println("testEx1, at the end of try");
                return ret;
            }catch (Exception e){
                System.out.println("testEx1, catch exception");
                ret = false;
                throw e;
            }
            finally{
                System.out.println("testEx1, finally; return value="+ret);
                return ret;
            }
        }
        boolean testEx2() throws Exception{
            boolean ret = true;
            try{
                int b=12;
                int c;
                for (int i=2;i>=-2;i--){
                    c=b/i;
                    System.out.println("i="+i);
                }
                return true;
            }catch (Exception e){
                System.out.println("testEx2, catch exception");
                ret = false;
                throw e;
            }
            finally{
                System.out.println("testEx2, finally; return value="+ret);
                return ret;//final中的return阻止了异常向下抛出
            }
        }
        public static void main(String[] args) {
            TestException testException1 = new TestException();
            try{
                testException1.testEx();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }


}
```

结果:
>i=2  
i=1  
testEx2, catch exception  
testEx2, finally; return value=false  
testEx1, finally; return value=false  
testEx, finally; return value=false  



