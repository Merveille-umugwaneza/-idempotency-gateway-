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


