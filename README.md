# Idempotency Gateway

Spring Boot application implementing idempotency for payment requests.

## Build & Run
```bash
mvn clean install
mvn spring-boot:run

Endpoints
GET /ping → Health check
Response:

Code
Idempotency Gateway is running!
POST /process-payment  
Headers:

Code
Content-Type: application/json
Idempotency-Key: <unique-key>
Body:

json
{ "amount": 100, "currency": "RWF" }
Response:

json
{ "status": "Charged 100 RWF" }
Idempotency Logic
Requests with the same Idempotency-Key will not be processed twice.

Ensures safe retry of payment requests without duplicate charges.

Requirements
Java 17

Maven 3.8+

Spring Boot 3.2.5

Notes
Run curl http://localhost:8080/ping to check health.

Run curl -X POST http://localhost:8080/process-payment ... to test payments.

Code

---
