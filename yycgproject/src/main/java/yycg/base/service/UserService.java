package yycg.base.service;


import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

import java.util.List;

public interface UserService {

    //根据条件查询用户信息
    public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo) throws Exception;
}
