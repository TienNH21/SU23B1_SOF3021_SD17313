package su23b1.tiennh21.sd17313.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import su23b1.tiennh21.sd17313.request.CuaHangVM;

import java.util.UUID;

@Entity
@Table(name="CuaHang")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class CuaHang {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="Ma")
    private String ma;

    @Column(name="Ten")
    private String ten;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="ThanhPho")
    private String thanhPho;

    @Column(name="QuocGia")
    private String quocGia;

    public void loadFromViewModel(CuaHangVM vm)
    {
        this.setTen( vm.getTen() );
        this.setMa( vm.getMa() );
        this.setDiaChi( vm.getDiaChi() );
        this.setThanhPho( vm.getThanhPho() );
        this.setQuocGia( vm.getQuocGia() );
    }
}
