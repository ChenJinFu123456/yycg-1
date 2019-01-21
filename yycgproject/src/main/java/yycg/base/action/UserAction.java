package yycg.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    //用户查询页面
    @RequestMapping("/queryuser")
    public String queryUser(Model model) throws Exception{

        return "/base/user/queryuser";
    }

    //最终DataGridResultInfo通过ResponseBody将java转换为json对象
    @ResponseBody
    @RequestMapping("/queryuser_result")
    public DataGridResultInfo queryUser_result(SysuserQueryVo sysuserQueryVo) throws Exception{
        DataGridResultInfo dataGridResultInf=new DataGridResultInfo();
        //填充total
        List<SysuserCustom> rows= userService.findSysuserList(sysuserQueryVo);
        dataGridResultInf.setRows(rows);
        //填充rows
        dataGridResultInf.setTotal(rows.size());

        return dataGridResultInf;
    }
}
