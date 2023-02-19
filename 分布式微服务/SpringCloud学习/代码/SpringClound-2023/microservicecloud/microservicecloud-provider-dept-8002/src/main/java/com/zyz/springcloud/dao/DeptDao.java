package com.zyz.springcloud.dao;

import com.zyz.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/9 12:39
 * @Description:
 */

@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
