package su23b1.tiennh21.sd17313.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import su23b1.tiennh21.sd17313.request.CuaHangVM;

import java.util.ArrayList;

@Controller
@RequestMapping("admin/cua-hang")
public class CuaHangController {
    private ArrayList<CuaHangVM> list = new ArrayList<>();

    @GetMapping("create")
    public String create(Model model)
    {
        CuaHangVM vm = new CuaHangVM();
        vm.setMa("CH01");
        vm.setTen("Cua hang 01");
        vm.setQuocGia("VN");
        vm.setThanhPho("ND");
        model.addAttribute("data", vm);
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(@ModelAttribute("data") CuaHangVM vm)
    {
        return "admin/cua_hang/create";
    }
}
