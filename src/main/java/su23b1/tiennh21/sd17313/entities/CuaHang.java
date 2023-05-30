package su23b1.tiennh21.sd17313.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="CuaHang")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class CuaHang {
    @Id
    @Column("Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column("Ma")
    private String ma;

    @Column("Ten")
    private String ten;

    @Column("DiaChi")
    private String diaChi;

    @Column("ThanhPho")
    private String thanhPho;

    @Column("QuocGia")
    private String quocGia;
}
