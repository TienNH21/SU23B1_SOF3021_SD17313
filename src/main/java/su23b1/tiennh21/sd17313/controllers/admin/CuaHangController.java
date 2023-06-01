package su23b1.tiennh21.sd17313.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import su23b1.tiennh21.sd17313.entities.CuaHang;
import su23b1.tiennh21.sd17313.repositories.CuaHangRepository;
import su23b1.tiennh21.sd17313.request.CuaHangVM;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        model.addAttribute("action", "/admin/cua-hang/store");
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("data") CuaHangVM vm,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/cua_hang/create";
        }

        CuaHang ch = new CuaHang();
        ch.loadFromViewModel(vm);
        this.chRepo.save(ch);
        return "redirect:/admin/cua-hang/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<CuaHang> ds = this.chRepo.findAll();
        model.addAttribute("data", ds);
        return "admin/cua_hang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") CuaHang cuaHang)
    {
        this.chRepo.delete(cuaHang);
        return "redirect:/admin/cua-hang/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") CuaHang cuaHang, Model model)
    {
        vm.loadFromDomainModel(cuaHang);
        model.addAttribute("data", vm);
        model.addAttribute("action", "/admin/cua-hang/update/" + cuaHang.getId());
        return "admin/cua_hang/create";
    }

    @PostMapping("update/{id}")
    public String update(
        @PathVariable("id") CuaHang oldValue,
        Model model,
        @Valid @ModelAttribute("data") CuaHangVM newValue,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            model.addAttribute("data", newValue);
            model.addAttribute("action", "/admin/cua-hang/update/" + oldValue.getId());
            return "admin/cua_hang/create";
        }

        oldValue.loadFromViewModel(newValue);
        this.chRepo.save(oldValue);
        return "redirect:/admin/cua-hang/index";
    }
}
