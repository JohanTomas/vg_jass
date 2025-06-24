# CETPRO Social Project – Technical Overview

## 🔧 Project Stack
- **Backend**: Java 17 (IntelliJ IDEA, Spring Boot)
- **Database**: Postgres

---

## ✅ Project Purpose
This JASS project initiative offers **useful tools for the Water Box System - RNC** and **community support** using real-world technology tools, allowing users to maintain their own IT and payment systems.

---

## 🛠️ Setup Instructions (Imperatives)
1. **Clone** the repository:  
   `git clone https://gitlab.com/vallegrande/as231s5_prs1/vg-ms-payments-billing.git`
2. **Clone - Develop** the repository:  
   `cd vg-ms-payments-billing`
   `git switch develop`
3. **Run** Spring Boot app:  
   `./mvnw spring-boot:run`  

---

## 🧩 How to Use the App (Advice with “should”)
- You **should** open `http://localhost:8080/api/vi/payments` after backend are running.  
- You **should** access the URL to view the GET of `/api/vi/payments`
- You **should** create a new record with the POST method `/api/vi/payments/new`

---

## 🎯 Future Plans (Advice & Suggestions)
- We **should** should integrate hosting for the Paymentes MicroService before the final release.
- We **should** implement user roles (admin, client, superadmin) to control content access.  
- We **should** schedule community coding workshops during the semester.

---

## 📁 Repository Structure
```text
/vg_ms_payments
├── backend/        # Java 17 + Spring Boot REST API
├── README.md       # ← You are here
├── README2.md
├── CONTRIBUTING.md # Contribution guidelines
├── .env.example    # Environment variables template
└── docs/           # Project documentation & diagrams
```
---

## 🧑‍🏫 Contributing (Imperatives & Advice)
- **Fork** this repo.  
- **Create** a feature branch:  
  `git checkout -b feature/your-feature-name`  
- **Implement**, **test**, and **lint** your feature locally.  
- **Open** a Pull Request with a clear summary and description.  
  > You **should** add “Fixes #\<issue-number\>” in your PR if it's related to an open issue.

---

## 🚀 Deployment Requirements (Must & Need To)
- You **must** set the environment variables:
- MONGODB_URI=your_mongodb_uri
- JWT_SECRET=your_jwt_secret_key
- - You **need to** enable CORS in the Spring configuration for frontend access.  
- You **must** build the frontend before deployment:  
`npm run build` in `/frontend/`  
Upload contents of `dist/` to your hosting platform.

---

## 💡 Best Practices & Tips
- You **should** write unit tests (JUnit for backend, Jasmine/Karma for frontend).  
- You **should** document any new REST endpoints in the README or API specification.  
- You **should** run `mvn clean` and `npm run lint` before each commit.

---

## 📞 Questions & Support
If you need help:
- **Open** an issue in this repository.  
- **Tag** `@project-lead` for urgent issues.  
- **Join** our group chat on Discord or Telegram for real-time collaboration.

---

**Thank you for your contributions!**  
👍 *Let's build something meaningful together.*
