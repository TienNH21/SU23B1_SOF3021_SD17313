package su23b1.tiennh21.sd17313.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import su23b1.tiennh21.sd17313.entities.CuaHang;

import java.util.UUID;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
//    @Query("FROM CuaHang ch WHERE ch.ma = ?1")
//    public CuaHang findByMa(String ma);

    public CuaHang findByMaEquals(String ma);
}
