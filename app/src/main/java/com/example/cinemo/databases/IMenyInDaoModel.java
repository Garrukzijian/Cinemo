package com.example.cinemo.databases;
import java.util.List;


/**
 * 所有数据库表的接口
 * @param <E>
 */
public interface IMenyInDaoModel<E> {

    /**
     * 添加的接口
     * @param weChtBeanIn
     * @return
     */
    int add(Object weChtBeanIn);

    /**
     * 删除的接口
     * @param id
     */
    int delect(int id);


    /**
     * 查询的接口
     */
    List<Object> quer();

    /**
     * 查询的接口
     */
    List<Object> querLike(String values);


    /**
     * 添加成功后的通知UI
     */
    interface ICallBack{
        void CallBack();
    }

    interface ICallBack2{
        void CallBack();
    }

    interface ICallBack3{
        void CallBack();
    }


    interface ICallBack4{
        void CallBack();
    }


}
