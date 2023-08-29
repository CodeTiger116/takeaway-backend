package com.sky.service;

import com.sky.entity.AddressBook;

import java.util.List;

/**
 * @author hanhu
 * @date 2023/8/29 23:43
 */
public interface AddressBookService {

    /**
     * 新增地址
     * @param addressBook
     */
    void save(AddressBook addressBook);

    /**
     * 查询当前登录用户的所有地址信息
     *
     * @return
     */
    List<AddressBook> list(AddressBook addressBook);

    /**
     * 根据id查询地址
     * @param id
     * @return
     */
    AddressBook getById(Long id);

    /**
     * 根据id修改地址
     *
     * @param addressBook
     * @return
     */
    void update(AddressBook addressBook);

    /**
     * 根据id删除地址
     *
     * @param id
     * @return
     */
    void deleteById(Long id);

    /**
     * 设置默认地址
     *
     * @param addressBook
     * @return
     */
    void setDefault(AddressBook addressBook);
}
