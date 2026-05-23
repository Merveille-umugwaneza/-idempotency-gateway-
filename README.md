# Idempotency Gateway

Spring Boot application implementing idempotency for payment requests.

---

## Build & Run
```bash
mvn clean install
mvn spring-boot:run

Idempotency Gateway is running!
Content-Type: application/json
Idempotency-Key: <unique-key>

curl -X POST http://localhost:8080/process-payment \
  -H "Content-Type: application/json" \
  -H "Idempotency-Key: test123" \
  -d '{"amount":100,"currency":"RWF"}'

idempotency-gateway/
├── README.md
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/idempotencygateway/
    │   │       ├── IdempotencyGatewayApplication.java
    │   │       ├── controllers/
    │   │       │   └── PaymentController.java
    │   │       ├── models/
    │   │       │   └── PaymentRequest.java
    │   │       └── services/
    │   │           └── PaymentService.java
    │   └── resources/
    │       └── application.properties
    └── test/
        └── java/...

