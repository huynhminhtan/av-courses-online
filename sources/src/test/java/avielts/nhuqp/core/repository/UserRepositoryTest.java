package avielts.nhuqp.core.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;
import avielts.nhuqp.core.model.UserEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//@EnableAutoConfiguration
////@SpringBootTest(classes = {UserRepositoryTest.class})
@SpringBootTest()
//@RunWith(SpringRunner.class)
////@DataJpaTest

@RunWith(SpringRunner.class)
//@DataJpaTest
public class UserRepositoryTest {

//    @Autowired
//    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp(){
        // Given
//        testEntityManager.persist(new UserEntity("admin"));
    }

    @Test
    @Order(1)
    public void insert() {
        userRepository.save(new UserEntity("admin"));
        userRepository.save(new UserEntity("admin", "admin@mysite.com"));
    }

    @Test
    @Order(2)
    public void testFindByName(){

        // When
        List<UserEntity> users = userRepository.findByName("admin");

        // Then
//        assertThat(users.get(0).getName()).isEqualTo("admin");
//        assertEquals(1, 1);
        assertThat(users).extracting(UserEntity::getName).containsOnly("admin");
    }
}
