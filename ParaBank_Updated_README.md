# 🏦 ParaBank Online Banking – QA Automation Suite

End-to-end QA automation framework for the **ParaBank** online banking demo application.

This project demonstrates **UI Automation (Selenium + Java + TestNG + POM)**,  
**API Testing (Postman/Newman or Rest Assured)**,  
**Performance Testing (JMeter)**,  
**and CI/CD (GitHub Actions)**.

---

## 🚀 Features Implemented

### ✅ UI Automation (Selenium + Java + TestNG)
- Page Object Model (POM) framework  
- BaseTest + BasePage reusable architecture  
- TestNG suite with grouping (smoke, regression)  
- Automated banking flows:  
  - Home Page Verification  
  - Invalid Login  
  - Successful User Registration  
  - Open New Account (UI Login + Account Creation)

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
│   │   │   │   ├── AccountsOverviewPage.java
│   │   │   │   ├── OpenNewAccountPage.java
│   │   │   │
│   │   │   ├── com.bharatsaini882.parabank.tests/
│   │   │       ├── SanityTest.java
│   │   │       ├── HomePageTest.java
│   │   │       ├── LoginTest.java
│   │   │       ├── RegistrationTest.java
│   │   │       ├── OpenNewAccountTest.java
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
- GitHub Actions pipelines:
  - UI smoke tests  
  - API regression suite  
  - JMeter smoke  

---

## 🌐 Application Under Test

- Home: https://parabank.parasoft.com/parabank/index.htm  
- Registration: https://parabank.parasoft.com/parabank/register.htm  
- API Docs: https://parabank.parasoft.com/parabank/api-docs/index.html  

---

## ▶ How to Run Tests

### **Run from IntelliJ**
Right-click `testng.xml` → **Run 'testng.xml'**

### **Run from Maven**
```
mvn clean test
```

---

## 📌 Future Enhancements

### **Phase 2 (UI Continued):**
- ✔️ Open New Account flow  
- ➡️ Transfer Funds flow  
- ➡️ Transaction History validation  

### **Phase 3 – API Testing**
- Rest Assured full API suite  
- Validate balances before/after transfers  
- JSON schema validations  

### **Phase 4 – Performance Testing**
- JMeter login + account overview  
- HTML dashboard report  
- SLA metrics  

### **Phase 5 – CI/CD**
- GitHub Actions  
- Test results reporting  
- Status badges  

---

## 👤 Author

**Bharat Saini**  
QA Automation Engineer & SDET  
🔗 LinkedIn: https://linkedin.com/in/bharatsaini882  
🔗 GitHub: https://github.com/bharat882  

---

This README will continue evolving as new modules are added 🚀
