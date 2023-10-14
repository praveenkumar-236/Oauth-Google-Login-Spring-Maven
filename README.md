# Oauth-Google-Login-Spring-Maven
 
 ## Overview

This project is a Spring Boot application that integrates Google OAuth2 authentication and MongoDB for user data storage. It allows users to log in using their Google accounts and stores user information in a MongoDB database.

Key Features:
- Google OAuth2 integration for secure user authentication.
- Storage of user information, including User ID, Full name, Given name, Family name, Profile picture URL, and Email address.
- A sample web application with endpoints for login and displaying user information.

## Prerequisites

- Java 8 or later
- Maven
- MongoDB
- A Google Developer Console project with OAuth 2.0 client ID (for OAuth2 integration)

## Getting Started

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/praveenkumar-236/Oauth-Google-Login-Spring-Maven.git
    ```

2. Configure your Google OAuth2 credentials:

    - Go to the [Google Developer Console](https://console.developers.google.com/).
    - Create a new project or select an existing one.
    - Set up your OAuth 2.0 client ID.
    - Add your redirect URI (e.g., `https://your-app-domain/auth/callback`) to the authorized redirect URIs.

3. Set your Google OAuth2 credentials and MongoDB configuration in `application.properties`:

    ```properties
    # Google OAuth2 Configuration
    spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
    spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET
    spring.security.oauth2.client.registration.google.redirect-uri=https://your-app-domain/auth/callback
    spring.security.oauth2.client.registration.google.scope=openid,profile,email

    # MongoDB Configuration
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=mydb
    ```

4. Build and run the application:

    ```bash
    mvn spring-boot:run
    ```

5. Access the application in your web browser:

    - [http://localhost:8080/login](http://localhost:8080/login) (For Google OAuth2 login)
    - [http://localhost:8080/user](http://localhost:8080/user) (After successful login)

## Contact

- Praveen Kumar
- http://praveenn.tech
- Project Link: [GitHub](https://github.com/praveenkumar-236/Oauth-Google-Login-Spring-Maven)
