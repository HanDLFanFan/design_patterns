package com.handl.behaviouraltype.mingling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handl on 2017/9/28.
 *
 *
 * 命令管理对象：
 *      这里定义了命令列表，实现批处理操作
 *
 */
public class Invoker {
    //定义命令列表
    private List<Command> commandList;

    //添加命令
    public void addCommand(Command command){
        commandList.add(command);
    }

    //删除命令
    public void removeCommand(Command command){
        commandList.remove(command);
    }

    //批处理操作命令
    public void commandNotify(){
        for (Command command : commandList){
            command.action();
        }
    }

    public Invoker() {
        commandList = new ArrayList<>();
    }
}
