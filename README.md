# 🍔 Food & Hospitality Management System

A full-stack web application for food ordering and room booking with integrated online payment system.

---

## 🚀 Features

* 🛒 Add food items to cart
* 🏨 Room booking system
* 💳 Razorpay payment integration
* 👤 User registration & login 
* 📦 Order storage in backend
* 📊 Dynamic cart updates
* 🔄 Real-time UI updates

---

## 🛠️ Tech Stack

- Frontend: HTML, CSS, JavaScript  
- Backend: Java, Spring Boot  
- Database: MySQL / H2  
- Payment: Razorpay
---

## 📐 Architecture

This project follows a **3-tier architecture**:

### 🔹 1. Presentation Layer (Frontend)

* Built using **HTML, CSS, JavaScript**
* Responsible for:

  * Displaying food menu
  * Managing cart operations
  * Handling room booking UI

### 🔹 2. Application Layer (Backend)

* Built using **Spring Boot (Java)**
* Responsible for:

  * User authentication
  * Order management
  * Room booking logic
  * Payment processing

### 🔹 3. Data Layer (Database)

* Uses **MySQL / H2 Database**
* Stores:

  * Users
  * Orders
  * Rooms
  * Menu items

---

## 🌐 Client–Server Architecture

This application follows a **client–server model**:

### 🔹 Client (Frontend)

* Built using **HTML, CSS, JavaScript**
* Handles user interactions such as:

  * Browsing menu
  * Adding items to cart
  * Booking rooms

### 🔹 Server (Backend)

* Built using **Spring Boot (Java)**
* Provides REST APIs for:

  * User authentication
  * Order processing
  * Room booking
  * Payment integration

### 🔹 Communication

* Client sends **HTTP requests (GET, POST)** to backend
* Server processes requests and returns **JSON responses**
* Frontend updates UI dynamically based on responses
  
---

## 📸 Screenshots

### 🏠 Home Page
screenshots/Home.png

### 🛒 Cart & Payment
screenshots/Cart.png
screenshots/Payment.png

### 🏨 Architecture
screenshots/architecture.png

## 🔄 Application Flow

1. User interacts with UI (Frontend)
2. Frontend sends request to Backend (REST API)
3. Backend processes logic and interacts with Database
4. Response is sent back to UI
5. UI updates dynamically

---

## ⚙️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/chandramouli17/food-hospitality-management-system.git
```

2. Open project in IntelliJ / VS Code

3. Run Spring Boot application

4. Open browser:

```
http://localhost:8080
```

---

## 💡 Future Improvements

* 🔐 Secure authentication (JWT)
* 📜 Order history tracking
* 📧 Email notifications
* 📱 Mobile responsive UI

---

## 👨‍💻 Author

**Chandra Mouli**

---
