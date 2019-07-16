#  Sources

## ## Chạy chương trình

- Mở bằng IntellIJ để import project vào.
- Run.

## ## API controller bằng command line

- Cập nhật thông tin DB tại */resources/application.properties*.

```text
## PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/db_spring_test
spring.datasource.username=postgres
spring.datasource.password=123456
```

- Test API, chạy command

```text
$ curl 'localhost:8080/config/add?name=First&email=someemail@someemailprovider.com'
$ curl 'localhost:8080/config/all'
```

- Link refer:
  - https://spring.io/guides/gs/accessing-data-mysql/
  - https://www.mkyong.com/spring-boot/spring-boot-spring-data-jpa-postgresql/
