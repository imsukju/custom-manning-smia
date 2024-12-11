# custom-manning-smia

**custom-manning-smia**는 Spring Microservices in Action(SMIA)을 기반으로 한 커스터마이징된 프로젝트입니다. 이 프로젝트는 마이크로서비스 아키텍처를 활용하여 유연하고 확장 가능한 서비스를 구현하는 데 초점을 맞춥니다.

## 프로젝트 구조

```
custom-manning-smia/
├── .idea/                 # 프로젝트 환경 설정 (IDE 관련 파일)
├── configserver/          # 구성 서버 (Spring Cloud Config)
├── docker/                # Docker 관련 설정 파일
├── licensing-service/     # 라이선스 관리 서비스
├── pom.xml                # Maven 빌드 파일
└── README.md              # 프로젝트 문서
```

## 주요 기능

1. **Spring Cloud Config**: 설정 서버를 통해 마이크로서비스 구성 관리.
2. **Docker 지원**: Docker를 통해 손쉽게 배포 가능.
3. **Licensing Service**: 예제 라이선스 서비스 구현.

## 요구 사항

- **Java 17 이상**
- **Maven 3.8 이상**
- **Docker(Optional)**

## 빌드 및 실행

### 1. 프로젝트 클론

```bash
git clone https://github.com/your-repo/custom-manning-smia.git
cd custom-manning-smia
```

### 2. Maven 빌드

```bash
mvn clean install
```

### 3. Config Server 실행

```bash
cd configserver
mvn spring-boot:run
```

### 4. Licensing Service 실행

```bash
cd licensing-service
mvn spring-boot:run
```

### 5. Docker로 실행 (선택 사항)

```bash
cd docker
docker-compose up
```

## 사용 기술

- **Spring Boot**
- **Spring Cloud Config**
- **Docker**
- **Maven**
