package com.handl.structuraltype.zuhe;

/**
 * Created by handl on 2017/9/26.
 *
 * 叶子节点：最小节点单位
 *      叶子节点没有节点列表，所以添加和删除操作并没有效果，使用的是透明方式
 *      在操作接口中处理叶子节点的行为
 *
 */
public class FileNode implements Operation {

    private String name;

    @Override
    public void addNode(Operation operation) {
        System.out.println("这是叶子节点，添加节点无效");
    }

    @Override
    public void removeNode(Operation operation) {
        System.out.println("这是叶子节点，删除节点无效");
    }

    /**
     * 叶子节点操作处理
     */
    @Override
    public void handl() {
        System.out.println(this.name+"文件:");

    }

    public FileNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
