package com.handl.behaviouraltype.guanchazhe;

/**
 * Created by handl on 2017/9/23.
 *
 * 真实的观察者对象，实现观察者接口重写更新方法
 *
 *      可以有自己的属性，
 *      可以接受一个主题，使用主题的特有属性(这个可以没有)
 *
 */
public class ObserverImpl implements Observer{

    private String name;
    private SubjectImpl subject;

    public ObserverImpl(String name, SubjectImpl subject) {
        this.name = name;
        this.subject = subject;
    }

    /**
     * 重写更新方法
     * 这里演示输入一句话，使用了主题的属性
     */
    @Override
    public void updata() {
        System.out.println("ObjectNmae = "+name +",SubjectName = "+subject.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
