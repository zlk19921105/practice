package com.zlk.java8;

/**java8特性之接口中的默认方法
 * @author zhoulk
 *         Date:  2018/4/3.
 */
public interface DefaultMethods {
    double show(int a);

    //特性，接口允许default修饰的实现方法
    default double sqrt(int a){
        return  Math.sqrt(a);
    }

    public static void main(String[] args) {
        //立即实现
        DefaultMethods defaultMethods = new DefaultMethods(){
           public double show(int a){
                return sqrt(a*100);
            }
        };
        System.out.println(defaultMethods.sqrt(9)+ ";");
        System.out.println(defaultMethods.show(100)+ ";");
    }
}
