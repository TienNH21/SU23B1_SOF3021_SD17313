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
import su23b1.tiennh21.sd17313.entities.CuaHang;
import su23b1.tiennh21.sd17313.repositories.CuaHangRepository;
import su23b1.tiennh21.sd17313.request.CuaHangVM;

import java.util.ArrayList;

@Controller
@RequestMapping("admin/cua-hang")
public class CuaHangController {
    @Autowired
    private CuaHangRepository chRepo;

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
        CuaHang ch = new CuaHang();
        ch.setTen( vm.getTen() );
        ch.setMa( vm.getMa() );
        ch.setDiaChi( vm.getDiaChi() );
        ch.setThanhPho( vm.getThanhPho() );
        ch.setQuocGia( vm.getQuocGia() );
        this.chRepo.save(ch);
        return "admin/cua_hang/create";
    }
}
