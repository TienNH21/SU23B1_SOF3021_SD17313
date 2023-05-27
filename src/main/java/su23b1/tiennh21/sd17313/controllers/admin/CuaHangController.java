package su23b1.tiennh21.sd17313.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @Autowired
    @Qualifier("ch_vm1")
    private CuaHangVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("data", vm);
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("data") CuaHangVM vm,
        BindingResult result
    ) {
        return "admin/cua_hang/create";
    }
}
