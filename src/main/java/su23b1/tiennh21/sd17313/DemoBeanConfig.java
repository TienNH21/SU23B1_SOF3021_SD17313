package su23b1.tiennh21.sd17313;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import su23b1.tiennh21.sd17313.request.CuaHangVM;

@Configuration
public class DemoBeanConfig {
    @Bean("ch_vm1")
    public CuaHangVM getCuaHangVM1()
    {
        CuaHangVM vm = new CuaHangVM();
        vm.setTen("Cua hang 01");
        vm.setThanhPho("HCM");
        vm.setQuocGia("VN");
        return vm;
    }

    @Bean("ch_vm2")
    public CuaHangVM getCuaHangVM2()
    {
        CuaHangVM vm = new CuaHangVM();
        vm.setTen("Cua hang 02");
        vm.setThanhPho("HN");
        vm.setQuocGia("VN");
        return vm;
    }
}
