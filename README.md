# 🏦 ParaBank Online Banking – QA Automation Suite

End-to-end QA automation framework for the **ParaBank** demo banking application.

This project demonstrates **UI Automation (Selenium + Java + TestNG + POM)**,  
**API Testing (Postman/Newman or Rest Assured)**,  
**Performance Testing (JMeter)**,  
and **CI/CD (GitHub Actions)**.

---

## 🚀 Features Implemented

### ✅ UI Automation (Selenium + Java + TestNG)
- Page Object Model (POM) framework
- BaseTest and BasePage architecture
- TestNG test suites with grouping (smoke, regression)
- Automated flows:
  - Home Page Verification
  - Invalid Login
  - Successful User Registration

---

## 🧱 Project Structure

```
parabank-banking-qa-automation/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── com.bharatsaini882.parabank.core/
│   │   │   │   ├── BaseTest.java
│   │   │   │   ├── BasePage.java
│   │   │   │
│   │   │   ├── com.bharatsaini882.parabank.pages/
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── RegisterPage.java
│   │   │   │
│   │   │   ├── com.bharatsaini882.parabank.tests/
│   │   │       ├── SanityTest.java
│   │   │       ├── HomePageTest.java
│   │   │       ├── LoginTest.java
│   │   │       ├── RegistrationTest.java
│   │   │
│   │   ├── resources/
│   │       ├── testng.xml
│
├── pom.xml
└── README.md
```

---

## 🛠 Tech Stack

### **Language & Build**
- Java 17
- Maven

### **UI Automation**
- Selenium WebDriver
- TestNG
- WebDriverManager
- Page Object Model (POM)

### **API Testing** (Coming Soon)
- Postman / Newman  
**or**
- Rest Assured

### **Performance Testing** (Coming Soon)
- Apache JMeter

### **CI/CD** (Coming Soon)
- GitHub Actions: run smoke tests, API regressions, JMeter smoke

---

## 🌐 Application Under Test

- Home: https://parabank.parasoft.com/parabank/index.htm  
- Registration: https://parabank.parasoft.com/parabank/register.htm  
- API Docs: https://parabank.parasoft.com/parabank/api-docs/index.html  

---

## ▶ How to Run Tests

### Run from IntelliJ
Right-click `testng.xml` → **Run 'testng.xml'**

### Run from Maven
```
mvn clean test
```

---

## 📌 Future Enhancements

### Phase 2:
- Open New Account flow
- Transfer Funds flow
- Transaction History validation

### Phase 3:
- Rest Assured complete API test suite
- Balance validations before/after transfers

### Phase 4:
- JMeter performance test plan

### Phase 5:
- Full CI/CD pipeline (GitHub Actions badges)

---

## 👤 Author
**Bharat Saini**  
QA Automation Engineer & SDET  
LinkedIn: https://linkedin.com/in/bharatsaini882  
GitHub: https://github.com/bharat882

---

This README will continue to grow as the project evolves. 🚀
