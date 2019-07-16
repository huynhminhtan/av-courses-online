package avielts.nhuqp.core.repository;

import org.springframework.data.repository.CrudRepository;
import avielts.nhuqp.core.model.UserEntity;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    List<UserEntity> findByName(String name);
}
