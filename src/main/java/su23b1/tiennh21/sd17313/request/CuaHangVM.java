package su23b1.tiennh21.sd17313.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import su23b1.tiennh21.sd17313.entities.CuaHang;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHangVM {
    @NotBlank(message = "Mã không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;

    @NotBlank(message = "Không được để trống")
    private String diaChi;

    @NotBlank
    private String thanhPho;

    @NotBlank
    private String quocGia;

    public void loadFromDomainModel(CuaHang domain)
    {
        this.setTen( domain.getTen() );
        this.setMa( domain.getMa() );
        this.setDiaChi( domain.getDiaChi() );
        this.setThanhPho( domain.getThanhPho() );
        this.setQuocGia( domain.getQuocGia() );
    }
}
