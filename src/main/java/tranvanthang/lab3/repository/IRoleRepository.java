package tranvanthang.lab3.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tranvanthang.lab3.entity.Role;
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    @Query("Select r.id FROM Role r WHERE r.name= ?1")
    Long getRoleIdByName(String roleName);

}
