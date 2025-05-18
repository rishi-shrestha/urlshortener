# 🔗 ShortnerKing

**ShortnerKing** is a Spring Boot-based web application that allows users to shorten long URLs and redirect to the original ones. Built using the MVC architecture, it provides a simple and user-friendly interface to test URL shortening functionality.

---

## 📌 Features

- 🔗 Shorten any valid long URL
- 🚀 Redirect to original URL using the short version
- 🌐 Web interface with basic HTML templates
- 📁 MVC Architecture (Model-View-Controller)

---

## 🛠 Tech Stack

| Technology     | Purpose                       |
|----------------|-------------------------------|
| Java           | Programming language          |
| Spring Boot    | Backend framework             |
| Spring MVC     | For controller and routing    |
| Thymeleaf      | Template engine (HTML views)  |
| Maven          | Build and dependency manager  |

---

## 📂 Project Structure

ShortnerKing/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/ShortnerKing/
│ │ │ ├── ShortnerKingApplication.java
│ │ │ ├── controller/
│ │ │ │ └── UrlController.java
│ │ │ └── service/
│ │ │ └── UrlService.java
│ │ └── resources/
│ │ ├── application.properties
│ │ ├── static/
│ │ └── templates/
│ │ ├── index.html
│ │ └── result.html
│ └── test/
│ └── com/example/ShortnerKing/
│ └── ShortnerKingApplicationTests.java
├── pom.xml

yaml
Copy code

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/ShortnerKing.git
cd ShortnerKing
2. Build and Run
bash
# Build the project
./mvnw clean install

# Run the app
./mvnw spring-boot:run
3. Access the App
Open your browser and navigate to:

arduino
http://localhost:8080
📚 Learning Outcomes
Understanding of Spring Boot MVC architecture

URL mapping and redirection in Spring

Use of Thymeleaf for rendering views

Service-based logic separation
