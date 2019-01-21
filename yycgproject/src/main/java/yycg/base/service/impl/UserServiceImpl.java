package yycg.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.SysuserMapperCustom;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private SysuserMapperCustom sysuserMapperCustom;


    @Override
    public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo) throws Exception {
        return sysuserMapperCustom.findSysuserList(sysuserQueryVo);
    }
}
