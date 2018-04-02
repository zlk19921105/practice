package com.zlk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**lambda表达式的使用
 * @author zhoulk
 *         Date:  2018/4/2.
 */
public class Lambda {

    /**
     * lambda表达式循环输出list值
     */
    public void lambdaList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        //1.循环输出list,
        list.forEach(l-> System.out.print(l+","));
        //方式和上一个相似
        list.forEach(System.out::println);
        System.out.print( list.stream());
    }

    /**
     * lambda表达式启动线程
     */
    public void lambdaThread(){
        //->前为参数，->为处理的语句块
        new Thread(()-> System.out.println("java8,线程启动")).start();
    }

    /**
     *  java.util.function.Predicate[ˈprɛdɪˌkeɪt]使用（Predicate[ˈprɛdɪˌkeɪt]断言）
     */
    public void predicateTest(List<String> list){
        //字符串以J开始,长度为4，使用and()合并条件，
        // Predicate类中方法除去and，还有or或、isEqual相等、negate否定、test匹配为true;
        Predicate<String> startsWithJ = (n) ->n.startsWith("J");
        Predicate<String> length =(n)->n.length()==4;
        list.stream().filter(startsWithJ.and(length)).forEach(l-> System.out.println("输出结果："+l+","));
        list.stream().map((cost)->cost+"12345").forEach(System.out::println);
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("adhsfjJfsvbgfh");
        list.add("adhJfsvbgJh");
        list.add("Jfsv");
        Lambda lambda = new Lambda();

       // lambda.lambdaList();
       // lambda.lambdaThread();
        lambda.predicateTest(list);
    }
}
