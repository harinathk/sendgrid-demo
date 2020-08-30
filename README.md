# Getting Started
## SendGrid emails using Spring Boot

1. Create a Spring Boot app using [start.spring.io](https://start.spring.io/) (no need to add any dependency)
2. Add the following maven dependency
    ```
    <dependency>
        <groupId>com.sendgrid</groupId>
        <artifactId>sendgrid-java</artifactId>
        <version>4.6.4</version>
    </dependency>
    ```
3. Create an account with SendGrid (wwww.sendgrid.com)
- Confirm the email and complete sender authentication (Settings -> Sender Authentication)
4. Create API Key (Settings -> API Keys).
5. Copy the Key in properties file
    ```
    spring.sendgrid.api-key=<API Key>
    ```
4. Run the App