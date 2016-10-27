package com.example.silas.mvpdemo;

import java.util.List;

/**
 * Created by Silas on 2016/10/7.
 */
public interface IBuyBookModel {
    /**
     * 获取模拟数据
     */
    void getTestData(ValueCallBack<List<DingTestBean>> callBack);


    /**
     * 返回本地adapter数据
     * @return
     */
    List<DingTestBean> getAdapterData();
}
