package com.zx;

import java.util.Map;

public interface IUserDao {
    /*
    1.  Original page split
        1. search with requirements
        2. get total number of results
        3. split results into pages

    2. Page split automatically in mybatis: RowBounds

    3. Use pagehelper
     */

    List<User> selectList(Map<String,Object> param);

    Integer selectCount(Map<String,Object> param);
}
