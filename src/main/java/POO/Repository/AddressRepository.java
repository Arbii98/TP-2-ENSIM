package POO.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import POO.Model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long> {

}
