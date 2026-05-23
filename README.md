# Idempotency Gateway

Spring Boot application implementing idempotency for payment requests.

## Build & Run
```bash
mvn clean install
mvn spring-boot:run


Endpoints
GET /ping → Health check

Idempotency Gateway is running!

POST /process-payment
Headers:

Content-Type: application/json
Idempotency-Key: <unique-key>

Body:
{ "amount": 100, "currency": "RWF" }

Response:
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


---

### ✅ Why this is better
- Uses proper fenced code blocks (` ```bash `, ` ```json `) instead of “Code/json” labels.  
- Clear separation of **Headers**, **Body**, and **Response**.  
- Easy to copy‑paste commands directly.  
- Professional formatting that reviewers expect.

---

### 📌 Next Step
Update your README with this improved version:

```bash
nano README.md

