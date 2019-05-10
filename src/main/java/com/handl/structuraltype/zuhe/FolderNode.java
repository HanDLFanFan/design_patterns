package com.handl.structuraltype.zuhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handl on 2017/9/26.
 *
 * 容器节点
 *      1.定义节点列表，通过add和remove来维护节点列表
 *
 *      2.容器节点的操作接口，处理容器节点的行为和循环调用叶子节点的行为
 *
 */
public class FolderNode implements Operation {

    private String name;

    //节点列表
    private List<Operation> operationList = new ArrayList<>();

    //节点的添加和删除操作
    @Override
    public void addNode(Operation operation) {
        operationList.add(operation);
    }
    @Override
    public void removeNode(Operation operation) {
        operationList.remove(operation);
    }

    /**
     * 容器节点的操作接口
     */
    @Override
    public void handl() {

        System.out.println(this.name+"文件夹:");
        for (Operation operation : operationList){
            operation.handl();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FolderNode(String name) {
        this.name = name;
    }
}
