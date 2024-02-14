package afn.e_apartment.repository;

import afn.e_apartment.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ApartmentRepository extends JpaRepository<Apartment,String> {
}
