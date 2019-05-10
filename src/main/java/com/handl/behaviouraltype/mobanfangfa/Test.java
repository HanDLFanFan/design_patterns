package com.handl.behaviouraltype.mobanfangfa;

/**
 * Created by handl on 2017/9/22.
 *
 * 模板方法：定义一个操作中的算法骨架，将一些步骤延迟到子类中。
 *          模板方法使得子类不改变一个算法的结构即可重新定义或实现该算法的特定步骤
 *
 *
 *   1.抽象的骨架模板类Template，定义算法结构，把变化的算法提出抽象方法，放到子类实现
 *
 *   2.实现子类TemplateImpl，继承模板类，实现抽象算法方法
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建模板方法类对象(子类实现,子类继承了算法骨架)
        Template template = new TemplateImpl();
        template.result(5,8);
    }
}