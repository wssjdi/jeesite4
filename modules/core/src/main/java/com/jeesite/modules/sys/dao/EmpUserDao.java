/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.sys.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.sys.entity.EmpUser;

/**
 * 员工管理DAO接口
 * @author ThinkGem
 * @version 2015-4-24
 */
@MyBatisDao
public interface EmpUserDao extends CrudDao<EmpUser> {

}