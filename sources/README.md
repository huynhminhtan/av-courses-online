#  Sources

## ## Chạy chương trình

- Mở bằng IntellIJ chạy `mvn compile` để generate ra các class từ file protobuf.
- Click chuột phải vào project chọn *Maven -> Generate Sources and Update Folders* để update lại project. Hoặc có thể *auto import* Maven.
- Thiết lặp *Undo Set language level to 6 - @Override in interfaces* nếu có lỗi.
- Run.

## ## Test gRPC service bằng command line

- Cài đặt *gRPC command line tool*, đã cài đặt protobuf:

 ```bash
 $ apt-get install build-essential autoconf libtool pkg-config
 $ git clone -b $(curl -L https://grpc.io/release) https://github.com/grpc/grpc
 $ cd grpc
 $ git submodule update --init
 $ sudo apt-get install libgflags-dev
 $ make grpc_cli
 ```

- Chạy command, cd vào thư mục root của folder vừa build

```bash
$ ./bins/opt/grpc_cli ls localhost:9999
$ ./bins/opt/grpc_cli ls localhost:9999 protobuf.ZPBase
$ ./bins/opt/grpc_cli call localhost:9999 protobuf.ZPBase.sendRequest "methodName: 'okayokay'"
```

- Link refer:
  - https://github.com/grpc/grpc/blob/master/doc/command_line_tool.md
  - https://github.com/grpc/grpc/blob/master/BUILDING.md
  - https://gitlab.zalopay.vn/huyvha/spring-boot-grpc-example

## ## Test API controller bằng command line

- Cập nhật thông tin DB tại */resources/application.properties*.

```text
## PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/db_spring_test
spring.datasource.username=postgres
spring.datasource.password=123456
```

- Chạy command

```text
$ curl 'localhost:8080/config/add?name=First&email=someemail@someemailprovider.com'
$ curl 'localhost:8080/config/all'
```

- Link refer:
  - https://spring.io/guides/gs/accessing-data-mysql/
  - https://www.mkyong.com/spring-boot/spring-boot-spring-data-jpa-postgresql/
