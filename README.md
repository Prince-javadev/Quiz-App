# Quiz Application




## Overview
The Quiz Application is a web-based platform designed to deliver a seamless and engaging quiz experience. Users can register, log in, take quizzes, and view their results. The app shuffles a set of questions to ensure a unique experience for every user.

---

## Features
- **User Registration:** Allows users to create an account.
- **Login:** Secure access for registered users.
- **Quiz Section:**
  - Displays 10 shuffled questions selected randomly from a database of 50 questions.
  - Supports 6 different types of questions (e.g., multiple choice, true/false, etc.).
  - Prevents users from navigating back after submitting an answer.
  - Mandatory to answer each question before moving to the next.
- **Results:** Displays the user's quiz score upon completion.
- **Email Notification:** Planned feature to send quiz results to users via email.

---

## Technology Stack
- **Backend:** Spring Boot
- **Frontend:** HTML, CSS, JavaScript, Bootstrap
- **Database:** MySQL
- **Tools:** Eclipse IDE (2023-12)

---

## Setup and Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Prince-javadev/Quiz-App.git
   ```
2. Open the project in Eclipse IDE.
3. Set up the MySQL database:
   - Create a database named `quiz_app`.
   - Import the provided SQL file to populate the database.
4. Update database credentials in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/quiz_app
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   ```
5. Run the Spring Boot application.
6. Open the application in your browser at `http://localhost:8080`.

---

## Application Pages
### Registration Page
Users can create a new account by providing their details.
![Registration Page](https://github.com/Prince-javadev/Quiz-App/blob/main/Image/Registration%20Page.jpg)


### Login Page
Registered users can log in to access the quiz section.
![Login Page](https://github.com/Prince-javadev/Quiz-App/blob/main/Image/login%20page.jpg)

### Quiz Page
Displays questions one at a time with navigation restricted to prevent revisiting previous questions.
![Quiz Page](https://github.com/Prince-javadev/Quiz-App/blob/main/Image/quiz%20page.jpg)


---

## Future Enhancements
- Implementing email notifications for quiz results.
- Enhancing the UI with additional interactive elements.
- Adding more question types for a richer quiz experience.

---


---

## Contact
If you have any questions or suggestions, feel free to contact me at princeraj82524@gmail.com.
