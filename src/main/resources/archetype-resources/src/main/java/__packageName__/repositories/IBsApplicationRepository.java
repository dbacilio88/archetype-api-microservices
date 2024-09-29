package ${package}.${packageName.replace('/','.')}.repositories;

import ${package}.${packageName.replace('/','.')}.repositories.entities.BsApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * IBsApplicationRepository
 * <p>
 * IBsApplicationRepository interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

@Repository
public interface IBsApplicationRepository extends JpaRepository<BsApplicationEntity, Long>, JpaSpecificationExecutor<BsApplicationEntity> {
}