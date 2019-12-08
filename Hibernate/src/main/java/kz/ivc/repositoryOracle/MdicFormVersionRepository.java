package kz.ivc.repositoryOracle;

import kz.ivc.entityOracle.MdicFormVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MdicFormVersionRepository extends JpaRepository<MdicFormVersion, Long> {
    List<MdicFormVersion> getAll(String MdicFormVersion);
}
