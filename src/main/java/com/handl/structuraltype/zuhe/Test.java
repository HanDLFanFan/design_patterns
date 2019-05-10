package com.handl.structuraltype.zuhe;

/**
 * Created by handl on 2017/9/25.
 *
 * 组合模式：将对象组合成树形结构以表示‘部分-整体’的层次结构。
 *      组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 *      1.抽象接口Component:定义了叶子节点和容器节点的一致接口
 *              提供子节点的操作(添加和删除)接口，
 *              以及叶子节点和容器节点的统一操作接口。
 *
 *      2.容器节点Composite：
 *          容器节点可以包含另外的容器节点和叶子节点
 *          容器节点定义节点列表，并使用添加和删除接口操作节点
 *          容器节点的节点操作接口通过遍历节点列表调用
 *              各个节点(容器和叶子)的节点操作接口(相当于递归操作)
 *
 *      3.叶子节点Leaf：节点的最小单位，不能包含其他节点
 *          叶子节点的节点操作接口与容器节点的节点操作接口区别是：
 *              容器节点的操作接口要遍历节点集合,并调用集合内节点的操作接口
 *              而叶子操作接口是真实的节点行为操作
 *          叶子节点是最小的节点单位，所有不能包含其他节点(容器和叶子)，因此
 *              接口中定义的对节点的添加和删除操作接口，在叶子节点中是无效的，
 *              叶子节点不需要有节点列表对象。因为节点操作接口在叶子节点中可以是虚实现。
 *
 *    提示：透明方式:节点操作接口定义在抽象接口中，让容器节点和叶子节点都去实现,
 *                  依据依赖倒置原则，客户端在使用的使用不必判断是否是容器节点还是叶子节点。
 *          安全方式:节点操作节点单独的定义在容器节点中，这样客户端在使用的时候，就要判断
 *                  是否是容器节点或者向下转型
 *
 *          遵循依赖倒置原则，因为我们使用透明方式。
 *
 *    例子：文件夹Folder(容器节点),文件File(叶子节点)
 *
 *    1.节点抽象接口Operation
 *    2.容器节点FolderNode
 *    3.叶子节点FileNode
 *
 */
public class Test {

    public static void main(String[] args) {
        //创建容器节点
        Operation operationFolder1 = new FolderNode("0");
        Operation operationFolder2 = new FolderNode("    ---0-1");
        Operation operationFolder3 = new FolderNode("    ---0-2");
        Operation operationFolder4 = new FolderNode("        ------0-1-1");

        //创建叶子节点
        Operation fileNode1 = new FileNode("    ---0-3");
        Operation fileNode2 = new FileNode("    ---0-4");
        Operation fileNode3 = new FileNode("        ------0-1-2");
        Operation fileNode4 = new FileNode("        ------0-1-3");
        Operation fileNode5 = new FileNode("        ------0-2-1");
        Operation fileNode6 = new FileNode("        ------0-2-2");
        Operation fileNode7 = new FileNode("            ---------0-1-1-1");
        Operation fileNode8 = new FileNode("            ---------0-1-1-2");

        //组合
        operationFolder4.addNode(fileNode7);
        operationFolder4.addNode(fileNode8);

        operationFolder3.addNode(fileNode5);
        operationFolder3.addNode(fileNode6);

        operationFolder2.addNode(operationFolder4);
        operationFolder2.addNode(fileNode3);
        operationFolder2.addNode(fileNode4);

        operationFolder1.addNode(operationFolder2);
        operationFolder1.addNode(operationFolder3);
        operationFolder1.addNode(fileNode1);
        operationFolder1.addNode(fileNode2);

        //执行
        operationFolder1.handl();
    }
}
